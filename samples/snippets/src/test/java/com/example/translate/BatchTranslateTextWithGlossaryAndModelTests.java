/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.translate;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.cloud.testing.junit4.MultipleAttemptsRule;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for Batch Translate Text With Glossary sample. */
@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class BatchTranslateTextWithGlossaryAndModelTests {

  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String INPUT_URI =
      "gs://cloud-samples-data/translation/text_with_custom_model_and_glossary.txt";
  private static final String GLOSSARY_ID = "DO_NOT_DELETE_TEST_GLOSSARY";
  private static final String MODEL_ID = "TRL3645318651705294848";
  private static final String PREFIX = "BATCH_TRANSLATION_MODEL_GLOS_OUTPUT_";
  private static final String OUTPUT_URI =
      String.format("gs://%s/%s%s/", PROJECT_ID, PREFIX, UUID.randomUUID());

  private ByteArrayOutputStream bout;
  private PrintStream out;

  private static final void cleanUpBucket() {
    Storage storage = StorageOptions.getDefaultInstance().getService();
    Page<Blob> blobs =
        storage.list(
            PROJECT_ID,
            Storage.BlobListOption.currentDirectory(),
            Storage.BlobListOption.prefix(PREFIX));

    deleteDirectory(storage, blobs);
  }

  private static void deleteDirectory(Storage storage, Page<Blob> blobs) {
    for (Blob blob : blobs.iterateAll()) {
      System.out.println(blob.getBlobId());
      if (!blob.delete()) {
        Page<Blob> subBlobs =
            storage.list(
                PROJECT_ID,
                Storage.BlobListOption.currentDirectory(),
                Storage.BlobListOption.prefix(blob.getName()));

        deleteDirectory(storage, subBlobs);
      }
    }
  }

  private static void requireEnvVar(String varName) {
    assertNotNull(
        "Environment variable '%s' is required to perform these tests.".format(varName),
        System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  private PrintStream originalPrintStream;

  @Before
  public void setUp() {
    PrintStream temp = new PrintStream(new ByteArrayOutputStream());
    System.setOut(temp);

    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    originalPrintStream = System.out;
    System.setOut(out);

    // clear up bucket before the use to prevent concurrency issue.
    cleanUpBucket();
  }

  @After
  public void tearDown() {
    cleanUpBucket();
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Rule public MultipleAttemptsRule multipleAttemptsRule = new MultipleAttemptsRule(3);

  @Test
  public void testBatchTranslateTextWithGlossaryAndModel()
      throws InterruptedException, ExecutionException, IOException, TimeoutException {
    BatchTranslateTextWithGlossaryAndModel.batchTranslateTextWithGlossaryAndModel(
        PROJECT_ID, "en", "ja", INPUT_URI, OUTPUT_URI, GLOSSARY_ID, MODEL_ID);
    String got = bout.toString();
    assertThat(got).contains("Total Characters: 25");
  }
}

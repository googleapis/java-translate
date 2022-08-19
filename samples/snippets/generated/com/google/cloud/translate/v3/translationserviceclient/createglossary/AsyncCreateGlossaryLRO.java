/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.translate.v3.samples;

// [START translation_v3_generated_translationserviceclient_createglossary_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.translate.v3.CreateGlossaryMetadata;
import com.google.cloud.translate.v3.CreateGlossaryRequest;
import com.google.cloud.translate.v3.Glossary;
import com.google.cloud.translate.v3.LocationName;
import com.google.cloud.translate.v3.TranslationServiceClient;

public class AsyncCreateGlossaryLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateGlossaryLRO();
  }

  public static void asyncCreateGlossaryLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
      CreateGlossaryRequest request =
          CreateGlossaryRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setGlossary(Glossary.newBuilder().build())
              .build();
      OperationFuture<Glossary, CreateGlossaryMetadata> future =
          translationServiceClient.createGlossaryOperationCallable().futureCall(request);
      // Do something.
      Glossary response = future.get();
    }
  }
}
// [END translation_v3_generated_translationserviceclient_createglossary_lro_async]

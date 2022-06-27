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

// [START translation_v3_generated_translationserviceclient_translatetext_sync]
import com.google.cloud.translate.v3.LocationName;
import com.google.cloud.translate.v3.TranslateTextGlossaryConfig;
import com.google.cloud.translate.v3.TranslateTextRequest;
import com.google.cloud.translate.v3.TranslateTextResponse;
import com.google.cloud.translate.v3.TranslationServiceClient;
import java.util.ArrayList;
import java.util.HashMap;

public class SyncTranslateText {

  public static void main(String[] args) throws Exception {
    syncTranslateText();
  }

  public static void syncTranslateText() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
      TranslateTextRequest request =
          TranslateTextRequest.newBuilder()
              .addAllContents(new ArrayList<String>())
              .setMimeType("mimeType-1392120434")
              .setSourceLanguageCode("sourceLanguageCode1645917472")
              .setTargetLanguageCode("targetLanguageCode-106414698")
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setModel("model104069929")
              .setGlossaryConfig(TranslateTextGlossaryConfig.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .build();
      TranslateTextResponse response = translationServiceClient.translateText(request);
    }
  }
}
// [END translation_v3_generated_translationserviceclient_translatetext_sync]

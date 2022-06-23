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

package com.google.cloud.translate.v3beta1.samples;

// [START
// translation_v3beta1_generated_translationserviceclient_batchtranslatedocument_stringstringliststringlistbatchdocumentinputconfigbatchdocumentoutputconfig_sync]
import com.google.cloud.translate.v3beta1.BatchDocumentInputConfig;
import com.google.cloud.translate.v3beta1.BatchDocumentOutputConfig;
import com.google.cloud.translate.v3beta1.BatchTranslateDocumentResponse;
import com.google.cloud.translate.v3beta1.LocationName;
import com.google.cloud.translate.v3beta1.TranslationServiceClient;
import java.util.ArrayList;
import java.util.List;

public
class SyncBatchTranslateDocumentStringStringListstringListbatchdocumentinputconfigBatchdocumentoutputconfig {

  public static void main(String[] args) throws Exception {
    syncBatchTranslateDocumentStringStringListstringListbatchdocumentinputconfigBatchdocumentoutputconfig();
  }

  public static void
      syncBatchTranslateDocumentStringStringListstringListbatchdocumentinputconfigBatchdocumentoutputconfig()
          throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
      String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
      String sourceLanguageCode = "sourceLanguageCode1645917472";
      List<String> targetLanguageCodes = new ArrayList<>();
      List<BatchDocumentInputConfig> inputConfigs = new ArrayList<>();
      BatchDocumentOutputConfig outputConfig = BatchDocumentOutputConfig.newBuilder().build();
      BatchTranslateDocumentResponse response =
          translationServiceClient
              .batchTranslateDocumentAsync(
                  parent, sourceLanguageCode, targetLanguageCodes, inputConfigs, outputConfig)
              .get();
    }
  }
}
// [END
// translation_v3beta1_generated_translationserviceclient_batchtranslatedocument_stringstringliststringlistbatchdocumentinputconfigbatchdocumentoutputconfig_sync]

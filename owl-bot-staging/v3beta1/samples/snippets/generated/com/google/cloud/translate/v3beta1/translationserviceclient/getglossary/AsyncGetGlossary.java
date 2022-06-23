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

// [START translation_v3beta1_generated_translationserviceclient_getglossary_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.translate.v3beta1.GetGlossaryRequest;
import com.google.cloud.translate.v3beta1.Glossary;
import com.google.cloud.translate.v3beta1.GlossaryName;
import com.google.cloud.translate.v3beta1.TranslationServiceClient;

public class AsyncGetGlossary {

  public static void main(String[] args) throws Exception {
    asyncGetGlossary();
  }

  public static void asyncGetGlossary() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
      GetGlossaryRequest request =
          GetGlossaryRequest.newBuilder()
              .setName(GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]").toString())
              .build();
      ApiFuture<Glossary> future =
          translationServiceClient.getGlossaryCallable().futureCall(request);
      // Do something.
      Glossary response = future.get();
    }
  }
}
// [END translation_v3beta1_generated_translationserviceclient_getglossary_async]

/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface DetectedLanguageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.DetectedLanguage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The BCP-47 language code of source content in the request, detected
   * automatically.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The BCP-47 language code of source content in the request, detected
   * automatically.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The confidence of the detection result for this language.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   *
   * @return The confidence.
   */
  float getConfidence();
}

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

public interface CreateGlossaryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.CreateGlossaryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasGlossary();
  /**
   *
   *
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.translate.v3.Glossary getGlossary();
  /**
   *
   *
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.translate.v3.GlossaryOrBuilder getGlossaryOrBuilder();
}

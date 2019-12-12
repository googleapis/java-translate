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

public interface CreateGlossaryMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.CreateGlossaryMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the glossary that is being created.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the glossary that is being created.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The current state of the glossary creation operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.CreateGlossaryMetadata.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The current state of the glossary creation operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.CreateGlossaryMetadata.State state = 2;</code>
   *
   * @return The state.
   */
  com.google.cloud.translate.v3.CreateGlossaryMetadata.State getState();

  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   *
   * @return Whether the submitTime field is set.
   */
  boolean hasSubmitTime();
  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   *
   * @return The submitTime.
   */
  com.google.protobuf.Timestamp getSubmitTime();
  /**
   *
   *
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();
}

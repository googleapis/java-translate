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
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface GcsDestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.GcsDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. There must be no files under 'output_uri_prefix'.
   * 'output_uri_prefix' must end with "/" and start with "gs://", otherwise an
   * INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The outputUriPrefix.
   */
  java.lang.String getOutputUriPrefix();
  /**
   *
   *
   * <pre>
   * Required. There must be no files under 'output_uri_prefix'.
   * 'output_uri_prefix' must end with "/" and start with "gs://", otherwise an
   * INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>string output_uri_prefix = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for outputUriPrefix.
   */
  com.google.protobuf.ByteString getOutputUriPrefixBytes();
}

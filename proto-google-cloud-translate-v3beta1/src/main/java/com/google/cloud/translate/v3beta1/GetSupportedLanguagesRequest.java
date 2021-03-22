/*
 * Copyright 2020 Google LLC
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

/**
 *
 *
 * <pre>
 * The request message for discovering supported languages.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3beta1.GetSupportedLanguagesRequest}
 */
public final class GetSupportedLanguagesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3beta1.GetSupportedLanguagesRequest)
    GetSupportedLanguagesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetSupportedLanguagesRequest.newBuilder() to construct.
  private GetSupportedLanguagesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetSupportedLanguagesRequest() {
    parent_ = "";
    displayLanguageCode_ = "";
    model_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetSupportedLanguagesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetSupportedLanguagesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              displayLanguageCode_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              model_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_GetSupportedLanguagesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_GetSupportedLanguagesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest.class,
            com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   * Format: `projects/{project-number-or-id}` or
   * `projects/{project-number-or-id}/locations/{location-id}`.
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   * Non-global location is required for AutoML models.
   * Only models within the same region (have same location-id) can be used,
   * otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   * Format: `projects/{project-number-or-id}` or
   * `projects/{project-number-or-id}/locations/{location-id}`.
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   * Non-global location is required for AutoML models.
   * Only models within the same region (have same location-id) can be used,
   * otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_LANGUAGE_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object displayLanguageCode_;
  /**
   *
   *
   * <pre>
   * Optional. The language to use to return localized, human readable names
   * of supported languages. If missing, then display names are not returned
   * in a response.
   * </pre>
   *
   * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayLanguageCode.
   */
  @java.lang.Override
  public java.lang.String getDisplayLanguageCode() {
    java.lang.Object ref = displayLanguageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayLanguageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The language to use to return localized, human readable names
   * of supported languages. If missing, then display names are not returned
   * in a response.
   * </pre>
   *
   * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayLanguageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayLanguageCodeBytes() {
    java.lang.Object ref = displayLanguageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayLanguageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object model_;
  /**
   *
   *
   * <pre>
   * Optional. Get supported languages of this model.
   * The format depends on model type:
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/base`
   * Returns languages supported by the specified model.
   * If missing, we get supported languages of Google general base (PBMT) model.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Get supported languages of this model.
   * The format depends on model type:
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/base`
   * Returns languages supported by the specified model.
   * If missing, we get supported languages of Google general base (PBMT) model.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getDisplayLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayLanguageCode_);
    }
    if (!getModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, model_);
    }
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDisplayLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayLanguageCode_);
    }
    if (!getModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, model_);
    }
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parent_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest other =
        (com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getDisplayLanguageCode().equals(other.getDisplayLanguageCode())) return false;
    if (!getModel().equals(other.getModel())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + DISPLAY_LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayLanguageCode().hashCode();
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request message for discovering supported languages.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3beta1.GetSupportedLanguagesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3beta1.GetSupportedLanguagesRequest)
      com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_GetSupportedLanguagesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_GetSupportedLanguagesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest.class,
              com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      displayLanguageCode_ = "";

      model_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_GetSupportedLanguagesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest build() {
      com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest buildPartial() {
      com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest result =
          new com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest(this);
      result.parent_ = parent_;
      result.displayLanguageCode_ = displayLanguageCode_;
      result.model_ = model_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest) {
        return mergeFrom((com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest other) {
      if (other
          == com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getDisplayLanguageCode().isEmpty()) {
        displayLanguageCode_ = other.displayLanguageCode_;
        onChanged();
      }
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Project or location to make a call. Must refer to a caller's
     * project.
     * Format: `projects/{project-number-or-id}` or
     * `projects/{project-number-or-id}/locations/{location-id}`.
     * For global calls, use `projects/{project-number-or-id}/locations/global` or
     * `projects/{project-number-or-id}`.
     * Non-global location is required for AutoML models.
     * Only models within the same region (have same location-id) can be used,
     * otherwise an INVALID_ARGUMENT (400) error is returned.
     * </pre>
     *
     * <code>
     * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Project or location to make a call. Must refer to a caller's
     * project.
     * Format: `projects/{project-number-or-id}` or
     * `projects/{project-number-or-id}/locations/{location-id}`.
     * For global calls, use `projects/{project-number-or-id}/locations/global` or
     * `projects/{project-number-or-id}`.
     * Non-global location is required for AutoML models.
     * Only models within the same region (have same location-id) can be used,
     * otherwise an INVALID_ARGUMENT (400) error is returned.
     * </pre>
     *
     * <code>
     * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Project or location to make a call. Must refer to a caller's
     * project.
     * Format: `projects/{project-number-or-id}` or
     * `projects/{project-number-or-id}/locations/{location-id}`.
     * For global calls, use `projects/{project-number-or-id}/locations/global` or
     * `projects/{project-number-or-id}`.
     * Non-global location is required for AutoML models.
     * Only models within the same region (have same location-id) can be used,
     * otherwise an INVALID_ARGUMENT (400) error is returned.
     * </pre>
     *
     * <code>
     * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Project or location to make a call. Must refer to a caller's
     * project.
     * Format: `projects/{project-number-or-id}` or
     * `projects/{project-number-or-id}/locations/{location-id}`.
     * For global calls, use `projects/{project-number-or-id}/locations/global` or
     * `projects/{project-number-or-id}`.
     * Non-global location is required for AutoML models.
     * Only models within the same region (have same location-id) can be used,
     * otherwise an INVALID_ARGUMENT (400) error is returned.
     * </pre>
     *
     * <code>
     * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Project or location to make a call. Must refer to a caller's
     * project.
     * Format: `projects/{project-number-or-id}` or
     * `projects/{project-number-or-id}/locations/{location-id}`.
     * For global calls, use `projects/{project-number-or-id}/locations/global` or
     * `projects/{project-number-or-id}`.
     * Non-global location is required for AutoML models.
     * Only models within the same region (have same location-id) can be used,
     * otherwise an INVALID_ARGUMENT (400) error is returned.
     * </pre>
     *
     * <code>
     * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayLanguageCode_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The language to use to return localized, human readable names
     * of supported languages. If missing, then display names are not returned
     * in a response.
     * </pre>
     *
     * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The displayLanguageCode.
     */
    public java.lang.String getDisplayLanguageCode() {
      java.lang.Object ref = displayLanguageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayLanguageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The language to use to return localized, human readable names
     * of supported languages. If missing, then display names are not returned
     * in a response.
     * </pre>
     *
     * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for displayLanguageCode.
     */
    public com.google.protobuf.ByteString getDisplayLanguageCodeBytes() {
      java.lang.Object ref = displayLanguageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayLanguageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The language to use to return localized, human readable names
     * of supported languages. If missing, then display names are not returned
     * in a response.
     * </pre>
     *
     * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The displayLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayLanguageCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The language to use to return localized, human readable names
     * of supported languages. If missing, then display names are not returned
     * in a response.
     * </pre>
     *
     * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayLanguageCode() {

      displayLanguageCode_ = getDefaultInstance().getDisplayLanguageCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The language to use to return localized, human readable names
     * of supported languages. If missing, then display names are not returned
     * in a response.
     * </pre>
     *
     * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for displayLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayLanguageCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Get supported languages of this model.
     * The format depends on model type:
     * - AutoML Translation models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
     * - General (built-in) models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/base`
     * Returns languages supported by the specified model.
     * If missing, we get supported languages of Google general base (PBMT) model.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Get supported languages of this model.
     * The format depends on model type:
     * - AutoML Translation models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
     * - General (built-in) models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/base`
     * Returns languages supported by the specified model.
     * If missing, we get supported languages of Google general base (PBMT) model.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Get supported languages of this model.
     * The format depends on model type:
     * - AutoML Translation models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
     * - General (built-in) models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/base`
     * Returns languages supported by the specified model.
     * If missing, we get supported languages of Google general base (PBMT) model.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      model_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Get supported languages of this model.
     * The format depends on model type:
     * - AutoML Translation models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
     * - General (built-in) models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/base`
     * Returns languages supported by the specified model.
     * If missing, we get supported languages of Google general base (PBMT) model.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModel() {

      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Get supported languages of this model.
     * The format depends on model type:
     * - AutoML Translation models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
     * - General (built-in) models:
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
     *   `projects/{project-number-or-id}/locations/{location-id}/models/general/base`
     * Returns languages supported by the specified model.
     * If missing, we get supported languages of Google general base (PBMT) model.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      model_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3beta1.GetSupportedLanguagesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3beta1.GetSupportedLanguagesRequest)
  private static final com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest();
  }

  public static com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSupportedLanguagesRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetSupportedLanguagesRequest>() {
        @java.lang.Override
        public GetSupportedLanguagesRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetSupportedLanguagesRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetSupportedLanguagesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSupportedLanguagesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

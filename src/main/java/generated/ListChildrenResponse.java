// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive-server.proto

package generated;

/**
 * Protobuf type {@code proto.ListChildrenResponse}
 */
public  final class ListChildrenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ListChildrenResponse)
    ListChildrenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListChildrenResponse.newBuilder() to construct.
  private ListChildrenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListChildrenResponse() {
    contents_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    responseMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListChildrenResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListChildrenResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              contents_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            contents_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            responseMessage_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        contents_ = contents_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.ArchiveServer.internal_static_proto_ListChildrenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.ArchiveServer.internal_static_proto_ListChildrenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.ListChildrenResponse.class, generated.ListChildrenResponse.Builder.class);
  }

  public static final int CONTENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList contents_;
  /**
   * <code>repeated string contents = 1;</code>
   * @return A list containing the contents.
   */
  public com.google.protobuf.ProtocolStringList
      getContentsList() {
    return contents_;
  }
  /**
   * <code>repeated string contents = 1;</code>
   * @return The count of contents.
   */
  public int getContentsCount() {
    return contents_.size();
  }
  /**
   * <code>repeated string contents = 1;</code>
   * @param index The index of the element to return.
   * @return The contents at the given index.
   */
  public java.lang.String getContents(int index) {
    return contents_.get(index);
  }
  /**
   * <code>repeated string contents = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the contents at the given index.
   */
  public com.google.protobuf.ByteString
      getContentsBytes(int index) {
    return contents_.getByteString(index);
  }

  public static final int RESPONSE_MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object responseMessage_;
  /**
   * <code>string response_message = 2;</code>
   * @return The responseMessage.
   */
  public java.lang.String getResponseMessage() {
    java.lang.Object ref = responseMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string response_message = 2;</code>
   * @return The bytes for responseMessage.
   */
  public com.google.protobuf.ByteString
      getResponseMessageBytes() {
    java.lang.Object ref = responseMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseMessage_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < contents_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contents_.getRaw(i));
    }
    if (!getResponseMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, responseMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < contents_.size(); i++) {
        dataSize += computeStringSizeNoTag(contents_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getContentsList().size();
    }
    if (!getResponseMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, responseMessage_);
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
    if (!(obj instanceof generated.ListChildrenResponse)) {
      return super.equals(obj);
    }
    generated.ListChildrenResponse other = (generated.ListChildrenResponse) obj;

    if (!getContentsList()
        .equals(other.getContentsList())) return false;
    if (!getResponseMessage()
        .equals(other.getResponseMessage())) return false;
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
    if (getContentsCount() > 0) {
      hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getContentsList().hashCode();
    }
    hash = (37 * hash) + RESPONSE_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.ListChildrenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ListChildrenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ListChildrenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ListChildrenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ListChildrenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ListChildrenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ListChildrenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.ListChildrenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.ListChildrenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.ListChildrenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.ListChildrenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.ListChildrenResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.ListChildrenResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.ListChildrenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ListChildrenResponse)
      generated.ListChildrenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.ArchiveServer.internal_static_proto_ListChildrenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.ArchiveServer.internal_static_proto_ListChildrenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.ListChildrenResponse.class, generated.ListChildrenResponse.Builder.class);
    }

    // Construct using generated.ListChildrenResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      contents_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      responseMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.ArchiveServer.internal_static_proto_ListChildrenResponse_descriptor;
    }

    @java.lang.Override
    public generated.ListChildrenResponse getDefaultInstanceForType() {
      return generated.ListChildrenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public generated.ListChildrenResponse build() {
      generated.ListChildrenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.ListChildrenResponse buildPartial() {
      generated.ListChildrenResponse result = new generated.ListChildrenResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        contents_ = contents_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.contents_ = contents_;
      result.responseMessage_ = responseMessage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.ListChildrenResponse) {
        return mergeFrom((generated.ListChildrenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.ListChildrenResponse other) {
      if (other == generated.ListChildrenResponse.getDefaultInstance()) return this;
      if (!other.contents_.isEmpty()) {
        if (contents_.isEmpty()) {
          contents_ = other.contents_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureContentsIsMutable();
          contents_.addAll(other.contents_);
        }
        onChanged();
      }
      if (!other.getResponseMessage().isEmpty()) {
        responseMessage_ = other.responseMessage_;
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
      generated.ListChildrenResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.ListChildrenResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList contents_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureContentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contents_ = new com.google.protobuf.LazyStringArrayList(contents_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @return A list containing the contents.
     */
    public com.google.protobuf.ProtocolStringList
        getContentsList() {
      return contents_.getUnmodifiableView();
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @return The count of contents.
     */
    public int getContentsCount() {
      return contents_.size();
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @param index The index of the element to return.
     * @return The contents at the given index.
     */
    public java.lang.String getContents(int index) {
      return contents_.get(index);
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the contents at the given index.
     */
    public com.google.protobuf.ByteString
        getContentsBytes(int index) {
      return contents_.getByteString(index);
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @param index The index to set the value at.
     * @param value The contents to set.
     * @return This builder for chaining.
     */
    public Builder setContents(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureContentsIsMutable();
      contents_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @param value The contents to add.
     * @return This builder for chaining.
     */
    public Builder addContents(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureContentsIsMutable();
      contents_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @param values The contents to add.
     * @return This builder for chaining.
     */
    public Builder addAllContents(
        java.lang.Iterable<java.lang.String> values) {
      ensureContentsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, contents_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContents() {
      contents_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string contents = 1;</code>
     * @param value The bytes of the contents to add.
     * @return This builder for chaining.
     */
    public Builder addContentsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureContentsIsMutable();
      contents_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object responseMessage_ = "";
    /**
     * <code>string response_message = 2;</code>
     * @return The responseMessage.
     */
    public java.lang.String getResponseMessage() {
      java.lang.Object ref = responseMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string response_message = 2;</code>
     * @return The bytes for responseMessage.
     */
    public com.google.protobuf.ByteString
        getResponseMessageBytes() {
      java.lang.Object ref = responseMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string response_message = 2;</code>
     * @param value The responseMessage to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string response_message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseMessage() {
      
      responseMessage_ = getDefaultInstance().getResponseMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string response_message = 2;</code>
     * @param value The bytes for responseMessage to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responseMessage_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.ListChildrenResponse)
  }

  // @@protoc_insertion_point(class_scope:proto.ListChildrenResponse)
  private static final generated.ListChildrenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.ListChildrenResponse();
  }

  public static generated.ListChildrenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListChildrenResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListChildrenResponse>() {
    @java.lang.Override
    public ListChildrenResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListChildrenResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListChildrenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListChildrenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.ListChildrenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

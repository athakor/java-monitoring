// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * Contains the region, location, and list of IP
 * addresses where checkers in the location run from.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.UptimeCheckIp}
 */
public  final class UptimeCheckIp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.UptimeCheckIp)
    UptimeCheckIpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UptimeCheckIp.newBuilder() to construct.
  private UptimeCheckIp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UptimeCheckIp() {
    region_ = 0;
    location_ = "";
    ipAddress_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UptimeCheckIp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            region_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            ipAddress_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_UptimeCheckIp_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_UptimeCheckIp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.UptimeCheckIp.class, com.google.monitoring.v3.UptimeCheckIp.Builder.class);
  }

  public static final int REGION_FIELD_NUMBER = 1;
  private int region_;
  /**
   * <pre>
   * A broad region category in which the IP address is located.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
   */
  public int getRegionValue() {
    return region_;
  }
  /**
   * <pre>
   * A broad region category in which the IP address is located.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
   */
  public com.google.monitoring.v3.UptimeCheckRegion getRegion() {
    com.google.monitoring.v3.UptimeCheckRegion result = com.google.monitoring.v3.UptimeCheckRegion.valueOf(region_);
    return result == null ? com.google.monitoring.v3.UptimeCheckRegion.UNRECOGNIZED : result;
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object location_;
  /**
   * <pre>
   * A more specific location within the region that typically encodes
   * a particular city/town/metro (and its containing state/province or country)
   * within the broader umbrella region category.
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A more specific location within the region that typically encodes
   * a particular city/town/metro (and its containing state/province or country)
   * within the broader umbrella region category.
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object ipAddress_;
  /**
   * <pre>
   * The IP address from which the uptime check originates. This is a full
   * IP address (not an IP address range). Most IP addresses, as of this
   * publication, are in IPv4 format; however, one should not rely on the
   * IP addresses being in IPv4 format indefinitely and should support
   * interpreting this field in either IPv4 or IPv6 format.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   */
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The IP address from which the uptime check originates. This is a full
   * IP address (not an IP address range). Most IP addresses, as of this
   * publication, are in IPv4 format; however, one should not rely on the
   * IP addresses being in IPv4 format indefinitely and should support
   * interpreting this field in either IPv4 or IPv6 format.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   */
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (region_ != com.google.monitoring.v3.UptimeCheckRegion.REGION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, region_);
    }
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    if (!getIpAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ipAddress_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (region_ != com.google.monitoring.v3.UptimeCheckRegion.REGION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, region_);
    }
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
    }
    if (!getIpAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ipAddress_);
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
    if (!(obj instanceof com.google.monitoring.v3.UptimeCheckIp)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.UptimeCheckIp other = (com.google.monitoring.v3.UptimeCheckIp) obj;

    boolean result = true;
    result = result && region_ == other.region_;
    result = result && getLocation()
        .equals(other.getLocation());
    result = result && getIpAddress()
        .equals(other.getIpAddress());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + region_;
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.monitoring.v3.UptimeCheckIp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Contains the region, location, and list of IP
   * addresses where checkers in the location run from.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.UptimeCheckIp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.UptimeCheckIp)
      com.google.monitoring.v3.UptimeCheckIpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_UptimeCheckIp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_UptimeCheckIp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.UptimeCheckIp.class, com.google.monitoring.v3.UptimeCheckIp.Builder.class);
    }

    // Construct using com.google.monitoring.v3.UptimeCheckIp.newBuilder()
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
    public Builder clear() {
      super.clear();
      region_ = 0;

      location_ = "";

      ipAddress_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_UptimeCheckIp_descriptor;
    }

    public com.google.monitoring.v3.UptimeCheckIp getDefaultInstanceForType() {
      return com.google.monitoring.v3.UptimeCheckIp.getDefaultInstance();
    }

    public com.google.monitoring.v3.UptimeCheckIp build() {
      com.google.monitoring.v3.UptimeCheckIp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.UptimeCheckIp buildPartial() {
      com.google.monitoring.v3.UptimeCheckIp result = new com.google.monitoring.v3.UptimeCheckIp(this);
      result.region_ = region_;
      result.location_ = location_;
      result.ipAddress_ = ipAddress_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.UptimeCheckIp) {
        return mergeFrom((com.google.monitoring.v3.UptimeCheckIp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.UptimeCheckIp other) {
      if (other == com.google.monitoring.v3.UptimeCheckIp.getDefaultInstance()) return this;
      if (other.region_ != 0) {
        setRegionValue(other.getRegionValue());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.UptimeCheckIp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.UptimeCheckIp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int region_ = 0;
    /**
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     */
    public int getRegionValue() {
      return region_;
    }
    /**
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     */
    public Builder setRegionValue(int value) {
      region_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     */
    public com.google.monitoring.v3.UptimeCheckRegion getRegion() {
      com.google.monitoring.v3.UptimeCheckRegion result = com.google.monitoring.v3.UptimeCheckRegion.valueOf(region_);
      return result == null ? com.google.monitoring.v3.UptimeCheckRegion.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     */
    public Builder setRegion(com.google.monitoring.v3.UptimeCheckRegion value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      region_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     */
    public Builder clearRegion() {
      
      region_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ipAddress_ = "";
    /**
     * <pre>
     * The IP address from which the uptime check originates. This is a full
     * IP address (not an IP address range). Most IP addresses, as of this
     * publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The IP address from which the uptime check originates. This is a full
     * IP address (not an IP address range). Most IP addresses, as of this
     * publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The IP address from which the uptime check originates. This is a full
     * IP address (not an IP address range). Most IP addresses, as of this
     * publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address from which the uptime check originates. This is a full
     * IP address (not an IP address range). Most IP addresses, as of this
     * publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     */
    public Builder clearIpAddress() {
      
      ipAddress_ = getDefaultInstance().getIpAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address from which the uptime check originates. This is a full
     * IP address (not an IP address range). Most IP addresses, as of this
     * publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipAddress_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.UptimeCheckIp)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.UptimeCheckIp)
  private static final com.google.monitoring.v3.UptimeCheckIp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.UptimeCheckIp();
  }

  public static com.google.monitoring.v3.UptimeCheckIp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UptimeCheckIp>
      PARSER = new com.google.protobuf.AbstractParser<UptimeCheckIp>() {
    public UptimeCheckIp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UptimeCheckIp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UptimeCheckIp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UptimeCheckIp> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.UptimeCheckIp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


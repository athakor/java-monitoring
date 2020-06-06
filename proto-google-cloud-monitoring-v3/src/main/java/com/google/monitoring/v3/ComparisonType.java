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
// source: google/monitoring/v3/common.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * Specifies an ordering relationship on two arguments, called `left` and
 * `right`.
 * </pre>
 *
 * Protobuf enum {@code google.monitoring.v3.ComparisonType}
 */
public enum ComparisonType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No ordering relationship is specified.
   * </pre>
   *
   * <code>COMPARISON_UNSPECIFIED = 0;</code>
   */
  COMPARISON_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * True if the left argument is greater than the right argument.
   * </pre>
   *
   * <code>COMPARISON_GT = 1;</code>
   */
  COMPARISON_GT(1),
  /**
   *
   *
   * <pre>
   * True if the left argument is greater than or equal to the right argument.
   * </pre>
   *
   * <code>COMPARISON_GE = 2;</code>
   */
  COMPARISON_GE(2),
  /**
   *
   *
   * <pre>
   * True if the left argument is less than the right argument.
   * </pre>
   *
   * <code>COMPARISON_LT = 3;</code>
   */
  COMPARISON_LT(3),
  /**
   *
   *
   * <pre>
   * True if the left argument is less than or equal to the right argument.
   * </pre>
   *
   * <code>COMPARISON_LE = 4;</code>
   */
  COMPARISON_LE(4),
  /**
   *
   *
   * <pre>
   * True if the left argument is equal to the right argument.
   * </pre>
   *
   * <code>COMPARISON_EQ = 5;</code>
   */
  COMPARISON_EQ(5),
  /**
   *
   *
   * <pre>
   * True if the left argument is not equal to the right argument.
   * </pre>
   *
   * <code>COMPARISON_NE = 6;</code>
   */
  COMPARISON_NE(6),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No ordering relationship is specified.
   * </pre>
   *
   * <code>COMPARISON_UNSPECIFIED = 0;</code>
   */
  public static final int COMPARISON_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * True if the left argument is greater than the right argument.
   * </pre>
   *
   * <code>COMPARISON_GT = 1;</code>
   */
  public static final int COMPARISON_GT_VALUE = 1;
  /**
   *
   *
   * <pre>
   * True if the left argument is greater than or equal to the right argument.
   * </pre>
   *
   * <code>COMPARISON_GE = 2;</code>
   */
  public static final int COMPARISON_GE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * True if the left argument is less than the right argument.
   * </pre>
   *
   * <code>COMPARISON_LT = 3;</code>
   */
  public static final int COMPARISON_LT_VALUE = 3;
  /**
   *
   *
   * <pre>
   * True if the left argument is less than or equal to the right argument.
   * </pre>
   *
   * <code>COMPARISON_LE = 4;</code>
   */
  public static final int COMPARISON_LE_VALUE = 4;
  /**
   *
   *
   * <pre>
   * True if the left argument is equal to the right argument.
   * </pre>
   *
   * <code>COMPARISON_EQ = 5;</code>
   */
  public static final int COMPARISON_EQ_VALUE = 5;
  /**
   *
   *
   * <pre>
   * True if the left argument is not equal to the right argument.
   * </pre>
   *
   * <code>COMPARISON_NE = 6;</code>
   */
  public static final int COMPARISON_NE_VALUE = 6;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ComparisonType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ComparisonType forNumber(int value) {
    switch (value) {
      case 0:
        return COMPARISON_UNSPECIFIED;
      case 1:
        return COMPARISON_GT;
      case 2:
        return COMPARISON_GE;
      case 3:
        return COMPARISON_LT;
      case 4:
        return COMPARISON_LE;
      case 5:
        return COMPARISON_EQ;
      case 6:
        return COMPARISON_NE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ComparisonType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ComparisonType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ComparisonType>() {
        public ComparisonType findValueByNumber(int number) {
          return ComparisonType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.monitoring.v3.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ComparisonType[] VALUES = values();

  public static ComparisonType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ComparisonType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.monitoring.v3.ComparisonType)
}

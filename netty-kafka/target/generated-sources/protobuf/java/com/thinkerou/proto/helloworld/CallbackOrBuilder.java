// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.thinkerou.proto.helloworld;

public interface CallbackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.Callback)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.helloworld.KafkaEventOne one_event = 1;</code>
   */
  boolean hasOneEvent();
  /**
   * <code>.helloworld.KafkaEventOne one_event = 1;</code>
   */
  com.thinkerou.proto.helloworld.KafkaEventOne getOneEvent();
  /**
   * <code>.helloworld.KafkaEventOne one_event = 1;</code>
   */
  com.thinkerou.proto.helloworld.KafkaEventOneOrBuilder getOneEventOrBuilder();

  /**
   * <code>.helloworld.KafkaEventTwo two_event = 2;</code>
   */
  boolean hasTwoEvent();
  /**
   * <code>.helloworld.KafkaEventTwo two_event = 2;</code>
   */
  com.thinkerou.proto.helloworld.KafkaEventTwo getTwoEvent();
  /**
   * <code>.helloworld.KafkaEventTwo two_event = 2;</code>
   */
  com.thinkerou.proto.helloworld.KafkaEventTwoOrBuilder getTwoEventOrBuilder();

  public com.thinkerou.proto.helloworld.Callback.EventTypeCase getEventTypeCase();
}

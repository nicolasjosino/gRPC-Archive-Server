// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive-server.proto

package generated;

public interface SendArchiveRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.SendArchiveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bytes contents = 2;</code>
   * @return The contents.
   */
  com.google.protobuf.ByteString getContents();
}
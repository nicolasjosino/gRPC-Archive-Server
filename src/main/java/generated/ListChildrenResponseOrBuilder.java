// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive-server.proto

package generated;

public interface ListChildrenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ListChildrenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string contents = 1;</code>
   * @return A list containing the contents.
   */
  java.util.List<java.lang.String>
      getContentsList();
  /**
   * <code>repeated string contents = 1;</code>
   * @return The count of contents.
   */
  int getContentsCount();
  /**
   * <code>repeated string contents = 1;</code>
   * @param index The index of the element to return.
   * @return The contents at the given index.
   */
  java.lang.String getContents(int index);
  /**
   * <code>repeated string contents = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the contents at the given index.
   */
  com.google.protobuf.ByteString
      getContentsBytes(int index);

  /**
   * <code>string response_message = 2;</code>
   * @return The responseMessage.
   */
  java.lang.String getResponseMessage();
  /**
   * <code>string response_message = 2;</code>
   * @return The bytes for responseMessage.
   */
  com.google.protobuf.ByteString
      getResponseMessageBytes();
}
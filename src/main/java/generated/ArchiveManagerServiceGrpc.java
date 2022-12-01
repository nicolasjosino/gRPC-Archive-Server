package generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: archive-server.proto")
public final class ArchiveManagerServiceGrpc {

  private ArchiveManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.ArchiveManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.ListFilesRequest,
      generated.ListFilesResponse> getListFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFiles",
      requestType = generated.ListFilesRequest.class,
      responseType = generated.ListFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ListFilesRequest,
      generated.ListFilesResponse> getListFilesMethod() {
    io.grpc.MethodDescriptor<generated.ListFilesRequest, generated.ListFilesResponse> getListFilesMethod;
    if ((getListFilesMethod = ArchiveManagerServiceGrpc.getListFilesMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getListFilesMethod = ArchiveManagerServiceGrpc.getListFilesMethod) == null) {
          ArchiveManagerServiceGrpc.getListFilesMethod = getListFilesMethod = 
              io.grpc.MethodDescriptor.<generated.ListFilesRequest, generated.ListFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "ListFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ListFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ListFilesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("ListFiles"))
                  .build();
          }
        }
     }
     return getListFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.GetArchiveRequest,
      generated.GetArchiveResponse> getGetArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArchive",
      requestType = generated.GetArchiveRequest.class,
      responseType = generated.GetArchiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.GetArchiveRequest,
      generated.GetArchiveResponse> getGetArchiveMethod() {
    io.grpc.MethodDescriptor<generated.GetArchiveRequest, generated.GetArchiveResponse> getGetArchiveMethod;
    if ((getGetArchiveMethod = ArchiveManagerServiceGrpc.getGetArchiveMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getGetArchiveMethod = ArchiveManagerServiceGrpc.getGetArchiveMethod) == null) {
          ArchiveManagerServiceGrpc.getGetArchiveMethod = getGetArchiveMethod = 
              io.grpc.MethodDescriptor.<generated.GetArchiveRequest, generated.GetArchiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "GetArchive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.GetArchiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.GetArchiveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("GetArchive"))
                  .build();
          }
        }
     }
     return getGetArchiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.DeleteArchiveRequest,
      generated.DeleteArchiveResponse> getDeleteArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteArchive",
      requestType = generated.DeleteArchiveRequest.class,
      responseType = generated.DeleteArchiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.DeleteArchiveRequest,
      generated.DeleteArchiveResponse> getDeleteArchiveMethod() {
    io.grpc.MethodDescriptor<generated.DeleteArchiveRequest, generated.DeleteArchiveResponse> getDeleteArchiveMethod;
    if ((getDeleteArchiveMethod = ArchiveManagerServiceGrpc.getDeleteArchiveMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getDeleteArchiveMethod = ArchiveManagerServiceGrpc.getDeleteArchiveMethod) == null) {
          ArchiveManagerServiceGrpc.getDeleteArchiveMethod = getDeleteArchiveMethod = 
              io.grpc.MethodDescriptor.<generated.DeleteArchiveRequest, generated.DeleteArchiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "DeleteArchive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DeleteArchiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DeleteArchiveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("DeleteArchive"))
                  .build();
          }
        }
     }
     return getDeleteArchiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.ListChildrenRequest,
      generated.ListChildrenResponse> getListChildrenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListChildren",
      requestType = generated.ListChildrenRequest.class,
      responseType = generated.ListChildrenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ListChildrenRequest,
      generated.ListChildrenResponse> getListChildrenMethod() {
    io.grpc.MethodDescriptor<generated.ListChildrenRequest, generated.ListChildrenResponse> getListChildrenMethod;
    if ((getListChildrenMethod = ArchiveManagerServiceGrpc.getListChildrenMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getListChildrenMethod = ArchiveManagerServiceGrpc.getListChildrenMethod) == null) {
          ArchiveManagerServiceGrpc.getListChildrenMethod = getListChildrenMethod = 
              io.grpc.MethodDescriptor.<generated.ListChildrenRequest, generated.ListChildrenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "ListChildren"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ListChildrenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ListChildrenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("ListChildren"))
                  .build();
          }
        }
     }
     return getListChildrenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.SendArchiveRequest,
      generated.SendArchiveResponse> getSendArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendArchive",
      requestType = generated.SendArchiveRequest.class,
      responseType = generated.SendArchiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.SendArchiveRequest,
      generated.SendArchiveResponse> getSendArchiveMethod() {
    io.grpc.MethodDescriptor<generated.SendArchiveRequest, generated.SendArchiveResponse> getSendArchiveMethod;
    if ((getSendArchiveMethod = ArchiveManagerServiceGrpc.getSendArchiveMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getSendArchiveMethod = ArchiveManagerServiceGrpc.getSendArchiveMethod) == null) {
          ArchiveManagerServiceGrpc.getSendArchiveMethod = getSendArchiveMethod = 
              io.grpc.MethodDescriptor.<generated.SendArchiveRequest, generated.SendArchiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "SendArchive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.SendArchiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.SendArchiveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("SendArchive"))
                  .build();
          }
        }
     }
     return getSendArchiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.PwdRequest,
      generated.PwdResponse> getPwdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pwd",
      requestType = generated.PwdRequest.class,
      responseType = generated.PwdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.PwdRequest,
      generated.PwdResponse> getPwdMethod() {
    io.grpc.MethodDescriptor<generated.PwdRequest, generated.PwdResponse> getPwdMethod;
    if ((getPwdMethod = ArchiveManagerServiceGrpc.getPwdMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getPwdMethod = ArchiveManagerServiceGrpc.getPwdMethod) == null) {
          ArchiveManagerServiceGrpc.getPwdMethod = getPwdMethod = 
              io.grpc.MethodDescriptor.<generated.PwdRequest, generated.PwdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "Pwd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.PwdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.PwdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("Pwd"))
                  .build();
          }
        }
     }
     return getPwdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.ChangeDirectoryUpRequest,
      generated.ChangeDirectoryUpResponse> getChangeDirectoryUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeDirectoryUp",
      requestType = generated.ChangeDirectoryUpRequest.class,
      responseType = generated.ChangeDirectoryUpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ChangeDirectoryUpRequest,
      generated.ChangeDirectoryUpResponse> getChangeDirectoryUpMethod() {
    io.grpc.MethodDescriptor<generated.ChangeDirectoryUpRequest, generated.ChangeDirectoryUpResponse> getChangeDirectoryUpMethod;
    if ((getChangeDirectoryUpMethod = ArchiveManagerServiceGrpc.getChangeDirectoryUpMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getChangeDirectoryUpMethod = ArchiveManagerServiceGrpc.getChangeDirectoryUpMethod) == null) {
          ArchiveManagerServiceGrpc.getChangeDirectoryUpMethod = getChangeDirectoryUpMethod = 
              io.grpc.MethodDescriptor.<generated.ChangeDirectoryUpRequest, generated.ChangeDirectoryUpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "ChangeDirectoryUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ChangeDirectoryUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ChangeDirectoryUpResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("ChangeDirectoryUp"))
                  .build();
          }
        }
     }
     return getChangeDirectoryUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.ChangeDirectoryDownRequest,
      generated.ChangeDirectoryDownResponse> getChangeDirectoryDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeDirectoryDown",
      requestType = generated.ChangeDirectoryDownRequest.class,
      responseType = generated.ChangeDirectoryDownResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ChangeDirectoryDownRequest,
      generated.ChangeDirectoryDownResponse> getChangeDirectoryDownMethod() {
    io.grpc.MethodDescriptor<generated.ChangeDirectoryDownRequest, generated.ChangeDirectoryDownResponse> getChangeDirectoryDownMethod;
    if ((getChangeDirectoryDownMethod = ArchiveManagerServiceGrpc.getChangeDirectoryDownMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getChangeDirectoryDownMethod = ArchiveManagerServiceGrpc.getChangeDirectoryDownMethod) == null) {
          ArchiveManagerServiceGrpc.getChangeDirectoryDownMethod = getChangeDirectoryDownMethod = 
              io.grpc.MethodDescriptor.<generated.ChangeDirectoryDownRequest, generated.ChangeDirectoryDownResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "ChangeDirectoryDown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ChangeDirectoryDownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ChangeDirectoryDownResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("ChangeDirectoryDown"))
                  .build();
          }
        }
     }
     return getChangeDirectoryDownMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArchiveManagerServiceStub newStub(io.grpc.Channel channel) {
    return new ArchiveManagerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArchiveManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArchiveManagerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArchiveManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArchiveManagerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ArchiveManagerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listFiles(generated.ListFilesRequest request,
        io.grpc.stub.StreamObserver<generated.ListFilesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFilesMethod(), responseObserver);
    }

    /**
     */
    public void getArchive(generated.GetArchiveRequest request,
        io.grpc.stub.StreamObserver<generated.GetArchiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetArchiveMethod(), responseObserver);
    }

    /**
     */
    public void deleteArchive(generated.DeleteArchiveRequest request,
        io.grpc.stub.StreamObserver<generated.DeleteArchiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteArchiveMethod(), responseObserver);
    }

    /**
     */
    public void listChildren(generated.ListChildrenRequest request,
        io.grpc.stub.StreamObserver<generated.ListChildrenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListChildrenMethod(), responseObserver);
    }

    /**
     */
    public void sendArchive(generated.SendArchiveRequest request,
        io.grpc.stub.StreamObserver<generated.SendArchiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendArchiveMethod(), responseObserver);
    }

    /**
     */
    public void pwd(generated.PwdRequest request,
        io.grpc.stub.StreamObserver<generated.PwdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPwdMethod(), responseObserver);
    }

    /**
     */
    public void changeDirectoryUp(generated.ChangeDirectoryUpRequest request,
        io.grpc.stub.StreamObserver<generated.ChangeDirectoryUpResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDirectoryUpMethod(), responseObserver);
    }

    /**
     */
    public void changeDirectoryDown(generated.ChangeDirectoryDownRequest request,
        io.grpc.stub.StreamObserver<generated.ChangeDirectoryDownResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDirectoryDownMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListFilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ListFilesRequest,
                generated.ListFilesResponse>(
                  this, METHODID_LIST_FILES)))
          .addMethod(
            getGetArchiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.GetArchiveRequest,
                generated.GetArchiveResponse>(
                  this, METHODID_GET_ARCHIVE)))
          .addMethod(
            getDeleteArchiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.DeleteArchiveRequest,
                generated.DeleteArchiveResponse>(
                  this, METHODID_DELETE_ARCHIVE)))
          .addMethod(
            getListChildrenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ListChildrenRequest,
                generated.ListChildrenResponse>(
                  this, METHODID_LIST_CHILDREN)))
          .addMethod(
            getSendArchiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.SendArchiveRequest,
                generated.SendArchiveResponse>(
                  this, METHODID_SEND_ARCHIVE)))
          .addMethod(
            getPwdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.PwdRequest,
                generated.PwdResponse>(
                  this, METHODID_PWD)))
          .addMethod(
            getChangeDirectoryUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ChangeDirectoryUpRequest,
                generated.ChangeDirectoryUpResponse>(
                  this, METHODID_CHANGE_DIRECTORY_UP)))
          .addMethod(
            getChangeDirectoryDownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ChangeDirectoryDownRequest,
                generated.ChangeDirectoryDownResponse>(
                  this, METHODID_CHANGE_DIRECTORY_DOWN)))
          .build();
    }
  }

  /**
   */
  public static final class ArchiveManagerServiceStub extends io.grpc.stub.AbstractStub<ArchiveManagerServiceStub> {
    private ArchiveManagerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArchiveManagerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArchiveManagerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArchiveManagerServiceStub(channel, callOptions);
    }

    /**
     */
    public void listFiles(generated.ListFilesRequest request,
        io.grpc.stub.StreamObserver<generated.ListFilesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArchive(generated.GetArchiveRequest request,
        io.grpc.stub.StreamObserver<generated.GetArchiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetArchiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteArchive(generated.DeleteArchiveRequest request,
        io.grpc.stub.StreamObserver<generated.DeleteArchiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteArchiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listChildren(generated.ListChildrenRequest request,
        io.grpc.stub.StreamObserver<generated.ListChildrenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListChildrenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendArchive(generated.SendArchiveRequest request,
        io.grpc.stub.StreamObserver<generated.SendArchiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendArchiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pwd(generated.PwdRequest request,
        io.grpc.stub.StreamObserver<generated.PwdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPwdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeDirectoryUp(generated.ChangeDirectoryUpRequest request,
        io.grpc.stub.StreamObserver<generated.ChangeDirectoryUpResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDirectoryUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeDirectoryDown(generated.ChangeDirectoryDownRequest request,
        io.grpc.stub.StreamObserver<generated.ChangeDirectoryDownResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDirectoryDownMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ArchiveManagerServiceBlockingStub extends io.grpc.stub.AbstractStub<ArchiveManagerServiceBlockingStub> {
    private ArchiveManagerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArchiveManagerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArchiveManagerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArchiveManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.ListFilesResponse listFiles(generated.ListFilesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.GetArchiveResponse getArchive(generated.GetArchiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetArchiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.DeleteArchiveResponse deleteArchive(generated.DeleteArchiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteArchiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.ListChildrenResponse listChildren(generated.ListChildrenRequest request) {
      return blockingUnaryCall(
          getChannel(), getListChildrenMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.SendArchiveResponse sendArchive(generated.SendArchiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendArchiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.PwdResponse pwd(generated.PwdRequest request) {
      return blockingUnaryCall(
          getChannel(), getPwdMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.ChangeDirectoryUpResponse changeDirectoryUp(generated.ChangeDirectoryUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDirectoryUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.ChangeDirectoryDownResponse changeDirectoryDown(generated.ChangeDirectoryDownRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDirectoryDownMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ArchiveManagerServiceFutureStub extends io.grpc.stub.AbstractStub<ArchiveManagerServiceFutureStub> {
    private ArchiveManagerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArchiveManagerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArchiveManagerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArchiveManagerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ListFilesResponse> listFiles(
        generated.ListFilesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.GetArchiveResponse> getArchive(
        generated.GetArchiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetArchiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.DeleteArchiveResponse> deleteArchive(
        generated.DeleteArchiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteArchiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ListChildrenResponse> listChildren(
        generated.ListChildrenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListChildrenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.SendArchiveResponse> sendArchive(
        generated.SendArchiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendArchiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.PwdResponse> pwd(
        generated.PwdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPwdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ChangeDirectoryUpResponse> changeDirectoryUp(
        generated.ChangeDirectoryUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDirectoryUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ChangeDirectoryDownResponse> changeDirectoryDown(
        generated.ChangeDirectoryDownRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDirectoryDownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_FILES = 0;
  private static final int METHODID_GET_ARCHIVE = 1;
  private static final int METHODID_DELETE_ARCHIVE = 2;
  private static final int METHODID_LIST_CHILDREN = 3;
  private static final int METHODID_SEND_ARCHIVE = 4;
  private static final int METHODID_PWD = 5;
  private static final int METHODID_CHANGE_DIRECTORY_UP = 6;
  private static final int METHODID_CHANGE_DIRECTORY_DOWN = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArchiveManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArchiveManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_FILES:
          serviceImpl.listFiles((generated.ListFilesRequest) request,
              (io.grpc.stub.StreamObserver<generated.ListFilesResponse>) responseObserver);
          break;
        case METHODID_GET_ARCHIVE:
          serviceImpl.getArchive((generated.GetArchiveRequest) request,
              (io.grpc.stub.StreamObserver<generated.GetArchiveResponse>) responseObserver);
          break;
        case METHODID_DELETE_ARCHIVE:
          serviceImpl.deleteArchive((generated.DeleteArchiveRequest) request,
              (io.grpc.stub.StreamObserver<generated.DeleteArchiveResponse>) responseObserver);
          break;
        case METHODID_LIST_CHILDREN:
          serviceImpl.listChildren((generated.ListChildrenRequest) request,
              (io.grpc.stub.StreamObserver<generated.ListChildrenResponse>) responseObserver);
          break;
        case METHODID_SEND_ARCHIVE:
          serviceImpl.sendArchive((generated.SendArchiveRequest) request,
              (io.grpc.stub.StreamObserver<generated.SendArchiveResponse>) responseObserver);
          break;
        case METHODID_PWD:
          serviceImpl.pwd((generated.PwdRequest) request,
              (io.grpc.stub.StreamObserver<generated.PwdResponse>) responseObserver);
          break;
        case METHODID_CHANGE_DIRECTORY_UP:
          serviceImpl.changeDirectoryUp((generated.ChangeDirectoryUpRequest) request,
              (io.grpc.stub.StreamObserver<generated.ChangeDirectoryUpResponse>) responseObserver);
          break;
        case METHODID_CHANGE_DIRECTORY_DOWN:
          serviceImpl.changeDirectoryDown((generated.ChangeDirectoryDownRequest) request,
              (io.grpc.stub.StreamObserver<generated.ChangeDirectoryDownResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ArchiveManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArchiveManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.ArchiveServer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArchiveManagerService");
    }
  }

  private static final class ArchiveManagerServiceFileDescriptorSupplier
      extends ArchiveManagerServiceBaseDescriptorSupplier {
    ArchiveManagerServiceFileDescriptorSupplier() {}
  }

  private static final class ArchiveManagerServiceMethodDescriptorSupplier
      extends ArchiveManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArchiveManagerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArchiveManagerServiceFileDescriptorSupplier())
              .addMethod(getListFilesMethod())
              .addMethod(getGetArchiveMethod())
              .addMethod(getDeleteArchiveMethod())
              .addMethod(getListChildrenMethod())
              .addMethod(getSendArchiveMethod())
              .addMethod(getPwdMethod())
              .addMethod(getChangeDirectoryUpMethod())
              .addMethod(getChangeDirectoryDownMethod())
              .build();
        }
      }
    }
    return result;
  }
}

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
  private static volatile io.grpc.MethodDescriptor<generated.Empty,
      generated.StringResponse> getListFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listFiles",
      requestType = generated.Empty.class,
      responseType = generated.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Empty,
      generated.StringResponse> getListFilesMethod() {
    io.grpc.MethodDescriptor<generated.Empty, generated.StringResponse> getListFilesMethod;
    if ((getListFilesMethod = ArchiveManagerServiceGrpc.getListFilesMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getListFilesMethod = ArchiveManagerServiceGrpc.getListFilesMethod) == null) {
          ArchiveManagerServiceGrpc.getListFilesMethod = getListFilesMethod = 
              io.grpc.MethodDescriptor.<generated.Empty, generated.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "listFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("listFiles"))
                  .build();
          }
        }
     }
     return getListFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Request,
      generated.ArchiveResponse> getGetArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getArchive",
      requestType = generated.Request.class,
      responseType = generated.ArchiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Request,
      generated.ArchiveResponse> getGetArchiveMethod() {
    io.grpc.MethodDescriptor<generated.Request, generated.ArchiveResponse> getGetArchiveMethod;
    if ((getGetArchiveMethod = ArchiveManagerServiceGrpc.getGetArchiveMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getGetArchiveMethod = ArchiveManagerServiceGrpc.getGetArchiveMethod) == null) {
          ArchiveManagerServiceGrpc.getGetArchiveMethod = getGetArchiveMethod = 
              io.grpc.MethodDescriptor.<generated.Request, generated.ArchiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "getArchive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ArchiveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("getArchive"))
                  .build();
          }
        }
     }
     return getGetArchiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Request,
      generated.APIResponse> getDeleteArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteArchive",
      requestType = generated.Request.class,
      responseType = generated.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Request,
      generated.APIResponse> getDeleteArchiveMethod() {
    io.grpc.MethodDescriptor<generated.Request, generated.APIResponse> getDeleteArchiveMethod;
    if ((getDeleteArchiveMethod = ArchiveManagerServiceGrpc.getDeleteArchiveMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getDeleteArchiveMethod = ArchiveManagerServiceGrpc.getDeleteArchiveMethod) == null) {
          ArchiveManagerServiceGrpc.getDeleteArchiveMethod = getDeleteArchiveMethod = 
              io.grpc.MethodDescriptor.<generated.Request, generated.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "deleteArchive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("deleteArchive"))
                  .build();
          }
        }
     }
     return getDeleteArchiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Request,
      generated.StringResponse> getListChildrenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listChildren",
      requestType = generated.Request.class,
      responseType = generated.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Request,
      generated.StringResponse> getListChildrenMethod() {
    io.grpc.MethodDescriptor<generated.Request, generated.StringResponse> getListChildrenMethod;
    if ((getListChildrenMethod = ArchiveManagerServiceGrpc.getListChildrenMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getListChildrenMethod = ArchiveManagerServiceGrpc.getListChildrenMethod) == null) {
          ArchiveManagerServiceGrpc.getListChildrenMethod = getListChildrenMethod = 
              io.grpc.MethodDescriptor.<generated.Request, generated.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "listChildren"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("listChildren"))
                  .build();
          }
        }
     }
     return getListChildrenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.SendRequest,
      generated.APIResponse> getSendArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendArchive",
      requestType = generated.SendRequest.class,
      responseType = generated.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.SendRequest,
      generated.APIResponse> getSendArchiveMethod() {
    io.grpc.MethodDescriptor<generated.SendRequest, generated.APIResponse> getSendArchiveMethod;
    if ((getSendArchiveMethod = ArchiveManagerServiceGrpc.getSendArchiveMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getSendArchiveMethod = ArchiveManagerServiceGrpc.getSendArchiveMethod) == null) {
          ArchiveManagerServiceGrpc.getSendArchiveMethod = getSendArchiveMethod = 
              io.grpc.MethodDescriptor.<generated.SendRequest, generated.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "sendArchive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.SendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("sendArchive"))
                  .build();
          }
        }
     }
     return getSendArchiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Empty,
      generated.StringResponse> getPwdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pwd",
      requestType = generated.Empty.class,
      responseType = generated.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Empty,
      generated.StringResponse> getPwdMethod() {
    io.grpc.MethodDescriptor<generated.Empty, generated.StringResponse> getPwdMethod;
    if ((getPwdMethod = ArchiveManagerServiceGrpc.getPwdMethod) == null) {
      synchronized (ArchiveManagerServiceGrpc.class) {
        if ((getPwdMethod = ArchiveManagerServiceGrpc.getPwdMethod) == null) {
          ArchiveManagerServiceGrpc.getPwdMethod = getPwdMethod = 
              io.grpc.MethodDescriptor.<generated.Empty, generated.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ArchiveManagerService", "pwd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ArchiveManagerServiceMethodDescriptorSupplier("pwd"))
                  .build();
          }
        }
     }
     return getPwdMethod;
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
    public void listFiles(generated.Empty request,
        io.grpc.stub.StreamObserver<generated.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFilesMethod(), responseObserver);
    }

    /**
     */
    public void getArchive(generated.Request request,
        io.grpc.stub.StreamObserver<generated.ArchiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetArchiveMethod(), responseObserver);
    }

    /**
     */
    public void deleteArchive(generated.Request request,
        io.grpc.stub.StreamObserver<generated.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteArchiveMethod(), responseObserver);
    }

    /**
     */
    public void listChildren(generated.Request request,
        io.grpc.stub.StreamObserver<generated.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListChildrenMethod(), responseObserver);
    }

    /**
     */
    public void sendArchive(generated.SendRequest request,
        io.grpc.stub.StreamObserver<generated.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendArchiveMethod(), responseObserver);
    }

    /**
     */
    public void pwd(generated.Empty request,
        io.grpc.stub.StreamObserver<generated.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPwdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListFilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Empty,
                generated.StringResponse>(
                  this, METHODID_LIST_FILES)))
          .addMethod(
            getGetArchiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Request,
                generated.ArchiveResponse>(
                  this, METHODID_GET_ARCHIVE)))
          .addMethod(
            getDeleteArchiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Request,
                generated.APIResponse>(
                  this, METHODID_DELETE_ARCHIVE)))
          .addMethod(
            getListChildrenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Request,
                generated.StringResponse>(
                  this, METHODID_LIST_CHILDREN)))
          .addMethod(
            getSendArchiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.SendRequest,
                generated.APIResponse>(
                  this, METHODID_SEND_ARCHIVE)))
          .addMethod(
            getPwdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Empty,
                generated.StringResponse>(
                  this, METHODID_PWD)))
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
    public void listFiles(generated.Empty request,
        io.grpc.stub.StreamObserver<generated.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArchive(generated.Request request,
        io.grpc.stub.StreamObserver<generated.ArchiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetArchiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteArchive(generated.Request request,
        io.grpc.stub.StreamObserver<generated.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteArchiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listChildren(generated.Request request,
        io.grpc.stub.StreamObserver<generated.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListChildrenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendArchive(generated.SendRequest request,
        io.grpc.stub.StreamObserver<generated.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendArchiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pwd(generated.Empty request,
        io.grpc.stub.StreamObserver<generated.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPwdMethod(), getCallOptions()), request, responseObserver);
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
    public generated.StringResponse listFiles(generated.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListFilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.ArchiveResponse getArchive(generated.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetArchiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.APIResponse deleteArchive(generated.Request request) {
      return blockingUnaryCall(
          getChannel(), getDeleteArchiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.StringResponse listChildren(generated.Request request) {
      return blockingUnaryCall(
          getChannel(), getListChildrenMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.APIResponse sendArchive(generated.SendRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendArchiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.StringResponse pwd(generated.Empty request) {
      return blockingUnaryCall(
          getChannel(), getPwdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<generated.StringResponse> listFiles(
        generated.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListFilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ArchiveResponse> getArchive(
        generated.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetArchiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.APIResponse> deleteArchive(
        generated.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteArchiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.StringResponse> listChildren(
        generated.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getListChildrenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.APIResponse> sendArchive(
        generated.SendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendArchiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.StringResponse> pwd(
        generated.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getPwdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_FILES = 0;
  private static final int METHODID_GET_ARCHIVE = 1;
  private static final int METHODID_DELETE_ARCHIVE = 2;
  private static final int METHODID_LIST_CHILDREN = 3;
  private static final int METHODID_SEND_ARCHIVE = 4;
  private static final int METHODID_PWD = 5;

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
          serviceImpl.listFiles((generated.Empty) request,
              (io.grpc.stub.StreamObserver<generated.StringResponse>) responseObserver);
          break;
        case METHODID_GET_ARCHIVE:
          serviceImpl.getArchive((generated.Request) request,
              (io.grpc.stub.StreamObserver<generated.ArchiveResponse>) responseObserver);
          break;
        case METHODID_DELETE_ARCHIVE:
          serviceImpl.deleteArchive((generated.Request) request,
              (io.grpc.stub.StreamObserver<generated.APIResponse>) responseObserver);
          break;
        case METHODID_LIST_CHILDREN:
          serviceImpl.listChildren((generated.Request) request,
              (io.grpc.stub.StreamObserver<generated.StringResponse>) responseObserver);
          break;
        case METHODID_SEND_ARCHIVE:
          serviceImpl.sendArchive((generated.SendRequest) request,
              (io.grpc.stub.StreamObserver<generated.APIResponse>) responseObserver);
          break;
        case METHODID_PWD:
          serviceImpl.pwd((generated.Empty) request,
              (io.grpc.stub.StreamObserver<generated.StringResponse>) responseObserver);
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
              .build();
        }
      }
    }
    return result;
  }
}

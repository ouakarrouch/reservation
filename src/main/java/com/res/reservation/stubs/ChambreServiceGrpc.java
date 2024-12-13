package com.res.reservation.stubs;

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
    comments = "Source: Reservation.proto")
public final class ChambreServiceGrpc {

  private ChambreServiceGrpc() {}

  public static final String SERVICE_NAME = "ChambreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllChambresRequest,
      com.res.reservation.stubs.GetAllChambresResponse> getAllChambresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllChambres",
      requestType = com.res.reservation.stubs.GetAllChambresRequest.class,
      responseType = com.res.reservation.stubs.GetAllChambresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllChambresRequest,
      com.res.reservation.stubs.GetAllChambresResponse> getAllChambresMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllChambresRequest, com.res.reservation.stubs.GetAllChambresResponse> getAllChambresMethod;
    if ((getAllChambresMethod = ChambreServiceGrpc.getAllChambresMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getAllChambresMethod = ChambreServiceGrpc.getAllChambresMethod) == null) {
          ChambreServiceGrpc.getAllChambresMethod = getAllChambresMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.GetAllChambresRequest, com.res.reservation.stubs.GetAllChambresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "AllChambres"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetAllChambresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetAllChambresResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("AllChambres"))
                  .build();
          }
        }
     }
     return getAllChambresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.GetChambreByIdRequest,
      com.res.reservation.stubs.GetChambreByIdResponse> getChambreByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChambreById",
      requestType = com.res.reservation.stubs.GetChambreByIdRequest.class,
      responseType = com.res.reservation.stubs.GetChambreByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.GetChambreByIdRequest,
      com.res.reservation.stubs.GetChambreByIdResponse> getChambreByIdMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.GetChambreByIdRequest, com.res.reservation.stubs.GetChambreByIdResponse> getChambreByIdMethod;
    if ((getChambreByIdMethod = ChambreServiceGrpc.getChambreByIdMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getChambreByIdMethod = ChambreServiceGrpc.getChambreByIdMethod) == null) {
          ChambreServiceGrpc.getChambreByIdMethod = getChambreByIdMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.GetChambreByIdRequest, com.res.reservation.stubs.GetChambreByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "ChambreById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetChambreByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetChambreByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("ChambreById"))
                  .build();
          }
        }
     }
     return getChambreByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveChambreRequest,
      com.res.reservation.stubs.SaveChambreResponse> getSaveChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveChambre",
      requestType = com.res.reservation.stubs.SaveChambreRequest.class,
      responseType = com.res.reservation.stubs.SaveChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveChambreRequest,
      com.res.reservation.stubs.SaveChambreResponse> getSaveChambreMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveChambreRequest, com.res.reservation.stubs.SaveChambreResponse> getSaveChambreMethod;
    if ((getSaveChambreMethod = ChambreServiceGrpc.getSaveChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getSaveChambreMethod = ChambreServiceGrpc.getSaveChambreMethod) == null) {
          ChambreServiceGrpc.getSaveChambreMethod = getSaveChambreMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.SaveChambreRequest, com.res.reservation.stubs.SaveChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "SaveChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.SaveChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.SaveChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("SaveChambre"))
                  .build();
          }
        }
     }
     return getSaveChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteChambreRequest,
      com.res.reservation.stubs.DeleteChambreResponse> getDeleteChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteChambre",
      requestType = com.res.reservation.stubs.DeleteChambreRequest.class,
      responseType = com.res.reservation.stubs.DeleteChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteChambreRequest,
      com.res.reservation.stubs.DeleteChambreResponse> getDeleteChambreMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteChambreRequest, com.res.reservation.stubs.DeleteChambreResponse> getDeleteChambreMethod;
    if ((getDeleteChambreMethod = ChambreServiceGrpc.getDeleteChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getDeleteChambreMethod = ChambreServiceGrpc.getDeleteChambreMethod) == null) {
          ChambreServiceGrpc.getDeleteChambreMethod = getDeleteChambreMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.DeleteChambreRequest, com.res.reservation.stubs.DeleteChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "deleteChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.DeleteChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.DeleteChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("deleteChambre"))
                  .build();
          }
        }
     }
     return getDeleteChambreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChambreServiceStub newStub(io.grpc.Channel channel) {
    return new ChambreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChambreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChambreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChambreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChambreServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChambreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allChambres(com.res.reservation.stubs.GetAllChambresRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllChambresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllChambresMethod(), responseObserver);
    }

    /**
     */
    public void chambreById(com.res.reservation.stubs.GetChambreByIdRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetChambreByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChambreByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveChambre(com.res.reservation.stubs.SaveChambreRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveChambreMethod(), responseObserver);
    }

    /**
     */
    public void deleteChambre(com.res.reservation.stubs.DeleteChambreRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteChambreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllChambresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.GetAllChambresRequest,
                com.res.reservation.stubs.GetAllChambresResponse>(
                  this, METHODID_ALL_CHAMBRES)))
          .addMethod(
            getChambreByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.GetChambreByIdRequest,
                com.res.reservation.stubs.GetChambreByIdResponse>(
                  this, METHODID_CHAMBRE_BY_ID)))
          .addMethod(
            getSaveChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.SaveChambreRequest,
                com.res.reservation.stubs.SaveChambreResponse>(
                  this, METHODID_SAVE_CHAMBRE)))
          .addMethod(
            getDeleteChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.DeleteChambreRequest,
                com.res.reservation.stubs.DeleteChambreResponse>(
                  this, METHODID_DELETE_CHAMBRE)))
          .build();
    }
  }

  /**
   */
  public static final class ChambreServiceStub extends io.grpc.stub.AbstractStub<ChambreServiceStub> {
    private ChambreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceStub(channel, callOptions);
    }

    /**
     */
    public void allChambres(com.res.reservation.stubs.GetAllChambresRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllChambresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllChambresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void chambreById(com.res.reservation.stubs.GetChambreByIdRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetChambreByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChambreByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveChambre(com.res.reservation.stubs.SaveChambreRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteChambre(com.res.reservation.stubs.DeleteChambreRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteChambreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChambreServiceBlockingStub extends io.grpc.stub.AbstractStub<ChambreServiceBlockingStub> {
    private ChambreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.res.reservation.stubs.GetAllChambresResponse allChambres(com.res.reservation.stubs.GetAllChambresRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllChambresMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.GetChambreByIdResponse chambreById(com.res.reservation.stubs.GetChambreByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getChambreByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.SaveChambreResponse saveChambre(com.res.reservation.stubs.SaveChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.DeleteChambreResponse deleteChambre(com.res.reservation.stubs.DeleteChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteChambreMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChambreServiceFutureStub extends io.grpc.stub.AbstractStub<ChambreServiceFutureStub> {
    private ChambreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.GetAllChambresResponse> allChambres(
        com.res.reservation.stubs.GetAllChambresRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllChambresMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.GetChambreByIdResponse> chambreById(
        com.res.reservation.stubs.GetChambreByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChambreByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.SaveChambreResponse> saveChambre(
        com.res.reservation.stubs.SaveChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.DeleteChambreResponse> deleteChambre(
        com.res.reservation.stubs.DeleteChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteChambreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_CHAMBRES = 0;
  private static final int METHODID_CHAMBRE_BY_ID = 1;
  private static final int METHODID_SAVE_CHAMBRE = 2;
  private static final int METHODID_DELETE_CHAMBRE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChambreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChambreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_CHAMBRES:
          serviceImpl.allChambres((com.res.reservation.stubs.GetAllChambresRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllChambresResponse>) responseObserver);
          break;
        case METHODID_CHAMBRE_BY_ID:
          serviceImpl.chambreById((com.res.reservation.stubs.GetChambreByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetChambreByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_CHAMBRE:
          serviceImpl.saveChambre((com.res.reservation.stubs.SaveChambreRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveChambreResponse>) responseObserver);
          break;
        case METHODID_DELETE_CHAMBRE:
          serviceImpl.deleteChambre((com.res.reservation.stubs.DeleteChambreRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteChambreResponse>) responseObserver);
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

  private static abstract class ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChambreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.res.reservation.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChambreService");
    }
  }

  private static final class ChambreServiceFileDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier {
    ChambreServiceFileDescriptorSupplier() {}
  }

  private static final class ChambreServiceMethodDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChambreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChambreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChambreServiceFileDescriptorSupplier())
              .addMethod(getAllChambresMethod())
              .addMethod(getChambreByIdMethod())
              .addMethod(getSaveChambreMethod())
              .addMethod(getDeleteChambreMethod())
              .build();
        }
      }
    }
    return result;
  }
}

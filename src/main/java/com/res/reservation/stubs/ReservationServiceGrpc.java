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
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllReservationsRequest,
      com.res.reservation.stubs.GetAllReservationsResponse> getAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllReservations",
      requestType = com.res.reservation.stubs.GetAllReservationsRequest.class,
      responseType = com.res.reservation.stubs.GetAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllReservationsRequest,
      com.res.reservation.stubs.GetAllReservationsResponse> getAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllReservationsRequest, com.res.reservation.stubs.GetAllReservationsResponse> getAllReservationsMethod;
    if ((getAllReservationsMethod = ReservationServiceGrpc.getAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getAllReservationsMethod = ReservationServiceGrpc.getAllReservationsMethod) == null) {
          ReservationServiceGrpc.getAllReservationsMethod = getAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.GetAllReservationsRequest, com.res.reservation.stubs.GetAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "AllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("AllReservations"))
                  .build();
          }
        }
     }
     return getAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.GetReservationByIdRequest,
      com.res.reservation.stubs.GetReservationByIdResponse> getReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReservationById",
      requestType = com.res.reservation.stubs.GetReservationByIdRequest.class,
      responseType = com.res.reservation.stubs.GetReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.GetReservationByIdRequest,
      com.res.reservation.stubs.GetReservationByIdResponse> getReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.GetReservationByIdRequest, com.res.reservation.stubs.GetReservationByIdResponse> getReservationByIdMethod;
    if ((getReservationByIdMethod = ReservationServiceGrpc.getReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getReservationByIdMethod = ReservationServiceGrpc.getReservationByIdMethod) == null) {
          ReservationServiceGrpc.getReservationByIdMethod = getReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.GetReservationByIdRequest, com.res.reservation.stubs.GetReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "ReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("ReservationById"))
                  .build();
          }
        }
     }
     return getReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveReservationRequest,
      com.res.reservation.stubs.SaveReservationResponse> getSaveReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveReservation",
      requestType = com.res.reservation.stubs.SaveReservationRequest.class,
      responseType = com.res.reservation.stubs.SaveReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveReservationRequest,
      com.res.reservation.stubs.SaveReservationResponse> getSaveReservationMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveReservationRequest, com.res.reservation.stubs.SaveReservationResponse> getSaveReservationMethod;
    if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
          ReservationServiceGrpc.getSaveReservationMethod = getSaveReservationMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.SaveReservationRequest, com.res.reservation.stubs.SaveReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "SaveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.SaveReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.SaveReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("SaveReservation"))
                  .build();
          }
        }
     }
     return getSaveReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteReservationRequest,
      com.res.reservation.stubs.DeleteReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteReservation",
      requestType = com.res.reservation.stubs.DeleteReservationRequest.class,
      responseType = com.res.reservation.stubs.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteReservationRequest,
      com.res.reservation.stubs.DeleteReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteReservationRequest, com.res.reservation.stubs.DeleteReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.DeleteReservationRequest, com.res.reservation.stubs.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "deleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.DeleteReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("deleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allReservations(com.res.reservation.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllReservationsMethod(), responseObserver);
    }

    /**
     */
    public void reservationById(com.res.reservation.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReservationByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveReservation(com.res.reservation.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveReservationMethod(), responseObserver);
    }

    /**
     */
    public void deleteReservation(com.res.reservation.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.GetAllReservationsRequest,
                com.res.reservation.stubs.GetAllReservationsResponse>(
                  this, METHODID_ALL_RESERVATIONS)))
          .addMethod(
            getReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.GetReservationByIdRequest,
                com.res.reservation.stubs.GetReservationByIdResponse>(
                  this, METHODID_RESERVATION_BY_ID)))
          .addMethod(
            getSaveReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.SaveReservationRequest,
                com.res.reservation.stubs.SaveReservationResponse>(
                  this, METHODID_SAVE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.DeleteReservationRequest,
                com.res.reservation.stubs.DeleteReservationResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void allReservations(com.res.reservation.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reservationById(com.res.reservation.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveReservation(com.res.reservation.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(com.res.reservation.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.res.reservation.stubs.GetAllReservationsResponse allReservations(com.res.reservation.stubs.GetAllReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.GetReservationByIdResponse reservationById(com.res.reservation.stubs.GetReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.SaveReservationResponse saveReservation(com.res.reservation.stubs.SaveReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.DeleteReservationResponse deleteReservation(com.res.reservation.stubs.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.GetAllReservationsResponse> allReservations(
        com.res.reservation.stubs.GetAllReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.GetReservationByIdResponse> reservationById(
        com.res.reservation.stubs.GetReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.SaveReservationResponse> saveReservation(
        com.res.reservation.stubs.SaveReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.DeleteReservationResponse> deleteReservation(
        com.res.reservation.stubs.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_RESERVATIONS = 0;
  private static final int METHODID_RESERVATION_BY_ID = 1;
  private static final int METHODID_SAVE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_RESERVATIONS:
          serviceImpl.allReservations((com.res.reservation.stubs.GetAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllReservationsResponse>) responseObserver);
          break;
        case METHODID_RESERVATION_BY_ID:
          serviceImpl.reservationById((com.res.reservation.stubs.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetReservationByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_RESERVATION:
          serviceImpl.saveReservation((com.res.reservation.stubs.SaveReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((com.res.reservation.stubs.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteReservationResponse>) responseObserver);
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

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.res.reservation.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getAllReservationsMethod())
              .addMethod(getReservationByIdMethod())
              .addMethod(getSaveReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}

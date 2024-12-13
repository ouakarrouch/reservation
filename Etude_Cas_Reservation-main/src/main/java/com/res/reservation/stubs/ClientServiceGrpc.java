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
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final String SERVICE_NAME = "ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllClientsRequest,
      com.res.reservation.stubs.GetAllClientsResponse> getAllClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllClients",
      requestType = com.res.reservation.stubs.GetAllClientsRequest.class,
      responseType = com.res.reservation.stubs.GetAllClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllClientsRequest,
      com.res.reservation.stubs.GetAllClientsResponse> getAllClientsMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.GetAllClientsRequest, com.res.reservation.stubs.GetAllClientsResponse> getAllClientsMethod;
    if ((getAllClientsMethod = ClientServiceGrpc.getAllClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getAllClientsMethod = ClientServiceGrpc.getAllClientsMethod) == null) {
          ClientServiceGrpc.getAllClientsMethod = getAllClientsMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.GetAllClientsRequest, com.res.reservation.stubs.GetAllClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "AllClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetAllClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetAllClientsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("AllClients"))
                  .build();
          }
        }
     }
     return getAllClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.GetClientByIdRequest,
      com.res.reservation.stubs.GetClientByIdResponse> getClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientById",
      requestType = com.res.reservation.stubs.GetClientByIdRequest.class,
      responseType = com.res.reservation.stubs.GetClientByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.GetClientByIdRequest,
      com.res.reservation.stubs.GetClientByIdResponse> getClientByIdMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.GetClientByIdRequest, com.res.reservation.stubs.GetClientByIdResponse> getClientByIdMethod;
    if ((getClientByIdMethod = ClientServiceGrpc.getClientByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getClientByIdMethod = ClientServiceGrpc.getClientByIdMethod) == null) {
          ClientServiceGrpc.getClientByIdMethod = getClientByIdMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.GetClientByIdRequest, com.res.reservation.stubs.GetClientByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "ClientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetClientByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.GetClientByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ClientById"))
                  .build();
          }
        }
     }
     return getClientByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveClientRequest,
      com.res.reservation.stubs.SaveClientResponse> getSaveClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveClient",
      requestType = com.res.reservation.stubs.SaveClientRequest.class,
      responseType = com.res.reservation.stubs.SaveClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveClientRequest,
      com.res.reservation.stubs.SaveClientResponse> getSaveClientMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.SaveClientRequest, com.res.reservation.stubs.SaveClientResponse> getSaveClientMethod;
    if ((getSaveClientMethod = ClientServiceGrpc.getSaveClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getSaveClientMethod = ClientServiceGrpc.getSaveClientMethod) == null) {
          ClientServiceGrpc.getSaveClientMethod = getSaveClientMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.SaveClientRequest, com.res.reservation.stubs.SaveClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "SaveClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.SaveClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.SaveClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("SaveClient"))
                  .build();
          }
        }
     }
     return getSaveClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteClientRequest,
      com.res.reservation.stubs.DeleteClientResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteClient",
      requestType = com.res.reservation.stubs.DeleteClientRequest.class,
      responseType = com.res.reservation.stubs.DeleteClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteClientRequest,
      com.res.reservation.stubs.DeleteClientResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<com.res.reservation.stubs.DeleteClientRequest, com.res.reservation.stubs.DeleteClientResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
          ClientServiceGrpc.getDeleteClientMethod = getDeleteClientMethod = 
              io.grpc.MethodDescriptor.<com.res.reservation.stubs.DeleteClientRequest, com.res.reservation.stubs.DeleteClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "deleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.DeleteClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.res.reservation.stubs.DeleteClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("deleteClient"))
                  .build();
          }
        }
     }
     return getDeleteClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    return new ClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allClients(com.res.reservation.stubs.GetAllClientsRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllClientsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllClientsMethod(), responseObserver);
    }

    /**
     */
    public void clientById(com.res.reservation.stubs.GetClientByIdRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetClientByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClientByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveClient(com.res.reservation.stubs.SaveClientRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveClientMethod(), responseObserver);
    }

    /**
     */
    public void deleteClient(com.res.reservation.stubs.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.GetAllClientsRequest,
                com.res.reservation.stubs.GetAllClientsResponse>(
                  this, METHODID_ALL_CLIENTS)))
          .addMethod(
            getClientByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.GetClientByIdRequest,
                com.res.reservation.stubs.GetClientByIdResponse>(
                  this, METHODID_CLIENT_BY_ID)))
          .addMethod(
            getSaveClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.SaveClientRequest,
                com.res.reservation.stubs.SaveClientResponse>(
                  this, METHODID_SAVE_CLIENT)))
          .addMethod(
            getDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.res.reservation.stubs.DeleteClientRequest,
                com.res.reservation.stubs.DeleteClientResponse>(
                  this, METHODID_DELETE_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class ClientServiceStub extends io.grpc.stub.AbstractStub<ClientServiceStub> {
    private ClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void allClients(com.res.reservation.stubs.GetAllClientsRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllClientsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clientById(com.res.reservation.stubs.GetClientByIdRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetClientByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveClient(com.res.reservation.stubs.SaveClientRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClient(com.res.reservation.stubs.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientServiceBlockingStub extends io.grpc.stub.AbstractStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.res.reservation.stubs.GetAllClientsResponse allClients(com.res.reservation.stubs.GetAllClientsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.GetClientByIdResponse clientById(com.res.reservation.stubs.GetClientByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.SaveClientResponse saveClient(com.res.reservation.stubs.SaveClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.res.reservation.stubs.DeleteClientResponse deleteClient(com.res.reservation.stubs.DeleteClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientServiceFutureStub extends io.grpc.stub.AbstractStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.GetAllClientsResponse> allClients(
        com.res.reservation.stubs.GetAllClientsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.GetClientByIdResponse> clientById(
        com.res.reservation.stubs.GetClientByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.SaveClientResponse> saveClient(
        com.res.reservation.stubs.SaveClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.res.reservation.stubs.DeleteClientResponse> deleteClient(
        com.res.reservation.stubs.DeleteClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_CLIENTS = 0;
  private static final int METHODID_CLIENT_BY_ID = 1;
  private static final int METHODID_SAVE_CLIENT = 2;
  private static final int METHODID_DELETE_CLIENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_CLIENTS:
          serviceImpl.allClients((com.res.reservation.stubs.GetAllClientsRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetAllClientsResponse>) responseObserver);
          break;
        case METHODID_CLIENT_BY_ID:
          serviceImpl.clientById((com.res.reservation.stubs.GetClientByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.GetClientByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_CLIENT:
          serviceImpl.saveClient((com.res.reservation.stubs.SaveClientRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.SaveClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((com.res.reservation.stubs.DeleteClientRequest) request,
              (io.grpc.stub.StreamObserver<com.res.reservation.stubs.DeleteClientResponse>) responseObserver);
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

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.res.reservation.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getAllClientsMethod())
              .addMethod(getClientByIdMethod())
              .addMethod(getSaveClientMethod())
              .addMethod(getDeleteClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}

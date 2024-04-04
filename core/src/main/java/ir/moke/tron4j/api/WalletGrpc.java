package ir.moke.tron4j.api;

import ir.moke.tron4j.proto.*;

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
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: api/api.proto")
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "protocol.Wallet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Chain.Transaction,
      TransactionReturn> getBroadcastTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastTransaction",
      requestType = Chain.Transaction.class,
      responseType = TransactionReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Chain.Transaction,
      TransactionReturn> getBroadcastTransactionMethod() {
    io.grpc.MethodDescriptor<Chain.Transaction, TransactionReturn> getBroadcastTransactionMethod;
    if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
          WalletGrpc.getBroadcastTransactionMethod = getBroadcastTransactionMethod =
              io.grpc.MethodDescriptor.<Chain.Transaction, TransactionReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionReturn.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BroadcastTransaction"))
              .build();
        }
      }
    }
    return getBroadcastTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Contract.CreateSmartContract,
          TransactionExtention> getDeployContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployContract",
      requestType = Contract.CreateSmartContract.class,
      responseType = TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Contract.CreateSmartContract,
      TransactionExtention> getDeployContractMethod() {
    io.grpc.MethodDescriptor<Contract.CreateSmartContract, TransactionExtention> getDeployContractMethod;
    if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
          WalletGrpc.getDeployContractMethod = getDeployContractMethod =
              io.grpc.MethodDescriptor.<Contract.CreateSmartContract, TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Contract.CreateSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DeployContract"))
              .build();
        }
      }
    }
    return getDeployContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Contract.TriggerSmartContract,
      TransactionExtention> getTriggerContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerContract",
      requestType = Contract.TriggerSmartContract.class,
      responseType = TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Contract.TriggerSmartContract,
      TransactionExtention> getTriggerContractMethod() {
    io.grpc.MethodDescriptor<Contract.TriggerSmartContract, TransactionExtention> getTriggerContractMethod;
    if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
          WalletGrpc.getTriggerContractMethod = getTriggerContractMethod =
              io.grpc.MethodDescriptor.<Contract.TriggerSmartContract, TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerContract"))
              .build();
        }
      }
    }
    return getTriggerContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Contract.TriggerSmartContract,
      TransactionExtention> getTriggerConstantContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerConstantContract",
      requestType = Contract.TriggerSmartContract.class,
      responseType = TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Contract.TriggerSmartContract,
      TransactionExtention> getTriggerConstantContractMethod() {
    io.grpc.MethodDescriptor<Contract.TriggerSmartContract, TransactionExtention> getTriggerConstantContractMethod;
    if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
          WalletGrpc.getTriggerConstantContractMethod = getTriggerConstantContractMethod =
              io.grpc.MethodDescriptor.<Contract.TriggerSmartContract, TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerConstantContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerConstantContract"))
              .build();
        }
      }
    }
    return getTriggerConstantContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Contract.TriggerSmartContract,
      EstimateEnergyMessage> getEstimateEnergyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateEnergy",
      requestType = Contract.TriggerSmartContract.class,
      responseType = EstimateEnergyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Contract.TriggerSmartContract,
          EstimateEnergyMessage> getEstimateEnergyMethod() {
    io.grpc.MethodDescriptor<Contract.TriggerSmartContract, EstimateEnergyMessage> getEstimateEnergyMethod;
    if ((getEstimateEnergyMethod = WalletGrpc.getEstimateEnergyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEstimateEnergyMethod = WalletGrpc.getEstimateEnergyMethod) == null) {
          WalletGrpc.getEstimateEnergyMethod = getEstimateEnergyMethod =
              io.grpc.MethodDescriptor.<Contract.TriggerSmartContract, EstimateEnergyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateEnergy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EstimateEnergyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EstimateEnergy"))
              .build();
        }
      }
    }
    return getEstimateEnergyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
          NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
          WalletGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNodeInfo"))
              .build();
        }
      }
    }
    return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      NodeList> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = NodeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      NodeList> getListNodesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, NodeList> getListNodesMethod;
    if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
          WalletGrpc.getListNodesMethod = getListNodesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, NodeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NodeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListNodes"))
              .build();
        }
      }
    }
    return getListNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      ChainParameters> getGetChainParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainParameters",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = ChainParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      ChainParameters> getGetChainParametersMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, ChainParameters> getGetChainParametersMethod;
    if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
          WalletGrpc.getGetChainParametersMethod = getGetChainParametersMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, ChainParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ChainParameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetChainParameters"))
              .build();
        }
      }
    }
    return getGetChainParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getTotalTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalTransaction",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getTotalTransactionMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage> getTotalTransactionMethod;
    if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
          WalletGrpc.getTotalTransactionMethod = getTotalTransactionMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TotalTransaction"))
              .build();
        }
      }
    }
    return getTotalTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextMaintenanceTime",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;
    if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
          WalletGrpc.getGetNextMaintenanceTimeMethod = getGetNextMaintenanceTimeMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextMaintenanceTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNextMaintenanceTime"))
              .build();
        }
      }
    }
    return getGetNextMaintenanceTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Chain.Transaction,
      TransactionSignWeight> getGetTransactionSignWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSignWeight",
      requestType = Chain.Transaction.class,
      responseType = TransactionSignWeight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Chain.Transaction,
      TransactionSignWeight> getGetTransactionSignWeightMethod() {
    io.grpc.MethodDescriptor<Chain.Transaction, TransactionSignWeight> getGetTransactionSignWeightMethod;
    if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
          WalletGrpc.getGetTransactionSignWeightMethod = getGetTransactionSignWeightMethod =
              io.grpc.MethodDescriptor.<Chain.Transaction, TransactionSignWeight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSignWeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionSignWeight.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSignWeight"))
              .build();
        }
      }
    }
    return getGetTransactionSignWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Chain.Transaction,
      TransactionApprovedList> getGetTransactionApprovedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionApprovedList",
      requestType = Chain.Transaction.class,
      responseType = TransactionApprovedList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Chain.Transaction,
      TransactionApprovedList> getGetTransactionApprovedListMethod() {
    io.grpc.MethodDescriptor<Chain.Transaction, TransactionApprovedList> getGetTransactionApprovedListMethod;
    if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
          WalletGrpc.getGetTransactionApprovedListMethod = getGetTransactionApprovedListMethod =
              io.grpc.MethodDescriptor.<Chain.Transaction, TransactionApprovedList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionApprovedList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionApprovedList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionApprovedList"))
              .build();
        }
      }
    }
    return getGetTransactionApprovedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = GrpcAPI.AccountAddressMessage.class,
      responseType = Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage, Account> getGetAccountMethod;
    if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
          WalletGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountAddressMessage, Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountIdMessage,
      Account> getGetAccountByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountById",
      requestType = GrpcAPI.AccountIdMessage.class,
      responseType = Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountIdMessage,
      Account> getGetAccountByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountIdMessage, Account> getGetAccountByIdMethod;
    if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
          WalletGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountIdMessage, Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountIdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountById"))
              .build();
        }
      }
    }
    return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      AccountNetMessage> getGetAccountNetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountNet",
      requestType = GrpcAPI.AccountAddressMessage.class,
      responseType = AccountNetMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      AccountNetMessage> getGetAccountNetMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage, AccountNetMessage> getGetAccountNetMethod;
    if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
          WalletGrpc.getGetAccountNetMethod = getGetAccountNetMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountAddressMessage, AccountNetMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountNet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AccountNetMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountNet"))
              .build();
        }
      }
    }
    return getGetAccountNetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      AccountResourceMessage> getGetAccountResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountResource",
      requestType = GrpcAPI.AccountAddressMessage.class,
      responseType = AccountResourceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      AccountResourceMessage> getGetAccountResourceMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage, AccountResourceMessage> getGetAccountResourceMethod;
    if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
          WalletGrpc.getGetAccountResourceMethod = getGetAccountResourceMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountAddressMessage, AccountResourceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AccountResourceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountResource"))
              .build();
        }
      }
    }
    return getGetAccountResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      AssetIssueList> getGetAssetIssueByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByAccount",
      requestType = GrpcAPI.AccountAddressMessage.class,
      responseType = AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      AssetIssueList> getGetAssetIssueByAccountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage, AssetIssueList> getGetAssetIssueByAccountMethod;
    if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
          WalletGrpc.getGetAssetIssueByAccountMethod = getGetAssetIssueByAccountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountAddressMessage, AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByAccount"))
              .build();
        }
      }
    }
    return getGetAssetIssueByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Contract.AssetIssueContract> getGetAssetIssueByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByName",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = Contract.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Contract.AssetIssueContract> getGetAssetIssueByNameMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, Contract.AssetIssueContract> getGetAssetIssueByNameMethod;
    if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueByNameMethod = getGetAssetIssueByNameMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, Contract.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Contract.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,AssetIssueList> getGetAssetIssueListByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueListByName",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      AssetIssueList> getGetAssetIssueListByNameMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, AssetIssueList> getGetAssetIssueListByNameMethod;
    if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueListByNameMethod = getGetAssetIssueListByNameMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueListByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueListByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueListByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Contract.AssetIssueContract> getGetAssetIssueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = Contract.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Contract.AssetIssueContract> getGetAssetIssueByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, Contract.AssetIssueContract> getGetAssetIssueByIdMethod;
    if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
          WalletGrpc.getGetAssetIssueByIdMethod = getGetAssetIssueByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, Contract.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Contract.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueById"))
              .build();
        }
      }
    }
    return getGetAssetIssueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      AssetIssueList> getGetAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueList",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      AssetIssueList> getGetAssetIssueListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, AssetIssueList> getGetAssetIssueListMethod;
    if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
          WalletGrpc.getGetAssetIssueListMethod = getGetAssetIssueListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueList"))
              .build();
        }
      }
    }
    return getGetAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      AssetIssueList> getGetPaginatedAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedAssetIssueList",
      requestType = GrpcAPI.PaginatedMessage.class,
      responseType = AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      AssetIssueList> getGetPaginatedAssetIssueListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage, AssetIssueList> getGetPaginatedAssetIssueListMethod;
    if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
          WalletGrpc.getGetPaginatedAssetIssueListMethod = getGetPaginatedAssetIssueListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PaginatedMessage, AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedAssetIssueList"))
              .build();
        }
      }
    }
    return getGetPaginatedAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      Chain.Block> getGetNowBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      Chain.Block> getGetNowBlockMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, Chain.Block> getGetNowBlockMethod;
    if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
          WalletGrpc.getGetNowBlockMethod = getGetNowBlockMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock"))
              .build();
        }
      }
    }
    return getGetNowBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      BlockExtention> getGetNowBlock2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock2",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      BlockExtention> getGetNowBlock2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, BlockExtention> getGetNowBlock2Method;
    if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
          WalletGrpc.getGetNowBlock2Method = getGetNowBlock2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock2"))
              .build();
        }
      }
    }
    return getGetNowBlock2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      Chain.Block> getGetBlockByNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      Chain.Block> getGetBlockByNumMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, Chain.Block> getGetBlockByNumMethod;
    if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
          WalletGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum"))
              .build();
        }
      }
    }
    return getGetBlockByNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      BlockExtention> getGetBlockByNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum2",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      BlockExtention> getGetBlockByNum2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, BlockExtention> getGetBlockByNum2Method;
    if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
          WalletGrpc.getGetBlockByNum2Method = getGetBlockByNum2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum2"))
              .build();
        }
      }
    }
    return getGetBlockByNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Chain.Block> getGetBlockByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Chain.Block> getGetBlockByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, Chain.Block> getGetBlockByIdMethod;
    if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
          WalletGrpc.getGetBlockByIdMethod = getGetBlockByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockById"))
              .build();
        }
      }
    }
    return getGetBlockByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BlockLimit,
      BlockList> getGetBlockByLimitNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext",
      requestType = GrpcAPI.BlockLimit.class,
      responseType = BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BlockLimit,
      BlockList> getGetBlockByLimitNextMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BlockLimit, BlockList> getGetBlockByLimitNextMethod;
    if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
          WalletGrpc.getGetBlockByLimitNextMethod = getGetBlockByLimitNextMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BlockLimit, BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BlockLimit,
      BlockListExtention> getGetBlockByLimitNext2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext2",
      requestType = GrpcAPI.BlockLimit.class,
      responseType = BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BlockLimit,
      BlockListExtention> getGetBlockByLimitNext2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.BlockLimit, BlockListExtention> getGetBlockByLimitNext2Method;
    if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
          WalletGrpc.getGetBlockByLimitNext2Method = getGetBlockByLimitNext2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.BlockLimit, BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext2"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNext2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      BlockList> getGetBlockByLatestNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      BlockList> getGetBlockByLatestNumMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, BlockList> getGetBlockByLatestNumMethod;
    if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
          WalletGrpc.getGetBlockByLatestNumMethod = getGetBlockByLatestNumMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      BlockListExtention> getGetBlockByLatestNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum2",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      BlockListExtention> getGetBlockByLatestNum2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, BlockListExtention> getGetBlockByLatestNum2Method;
    if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
          WalletGrpc.getGetBlockByLatestNum2Method = getGetBlockByLatestNum2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum2"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionCountByBlockNum",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;
    if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionCountByBlockNumMethod = getGetTransactionCountByBlockNumMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionCountByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionCountByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionCountByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Chain.Transaction> getGetTransactionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Chain.Transaction> getGetTransactionByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, Chain.Transaction> getGetTransactionByIdMethod;
    if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
          WalletGrpc.getGetTransactionByIdMethod = getGetTransactionByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionById"))
              .build();
        }
      }
    }
    return getGetTransactionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      TransactionInfo> getGetTransactionInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = TransactionInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      TransactionInfo> getGetTransactionInfoByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, TransactionInfo> getGetTransactionInfoByIdMethod;
    if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
          WalletGrpc.getGetTransactionInfoByIdMethod = getGetTransactionInfoByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, TransactionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoById"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      TransactionInfoList> getGetTransactionInfoByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoByBlockNum",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = TransactionInfoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      TransactionInfoList> getGetTransactionInfoByBlockNumMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, TransactionInfoList> getGetTransactionInfoByBlockNumMethod;
    if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionInfoByBlockNumMethod = getGetTransactionInfoByBlockNumMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, TransactionInfoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionInfoList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Common.SmartContract> getGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContract",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = Common.SmartContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Common.SmartContract> getGetContractMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, Common.SmartContract> getGetContractMethod;
    if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
          WalletGrpc.getGetContractMethod = getGetContractMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, Common.SmartContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Common.SmartContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContract"))
              .build();
        }
      }
    }
    return getGetContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      SmartContractDataWrapper> getGetContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContractInfo",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = SmartContractDataWrapper.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      SmartContractDataWrapper> getGetContractInfoMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, SmartContractDataWrapper> getGetContractInfoMethod;
    if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
          WalletGrpc.getGetContractInfoMethod = getGetContractInfoMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, SmartContractDataWrapper>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartContractDataWrapper.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContractInfo"))
              .build();
        }
      }
    }
    return getGetContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      WitnessList> getListWitnessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWitnesses",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = WitnessList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      WitnessList> getListWitnessesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, WitnessList> getListWitnessesMethod;
    if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
          WalletGrpc.getListWitnessesMethod = getListWitnessesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, WitnessList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWitnesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WitnessList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListWitnesses"))
              .build();
        }
      }
    }
    return getListWitnessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrokerageInfo",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.NumberMessage> getGetBrokerageInfoMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;
    if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
          WalletGrpc.getGetBrokerageInfoMethod = getGetBrokerageInfoMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrokerageInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBrokerageInfo"))
              .build();
        }
      }
    }
    return getGetBrokerageInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.NumberMessage> getGetRewardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRewardInfo",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.NumberMessage> getGetRewardInfoMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.NumberMessage> getGetRewardInfoMethod;
    if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
          WalletGrpc.getGetRewardInfoMethod = getGetRewardInfoMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRewardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRewardInfo"))
              .build();
        }
      }
    }
    return getGetRewardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DelegatedResourceMessage,
      DelegatedResourceList> getGetDelegatedResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResource",
      requestType = DelegatedResourceMessage.class,
      responseType = DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DelegatedResourceMessage,
      DelegatedResourceList> getGetDelegatedResourceMethod() {
    io.grpc.MethodDescriptor<DelegatedResourceMessage, DelegatedResourceList> getGetDelegatedResourceMethod;
    if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
          WalletGrpc.getGetDelegatedResourceMethod = getGetDelegatedResourceMethod =
              io.grpc.MethodDescriptor.<DelegatedResourceMessage, DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResource"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndex",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;
    if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexMethod = getGetDelegatedResourceAccountIndexMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndex"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceAccountIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      ProposalList> getListProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProposals",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      ProposalList> getListProposalsMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, ProposalList> getListProposalsMethod;
    if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
          WalletGrpc.getListProposalsMethod = getListProposalsMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListProposals"))
              .build();
        }
      }
    }
    return getListProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Proposal> getGetProposalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposalById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = Proposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Proposal> getGetProposalByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, Proposal> getGetProposalByIdMethod;
    if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
          WalletGrpc.getGetProposalByIdMethod = getGetProposalByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, Proposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Proposal.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetProposalById"))
              .build();
        }
      }
    }
    return getGetProposalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      ProposalList> getGetPaginatedProposalListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedProposalList",
      requestType = GrpcAPI.PaginatedMessage.class,
      responseType = ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      ProposalList> getGetPaginatedProposalListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage, ProposalList> getGetPaginatedProposalListMethod;
    if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
          WalletGrpc.getGetPaginatedProposalListMethod = getGetPaginatedProposalListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PaginatedMessage, ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedProposalList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedProposalList"))
              .build();
        }
      }
    }
    return getGetPaginatedProposalListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      ExchangeList> getListExchangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExchanges",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      ExchangeList> getListExchangesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, ExchangeList> getListExchangesMethod;
    if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
          WalletGrpc.getListExchangesMethod = getListExchangesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExchanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListExchanges"))
              .build();
        }
      }
    }
    return getListExchangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Exchange> getGetExchangeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = Exchange.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Exchange> getGetExchangeByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, Exchange> getGetExchangeByIdMethod;
    if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
          WalletGrpc.getGetExchangeByIdMethod = getGetExchangeByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, Exchange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Exchange.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExchangeById"))
              .build();
        }
      }
    }
    return getGetExchangeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      ExchangeList> getGetPaginatedExchangeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedExchangeList",
      requestType = GrpcAPI.PaginatedMessage.class,
      responseType = ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      ExchangeList> getGetPaginatedExchangeListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage, ExchangeList> getGetPaginatedExchangeListMethod;
    if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
          WalletGrpc.getGetPaginatedExchangeListMethod = getGetPaginatedExchangeListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PaginatedMessage, ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedExchangeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedExchangeList"))
              .build();
        }
      }
    }
    return getGetPaginatedExchangeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.IvkDecryptTRC20Parameters,
      DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByIvk",
      requestType = GrpcAPI.IvkDecryptTRC20Parameters.class,
      responseType = DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.IvkDecryptTRC20Parameters,
      DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.IvkDecryptTRC20Parameters, DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;
    if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByIvkMethod = getScanShieldedTRC20NotesByIvkMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.IvkDecryptTRC20Parameters, DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.IvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByIvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.OvkDecryptTRC20Parameters,
      DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByOvk",
      requestType = GrpcAPI.OvkDecryptTRC20Parameters.class,
      responseType = DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.OvkDecryptTRC20Parameters,
      DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.OvkDecryptTRC20Parameters, DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;
    if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByOvkMethod = getScanShieldedTRC20NotesByOvkMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.OvkDecryptTRC20Parameters, DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.OvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByOvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NfTRC20Parameters,
      NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsShieldedTRC20ContractNoteSpent",
      requestType = GrpcAPI.NfTRC20Parameters.class,
      responseType = NullifierResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NfTRC20Parameters,
      NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NfTRC20Parameters, NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;
    if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
          WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod = getIsShieldedTRC20ContractNoteSpentMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NfTRC20Parameters, NullifierResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsShieldedTRC20ContractNoteSpent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NfTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NullifierResult.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IsShieldedTRC20ContractNoteSpent"))
              .build();
        }
      }
    }
    return getIsShieldedTRC20ContractNoteSpentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      MarketOrderList> getGetMarketOrderByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderByAccount",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      MarketOrderList> getGetMarketOrderByAccountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, MarketOrderList> getGetMarketOrderByAccountMethod;
    if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
          WalletGrpc.getGetMarketOrderByAccountMethod = getGetMarketOrderByAccountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderByAccount"))
              .build();
        }
      }
    }
    return getGetMarketOrderByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      MarketOrder> getGetMarketOrderByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = MarketOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      MarketOrder> getGetMarketOrderByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, MarketOrder> getGetMarketOrderByIdMethod;
    if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
          WalletGrpc.getGetMarketOrderByIdMethod = getGetMarketOrderByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, MarketOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MarketOrder.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderById"))
              .build();
        }
      }
    }
    return getGetMarketOrderByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MarketOrderPair,
      MarketPriceList> getGetMarketPriceByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPriceByPair",
      requestType = MarketOrderPair.class,
      responseType = MarketPriceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MarketOrderPair,
      MarketPriceList> getGetMarketPriceByPairMethod() {
    io.grpc.MethodDescriptor<MarketOrderPair, MarketPriceList> getGetMarketPriceByPairMethod;
    if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
          WalletGrpc.getGetMarketPriceByPairMethod = getGetMarketPriceByPairMethod =
              io.grpc.MethodDescriptor.<MarketOrderPair, MarketPriceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPriceByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MarketPriceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPriceByPair"))
              .build();
        }
      }
    }
    return getGetMarketPriceByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MarketOrderPair,
      MarketOrderList> getGetMarketOrderListByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderListByPair",
      requestType = MarketOrderPair.class,
      responseType = MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MarketOrderPair,
      MarketOrderList> getGetMarketOrderListByPairMethod() {
    io.grpc.MethodDescriptor<MarketOrderPair, MarketOrderList> getGetMarketOrderListByPairMethod;
    if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
          WalletGrpc.getGetMarketOrderListByPairMethod = getGetMarketOrderListByPairMethod =
              io.grpc.MethodDescriptor.<MarketOrderPair, MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderListByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderListByPair"))
              .build();
        }
      }
    }
    return getGetMarketOrderListByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      MarketOrderPairList> getGetMarketPairListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPairList",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = MarketOrderPairList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      MarketOrderPairList> getGetMarketPairListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, MarketOrderPairList> getGetMarketPairListMethod;
    if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
          WalletGrpc.getGetMarketPairListMethod = getGetMarketPairListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, MarketOrderPairList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPairList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MarketOrderPairList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPairList"))
              .build();
        }
      }
    }
    return getGetMarketPairListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TransactionSign,
      Chain.Transaction> getGetTransactionSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign",
      requestType = TransactionSign.class,
      responseType = Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TransactionSign,
      Chain.Transaction> getGetTransactionSignMethod() {
    io.grpc.MethodDescriptor<TransactionSign, Chain.Transaction> getGetTransactionSignMethod;
    if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
          WalletGrpc.getGetTransactionSignMethod = getGetTransactionSignMethod =
              io.grpc.MethodDescriptor.<TransactionSign, Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign"))
              .build();
        }
      }
    }
    return getGetTransactionSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TransactionSign,
      TransactionExtention> getGetTransactionSign2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign2",
      requestType = TransactionSign.class,
      responseType = TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TransactionSign,
      TransactionExtention> getGetTransactionSign2Method() {
    io.grpc.MethodDescriptor<TransactionSign, TransactionExtention> getGetTransactionSign2Method;
    if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
          WalletGrpc.getGetTransactionSign2Method = getGetTransactionSign2Method =
              io.grpc.MethodDescriptor.<TransactionSign, TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign2"))
              .build();
        }
      }
    }
    return getGetTransactionSign2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetMessage,
      EasyTransferResponse> getEasyTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAsset",
      requestType = GrpcAPI.EasyTransferAssetMessage.class,
      responseType = EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetMessage,
      EasyTransferResponse> getEasyTransferAssetMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetMessage, EasyTransferResponse> getEasyTransferAssetMethod;
    if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
          WalletGrpc.getEasyTransferAssetMethod = getEasyTransferAssetMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EasyTransferAssetMessage, EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EasyTransferAssetMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAsset"))
              .build();
        }
      }
    }
    return getEasyTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetByPrivateMessage,
      EasyTransferResponse> getEasyTransferAssetByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAssetByPrivate",
      requestType = GrpcAPI.EasyTransferAssetByPrivateMessage.class,
      responseType = EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetByPrivateMessage,
      EasyTransferResponse> getEasyTransferAssetByPrivateMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetByPrivateMessage, EasyTransferResponse> getEasyTransferAssetByPrivateMethod;
    if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferAssetByPrivateMethod = getEasyTransferAssetByPrivateMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EasyTransferAssetByPrivateMessage, EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAssetByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EasyTransferAssetByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAssetByPrivate"))
              .build();
        }
      }
    }
    return getEasyTransferAssetByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EasyTransferMessage,
      EasyTransferResponse> getEasyTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransfer",
      requestType = GrpcAPI.EasyTransferMessage.class,
      responseType = EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EasyTransferMessage,
      EasyTransferResponse> getEasyTransferMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EasyTransferMessage, EasyTransferResponse> getEasyTransferMethod;
    if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
          WalletGrpc.getEasyTransferMethod = getEasyTransferMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EasyTransferMessage, EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EasyTransferMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransfer"))
              .build();
        }
      }
    }
    return getEasyTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EasyTransferByPrivateMessage,
      EasyTransferResponse> getEasyTransferByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferByPrivate",
      requestType = GrpcAPI.EasyTransferByPrivateMessage.class,
      responseType = EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EasyTransferByPrivateMessage,
      EasyTransferResponse> getEasyTransferByPrivateMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EasyTransferByPrivateMessage, EasyTransferResponse> getEasyTransferByPrivateMethod;
    if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferByPrivateMethod = getEasyTransferByPrivateMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EasyTransferByPrivateMessage, EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EasyTransferByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferByPrivate"))
              .build();
        }
      }
    }
    return getEasyTransferByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage> getCreateAddressMethod;
    if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
          WalletGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAddress"))
              .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      AddressPrKeyPairMessage> getGenerateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAddress",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = AddressPrKeyPairMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      AddressPrKeyPairMessage> getGenerateAddressMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, AddressPrKeyPairMessage> getGenerateAddressMethod;
    if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
          WalletGrpc.getGenerateAddressMethod = getGenerateAddressMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, AddressPrKeyPairMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressPrKeyPairMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GenerateAddress"))
              .build();
        }
      }
    }
    return getGenerateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TransactionSign,
      TransactionExtention> getAddSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSign",
      requestType = TransactionSign.class,
      responseType = TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TransactionSign,
      TransactionExtention> getAddSignMethod() {
    io.grpc.MethodDescriptor<TransactionSign, TransactionExtention> getAddSignMethod;
    if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
          WalletGrpc.getAddSignMethod = getAddSignMethod =
              io.grpc.MethodDescriptor.<TransactionSign, TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AddSign"))
              .build();
        }
      }
    }
    return getAddSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.BytesMessage> getGetSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendingKey",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.BytesMessage> getGetSpendingKeyMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.BytesMessage> getGetSpendingKeyMethod;
    if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
          WalletGrpc.getGetSpendingKeyMethod = getGetSpendingKeyMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetSpendingKey"))
              .build();
        }
      }
    }
    return getGetSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExpandedSpendingKey",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.ExpandedSpendingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;
    if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
          WalletGrpc.getGetExpandedSpendingKeyMethod = getGetExpandedSpendingKeyMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.ExpandedSpendingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExpandedSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ExpandedSpendingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExpandedSpendingKey"))
              .build();
        }
      }
    }
    return getGetExpandedSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getGetAkFromAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAkFromAsk",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getGetAkFromAskMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage> getGetAkFromAskMethod;
    if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
          WalletGrpc.getGetAkFromAskMethod = getGetAkFromAskMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAkFromAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAkFromAsk"))
              .build();
        }
      }
    }
    return getGetAkFromAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getGetNkFromNskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNkFromNsk",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getGetNkFromNskMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage> getGetNkFromNskMethod;
    if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
          WalletGrpc.getGetNkFromNskMethod = getGetNkFromNskMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNkFromNsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNkFromNsk"))
              .build();
        }
      }
    }
    return getGetNkFromNskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.ViewingKeyMessage,
      GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncomingViewingKey",
      requestType = GrpcAPI.ViewingKeyMessage.class,
      responseType = GrpcAPI.IncomingViewingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.ViewingKeyMessage,
      GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.ViewingKeyMessage, GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;
    if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
          WalletGrpc.getGetIncomingViewingKeyMethod = getGetIncomingViewingKeyMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.ViewingKeyMessage, GrpcAPI.IncomingViewingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIncomingViewingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ViewingKeyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.IncomingViewingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetIncomingViewingKey"))
              .build();
        }
      }
    }
    return getGetIncomingViewingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.DiversifierMessage> getGetDiversifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDiversifier",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.DiversifierMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.DiversifierMessage> getGetDiversifierMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.DiversifierMessage> getGetDiversifierMethod;
    if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
          WalletGrpc.getGetDiversifierMethod = getGetDiversifierMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.DiversifierMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDiversifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.DiversifierMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDiversifier"))
              .build();
        }
      }
    }
    return getGetDiversifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.IncomingViewingKeyDiversifierMessage,
      GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZenPaymentAddress",
      requestType = GrpcAPI.IncomingViewingKeyDiversifierMessage.class,
      responseType = GrpcAPI.PaymentAddressMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.IncomingViewingKeyDiversifierMessage,
      GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.IncomingViewingKeyDiversifierMessage, GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;
    if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
          WalletGrpc.getGetZenPaymentAddressMethod = getGetZenPaymentAddressMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.IncomingViewingKeyDiversifierMessage, GrpcAPI.PaymentAddressMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZenPaymentAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.IncomingViewingKeyDiversifierMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PaymentAddressMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetZenPaymentAddress"))
              .build();
        }
      }
    }
    return getGetZenPaymentAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNewShieldedAddress",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.ShieldedAddressInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;
    if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
          WalletGrpc.getGetNewShieldedAddressMethod = getGetNewShieldedAddressMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.ShieldedAddressInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNewShieldedAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ShieldedAddressInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNewShieldedAddress"))
              .build();
        }
      }
    }
    return getGetNewShieldedAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.BytesMessage> getGetRcmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRcm",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.BytesMessage> getGetRcmMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.BytesMessage> getGetRcmMethod;
    if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
          WalletGrpc.getGetRcmMethod = getGetRcmMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRcm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRcm"))
              .build();
        }
      }
    }
    return getGetRcmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20Parameters,
      GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParameters",
      requestType = GrpcAPI.PrivateShieldedTRC20Parameters.class,
      responseType = GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20Parameters,
      GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20Parameters, GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;
    if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersMethod = getCreateShieldedContractParametersMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PrivateShieldedTRC20Parameters, GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PrivateShieldedTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParameters"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParametersWithoutAsk",
      requestType = GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.class,
      responseType = GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;
    if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod = getCreateShieldedContractParametersWithoutAskMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParametersWithoutAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParametersWithoutAsk"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersWithoutAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.ShieldedTRC20TriggerContractParameters,
      GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerInputForShieldedTRC20Contract",
      requestType = GrpcAPI.ShieldedTRC20TriggerContractParameters.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.ShieldedTRC20TriggerContractParameters,
      GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.ShieldedTRC20TriggerContractParameters, GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;
    if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
          WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod = getGetTriggerInputForShieldedTRC20ContractMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.ShieldedTRC20TriggerContractParameters, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTriggerInputForShieldedTRC20Contract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ShieldedTRC20TriggerContractParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTriggerInputForShieldedTRC20Contract"))
              .build();
        }
      }
    }
    return getGetTriggerInputForShieldedTRC20ContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
      GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableUnfreezeCount",
      requestType = GrpcAPI.GetAvailableUnfreezeCountRequestMessage.class,
      responseType = GrpcAPI.GetAvailableUnfreezeCountResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
      GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.GetAvailableUnfreezeCountRequestMessage, GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod;
    if ((getGetAvailableUnfreezeCountMethod = WalletGrpc.getGetAvailableUnfreezeCountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAvailableUnfreezeCountMethod = WalletGrpc.getGetAvailableUnfreezeCountMethod) == null) {
          WalletGrpc.getGetAvailableUnfreezeCountMethod = getGetAvailableUnfreezeCountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.GetAvailableUnfreezeCountRequestMessage, GrpcAPI.GetAvailableUnfreezeCountResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableUnfreezeCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.GetAvailableUnfreezeCountRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.GetAvailableUnfreezeCountResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAvailableUnfreezeCount"))
              .build();
        }
      }
    }
    return getGetAvailableUnfreezeCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
      GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCanWithdrawUnfreezeAmount",
      requestType = GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage.class,
      responseType = GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
      GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage, GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod;
    if ((getGetCanWithdrawUnfreezeAmountMethod = WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetCanWithdrawUnfreezeAmountMethod = WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod) == null) {
          WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod = getGetCanWithdrawUnfreezeAmountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage, GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanWithdrawUnfreezeAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetCanWithdrawUnfreezeAmount"))
              .build();
        }
      }
    }
    return getGetCanWithdrawUnfreezeAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.CanDelegatedMaxSizeRequestMessage,
      GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCanDelegatedMaxSize",
      requestType = GrpcAPI.CanDelegatedMaxSizeRequestMessage.class,
      responseType = GrpcAPI.CanDelegatedMaxSizeResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.CanDelegatedMaxSizeRequestMessage,
      GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.CanDelegatedMaxSizeRequestMessage, GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod;
    if ((getGetCanDelegatedMaxSizeMethod = WalletGrpc.getGetCanDelegatedMaxSizeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetCanDelegatedMaxSizeMethod = WalletGrpc.getGetCanDelegatedMaxSizeMethod) == null) {
          WalletGrpc.getGetCanDelegatedMaxSizeMethod = getGetCanDelegatedMaxSizeMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.CanDelegatedMaxSizeRequestMessage, GrpcAPI.CanDelegatedMaxSizeResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanDelegatedMaxSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.CanDelegatedMaxSizeRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.CanDelegatedMaxSizeResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetCanDelegatedMaxSize"))
              .build();
        }
      }
    }
    return getGetCanDelegatedMaxSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DelegatedResourceMessage,
      DelegatedResourceList> getGetDelegatedResourceV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceV2",
      requestType = DelegatedResourceMessage.class,
      responseType = DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DelegatedResourceMessage,
      DelegatedResourceList> getGetDelegatedResourceV2Method() {
    io.grpc.MethodDescriptor<DelegatedResourceMessage, DelegatedResourceList> getGetDelegatedResourceV2Method;
    if ((getGetDelegatedResourceV2Method = WalletGrpc.getGetDelegatedResourceV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceV2Method = WalletGrpc.getGetDelegatedResourceV2Method) == null) {
          WalletGrpc.getGetDelegatedResourceV2Method = getGetDelegatedResourceV2Method =
              io.grpc.MethodDescriptor.<DelegatedResourceMessage, DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceV2"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndexV2",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method;
    if ((getGetDelegatedResourceAccountIndexV2Method = WalletGrpc.getGetDelegatedResourceAccountIndexV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexV2Method = WalletGrpc.getGetDelegatedResourceAccountIndexV2Method) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexV2Method = getGetDelegatedResourceAccountIndexV2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndexV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndexV2"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceAccountIndexV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetBurnTrxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBurnTrx",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetBurnTrxMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage> getGetBurnTrxMethod;
    if ((getGetBurnTrxMethod = WalletGrpc.getGetBurnTrxMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBurnTrxMethod = WalletGrpc.getGetBurnTrxMethod) == null) {
          WalletGrpc.getGetBurnTrxMethod = getGetBurnTrxMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBurnTrx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBurnTrx"))
              .build();
        }
      }
    }
    return getGetBurnTrxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BlockIdentifier,
      BlockBalanceTrace> getGetBlockBalanceTraceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockBalanceTrace",
      requestType = BlockIdentifier.class,
      responseType = BlockBalanceTrace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BlockIdentifier,
      BlockBalanceTrace> getGetBlockBalanceTraceMethod() {
    io.grpc.MethodDescriptor<BlockIdentifier, BlockBalanceTrace> getGetBlockBalanceTraceMethod;
    if ((getGetBlockBalanceTraceMethod = WalletGrpc.getGetBlockBalanceTraceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockBalanceTraceMethod = WalletGrpc.getGetBlockBalanceTraceMethod) == null) {
          WalletGrpc.getGetBlockBalanceTraceMethod = getGetBlockBalanceTraceMethod =
              io.grpc.MethodDescriptor.<BlockIdentifier, BlockBalanceTrace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockBalanceTrace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BlockBalanceTrace.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockBalanceTrace"))
              .build();
        }
      }
    }
    return getGetBlockBalanceTraceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Contract.WitnessCreateContract,
      TransactionExtention> getCreateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness2",
      requestType = Contract.WitnessCreateContract.class,
      responseType = TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Contract.WitnessCreateContract,
      TransactionExtention> getCreateWitness2Method() {
    io.grpc.MethodDescriptor<Contract.WitnessCreateContract, TransactionExtention> getCreateWitness2Method;
    if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
          WalletGrpc.getCreateWitness2Method = getCreateWitness2Method =
              io.grpc.MethodDescriptor.<Contract.WitnessCreateContract, TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Contract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness2"))
              .build();
        }
      }
    }
    return getCreateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<Contract.WithdrawBalanceContract,
      TransactionExtention> getWithdrawBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance2",
      requestType = Contract.WithdrawBalanceContract.class,
      responseType = TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Contract.WithdrawBalanceContract,
      TransactionExtention> getWithdrawBalance2Method() {
    io.grpc.MethodDescriptor<Contract.WithdrawBalanceContract, TransactionExtention> getWithdrawBalance2Method;
    if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
          WalletGrpc.getWithdrawBalance2Method = getWithdrawBalance2Method =
              io.grpc.MethodDescriptor.<Contract.WithdrawBalanceContract, TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Contract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance2"))
              .build();
        }
      }
    }
    return getWithdrawBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionListFromPending",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.TransactionIdList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod;
    if ((getGetTransactionListFromPendingMethod = WalletGrpc.getGetTransactionListFromPendingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionListFromPendingMethod = WalletGrpc.getGetTransactionListFromPendingMethod) == null) {
          WalletGrpc.getGetTransactionListFromPendingMethod = getGetTransactionListFromPendingMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.TransactionIdList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionListFromPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.TransactionIdList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionListFromPending"))
              .build();
        }
      }
    }
    return getGetTransactionListFromPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Chain.Transaction> getGetTransactionFromPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionFromPending",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      Chain.Transaction> getGetTransactionFromPendingMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, Chain.Transaction> getGetTransactionFromPendingMethod;
    if ((getGetTransactionFromPendingMethod = WalletGrpc.getGetTransactionFromPendingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionFromPendingMethod = WalletGrpc.getGetTransactionFromPendingMethod) == null) {
          WalletGrpc.getGetTransactionFromPendingMethod = getGetTransactionFromPendingMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionFromPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionFromPending"))
              .build();
        }
      }
    }
    return getGetTransactionFromPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetPendingSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingSize",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetPendingSizeMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage> getGetPendingSizeMethod;
    if ((getGetPendingSizeMethod = WalletGrpc.getGetPendingSizeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPendingSizeMethod = WalletGrpc.getGetPendingSizeMethod) == null) {
          WalletGrpc.getGetPendingSizeMethod = getGetPendingSizeMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPendingSize"))
              .build();
        }
      }
    }
    return getGetPendingSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      PricesResponseMessage> getGetBandwidthPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBandwidthPrices",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      PricesResponseMessage> getGetBandwidthPricesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, PricesResponseMessage> getGetBandwidthPricesMethod;
    if ((getGetBandwidthPricesMethod = WalletGrpc.getGetBandwidthPricesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBandwidthPricesMethod = WalletGrpc.getGetBandwidthPricesMethod) == null) {
          WalletGrpc.getGetBandwidthPricesMethod = getGetBandwidthPricesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBandwidthPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBandwidthPrices"))
              .build();
        }
      }
    }
    return getGetBandwidthPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      PricesResponseMessage> getGetEnergyPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnergyPrices",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      PricesResponseMessage> getGetEnergyPricesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, PricesResponseMessage> getGetEnergyPricesMethod;
    if ((getGetEnergyPricesMethod = WalletGrpc.getGetEnergyPricesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetEnergyPricesMethod = WalletGrpc.getGetEnergyPricesMethod) == null) {
          WalletGrpc.getGetEnergyPricesMethod = getGetEnergyPricesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnergyPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetEnergyPrices"))
              .build();
        }
      }
    }
    return getGetEnergyPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      PricesResponseMessage> getGetMemoFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMemoFee",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      PricesResponseMessage> getGetMemoFeeMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, PricesResponseMessage> getGetMemoFeeMethod;
    if ((getGetMemoFeeMethod = WalletGrpc.getGetMemoFeeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMemoFeeMethod = WalletGrpc.getGetMemoFeeMethod) == null) {
          WalletGrpc.getGetMemoFeeMethod = getGetMemoFeeMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMemoFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMemoFee"))
              .build();
        }
      }
    }
    return getGetMemoFeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletStub>() {
        @Override
        public WalletStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletStub(channel, callOptions);
        }
      };
    return WalletStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub>() {
        @Override
        public WalletBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletBlockingStub(channel, callOptions);
        }
      };
    return WalletBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub>() {
        @Override
        public WalletFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletFutureStub(channel, callOptions);
        }
      };
    return WalletFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WalletImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(Chain.Transaction request,
        io.grpc.stub.StreamObserver<TransactionReturn> responseObserver) {
      asyncUnimplementedUnaryCall(getBroadcastTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *  rpc CreateCommonTransaction(Transaction) returns (TransactionExtention) {}
     *  rpc CreateAccount(AccountCreateContract) returns (Transaction) {}
     *  rpc CreateAccount2(AccountCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateAccount(AccountUpdateContract) returns (Transaction) {}
     *  rpc UpdateAccount2(AccountUpdateContract) returns (TransactionExtention) {}
     *  rpc SetAccountId(SetAccountIdContract) returns (Transaction) {}
     *  rpc AccountPermissionUpdate(AccountPermissionUpdateContract) returns (TransactionExtention) {}
     *  rpc CreateTransaction(TransferContract) returns (Transaction) {}
     *  rpc CreateTransaction2(TransferContract) returns (TransactionExtention) {}
     *  rpc CreateAssetIssue(AssetIssueContract) returns (Transaction) {}
     *  rpc CreateAssetIssue2(AssetIssueContract) returns (TransactionExtention) {}
     *  rpc UpdateAsset(UpdateAssetContract) returns (Transaction) {}
     *  rpc UpdateAsset2(UpdateAssetContract) returns (TransactionExtention) {}
     *  rpc TransferAsset(TransferAssetContract) returns (Transaction) {}
     *  rpc TransferAsset2(TransferAssetContract) returns (TransactionExtention) {}
     *  rpc ParticipateAssetIssue(ParticipateAssetIssueContract) returns (Transaction) {}
     *  rpc ParticipateAssetIssue2(ParticipateAssetIssueContract) returns (TransactionExtention) {}
     *  rpc UnfreezeAsset(UnfreezeAssetContract) returns (Transaction) {}
     *  rpc UnfreezeAsset2(UnfreezeAssetContract) returns (TransactionExtention) {}
     *  rpc CreateWitness(WitnessCreateContract) returns (Transaction) {}
     *  rpc CreateWitness2(WitnessCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateWitness(WitnessUpdateContract) returns (Transaction) {}
     *  rpc UpdateWitness2(WitnessUpdateContract) returns (TransactionExtention) {}
     *  rpc UpdateBrokerage(UpdateBrokerageContract) returns (TransactionExtention) {}
     *  rpc VoteWitnessAccount(VoteWitnessContract) returns (Transaction) {}
     *  rpc VoteWitnessAccount2(VoteWitnessContract) returns (TransactionExtention) {}
     *  rpc FreezeBalance(FreezeBalanceContract) returns (Transaction) {}
     *  rpc FreezeBalance2(FreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc UnfreezeBalance(UnfreezeBalanceContract) returns (Transaction) {}
     *  rpc UnfreezeBalance2(UnfreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc WithdrawBalance(WithdrawBalanceContract) returns (Transaction) {}
     *  rpc WithdrawBalance2(WithdrawBalanceContract) returns (TransactionExtention) {}
     *  rpc ProposalCreate(ProposalCreateContract) returns (TransactionExtention) {}
     *  rpc ProposalApprove(ProposalApproveContract) returns (TransactionExtention) {}
     *  rpc ProposalDelete(ProposalDeleteContract) returns (TransactionExtention) {}
     * </pre>
     */
    public void deployContract(Contract.CreateSmartContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getDeployContractMethod(), responseObserver);
    }

    /**
     * <pre>
     *  rpc UpdateSetting(UpdateSettingContract) returns (TransactionExtention) {}          // consume_user_resource_percent
     *  rpc UpdateEnergyLimit(UpdateEnergyLimitContract) returns (TransactionExtention) {}  // origin_energy_limit
     *  rpc ClearContractABI(ClearABIContract) returns (TransactionExtention) {}
     * </pre>
     */
    public void triggerContract(Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerContractMethod(), responseObserver);
    }

    /**
     */
    public void triggerConstantContract(Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerConstantContractMethod(), responseObserver);
    }

    /**
     */
    public void estimateEnergy(Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<EstimateEnergyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getEstimateEnergyMethod(), responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<NodeInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     */
    public void listNodes(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<NodeList> responseObserver) {
      asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    /**
     */
    public void getChainParameters(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<ChainParameters> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChainParametersMethod(), responseObserver);
    }

    /**
     */
    public void totalTransaction(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNextMaintenanceTimeMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(Chain.Transaction request,
        io.grpc.stub.StreamObserver<TransactionSignWeight> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSignWeightMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(Chain.Transaction request,
        io.grpc.stub.StreamObserver<TransactionApprovedList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionApprovedListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccountById(GrpcAPI.AccountIdMessage request,
        io.grpc.stub.StreamObserver<Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAccountNet(GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<AccountNetMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountNetMethod(), responseObserver);
    }

    /**
     */
    public void getAccountResource(GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<AccountResourceMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountResourceMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Contract.AssetIssueContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueListByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Contract.AssetIssueContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueList(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getNowBlock(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNowBlockMethod(), responseObserver);
    }

    /**
     */
    public void getNowBlock2(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<BlockExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNowBlock2Method(), responseObserver);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public void getBlockByNum(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public void getBlockByNum2(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<BlockExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNum2Method(), responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByIdMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<BlockList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLimitNextMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<BlockListExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLimitNext2Method(), responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<BlockList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLatestNumMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<BlockListExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLatestNum2Method(), responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionCountByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<TransactionInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionInfoByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<TransactionInfoList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionInfoByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getContract(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Common.SmartContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<SmartContractDataWrapper> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractInfoMethod(), responseObserver);
    }

    /**
     */
    public void listWitnesses(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<WitnessList> responseObserver) {
      asyncUnimplementedUnaryCall(getListWitnessesMethod(), responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrokerageInfoMethod(), responseObserver);
    }

    /**
     */
    public void getRewardInfo(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRewardInfoMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResource(DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<DelegatedResourceList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegatedResourceMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<DelegatedResourceAccountIndex> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexMethod(), responseObserver);
    }

    /**
     */
    public void listProposals(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<ProposalList> responseObserver) {
      asyncUnimplementedUnaryCall(getListProposalsMethod(), responseObserver);
    }

    /**
     */
    public void getProposalById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Proposal> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProposalByIdMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<ProposalList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedProposalListMethod(), responseObserver);
    }

    /**
     */
    public void listExchanges(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<ExchangeList> responseObserver) {
      asyncUnimplementedUnaryCall(getListExchangesMethod(), responseObserver);
    }

    /**
     */
    public void getExchangeById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Exchange> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExchangeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<ExchangeList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedExchangeListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public void scanShieldedTRC20NotesByIvk(GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<DecryptNotesTRC20> responseObserver) {
      asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByIvkMethod(), responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<DecryptNotesTRC20> responseObserver) {
      asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByOvkMethod(), responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<NullifierResult> responseObserver) {
      asyncUnimplementedUnaryCall(getIsShieldedTRC20ContractNoteSpentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public void getMarketOrderByAccount(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<MarketOrderList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<MarketOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderByIdMethod(), responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(MarketOrderPair request,
        io.grpc.stub.StreamObserver<MarketPriceList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketPriceByPairMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(MarketOrderPair request,
        io.grpc.stub.StreamObserver<MarketOrderList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderListByPairMethod(), responseObserver);
    }

    /**
     */
    public void getMarketPairList(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<MarketOrderPairList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketPairListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(TransactionSign request,
        io.grpc.stub.StreamObserver<Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSignMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSign2(TransactionSign request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSign2Method(), responseObserver);
    }

    /**
     */
    public void easyTransferAsset(GrpcAPI.EasyTransferAssetMessage request,
        io.grpc.stub.StreamObserver<EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferAssetMethod(), responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(GrpcAPI.EasyTransferAssetByPrivateMessage request,
        io.grpc.stub.StreamObserver<EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferAssetByPrivateMethod(), responseObserver);
    }

    /**
     */
    public void easyTransfer(GrpcAPI.EasyTransferMessage request,
        io.grpc.stub.StreamObserver<EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferMethod(), responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(GrpcAPI.EasyTransferByPrivateMessage request,
        io.grpc.stub.StreamObserver<EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferByPrivateMethod(), responseObserver);
    }

    /**
     */
    public void createAddress(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void generateAddress(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<AddressPrKeyPairMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateAddressMethod(), responseObserver);
    }

    /**
     */
    public void addSign(TransactionSign request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSignMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public void getSpendingKey(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExpandedSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getAkFromAsk(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAkFromAskMethod(), responseObserver);
    }

    /**
     */
    public void getNkFromNsk(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNkFromNskMethod(), responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIncomingViewingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getDiversifier(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.DiversifierMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDiversifierMethod(), responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.PaymentAddressMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZenPaymentAddressMethod(), responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.ShieldedAddressInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNewShieldedAddressMethod(), responseObserver);
    }

    /**
     */
    public void getRcm(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRcmMethod(), responseObserver);
    }

    /**
     */
    public void createShieldedContractParameters(GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldedContractParametersMethod(), responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldedContractParametersWithoutAskMethod(), responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTriggerInputForShieldedTRC20ContractMethod(), responseObserver);
    }

    /**
     */
    public void getAvailableUnfreezeCount(GrpcAPI.GetAvailableUnfreezeCountRequestMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.GetAvailableUnfreezeCountResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAvailableUnfreezeCountMethod(), responseObserver);
    }

    /**
     */
    public void getCanWithdrawUnfreezeAmount(GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCanWithdrawUnfreezeAmountMethod(), responseObserver);
    }

    /**
     */
    public void getCanDelegatedMaxSize(GrpcAPI.CanDelegatedMaxSizeRequestMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.CanDelegatedMaxSizeResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCanDelegatedMaxSizeMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResourceV2(DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<DelegatedResourceList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegatedResourceV2Method(), responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndexV2(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<DelegatedResourceAccountIndex> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexV2Method(), responseObserver);
    }

    /**
     * <pre>
     *query the network
     * </pre>
     */
    public void getBurnTrx(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBurnTrxMethod(), responseObserver);
    }

    /**
     */
    public void getBlockBalanceTrace(BlockIdentifier request,
        io.grpc.stub.StreamObserver<BlockBalanceTrace> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockBalanceTraceMethod(), responseObserver);
    }

    /**
     * <pre>
     *voting&amp;SRs
     * </pre>
     */
    public void createWitness2(Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWitness2Method(), responseObserver);
    }

    /**
     */
    public void withdrawBalance2(Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawBalance2Method(), responseObserver);
    }

    /**
     * <pre>
     *pending pool
     * </pre>
     */
    public void getTransactionListFromPending(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.TransactionIdList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionListFromPendingMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionFromPending(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionFromPendingMethod(), responseObserver);
    }

    /**
     */
    public void getPendingSize(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPendingSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     *query resource price
     * </pre>
     */
    public void getBandwidthPrices(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<PricesResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBandwidthPricesMethod(), responseObserver);
    }

    /**
     */
    public void getEnergyPrices(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<PricesResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEnergyPricesMethod(), responseObserver);
    }

    /**
     */
    public void getMemoFee(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<PricesResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMemoFeeMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBroadcastTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Chain.Transaction,
                TransactionReturn>(
                  this, METHODID_BROADCAST_TRANSACTION)))
          .addMethod(
            getDeployContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Contract.CreateSmartContract,
                TransactionExtention>(
                  this, METHODID_DEPLOY_CONTRACT)))
          .addMethod(
            getTriggerContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Contract.TriggerSmartContract,
                TransactionExtention>(
                  this, METHODID_TRIGGER_CONTRACT)))
          .addMethod(
            getTriggerConstantContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Contract.TriggerSmartContract,
                TransactionExtention>(
                  this, METHODID_TRIGGER_CONSTANT_CONTRACT)))
          .addMethod(
            getEstimateEnergyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Contract.TriggerSmartContract,
                EstimateEnergyMessage>(
                  this, METHODID_ESTIMATE_ENERGY)))
          .addMethod(
            getGetNodeInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                NodeInfo>(
                  this, METHODID_GET_NODE_INFO)))
          .addMethod(
            getListNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                NodeList>(
                  this, METHODID_LIST_NODES)))
          .addMethod(
            getGetChainParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                ChainParameters>(
                  this, METHODID_GET_CHAIN_PARAMETERS)))
          .addMethod(
            getTotalTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.NumberMessage>(
                  this, METHODID_TOTAL_TRANSACTION)))
          .addMethod(
            getGetNextMaintenanceTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.NumberMessage>(
                  this, METHODID_GET_NEXT_MAINTENANCE_TIME)))
          .addMethod(
            getGetTransactionSignWeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Chain.Transaction,
                TransactionSignWeight>(
                  this, METHODID_GET_TRANSACTION_SIGN_WEIGHT)))
          .addMethod(
            getGetTransactionApprovedListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Chain.Transaction,
                TransactionApprovedList>(
                  this, METHODID_GET_TRANSACTION_APPROVED_LIST)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.AccountAddressMessage,
                Account>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.AccountIdMessage,
                Account>(
                  this, METHODID_GET_ACCOUNT_BY_ID)))
          .addMethod(
            getGetAccountNetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.AccountAddressMessage,
                AccountNetMessage>(
                  this, METHODID_GET_ACCOUNT_NET)))
          .addMethod(
            getGetAccountResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.AccountAddressMessage,
                AccountResourceMessage>(
                  this, METHODID_GET_ACCOUNT_RESOURCE)))
          .addMethod(
            getGetAssetIssueByAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.AccountAddressMessage,
                AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_BY_ACCOUNT)))
          .addMethod(
            getGetAssetIssueByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                Contract.AssetIssueContract>(
                  this, METHODID_GET_ASSET_ISSUE_BY_NAME)))
          .addMethod(
            getGetAssetIssueListByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_LIST_BY_NAME)))
          .addMethod(
            getGetAssetIssueByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                Contract.AssetIssueContract>(
                  this, METHODID_GET_ASSET_ISSUE_BY_ID)))
          .addMethod(
            getGetAssetIssueListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_LIST)))
          .addMethod(
            getGetPaginatedAssetIssueListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.PaginatedMessage,
                AssetIssueList>(
                  this, METHODID_GET_PAGINATED_ASSET_ISSUE_LIST)))
          .addMethod(
            getGetNowBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                Chain.Block>(
                  this, METHODID_GET_NOW_BLOCK)))
          .addMethod(
            getGetNowBlock2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                BlockExtention>(
                  this, METHODID_GET_NOW_BLOCK2)))
          .addMethod(
            getGetBlockByNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.NumberMessage,
                Chain.Block>(
                  this, METHODID_GET_BLOCK_BY_NUM)))
          .addMethod(
            getGetBlockByNum2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.NumberMessage,
                BlockExtention>(
                  this, METHODID_GET_BLOCK_BY_NUM2)))
          .addMethod(
            getGetBlockByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                Chain.Block>(
                  this, METHODID_GET_BLOCK_BY_ID)))
          .addMethod(
            getGetBlockByLimitNextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BlockLimit,
                BlockList>(
                  this, METHODID_GET_BLOCK_BY_LIMIT_NEXT)))
          .addMethod(
            getGetBlockByLimitNext2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BlockLimit,
                BlockListExtention>(
                  this, METHODID_GET_BLOCK_BY_LIMIT_NEXT2)))
          .addMethod(
            getGetBlockByLatestNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.NumberMessage,
                BlockList>(
                  this, METHODID_GET_BLOCK_BY_LATEST_NUM)))
          .addMethod(
            getGetBlockByLatestNum2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.NumberMessage,
                BlockListExtention>(
                  this, METHODID_GET_BLOCK_BY_LATEST_NUM2)))
          .addMethod(
            getGetTransactionCountByBlockNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.NumberMessage,
                GrpcAPI.NumberMessage>(
                  this, METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM)))
          .addMethod(
            getGetTransactionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                Chain.Transaction>(
                  this, METHODID_GET_TRANSACTION_BY_ID)))
          .addMethod(
            getGetTransactionInfoByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                TransactionInfo>(
                  this, METHODID_GET_TRANSACTION_INFO_BY_ID)))
          .addMethod(
            getGetTransactionInfoByBlockNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.NumberMessage,
                TransactionInfoList>(
                  this, METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM)))
          .addMethod(
            getGetContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                Common.SmartContract>(
                  this, METHODID_GET_CONTRACT)))
          .addMethod(
            getGetContractInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                SmartContractDataWrapper>(
                  this, METHODID_GET_CONTRACT_INFO)))
          .addMethod(
            getListWitnessesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                WitnessList>(
                  this, METHODID_LIST_WITNESSES)))
          .addMethod(
            getGetBrokerageInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                GrpcAPI.NumberMessage>(
                  this, METHODID_GET_BROKERAGE_INFO)))
          .addMethod(
            getGetRewardInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                GrpcAPI.NumberMessage>(
                  this, METHODID_GET_REWARD_INFO)))
          .addMethod(
            getGetDelegatedResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                DelegatedResourceMessage,
                DelegatedResourceList>(
                  this, METHODID_GET_DELEGATED_RESOURCE)))
          .addMethod(
            getGetDelegatedResourceAccountIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                DelegatedResourceAccountIndex>(
                  this, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX)))
          .addMethod(
            getListProposalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                ProposalList>(
                  this, METHODID_LIST_PROPOSALS)))
          .addMethod(
            getGetProposalByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                Proposal>(
                  this, METHODID_GET_PROPOSAL_BY_ID)))
          .addMethod(
            getGetPaginatedProposalListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.PaginatedMessage,
                ProposalList>(
                  this, METHODID_GET_PAGINATED_PROPOSAL_LIST)))
          .addMethod(
            getListExchangesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                ExchangeList>(
                  this, METHODID_LIST_EXCHANGES)))
          .addMethod(
            getGetExchangeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                Exchange>(
                  this, METHODID_GET_EXCHANGE_BY_ID)))
          .addMethod(
            getGetPaginatedExchangeListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.PaginatedMessage,
                ExchangeList>(
                  this, METHODID_GET_PAGINATED_EXCHANGE_LIST)))
          .addMethod(
            getScanShieldedTRC20NotesByIvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.IvkDecryptTRC20Parameters,
                DecryptNotesTRC20>(
                  this, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK)))
          .addMethod(
            getScanShieldedTRC20NotesByOvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.OvkDecryptTRC20Parameters,
                DecryptNotesTRC20>(
                  this, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK)))
          .addMethod(
            getIsShieldedTRC20ContractNoteSpentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.NfTRC20Parameters,
                NullifierResult>(
                  this, METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT)))
          .addMethod(
            getGetMarketOrderByAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                MarketOrderList>(
                  this, METHODID_GET_MARKET_ORDER_BY_ACCOUNT)))
          .addMethod(
            getGetMarketOrderByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                MarketOrder>(
                  this, METHODID_GET_MARKET_ORDER_BY_ID)))
          .addMethod(
            getGetMarketPriceByPairMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MarketOrderPair,
                MarketPriceList>(
                  this, METHODID_GET_MARKET_PRICE_BY_PAIR)))
          .addMethod(
            getGetMarketOrderListByPairMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MarketOrderPair,
                MarketOrderList>(
                  this, METHODID_GET_MARKET_ORDER_LIST_BY_PAIR)))
          .addMethod(
            getGetMarketPairListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                MarketOrderPairList>(
                  this, METHODID_GET_MARKET_PAIR_LIST)))
          .addMethod(
            getGetTransactionSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                TransactionSign,
                Chain.Transaction>(
                  this, METHODID_GET_TRANSACTION_SIGN)))
          .addMethod(
            getGetTransactionSign2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                TransactionSign,
                TransactionExtention>(
                  this, METHODID_GET_TRANSACTION_SIGN2)))
          .addMethod(
            getEasyTransferAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EasyTransferAssetMessage,
                EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_ASSET)))
          .addMethod(
            getEasyTransferAssetByPrivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EasyTransferAssetByPrivateMessage,
                EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE)))
          .addMethod(
            getEasyTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EasyTransferMessage,
                EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER)))
          .addMethod(
            getEasyTransferByPrivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EasyTransferByPrivateMessage,
                EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_BY_PRIVATE)))
          .addMethod(
            getCreateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                GrpcAPI.BytesMessage>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getGenerateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                AddressPrKeyPairMessage>(
                  this, METHODID_GENERATE_ADDRESS)))
          .addMethod(
            getAddSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                TransactionSign,
                TransactionExtention>(
                  this, METHODID_ADD_SIGN)))
          .addMethod(
            getGetSpendingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.BytesMessage>(
                  this, METHODID_GET_SPENDING_KEY)))
          .addMethod(
            getGetExpandedSpendingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                GrpcAPI.ExpandedSpendingKeyMessage>(
                  this, METHODID_GET_EXPANDED_SPENDING_KEY)))
          .addMethod(
            getGetAkFromAskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                GrpcAPI.BytesMessage>(
                  this, METHODID_GET_AK_FROM_ASK)))
          .addMethod(
            getGetNkFromNskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                GrpcAPI.BytesMessage>(
                  this, METHODID_GET_NK_FROM_NSK)))
          .addMethod(
            getGetIncomingViewingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.ViewingKeyMessage,
                GrpcAPI.IncomingViewingKeyMessage>(
                  this, METHODID_GET_INCOMING_VIEWING_KEY)))
          .addMethod(
            getGetDiversifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.DiversifierMessage>(
                  this, METHODID_GET_DIVERSIFIER)))
          .addMethod(
            getGetZenPaymentAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.IncomingViewingKeyDiversifierMessage,
                GrpcAPI.PaymentAddressMessage>(
                  this, METHODID_GET_ZEN_PAYMENT_ADDRESS)))
          .addMethod(
            getGetNewShieldedAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.ShieldedAddressInfo>(
                  this, METHODID_GET_NEW_SHIELDED_ADDRESS)))
          .addMethod(
            getGetRcmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.BytesMessage>(
                  this, METHODID_GET_RCM)))
          .addMethod(
            getCreateShieldedContractParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.PrivateShieldedTRC20Parameters,
                GrpcAPI.ShieldedTRC20Parameters>(
                  this, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS)))
          .addMethod(
            getCreateShieldedContractParametersWithoutAskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
                GrpcAPI.ShieldedTRC20Parameters>(
                  this, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK)))
          .addMethod(
            getGetTriggerInputForShieldedTRC20ContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.ShieldedTRC20TriggerContractParameters,
                GrpcAPI.BytesMessage>(
                  this, METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT)))
          .addMethod(
            getGetAvailableUnfreezeCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
                GrpcAPI.GetAvailableUnfreezeCountResponseMessage>(
                  this, METHODID_GET_AVAILABLE_UNFREEZE_COUNT)))
          .addMethod(
            getGetCanWithdrawUnfreezeAmountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
                GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>(
                  this, METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT)))
          .addMethod(
            getGetCanDelegatedMaxSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.CanDelegatedMaxSizeRequestMessage,
                GrpcAPI.CanDelegatedMaxSizeResponseMessage>(
                  this, METHODID_GET_CAN_DELEGATED_MAX_SIZE)))
          .addMethod(
            getGetDelegatedResourceV2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                DelegatedResourceMessage,
                DelegatedResourceList>(
                  this, METHODID_GET_DELEGATED_RESOURCE_V2)))
          .addMethod(
            getGetDelegatedResourceAccountIndexV2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                DelegatedResourceAccountIndex>(
                  this, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2)))
          .addMethod(
            getGetBurnTrxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.NumberMessage>(
                  this, METHODID_GET_BURN_TRX)))
          .addMethod(
            getGetBlockBalanceTraceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                BlockIdentifier,
                BlockBalanceTrace>(
                  this, METHODID_GET_BLOCK_BALANCE_TRACE)))
          .addMethod(
            getCreateWitness2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                Contract.WitnessCreateContract,
                TransactionExtention>(
                  this, METHODID_CREATE_WITNESS2)))
          .addMethod(
            getWithdrawBalance2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                Contract.WithdrawBalanceContract,
                TransactionExtention>(
                  this, METHODID_WITHDRAW_BALANCE2)))
          .addMethod(
            getGetTransactionListFromPendingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.TransactionIdList>(
                  this, METHODID_GET_TRANSACTION_LIST_FROM_PENDING)))
          .addMethod(
            getGetTransactionFromPendingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.BytesMessage,
                Chain.Transaction>(
                  this, METHODID_GET_TRANSACTION_FROM_PENDING)))
          .addMethod(
            getGetPendingSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                GrpcAPI.NumberMessage>(
                  this, METHODID_GET_PENDING_SIZE)))
          .addMethod(
            getGetBandwidthPricesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                PricesResponseMessage>(
                  this, METHODID_GET_BANDWIDTH_PRICES)))
          .addMethod(
            getGetEnergyPricesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                PricesResponseMessage>(
                  this, METHODID_GET_ENERGY_PRICES)))
          .addMethod(
            getGetMemoFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcAPI.EmptyMessage,
                PricesResponseMessage>(
                  this, METHODID_GET_MEMO_FEE)))
          .build();
    }
  }

  /**
   */
  public static final class WalletStub extends io.grpc.stub.AbstractAsyncStub<WalletStub> {
    private WalletStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WalletStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(Chain.Transaction request,
        io.grpc.stub.StreamObserver<TransactionReturn> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  rpc CreateCommonTransaction(Transaction) returns (TransactionExtention) {}
     *  rpc CreateAccount(AccountCreateContract) returns (Transaction) {}
     *  rpc CreateAccount2(AccountCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateAccount(AccountUpdateContract) returns (Transaction) {}
     *  rpc UpdateAccount2(AccountUpdateContract) returns (TransactionExtention) {}
     *  rpc SetAccountId(SetAccountIdContract) returns (Transaction) {}
     *  rpc AccountPermissionUpdate(AccountPermissionUpdateContract) returns (TransactionExtention) {}
     *  rpc CreateTransaction(TransferContract) returns (Transaction) {}
     *  rpc CreateTransaction2(TransferContract) returns (TransactionExtention) {}
     *  rpc CreateAssetIssue(AssetIssueContract) returns (Transaction) {}
     *  rpc CreateAssetIssue2(AssetIssueContract) returns (TransactionExtention) {}
     *  rpc UpdateAsset(UpdateAssetContract) returns (Transaction) {}
     *  rpc UpdateAsset2(UpdateAssetContract) returns (TransactionExtention) {}
     *  rpc TransferAsset(TransferAssetContract) returns (Transaction) {}
     *  rpc TransferAsset2(TransferAssetContract) returns (TransactionExtention) {}
     *  rpc ParticipateAssetIssue(ParticipateAssetIssueContract) returns (Transaction) {}
     *  rpc ParticipateAssetIssue2(ParticipateAssetIssueContract) returns (TransactionExtention) {}
     *  rpc UnfreezeAsset(UnfreezeAssetContract) returns (Transaction) {}
     *  rpc UnfreezeAsset2(UnfreezeAssetContract) returns (TransactionExtention) {}
     *  rpc CreateWitness(WitnessCreateContract) returns (Transaction) {}
     *  rpc CreateWitness2(WitnessCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateWitness(WitnessUpdateContract) returns (Transaction) {}
     *  rpc UpdateWitness2(WitnessUpdateContract) returns (TransactionExtention) {}
     *  rpc UpdateBrokerage(UpdateBrokerageContract) returns (TransactionExtention) {}
     *  rpc VoteWitnessAccount(VoteWitnessContract) returns (Transaction) {}
     *  rpc VoteWitnessAccount2(VoteWitnessContract) returns (TransactionExtention) {}
     *  rpc FreezeBalance(FreezeBalanceContract) returns (Transaction) {}
     *  rpc FreezeBalance2(FreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc UnfreezeBalance(UnfreezeBalanceContract) returns (Transaction) {}
     *  rpc UnfreezeBalance2(UnfreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc WithdrawBalance(WithdrawBalanceContract) returns (Transaction) {}
     *  rpc WithdrawBalance2(WithdrawBalanceContract) returns (TransactionExtention) {}
     *  rpc ProposalCreate(ProposalCreateContract) returns (TransactionExtention) {}
     *  rpc ProposalApprove(ProposalApproveContract) returns (TransactionExtention) {}
     *  rpc ProposalDelete(ProposalDeleteContract) returns (TransactionExtention) {}
     * </pre>
     */
    public void deployContract(Contract.CreateSmartContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  rpc UpdateSetting(UpdateSettingContract) returns (TransactionExtention) {}          // consume_user_resource_percent
     *  rpc UpdateEnergyLimit(UpdateEnergyLimitContract) returns (TransactionExtention) {}  // origin_energy_limit
     *  rpc ClearContractABI(ClearABIContract) returns (TransactionExtention) {}
     * </pre>
     */
    public void triggerContract(Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerConstantContract(Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void estimateEnergy(Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<EstimateEnergyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEstimateEnergyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<NodeInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNodes(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<NodeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChainParameters(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<ChainParameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalTransaction(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(Chain.Transaction request,
        io.grpc.stub.StreamObserver<TransactionSignWeight> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(Chain.Transaction request,
        io.grpc.stub.StreamObserver<TransactionApprovedList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountById(GrpcAPI.AccountIdMessage request,
        io.grpc.stub.StreamObserver<Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountNet(GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<AccountNetMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountResource(GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<AccountResourceMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Contract.AssetIssueContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Contract.AssetIssueContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueList(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<Chain.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock2(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<BlockExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public void getBlockByNum(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<Chain.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public void getBlockByNum2(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<BlockExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Chain.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<BlockList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<BlockListExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<BlockList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<BlockListExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<TransactionInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<TransactionInfoList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContract(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Common.SmartContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<SmartContractDataWrapper> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWitnesses(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<WitnessList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRewardInfo(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResource(DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<DelegatedResourceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<DelegatedResourceAccountIndex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProposals(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<ProposalList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProposalById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Proposal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<ProposalList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listExchanges(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<ExchangeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExchangeById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Exchange> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<ExchangeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public void scanShieldedTRC20NotesByIvk(GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<DecryptNotesTRC20> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<DecryptNotesTRC20> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<NullifierResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public void getMarketOrderByAccount(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<MarketOrderList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderById(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<MarketOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(MarketOrderPair request,
        io.grpc.stub.StreamObserver<MarketPriceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(MarketOrderPair request,
        io.grpc.stub.StreamObserver<MarketOrderList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPairList(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<MarketOrderPairList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(TransactionSign request,
        io.grpc.stub.StreamObserver<Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSign2(TransactionSign request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAsset(GrpcAPI.EasyTransferAssetMessage request,
        io.grpc.stub.StreamObserver<EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(GrpcAPI.EasyTransferAssetByPrivateMessage request,
        io.grpc.stub.StreamObserver<EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransfer(GrpcAPI.EasyTransferMessage request,
        io.grpc.stub.StreamObserver<EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(GrpcAPI.EasyTransferByPrivateMessage request,
        io.grpc.stub.StreamObserver<EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAddress(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateAddress(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<AddressPrKeyPairMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSign(TransactionSign request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public void getSpendingKey(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAkFromAsk(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNkFromNsk(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDiversifier(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.DiversifierMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.PaymentAddressMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.ShieldedAddressInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRcm(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParameters(GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailableUnfreezeCount(GrpcAPI.GetAvailableUnfreezeCountRequestMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.GetAvailableUnfreezeCountResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAvailableUnfreezeCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCanWithdrawUnfreezeAmount(GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCanDelegatedMaxSize(GrpcAPI.CanDelegatedMaxSizeRequestMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.CanDelegatedMaxSizeResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCanDelegatedMaxSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceV2(DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<DelegatedResourceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndexV2(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<DelegatedResourceAccountIndex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *query the network
     * </pre>
     */
    public void getBurnTrx(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockBalanceTrace(BlockIdentifier request,
        io.grpc.stub.StreamObserver<BlockBalanceTrace> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockBalanceTraceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *voting&amp;SRs
     * </pre>
     */
    public void createWitness2(Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawBalance2(Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *pending pool
     * </pre>
     */
    public void getTransactionListFromPending(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.TransactionIdList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionListFromPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionFromPending(GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionFromPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPendingSize(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPendingSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *query resource price
     * </pre>
     */
    public void getBandwidthPrices(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<PricesResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBandwidthPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnergyPrices(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<PricesResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEnergyPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMemoFee(GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<PricesResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMemoFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletBlockingStub extends io.grpc.stub.AbstractBlockingStub<WalletBlockingStub> {
    private WalletBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WalletBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public TransactionReturn broadcastTransaction(Chain.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getBroadcastTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  rpc CreateCommonTransaction(Transaction) returns (TransactionExtention) {}
     *  rpc CreateAccount(AccountCreateContract) returns (Transaction) {}
     *  rpc CreateAccount2(AccountCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateAccount(AccountUpdateContract) returns (Transaction) {}
     *  rpc UpdateAccount2(AccountUpdateContract) returns (TransactionExtention) {}
     *  rpc SetAccountId(SetAccountIdContract) returns (Transaction) {}
     *  rpc AccountPermissionUpdate(AccountPermissionUpdateContract) returns (TransactionExtention) {}
     *  rpc CreateTransaction(TransferContract) returns (Transaction) {}
     *  rpc CreateTransaction2(TransferContract) returns (TransactionExtention) {}
     *  rpc CreateAssetIssue(AssetIssueContract) returns (Transaction) {}
     *  rpc CreateAssetIssue2(AssetIssueContract) returns (TransactionExtention) {}
     *  rpc UpdateAsset(UpdateAssetContract) returns (Transaction) {}
     *  rpc UpdateAsset2(UpdateAssetContract) returns (TransactionExtention) {}
     *  rpc TransferAsset(TransferAssetContract) returns (Transaction) {}
     *  rpc TransferAsset2(TransferAssetContract) returns (TransactionExtention) {}
     *  rpc ParticipateAssetIssue(ParticipateAssetIssueContract) returns (Transaction) {}
     *  rpc ParticipateAssetIssue2(ParticipateAssetIssueContract) returns (TransactionExtention) {}
     *  rpc UnfreezeAsset(UnfreezeAssetContract) returns (Transaction) {}
     *  rpc UnfreezeAsset2(UnfreezeAssetContract) returns (TransactionExtention) {}
     *  rpc CreateWitness(WitnessCreateContract) returns (Transaction) {}
     *  rpc CreateWitness2(WitnessCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateWitness(WitnessUpdateContract) returns (Transaction) {}
     *  rpc UpdateWitness2(WitnessUpdateContract) returns (TransactionExtention) {}
     *  rpc UpdateBrokerage(UpdateBrokerageContract) returns (TransactionExtention) {}
     *  rpc VoteWitnessAccount(VoteWitnessContract) returns (Transaction) {}
     *  rpc VoteWitnessAccount2(VoteWitnessContract) returns (TransactionExtention) {}
     *  rpc FreezeBalance(FreezeBalanceContract) returns (Transaction) {}
     *  rpc FreezeBalance2(FreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc UnfreezeBalance(UnfreezeBalanceContract) returns (Transaction) {}
     *  rpc UnfreezeBalance2(UnfreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc WithdrawBalance(WithdrawBalanceContract) returns (Transaction) {}
     *  rpc WithdrawBalance2(WithdrawBalanceContract) returns (TransactionExtention) {}
     *  rpc ProposalCreate(ProposalCreateContract) returns (TransactionExtention) {}
     *  rpc ProposalApprove(ProposalApproveContract) returns (TransactionExtention) {}
     *  rpc ProposalDelete(ProposalDeleteContract) returns (TransactionExtention) {}
     * </pre>
     */
    public TransactionExtention deployContract(Contract.CreateSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getDeployContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  rpc UpdateSetting(UpdateSettingContract) returns (TransactionExtention) {}          // consume_user_resource_percent
     *  rpc UpdateEnergyLimit(UpdateEnergyLimitContract) returns (TransactionExtention) {}  // origin_energy_limit
     *  rpc ClearContractABI(ClearABIContract) returns (TransactionExtention) {}
     * </pre>
     */
    public TransactionExtention triggerContract(Contract.TriggerSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getTriggerContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public TransactionExtention triggerConstantContract(Contract.TriggerSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getTriggerConstantContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public EstimateEnergyMessage estimateEnergy(Contract.TriggerSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getEstimateEnergyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public NodeInfo getNodeInfo(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public NodeList listNodes(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ChainParameters getChainParameters(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetChainParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage totalTransaction(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getTotalTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getNextMaintenanceTime(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNextMaintenanceTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public TransactionSignWeight getTransactionSignWeight(Chain.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSignWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public TransactionApprovedList getTransactionApprovedList(Chain.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionApprovedListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public Account getAccount(GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public Account getAccountById(GrpcAPI.AccountIdMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public AccountNetMessage getAccountNet(GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountNetMethod(), getCallOptions(), request);
    }

    /**
     */
    public AccountResourceMessage getAccountResource(GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public AssetIssueList getAssetIssueByAccount(GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public Contract.AssetIssueContract getAssetIssueByName(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public AssetIssueList getAssetIssueListByName(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueListByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public Contract.AssetIssueContract getAssetIssueById(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public AssetIssueList getAssetIssueList(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public AssetIssueList getPaginatedAssetIssueList(GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public Chain.Block getNowBlock(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNowBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public BlockExtention getNowBlock2(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNowBlock2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public Chain.Block getBlockByNum(GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByNumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public BlockExtention getBlockByNum2(GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByNum2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public Chain.Block getBlockById(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public BlockList getBlockByLimitNext(GrpcAPI.BlockLimit request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLimitNextMethod(), getCallOptions(), request);
    }

    /**
     */
    public BlockListExtention getBlockByLimitNext2(GrpcAPI.BlockLimit request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLimitNext2Method(), getCallOptions(), request);
    }

    /**
     */
    public BlockList getBlockByLatestNum(GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLatestNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public BlockListExtention getBlockByLatestNum2(GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLatestNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getTransactionCountByBlockNum(GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionCountByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public Chain.Transaction getTransactionById(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public TransactionInfo getTransactionInfoById(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public TransactionInfoList getTransactionInfoByBlockNum(GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionInfoByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public Common.SmartContract getContract(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public SmartContractDataWrapper getContractInfo(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetContractInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public WitnessList listWitnesses(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListWitnessesMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getBrokerageInfo(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBrokerageInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getRewardInfo(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetRewardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public DelegatedResourceList getDelegatedResource(DelegatedResourceMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegatedResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public DelegatedResourceAccountIndex getDelegatedResourceAccountIndex(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProposalList listProposals(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListProposalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Proposal getProposalById(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetProposalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProposalList getPaginatedProposalList(GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedProposalListMethod(), getCallOptions(), request);
    }

    /**
     */
    public ExchangeList listExchanges(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListExchangesMethod(), getCallOptions(), request);
    }

    /**
     */
    public Exchange getExchangeById(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetExchangeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ExchangeList getPaginatedExchangeList(GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedExchangeListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public DecryptNotesTRC20 scanShieldedTRC20NotesByIvk(GrpcAPI.IvkDecryptTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public DecryptNotesTRC20 scanShieldedTRC20NotesByOvk(GrpcAPI.OvkDecryptTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByOvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public NullifierResult isShieldedTRC20ContractNoteSpent(GrpcAPI.NfTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public MarketOrderList getMarketOrderByAccount(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public MarketOrder getMarketOrderById(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public MarketPriceList getMarketPriceByPair(MarketOrderPair request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketPriceByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public MarketOrderList getMarketOrderListByPair(MarketOrderPair request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderListByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public MarketOrderPairList getMarketPairList(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketPairListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public Chain.Transaction getTransactionSign(TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSignMethod(), getCallOptions(), request);
    }

    /**
     */
    public TransactionExtention getTransactionSign2(TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSign2Method(), getCallOptions(), request);
    }

    /**
     */
    public EasyTransferResponse easyTransferAsset(GrpcAPI.EasyTransferAssetMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public EasyTransferResponse easyTransferAssetByPrivate(GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferAssetByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public EasyTransferResponse easyTransfer(GrpcAPI.EasyTransferMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public EasyTransferResponse easyTransferByPrivate(GrpcAPI.EasyTransferByPrivateMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage createAddress(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressPrKeyPairMessage generateAddress(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGenerateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public TransactionExtention addSign(TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getAddSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public GrpcAPI.BytesMessage getSpendingKey(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.ExpandedSpendingKeyMessage getExpandedSpendingKey(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetExpandedSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage getAkFromAsk(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAkFromAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage getNkFromNsk(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNkFromNskMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.IncomingViewingKeyMessage getIncomingViewingKey(GrpcAPI.ViewingKeyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetIncomingViewingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.DiversifierMessage getDiversifier(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDiversifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.PaymentAddressMessage getZenPaymentAddress(GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetZenPaymentAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.ShieldedAddressInfo getNewShieldedAddress(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNewShieldedAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage getRcm(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetRcmMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.ShieldedTRC20Parameters createShieldedContractParameters(GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.ShieldedTRC20Parameters createShieldedContractParametersWithoutAsk(GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage getTriggerInputForShieldedTRC20Contract(GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return blockingUnaryCall(
          getChannel(), getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.GetAvailableUnfreezeCountResponseMessage getAvailableUnfreezeCount(GrpcAPI.GetAvailableUnfreezeCountRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAvailableUnfreezeCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage getCanWithdrawUnfreezeAmount(GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.CanDelegatedMaxSizeResponseMessage getCanDelegatedMaxSize(GrpcAPI.CanDelegatedMaxSizeRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetCanDelegatedMaxSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public DelegatedResourceList getDelegatedResourceV2(DelegatedResourceMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegatedResourceV2Method(), getCallOptions(), request);
    }

    /**
     */
    public DelegatedResourceAccountIndex getDelegatedResourceAccountIndexV2(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *query the network
     * </pre>
     */
    public GrpcAPI.NumberMessage getBurnTrx(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBurnTrxMethod(), getCallOptions(), request);
    }

    /**
     */
    public BlockBalanceTrace getBlockBalanceTrace(BlockIdentifier request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockBalanceTraceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *voting&amp;SRs
     * </pre>
     */
    public TransactionExtention createWitness2(Contract.WitnessCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateWitness2Method(), getCallOptions(), request);
    }

    /**
     */
    public TransactionExtention withdrawBalance2(Contract.WithdrawBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawBalance2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *pending pool
     * </pre>
     */
    public GrpcAPI.TransactionIdList getTransactionListFromPending(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionListFromPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public Chain.Transaction getTransactionFromPending(GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionFromPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getPendingSize(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPendingSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *query resource price
     * </pre>
     */
    public PricesResponseMessage getBandwidthPrices(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBandwidthPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public PricesResponseMessage getEnergyPrices(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetEnergyPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public PricesResponseMessage getMemoFee(GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMemoFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletFutureStub extends io.grpc.stub.AbstractFutureStub<WalletFutureStub> {
    private WalletFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WalletFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionReturn> broadcastTransaction(
        Chain.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  rpc CreateCommonTransaction(Transaction) returns (TransactionExtention) {}
     *  rpc CreateAccount(AccountCreateContract) returns (Transaction) {}
     *  rpc CreateAccount2(AccountCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateAccount(AccountUpdateContract) returns (Transaction) {}
     *  rpc UpdateAccount2(AccountUpdateContract) returns (TransactionExtention) {}
     *  rpc SetAccountId(SetAccountIdContract) returns (Transaction) {}
     *  rpc AccountPermissionUpdate(AccountPermissionUpdateContract) returns (TransactionExtention) {}
     *  rpc CreateTransaction(TransferContract) returns (Transaction) {}
     *  rpc CreateTransaction2(TransferContract) returns (TransactionExtention) {}
     *  rpc CreateAssetIssue(AssetIssueContract) returns (Transaction) {}
     *  rpc CreateAssetIssue2(AssetIssueContract) returns (TransactionExtention) {}
     *  rpc UpdateAsset(UpdateAssetContract) returns (Transaction) {}
     *  rpc UpdateAsset2(UpdateAssetContract) returns (TransactionExtention) {}
     *  rpc TransferAsset(TransferAssetContract) returns (Transaction) {}
     *  rpc TransferAsset2(TransferAssetContract) returns (TransactionExtention) {}
     *  rpc ParticipateAssetIssue(ParticipateAssetIssueContract) returns (Transaction) {}
     *  rpc ParticipateAssetIssue2(ParticipateAssetIssueContract) returns (TransactionExtention) {}
     *  rpc UnfreezeAsset(UnfreezeAssetContract) returns (Transaction) {}
     *  rpc UnfreezeAsset2(UnfreezeAssetContract) returns (TransactionExtention) {}
     *  rpc CreateWitness(WitnessCreateContract) returns (Transaction) {}
     *  rpc CreateWitness2(WitnessCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateWitness(WitnessUpdateContract) returns (Transaction) {}
     *  rpc UpdateWitness2(WitnessUpdateContract) returns (TransactionExtention) {}
     *  rpc UpdateBrokerage(UpdateBrokerageContract) returns (TransactionExtention) {}
     *  rpc VoteWitnessAccount(VoteWitnessContract) returns (Transaction) {}
     *  rpc VoteWitnessAccount2(VoteWitnessContract) returns (TransactionExtention) {}
     *  rpc FreezeBalance(FreezeBalanceContract) returns (Transaction) {}
     *  rpc FreezeBalance2(FreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc UnfreezeBalance(UnfreezeBalanceContract) returns (Transaction) {}
     *  rpc UnfreezeBalance2(UnfreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc WithdrawBalance(WithdrawBalanceContract) returns (Transaction) {}
     *  rpc WithdrawBalance2(WithdrawBalanceContract) returns (TransactionExtention) {}
     *  rpc ProposalCreate(ProposalCreateContract) returns (TransactionExtention) {}
     *  rpc ProposalApprove(ProposalApproveContract) returns (TransactionExtention) {}
     *  rpc ProposalDelete(ProposalDeleteContract) returns (TransactionExtention) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionExtention> deployContract(
        Contract.CreateSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  rpc UpdateSetting(UpdateSettingContract) returns (TransactionExtention) {}          // consume_user_resource_percent
     *  rpc UpdateEnergyLimit(UpdateEnergyLimitContract) returns (TransactionExtention) {}  // origin_energy_limit
     *  rpc ClearContractABI(ClearABIContract) returns (TransactionExtention) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionExtention> triggerContract(
        Contract.TriggerSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionExtention> triggerConstantContract(
        Contract.TriggerSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EstimateEnergyMessage> estimateEnergy(
        Contract.TriggerSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getEstimateEnergyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<NodeInfo> getNodeInfo(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<NodeList> listNodes(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ChainParameters> getChainParameters(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> totalTransaction(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getNextMaintenanceTime(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionSignWeight> getTransactionSignWeight(
        Chain.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionApprovedList> getTransactionApprovedList(
        Chain.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Account> getAccount(
        GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Account> getAccountById(
        GrpcAPI.AccountIdMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AccountNetMessage> getAccountNet(
        GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AccountResourceMessage> getAccountResource(
        GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AssetIssueList> getAssetIssueByAccount(
        GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Contract.AssetIssueContract> getAssetIssueByName(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AssetIssueList> getAssetIssueListByName(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Contract.AssetIssueContract> getAssetIssueById(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AssetIssueList> getAssetIssueList(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AssetIssueList> getPaginatedAssetIssueList(
        GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Chain.Block> getNowBlock(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockExtention> getNowBlock2(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Chain.Block> getBlockByNum(
        GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockExtention> getBlockByNum2(
        GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Chain.Block> getBlockById(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockList> getBlockByLimitNext(
        GrpcAPI.BlockLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockListExtention> getBlockByLimitNext2(
        GrpcAPI.BlockLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockList> getBlockByLatestNum(
        GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockListExtention> getBlockByLatestNum2(
        GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getTransactionCountByBlockNum(
        GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Chain.Transaction> getTransactionById(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionInfo> getTransactionInfoById(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionInfoList> getTransactionInfoByBlockNum(
        GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Common.SmartContract> getContract(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SmartContractDataWrapper> getContractInfo(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<WitnessList> listWitnesses(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getBrokerageInfo(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getRewardInfo(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DelegatedResourceList> getDelegatedResource(
        DelegatedResourceMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DelegatedResourceAccountIndex> getDelegatedResourceAccountIndex(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProposalList> listProposals(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Proposal> getProposalById(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProposalList> getPaginatedProposalList(
        GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ExchangeList> listExchanges(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Exchange> getExchangeById(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ExchangeList> getPaginatedExchangeList(
        GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DecryptNotesTRC20> scanShieldedTRC20NotesByIvk(
        GrpcAPI.IvkDecryptTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DecryptNotesTRC20> scanShieldedTRC20NotesByOvk(
        GrpcAPI.OvkDecryptTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<NullifierResult> isShieldedTRC20ContractNoteSpent(
        GrpcAPI.NfTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MarketOrderList> getMarketOrderByAccount(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MarketOrder> getMarketOrderById(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MarketPriceList> getMarketPriceByPair(
        MarketOrderPair request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MarketOrderList> getMarketOrderListByPair(
        MarketOrderPair request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MarketOrderPairList> getMarketPairList(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Chain.Transaction> getTransactionSign(
        TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionExtention> getTransactionSign2(
        TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EasyTransferResponse> easyTransferAsset(
        GrpcAPI.EasyTransferAssetMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EasyTransferResponse> easyTransferAssetByPrivate(
        GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EasyTransferResponse> easyTransfer(
        GrpcAPI.EasyTransferMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EasyTransferResponse> easyTransferByPrivate(
        GrpcAPI.EasyTransferByPrivateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> createAddress(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressPrKeyPairMessage> generateAddress(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionExtention> addSign(
        TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getSpendingKey(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.ExpandedSpendingKeyMessage> getExpandedSpendingKey(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getAkFromAsk(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getNkFromNsk(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.IncomingViewingKeyMessage> getIncomingViewingKey(
        GrpcAPI.ViewingKeyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.DiversifierMessage> getDiversifier(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.PaymentAddressMessage> getZenPaymentAddress(
        GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.ShieldedAddressInfo> getNewShieldedAddress(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getRcm(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParameters(
        GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParametersWithoutAsk(
        GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getTriggerInputForShieldedTRC20Contract(
        GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getAvailableUnfreezeCount(
        GrpcAPI.GetAvailableUnfreezeCountRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAvailableUnfreezeCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getCanWithdrawUnfreezeAmount(
        GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.CanDelegatedMaxSizeResponseMessage> getCanDelegatedMaxSize(
        GrpcAPI.CanDelegatedMaxSizeRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCanDelegatedMaxSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DelegatedResourceList> getDelegatedResourceV2(
        DelegatedResourceMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DelegatedResourceAccountIndex> getDelegatedResourceAccountIndexV2(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *query the network
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getBurnTrx(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BlockBalanceTrace> getBlockBalanceTrace(
        BlockIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockBalanceTraceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *voting&amp;SRs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionExtention> createWitness2(
        Contract.WitnessCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TransactionExtention> withdrawBalance2(
        Contract.WithdrawBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *pending pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.TransactionIdList> getTransactionListFromPending(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionListFromPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Chain.Transaction> getTransactionFromPending(
        GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionFromPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getPendingSize(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPendingSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *query resource price
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<PricesResponseMessage> getBandwidthPrices(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBandwidthPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PricesResponseMessage> getEnergyPrices(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEnergyPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PricesResponseMessage> getMemoFee(
        GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMemoFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BROADCAST_TRANSACTION = 0;
  private static final int METHODID_DEPLOY_CONTRACT = 1;
  private static final int METHODID_TRIGGER_CONTRACT = 2;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT = 3;
  private static final int METHODID_ESTIMATE_ENERGY = 4;
  private static final int METHODID_GET_NODE_INFO = 5;
  private static final int METHODID_LIST_NODES = 6;
  private static final int METHODID_GET_CHAIN_PARAMETERS = 7;
  private static final int METHODID_TOTAL_TRANSACTION = 8;
  private static final int METHODID_GET_NEXT_MAINTENANCE_TIME = 9;
  private static final int METHODID_GET_TRANSACTION_SIGN_WEIGHT = 10;
  private static final int METHODID_GET_TRANSACTION_APPROVED_LIST = 11;
  private static final int METHODID_GET_ACCOUNT = 12;
  private static final int METHODID_GET_ACCOUNT_BY_ID = 13;
  private static final int METHODID_GET_ACCOUNT_NET = 14;
  private static final int METHODID_GET_ACCOUNT_RESOURCE = 15;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ACCOUNT = 16;
  private static final int METHODID_GET_ASSET_ISSUE_BY_NAME = 17;
  private static final int METHODID_GET_ASSET_ISSUE_LIST_BY_NAME = 18;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ID = 19;
  private static final int METHODID_GET_ASSET_ISSUE_LIST = 20;
  private static final int METHODID_GET_PAGINATED_ASSET_ISSUE_LIST = 21;
  private static final int METHODID_GET_NOW_BLOCK = 22;
  private static final int METHODID_GET_NOW_BLOCK2 = 23;
  private static final int METHODID_GET_BLOCK_BY_NUM = 24;
  private static final int METHODID_GET_BLOCK_BY_NUM2 = 25;
  private static final int METHODID_GET_BLOCK_BY_ID = 26;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT = 27;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT2 = 28;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM = 29;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM2 = 30;
  private static final int METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM = 31;
  private static final int METHODID_GET_TRANSACTION_BY_ID = 32;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_ID = 33;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM = 34;
  private static final int METHODID_GET_CONTRACT = 35;
  private static final int METHODID_GET_CONTRACT_INFO = 36;
  private static final int METHODID_LIST_WITNESSES = 37;
  private static final int METHODID_GET_BROKERAGE_INFO = 38;
  private static final int METHODID_GET_REWARD_INFO = 39;
  private static final int METHODID_GET_DELEGATED_RESOURCE = 40;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX = 41;
  private static final int METHODID_LIST_PROPOSALS = 42;
  private static final int METHODID_GET_PROPOSAL_BY_ID = 43;
  private static final int METHODID_GET_PAGINATED_PROPOSAL_LIST = 44;
  private static final int METHODID_LIST_EXCHANGES = 45;
  private static final int METHODID_GET_EXCHANGE_BY_ID = 46;
  private static final int METHODID_GET_PAGINATED_EXCHANGE_LIST = 47;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK = 48;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK = 49;
  private static final int METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT = 50;
  private static final int METHODID_GET_MARKET_ORDER_BY_ACCOUNT = 51;
  private static final int METHODID_GET_MARKET_ORDER_BY_ID = 52;
  private static final int METHODID_GET_MARKET_PRICE_BY_PAIR = 53;
  private static final int METHODID_GET_MARKET_ORDER_LIST_BY_PAIR = 54;
  private static final int METHODID_GET_MARKET_PAIR_LIST = 55;
  private static final int METHODID_GET_TRANSACTION_SIGN = 56;
  private static final int METHODID_GET_TRANSACTION_SIGN2 = 57;
  private static final int METHODID_EASY_TRANSFER_ASSET = 58;
  private static final int METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE = 59;
  private static final int METHODID_EASY_TRANSFER = 60;
  private static final int METHODID_EASY_TRANSFER_BY_PRIVATE = 61;
  private static final int METHODID_CREATE_ADDRESS = 62;
  private static final int METHODID_GENERATE_ADDRESS = 63;
  private static final int METHODID_ADD_SIGN = 64;
  private static final int METHODID_GET_SPENDING_KEY = 65;
  private static final int METHODID_GET_EXPANDED_SPENDING_KEY = 66;
  private static final int METHODID_GET_AK_FROM_ASK = 67;
  private static final int METHODID_GET_NK_FROM_NSK = 68;
  private static final int METHODID_GET_INCOMING_VIEWING_KEY = 69;
  private static final int METHODID_GET_DIVERSIFIER = 70;
  private static final int METHODID_GET_ZEN_PAYMENT_ADDRESS = 71;
  private static final int METHODID_GET_NEW_SHIELDED_ADDRESS = 72;
  private static final int METHODID_GET_RCM = 73;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS = 74;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK = 75;
  private static final int METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT = 76;
  private static final int METHODID_GET_AVAILABLE_UNFREEZE_COUNT = 77;
  private static final int METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT = 78;
  private static final int METHODID_GET_CAN_DELEGATED_MAX_SIZE = 79;
  private static final int METHODID_GET_DELEGATED_RESOURCE_V2 = 80;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2 = 81;
  private static final int METHODID_GET_BURN_TRX = 82;
  private static final int METHODID_GET_BLOCK_BALANCE_TRACE = 83;
  private static final int METHODID_CREATE_WITNESS2 = 84;
  private static final int METHODID_WITHDRAW_BALANCE2 = 85;
  private static final int METHODID_GET_TRANSACTION_LIST_FROM_PENDING = 86;
  private static final int METHODID_GET_TRANSACTION_FROM_PENDING = 87;
  private static final int METHODID_GET_PENDING_SIZE = 88;
  private static final int METHODID_GET_BANDWIDTH_PRICES = 89;
  private static final int METHODID_GET_ENERGY_PRICES = 90;
  private static final int METHODID_GET_MEMO_FEE = 91;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<TransactionReturn>) responseObserver);
          break;
        case METHODID_DEPLOY_CONTRACT:
          serviceImpl.deployContract((Contract.CreateSmartContract) request,
              (io.grpc.stub.StreamObserver<TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONTRACT:
          serviceImpl.triggerContract((Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT:
          serviceImpl.triggerConstantContract((Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<TransactionExtention>) responseObserver);
          break;
        case METHODID_ESTIMATE_ENERGY:
          serviceImpl.estimateEnergy((Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<EstimateEnergyMessage>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<NodeInfo>) responseObserver);
          break;
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<NodeList>) responseObserver);
          break;
        case METHODID_GET_CHAIN_PARAMETERS:
          serviceImpl.getChainParameters((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<ChainParameters>) responseObserver);
          break;
        case METHODID_TOTAL_TRANSACTION:
          serviceImpl.totalTransaction((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_NEXT_MAINTENANCE_TIME:
          serviceImpl.getNextMaintenanceTime((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN_WEIGHT:
          serviceImpl.getTransactionSignWeight((Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<TransactionSignWeight>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_APPROVED_LIST:
          serviceImpl.getTransactionApprovedList((Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<TransactionApprovedList>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_ID:
          serviceImpl.getAccountById((GrpcAPI.AccountIdMessage) request,
              (io.grpc.stub.StreamObserver<Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_NET:
          serviceImpl.getAccountNet((GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<AccountNetMessage>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_RESOURCE:
          serviceImpl.getAccountResource((GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<AccountResourceMessage>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ACCOUNT:
          serviceImpl.getAssetIssueByAccount((GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_NAME:
          serviceImpl.getAssetIssueByName((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST_BY_NAME:
          serviceImpl.getAssetIssueListByName((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ID:
          serviceImpl.getAssetIssueById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST:
          serviceImpl.getAssetIssueList((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_ASSET_ISSUE_LIST:
          serviceImpl.getPaginatedAssetIssueList((GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK:
          serviceImpl.getNowBlock((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<Chain.Block>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK2:
          serviceImpl.getNowBlock2((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM:
          serviceImpl.getBlockByNum((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM2:
          serviceImpl.getBlockByNum2((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_ID:
          serviceImpl.getBlockById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT:
          serviceImpl.getBlockByLimitNext((GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT2:
          serviceImpl.getBlockByLimitNext2((GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM:
          serviceImpl.getBlockByLatestNum((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM2:
          serviceImpl.getBlockByLatestNum2((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM:
          serviceImpl.getTransactionCountByBlockNum((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID:
          serviceImpl.getTransactionById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_ID:
          serviceImpl.getTransactionInfoById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<TransactionInfo>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM:
          serviceImpl.getTransactionInfoByBlockNum((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<TransactionInfoList>) responseObserver);
          break;
        case METHODID_GET_CONTRACT:
          serviceImpl.getContract((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<Common.SmartContract>) responseObserver);
          break;
        case METHODID_GET_CONTRACT_INFO:
          serviceImpl.getContractInfo((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<SmartContractDataWrapper>) responseObserver);
          break;
        case METHODID_LIST_WITNESSES:
          serviceImpl.listWitnesses((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<WitnessList>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE_INFO:
          serviceImpl.getBrokerageInfo((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_REWARD_INFO:
          serviceImpl.getRewardInfo((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE:
          serviceImpl.getDelegatedResource((DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX:
          serviceImpl.getDelegatedResourceAccountIndex((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_LIST_PROPOSALS:
          serviceImpl.listProposals((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<ProposalList>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_BY_ID:
          serviceImpl.getProposalById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<Proposal>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_PROPOSAL_LIST:
          serviceImpl.getPaginatedProposalList((GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<ProposalList>) responseObserver);
          break;
        case METHODID_LIST_EXCHANGES:
          serviceImpl.listExchanges((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<ExchangeList>) responseObserver);
          break;
        case METHODID_GET_EXCHANGE_BY_ID:
          serviceImpl.getExchangeById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<Exchange>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_EXCHANGE_LIST:
          serviceImpl.getPaginatedExchangeList((GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<ExchangeList>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK:
          serviceImpl.scanShieldedTRC20NotesByIvk((GrpcAPI.IvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK:
          serviceImpl.scanShieldedTRC20NotesByOvk((GrpcAPI.OvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT:
          serviceImpl.isShieldedTRC20ContractNoteSpent((GrpcAPI.NfTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<NullifierResult>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ACCOUNT:
          serviceImpl.getMarketOrderByAccount((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ID:
          serviceImpl.getMarketOrderById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<MarketOrder>) responseObserver);
          break;
        case METHODID_GET_MARKET_PRICE_BY_PAIR:
          serviceImpl.getMarketPriceByPair((MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<MarketPriceList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_LIST_BY_PAIR:
          serviceImpl.getMarketOrderListByPair((MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_PAIR_LIST:
          serviceImpl.getMarketPairList((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<MarketOrderPairList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN:
          serviceImpl.getTransactionSign((TransactionSign) request,
              (io.grpc.stub.StreamObserver<Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN2:
          serviceImpl.getTransactionSign2((TransactionSign) request,
              (io.grpc.stub.StreamObserver<TransactionExtention>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET:
          serviceImpl.easyTransferAsset((GrpcAPI.EasyTransferAssetMessage) request,
              (io.grpc.stub.StreamObserver<EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE:
          serviceImpl.easyTransferAssetByPrivate((GrpcAPI.EasyTransferAssetByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER:
          serviceImpl.easyTransfer((GrpcAPI.EasyTransferMessage) request,
              (io.grpc.stub.StreamObserver<EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_BY_PRIVATE:
          serviceImpl.easyTransferByPrivate((GrpcAPI.EasyTransferByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<EasyTransferResponse>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GENERATE_ADDRESS:
          serviceImpl.generateAddress((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<AddressPrKeyPairMessage>) responseObserver);
          break;
        case METHODID_ADD_SIGN:
          serviceImpl.addSign((TransactionSign) request,
              (io.grpc.stub.StreamObserver<TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_SPENDING_KEY:
          serviceImpl.getSpendingKey((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_EXPANDED_SPENDING_KEY:
          serviceImpl.getExpandedSpendingKey((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.ExpandedSpendingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_AK_FROM_ASK:
          serviceImpl.getAkFromAsk((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_NK_FROM_NSK:
          serviceImpl.getNkFromNsk((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_INCOMING_VIEWING_KEY:
          serviceImpl.getIncomingViewingKey((GrpcAPI.ViewingKeyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.IncomingViewingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_DIVERSIFIER:
          serviceImpl.getDiversifier((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.DiversifierMessage>) responseObserver);
          break;
        case METHODID_GET_ZEN_PAYMENT_ADDRESS:
          serviceImpl.getZenPaymentAddress((GrpcAPI.IncomingViewingKeyDiversifierMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.PaymentAddressMessage>) responseObserver);
          break;
        case METHODID_GET_NEW_SHIELDED_ADDRESS:
          serviceImpl.getNewShieldedAddress((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.ShieldedAddressInfo>) responseObserver);
          break;
        case METHODID_GET_RCM:
          serviceImpl.getRcm((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS:
          serviceImpl.createShieldedContractParameters((GrpcAPI.PrivateShieldedTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK:
          serviceImpl.createShieldedContractParametersWithoutAsk((GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT:
          serviceImpl.getTriggerInputForShieldedTRC20Contract((GrpcAPI.ShieldedTRC20TriggerContractParameters) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_UNFREEZE_COUNT:
          serviceImpl.getAvailableUnfreezeCount((GrpcAPI.GetAvailableUnfreezeCountRequestMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.GetAvailableUnfreezeCountResponseMessage>) responseObserver);
          break;
        case METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT:
          serviceImpl.getCanWithdrawUnfreezeAmount((GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>) responseObserver);
          break;
        case METHODID_GET_CAN_DELEGATED_MAX_SIZE:
          serviceImpl.getCanDelegatedMaxSize((GrpcAPI.CanDelegatedMaxSizeRequestMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.CanDelegatedMaxSizeResponseMessage>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_V2:
          serviceImpl.getDelegatedResourceV2((DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2:
          serviceImpl.getDelegatedResourceAccountIndexV2((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_GET_BURN_TRX:
          serviceImpl.getBurnTrx((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BALANCE_TRACE:
          serviceImpl.getBlockBalanceTrace((BlockIdentifier) request,
              (io.grpc.stub.StreamObserver<BlockBalanceTrace>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS2:
          serviceImpl.createWitness2((Contract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<TransactionExtention>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE2:
          serviceImpl.withdrawBalance2((Contract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_LIST_FROM_PENDING:
          serviceImpl.getTransactionListFromPending((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.TransactionIdList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_FROM_PENDING:
          serviceImpl.getTransactionFromPending((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_PENDING_SIZE:
          serviceImpl.getPendingSize((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BANDWIDTH_PRICES:
          serviceImpl.getBandwidthPrices((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<PricesResponseMessage>) responseObserver);
          break;
        case METHODID_GET_ENERGY_PRICES:
          serviceImpl.getEnergyPrices((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<PricesResponseMessage>) responseObserver);
          break;
        case METHODID_GET_MEMO_FEE:
          serviceImpl.getMemoFee((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<PricesResponseMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcAPI.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
      extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
      extends WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletFileDescriptorSupplier())
              .addMethod(getBroadcastTransactionMethod())
              .addMethod(getDeployContractMethod())
              .addMethod(getTriggerContractMethod())
              .addMethod(getTriggerConstantContractMethod())
              .addMethod(getEstimateEnergyMethod())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getListNodesMethod())
              .addMethod(getGetChainParametersMethod())
              .addMethod(getTotalTransactionMethod())
              .addMethod(getGetNextMaintenanceTimeMethod())
              .addMethod(getGetTransactionSignWeightMethod())
              .addMethod(getGetTransactionApprovedListMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountByIdMethod())
              .addMethod(getGetAccountNetMethod())
              .addMethod(getGetAccountResourceMethod())
              .addMethod(getGetAssetIssueByAccountMethod())
              .addMethod(getGetAssetIssueByNameMethod())
              .addMethod(getGetAssetIssueListByNameMethod())
              .addMethod(getGetAssetIssueByIdMethod())
              .addMethod(getGetAssetIssueListMethod())
              .addMethod(getGetPaginatedAssetIssueListMethod())
              .addMethod(getGetNowBlockMethod())
              .addMethod(getGetNowBlock2Method())
              .addMethod(getGetBlockByNumMethod())
              .addMethod(getGetBlockByNum2Method())
              .addMethod(getGetBlockByIdMethod())
              .addMethod(getGetBlockByLimitNextMethod())
              .addMethod(getGetBlockByLimitNext2Method())
              .addMethod(getGetBlockByLatestNumMethod())
              .addMethod(getGetBlockByLatestNum2Method())
              .addMethod(getGetTransactionCountByBlockNumMethod())
              .addMethod(getGetTransactionByIdMethod())
              .addMethod(getGetTransactionInfoByIdMethod())
              .addMethod(getGetTransactionInfoByBlockNumMethod())
              .addMethod(getGetContractMethod())
              .addMethod(getGetContractInfoMethod())
              .addMethod(getListWitnessesMethod())
              .addMethod(getGetBrokerageInfoMethod())
              .addMethod(getGetRewardInfoMethod())
              .addMethod(getGetDelegatedResourceMethod())
              .addMethod(getGetDelegatedResourceAccountIndexMethod())
              .addMethod(getListProposalsMethod())
              .addMethod(getGetProposalByIdMethod())
              .addMethod(getGetPaginatedProposalListMethod())
              .addMethod(getListExchangesMethod())
              .addMethod(getGetExchangeByIdMethod())
              .addMethod(getGetPaginatedExchangeListMethod())
              .addMethod(getScanShieldedTRC20NotesByIvkMethod())
              .addMethod(getScanShieldedTRC20NotesByOvkMethod())
              .addMethod(getIsShieldedTRC20ContractNoteSpentMethod())
              .addMethod(getGetMarketOrderByAccountMethod())
              .addMethod(getGetMarketOrderByIdMethod())
              .addMethod(getGetMarketPriceByPairMethod())
              .addMethod(getGetMarketOrderListByPairMethod())
              .addMethod(getGetMarketPairListMethod())
              .addMethod(getGetTransactionSignMethod())
              .addMethod(getGetTransactionSign2Method())
              .addMethod(getEasyTransferAssetMethod())
              .addMethod(getEasyTransferAssetByPrivateMethod())
              .addMethod(getEasyTransferMethod())
              .addMethod(getEasyTransferByPrivateMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getGenerateAddressMethod())
              .addMethod(getAddSignMethod())
              .addMethod(getGetSpendingKeyMethod())
              .addMethod(getGetExpandedSpendingKeyMethod())
              .addMethod(getGetAkFromAskMethod())
              .addMethod(getGetNkFromNskMethod())
              .addMethod(getGetIncomingViewingKeyMethod())
              .addMethod(getGetDiversifierMethod())
              .addMethod(getGetZenPaymentAddressMethod())
              .addMethod(getGetNewShieldedAddressMethod())
              .addMethod(getGetRcmMethod())
              .addMethod(getCreateShieldedContractParametersMethod())
              .addMethod(getCreateShieldedContractParametersWithoutAskMethod())
              .addMethod(getGetTriggerInputForShieldedTRC20ContractMethod())
              .addMethod(getGetAvailableUnfreezeCountMethod())
              .addMethod(getGetCanWithdrawUnfreezeAmountMethod())
              .addMethod(getGetCanDelegatedMaxSizeMethod())
              .addMethod(getGetDelegatedResourceV2Method())
              .addMethod(getGetDelegatedResourceAccountIndexV2Method())
              .addMethod(getGetBurnTrxMethod())
              .addMethod(getGetBlockBalanceTraceMethod())
              .addMethod(getCreateWitness2Method())
              .addMethod(getWithdrawBalance2Method())
              .addMethod(getGetTransactionListFromPendingMethod())
              .addMethod(getGetTransactionFromPendingMethod())
              .addMethod(getGetPendingSizeMethod())
              .addMethod(getGetBandwidthPricesMethod())
              .addMethod(getGetEnergyPricesMethod())
              .addMethod(getGetMemoFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}

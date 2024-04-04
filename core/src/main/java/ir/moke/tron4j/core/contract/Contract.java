package ir.moke.tron4j.core.contract;

import com.google.protobuf.ByteString;
import com.google.protobuf.util.JsonFormat;
import ir.moke.tron4j.abi.datatypes.Type;
import ir.moke.tron4j.core.ApiWrapper;
import ir.moke.tron4j.core.exceptions.ContractCreateException;
import ir.moke.tron4j.core.transaction.TransactionBuilder;
import ir.moke.tron4j.proto.Common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The {@code Contract} class is a wrapper for the {@code SmartContract} class defined in the .proto file. An object of {@code Contract} contains same attributes with the {@code SmartContract} class.
 *
 * <p>This class provides mutator and accessor methods for all
 * attributes. Besides, functions of smart contracts are wrapped and can be easily viewed through {@link ir.moke.tron4j.core.contract.ContractFunction#toString()}</>
 *
 * @see ir.moke.tron4j.core.contract.ContractFunction
 * @see ir.moke.tron4j.proto.Common.SmartContract;
 * @since jdk 1.8.0_231
 */

public class Contract {
    protected ApiWrapper wrapper;
    protected ByteString originAddr = ByteString.EMPTY;
    protected ByteString cntrAddr = ByteString.EMPTY;
    protected Common.SmartContract.ABI abi;
    protected ByteString bytecode;
    //the amount of deposit TRX, default is 0
    protected long callValue = 0;
    //the energy percent user consumes, default is 100%
    protected long consumeUserResourcePercent = 100;
    protected String name = "";
    protected long originEnergyLimit = 1;
    protected ByteString codeHash = ByteString.EMPTY;
    protected ByteString trxHash = ByteString.EMPTY;
    //Current transaction owner's address, to call or trigger contract"
    protected ByteString ownerAddr = ByteString.EMPTY;
    protected List<ContractFunction> functions = new ArrayList();
    //the constructor is loaded automatically from the abi, if has
    protected ContractConstructor constructor = null;

    public Contract(Contract cntr, String ownerAddr, ApiWrapper wrapper) {
        this.originAddr = cntr.getOriginAddr();
        this.cntrAddr = cntr.getCntrAddr();
        this.abi = cntr.getAbi();
        this.bytecode = cntr.getBytecode();
        this.callValue = cntr.getCallValue();
        this.consumeUserResourcePercent = cntr.getConsumeUserResourcePercent();
        this.name = cntr.getName();
        this.originEnergyLimit = cntr.getOriginEnergyLimit();
        this.codeHash = cntr.getCodeHash();
        this.trxHash = cntr.getTrxHash();
        this.ownerAddr = ApiWrapper.parseAddress(ownerAddr);
        this.wrapper = wrapper;
    }

    public Contract(ByteString cntrAddr, Common.SmartContract.ABI abi, ByteString bytecode, long consumeUserResourcePercent, String name, long originEnergyLimit) {
        this.cntrAddr = cntrAddr;
        this.abi = abi;
        this.bytecode = bytecode;
        this.consumeUserResourcePercent = consumeUserResourcePercent;
        this.name = name;
        this.originEnergyLimit = originEnergyLimit;
    }

    public Contract(Builder builder) {
        this.originAddr = builder.originAddr;
        this.cntrAddr = builder.cntrAddr;
        this.abi = builder.abi;
        this.bytecode = builder.bytecode;
        this.callValue = builder.callValue;
        this.consumeUserResourcePercent = builder.consumeUserResourcePercent;
        this.name = builder.name;
        this.originEnergyLimit = builder.originEnergyLimit;
        this.ownerAddr = builder.ownerAddr;
        abiToFunctions();
    }

    public ApiWrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(ApiWrapper wrapper) {
        this.wrapper = wrapper;
    }

    public ByteString getOriginAddr() {
        return originAddr;
    }

    public void setOriginAddr(ByteString originAddr) {
        this.originAddr = originAddr;
    }

    public ByteString getCntrAddr() {
        return cntrAddr;
    }

    public void setCntrAddr(ByteString cntrAddr) {
        this.cntrAddr = cntrAddr;
    }

    public Common.SmartContract.ABI getAbi() {
        return abi;
    }

    public void setAbi(Common.SmartContract.ABI abi) {
        this.abi = abi;
    }

    public void setAbi(String abiString) throws Exception {
        Common.SmartContract.ABI.Builder builder = Common.SmartContract.ABI.newBuilder();
        loadAbiFromJson(abiString, builder);
        this.abi = builder.build();
    }

    public ByteString getBytecode() {
        return bytecode;
    }

    public void setBytecode(ByteString bytecode) {
        this.bytecode = bytecode;
    }

    public long getCallValue() {
        return callValue;
    }

    public void setCallValue(long callValue) {
        this.callValue = callValue;
    }

    public long getConsumeUserResourcePercent() {
        return consumeUserResourcePercent;
    }

    public void setConsumeUserResourcePercent(long consumeUserResourcePercent) {
        this.consumeUserResourcePercent = consumeUserResourcePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOriginEnergyLimit() {
        return originEnergyLimit;
    }

    public void setOriginEnergyLimit(long originEnergyLimit) {
        this.originEnergyLimit = originEnergyLimit;
    }

    public ByteString getCodeHash() {
        return codeHash;
    }

    public void setCodeHash(ByteString codeHash) {
        this.codeHash = codeHash;
    }

    public ByteString getTrxHash() {
        return trxHash;
    }

    public void setTrxHash(ByteString trxHash) {
        this.trxHash = trxHash;
    }

    public ByteString getOwnerAddr() {
        return ownerAddr;
    }

    public void setOwnerAddr(ByteString ownerAddr) {
        this.ownerAddr = ownerAddr;
    }

    public List<ContractFunction> getFunctions() {
        return functions;
    }

    public void setFunctions(List<ContractFunction> functions) {
        this.functions = functions;
    }

    public ContractConstructor getConstructor() {
        return constructor;
    }

    public static class Builder {
        protected ApiWrapper wrapper;
        protected ByteString originAddr = ByteString.EMPTY;
        protected ByteString cntrAddr = ByteString.EMPTY;
        protected Common.SmartContract.ABI abi;
        protected ByteString bytecode;
        protected long callValue = 0;
        protected long consumeUserResourcePercent = 100;
        protected String name = "";
        protected long originEnergyLimit = 1;
        protected ByteString codeHash = ByteString.EMPTY;
        protected ByteString trxHash = ByteString.EMPTY;
        protected ByteString ownerAddr = ByteString.EMPTY;

        public Builder setWrapper(ApiWrapper wrapper) {
            this.wrapper = wrapper;
            return this;
        }

        public Builder setOriginAddr(ByteString originAddr) {
            this.originAddr = originAddr;
            return this;
        }

        public Builder setCntrAddr(ByteString cntrAddr) {
            this.cntrAddr = cntrAddr;
            return this;
        }

        public Builder setAbi(Common.SmartContract.ABI abi) {
            this.abi = abi;
            return this;
        }

        public Builder setAbi(String abiString) throws Exception {
            Common.SmartContract.ABI.Builder builder = Common.SmartContract.ABI.newBuilder();
            loadAbiFromJson(abiString, builder);
            this.abi = builder.build();
            return this;
        }

        public Builder setBytecode(ByteString bytecode) {
            this.bytecode = bytecode;
            return this;
        }

        public Builder setCallValue(long callValue) {
            this.callValue = callValue;
            return this;
        }

        public Builder setConsumeUserResourcePercent(long consumeUserResourcePercent) {
            this.consumeUserResourcePercent = consumeUserResourcePercent;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOriginEnergyLimit(long originEnergyLimit) {
            this.originEnergyLimit = originEnergyLimit;
            return this;
        }

        public Builder setOwnerAddr(ByteString ownerAddr) {
            this.ownerAddr = ownerAddr;
            return this;
        }

        public Contract build() {
            return new Contract(this);
        }
    }

    /**
     * Convert abi entries to ContractFunction objects
     *
     * @see ir.moke.tron4j.proto.Common.SmartContract.ABI.Entry;
     * @see ContractFunction ;
     */
    protected void abiToFunctions() {
        int funcNum = abi.getEntrysCount();
        for (int i = 0; i < funcNum; i++) {
            Common.SmartContract.ABI.Entry funcAbi = abi.getEntrysList().get(i);
            if (funcAbi.getTypeValue() == 2) {
                ContractFunction.Builder builder = new ContractFunction.Builder();
                builder.setName(funcAbi.getName());
                builder.setAbi(funcAbi);
                builder.setCntr(this);
                builder.setOwnerAddr(this.ownerAddr);
                //if has input
                if (0 != funcAbi.getInputsCount()) {
                    List params = funcAbi.getInputsList();
                    builder.setInputParams(collectParams(params, 'p'));
                    builder.setInputTypes(collectParams(params, 't'));
                }
                //if has output
                if (0 != funcAbi.getOutputsCount()) {
                    List<Common.SmartContract.ABI.Entry.Param> params = funcAbi.getOutputsList();
                    if (null != params.get(0).getName()) {
                        builder.setOutput((String) collectParams(params, 'p').get(0));
                    }
                    builder.setOutputType((String) collectParams(params, 't').get(0));
                }

                switch (funcAbi.getStateMutabilityValue()) {
                    case 0:
                        builder.setStateMutability("unknownmutabilitytype");
                        break;
                    case 1:
                        builder.setStateMutability("pure");
                        break;
                    case 2:
                        builder.setStateMutability("view");
                        break;
                    case 3:
                        builder.setStateMutability("nonpayable");
                        break;
                    case 4:
                        builder.setStateMutability("payable");
                        break;
                }

                functions.add(builder.build());
            }
        }
    }

    protected List<String> collectParams(List<Common.SmartContract.ABI.Entry.Param> params, char flag) {
        List<String> ret = new ArrayList();
        switch (flag) {
            //p = param, t = type
            case 'p':
                for (Common.SmartContract.ABI.Entry.Param p : params) {
                    ret.add(p.getName());
                }
                break;
            case 't':
                for (Common.SmartContract.ABI.Entry.Param p : params) {
                    ret.add(p.getType());
                }
                break;
        }
        return ret;
    }

    /**
     * build a SmartContract object
     *
     * @return SmartContract object
     */
    public Common.SmartContract toProto() {
        return Common.SmartContract.newBuilder()
                .setOriginAddress(originAddr)
                .setContractAddress(cntrAddr)
                .setAbi(abi)
                .setBytecode(bytecode)
                .setCallValue(callValue)
                .setConsumeUserResourcePercent(consumeUserResourcePercent)
                .setName(name)
                .setOriginEnergyLimit(originEnergyLimit)
                .setTrxHash(trxHash)
                .build();
    }

    public TransactionBuilder deploy() throws Exception {
        //No deposit when creating contract
        return deploy(Collections.emptyList());
    }

    /**
     * create a CreateSmartContract object to get ready for deployment. please note if any deposit is made during deployment(@see callValue), the constructor of this contract must be payable
     *
     * @return TransactionBuilder object for signing and broadcasting
     * @throws Exception               if deployment duplicating / owner and origin address don't match
     * @throws ContractCreateException if passes parameters but no constructor exists
     */
    public TransactionBuilder deploy(List<Type> buildParams) throws Exception {
        //throws if deployed
        if (!this.cntrAddr.isEmpty()) {
            throw new ContractCreateException("This contract has already been deployed.");
        }
        //throws if origin address does not match owner address
        if (!this.originAddr.equals(this.ownerAddr)) {
            throw new ContractCreateException("Origin address and owner address mismatch.");
        }
        loadConstructor();
        //throws if the contract does not have a constructor
        if (null == this.constructor && !buildParams.isEmpty()) {
            throw new ContractCreateException("The contract does not have a constructor.");
        }
        this.constructor.encodeParameter(buildParams);
        setBytecode(getBytecode().concat(this.constructor.getBytecode()));
        //create
        ir.moke.tron4j.proto.Contract.CreateSmartContract.Builder createSmartContractBuilder = ir.moke.tron4j.proto.Contract.CreateSmartContract.newBuilder();
        createSmartContractBuilder.setOwnerAddress(ownerAddr);
        createSmartContractBuilder.setNewContract(toProto());

        return new TransactionBuilder(wrapper.blockingStub.deployContract(createSmartContractBuilder.build()).getTransaction());
    }

    /**
     * load the constructor from ABI
     */
    protected void loadConstructor() {
        for (Common.SmartContract.ABI.Entry e : abi.getEntrysList()) {
            if (e.getName().equals("")) {
                this.constructor = new ContractConstructor(e);
            }
        }
    }

    /**
     * load abi from json format string
     *
     * @param abiString abi string in json format
     * @return proto.Common.SmartContract.ABI
     * @throws Exception if the input is not valid JSON format or there are unknown fields in the input
     */
    public static void loadAbiFromJson(String abiString, Common.SmartContract.ABI.Builder builder) throws Exception {
        JsonFormat.parser().ignoringUnknownFields().merge(abiString, builder);
    }

}
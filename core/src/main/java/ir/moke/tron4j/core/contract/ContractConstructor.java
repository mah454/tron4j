package ir.moke.tron4j.core.contract;

import ir.moke.tron4j.proto.Common;
import org.bouncycastle.util.encoders.Hex;

import com.google.protobuf.ByteString;
import ir.moke.tron4j.abi.datatypes.Type;
import ir.moke.tron4j.abi.TypeEncoder;
import ir.moke.tron4j.core.exceptions.ContractCreateException;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;

public class ContractConstructor {

    private Common.SmartContract.ABI.Entry rawConstructor;

    private List paramTypes;

    private boolean payable;

    private ByteString bytecode = null;
    
    public ContractConstructor(Common.SmartContract.ABI.Entry raw) {
        this.rawConstructor = raw;
        this.paramTypes = new ArrayList<String>();
        
        for (Common.SmartContract.ABI.Entry.Param p : raw.getInputsList()) {
            paramTypes.add(p.getType());
        }

        this.payable = raw.getPayable();
    }

    public Common.SmartContract.ABI.Entry getRawConstructor() {
        return this.rawConstructor;
    }

    public List getParamTypes() {
        return this.paramTypes;
    }

    public boolean getPayable() {
        return this.payable;
    }

    public ByteString getBytecode() {
        return this.bytecode;
    }

    public void encodeParameter(List<Type> params) throws ContractCreateException {
        if (params.size() != paramTypes.size()) {
            throw new ContractCreateException("Parameter amount doesn't match.");
        }
        StringBuilder builder = new StringBuilder();
        for (Type p : params) {
            builder.append(TypeEncoder.encode(p));
        }
        this.bytecode = ByteString.copyFrom(Hex.decode(builder.toString()));
    }
}

package ir.moke.tron4j.abi.datatypes.generated;

import java.math.BigInteger;

import ir.moke.tron4j.abi.datatypes.Int;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.tron.trident.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Int136 extends Int {
    public static final Int136 DEFAULT = new Int136(BigInteger.ZERO);

    public Int136(BigInteger value) {
        super(136, value);
    }

    public Int136(long value) {
        this(BigInteger.valueOf(value));
    }
}

package ir.moke.tron4j.core.utils;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import ir.moke.tron4j.core.transaction.BlockId;
import ir.moke.tron4j.proto.BlockExtention;
import ir.moke.tron4j.proto.Chain;
import ir.moke.tron4j.proto.Contract;

public class Utils {

    public static BlockId getBlockId(BlockExtention blockExtention) {
        BlockId blockId = new BlockId(Sha256Hash.ZERO_HASH, 0);
        if (blockId.equals(Sha256Hash.ZERO_HASH)) {
            blockId =
                    new BlockId(Sha256Hash.of(true,
                            blockExtention.getBlockHeader().getRawData().toByteArray()), blockExtention.getBlockHeader().getRawData().getNumber());
        }
        return blockId;
    }

    public static Contract.CreateSmartContract getSmartContractFromTransaction(Chain.Transaction trx) {
        try {
            Any any = trx.getRawData().getContract(0).getParameter();
            Contract.CreateSmartContract createSmartContract = any.unpack(Contract.CreateSmartContract.class);
            return createSmartContract;
        } catch (InvalidProtocolBufferException e) {
            return null;
        }
    }

}

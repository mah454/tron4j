package ir.moke.tron4j.core.transaction;

/**
 * The {@code TransactionBuilder} class provides mutator methods for common used attributes.
 *
 * <p>The {@code TransactionBuilder} object are mostly used before signing a
 * transaction, for setting attributes values like {@link #setFeeLimit}, {@link #setMemo}, Etc.</p>
 *
 * @see ir.moke.tron4j.proto.Chain.Transaction;
 * @since java version 1.8.0_231
 */

import com.google.protobuf.ByteString;
import ir.moke.tron4j.proto.Chain;

public class TransactionBuilder {
    private Chain.Transaction transaction;

    public TransactionBuilder(Chain.Transaction transaction) {
        this.transaction = transaction;
    }

    public Chain.Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Chain.Transaction transaction) {
        this.transaction = transaction;
    }

    public TransactionBuilder setFeeLimit(long feeLimit) {
        transaction = transaction.toBuilder()
                .setRawData(transaction.getRawData().toBuilder().setFeeLimit(feeLimit))
                .build();
        return this;
    }

    public TransactionBuilder setMemo(byte[] memo) {
        transaction = transaction.toBuilder()
                .setRawData(transaction.getRawData().toBuilder().setData(ByteString.copyFrom(memo)))
                .build();
        return this;
    }

    public TransactionBuilder setMemo(String memo) {
        transaction = transaction.toBuilder()
                .setRawData(transaction.getRawData().toBuilder().setData(ByteString.copyFromUtf8(memo)))
                .build();
        return this;
    }

    public Chain.Transaction build() {
        return this.transaction;
    }
}
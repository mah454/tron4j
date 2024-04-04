package ir.moke.tron4j.core.transaction;

import ir.moke.tron4j.core.ApiWrapper;
import ir.moke.tron4j.core.key.KeyPair;
import ir.moke.tron4j.crypto.SECP256K1;
import ir.moke.tron4j.crypto.tuwenitypes.Bytes;
import ir.moke.tron4j.crypto.tuwenitypes.Bytes32;
import org.bouncycastle.util.encoders.Hex;

import java.util.Arrays;

public class SignatureValidator {

    /**
     * Verify if a transction contains a valid signature.
     *
     * @param txid      the transaction hash
     * @param signature the signature message corresponding to the transaction hash
     * @param owner     the owner of the transaction
     * @return true if the signature is valid
     */
    public static boolean verify(byte[] txid, byte[] signature, byte[] owner) {
        SECP256K1.Signature sig = SECP256K1.Signature.decode(Bytes.wrap(signature));
        //decode a public key from the signature
        SECP256K1.PublicKey pubKey = SECP256K1.PublicKey.recoverFromSignature(Bytes32.wrap(txid), sig).get();

        final byte[] addressFromPubKey = KeyPair.publicKeyToAddress(pubKey);

        return Arrays.equals(addressFromPubKey, owner);
    }

    public static boolean verify(String txid, String signature, String owner) {
        byte[] txidBytes = Hex.decode(txid);
        byte[] sig = Hex.decode(signature);
        byte[] ownerBytes = ApiWrapper.parseAddress(owner).toByteArray();

        return verify(txidBytes, sig, ownerBytes);
    }
}

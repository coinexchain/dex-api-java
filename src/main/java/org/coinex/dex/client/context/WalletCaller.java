package org.coinex.dex.client.context;

import com.sun.jna.Library;
import com.sun.jna.Native;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

public class WalletCaller {
    public interface WalletLib extends Library {
        String libPath = "/Users/matrix/Desktop/dex-api-java/src/main/java/org/coinex/dex/client/context/wallet_mac.so";
        WalletLib INSTANCE = (WalletLib) Native.load(libPath, WalletLib.class);

        void BearInit(String root);
        String CreateKey(String name, String password, String bip39Passphrase, int account, int index);
        String DeleteKey(String name, String password);
        String RecoverKey(String name, String mnemonic, String password, String bip39Passphrase, int account, int index);
        String AddKey(String name, String armor, String passphrase);
        String ExportKey(String name, String decryptPassphrase, String encryptPassphrase);
        String ListKeys();
        String ResetPassword(String name, String password, String newPassword);
        String GetAddress(String name);
        String GetSigner(String signInfo);
        String GetPubKey(String name);
        String GetAddressFromWIF(String wif);

        String Sign(String name, String password, String tx);
        String SignStdTx(String name, String password, String tx, String chainId, long accountNum, long sequence);

        String SignAndBuildBroadcast(String name, String password, String tx, String chainId, String mode, long accountNum, long sequence);

    }




    public static void main(String[] args) throws IOException {

        String keyName = "alice";
        String password = "12345678";
        String bip39Password = "11111111";

        // Init
        WalletLib.INSTANCE.BearInit("tmp");

        // Create Key
        String key = WalletLib.INSTANCE.CreateKey(keyName,password,bip39Password,0,0);
        System.out.println(key);

        // List Keys
        String keys = WalletLib.INSTANCE.ListKeys();
        System.out.println(keys);

        // Get Public Key
        String pubKey = WalletLib.INSTANCE.GetPubKey(keyName);
        System.out.println(pubKey);

        // Get Wif Address
        String wif = "5HueCGU8rMjxEXxiPuD5BDku4MkFqeZyd4dZ1jvhTVqvbTLvyTJ";
        String addressWif = WalletLib.INSTANCE.GetAddressFromWIF(wif);
        System.out.println(addressWif);

        // Sign
        String sign = WalletLib.INSTANCE.Sign(keyName, password, "hello, that polar bear");
        System.out.println(sign);

        // Delete Key
        String delete = WalletLib.INSTANCE.DeleteKey(keyName, password);
        System.out.println(delete);

        keys = WalletLib.INSTANCE.ListKeys();
        System.out.println(keys);

        // Delete tmp
        Path directory = Paths.get("./tmp");
        DeleteDirectory walk = new DeleteDirectory();
        EnumSet opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        Files.walkFileTree(directory, opts, Integer.MAX_VALUE, walk);

    }

}
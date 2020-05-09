package org.coinex.dex.client.example;

import org.coinex.dex.client.ApiException;
import org.coinex.dex.client.api.BankApi;
import org.coinex.dex.client.api.TransactionsApi;
import org.coinex.dex.client.context.ApiContext;
import org.coinex.dex.client.context.WalletCaller;
import org.coinex.dex.client.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ApiException, IOException {


        String toAddress = "coinex10c22dwn7hxps77tnkpj5pzu9zcpq5zf76xms55";
        String name = "alice";
        String password = "12345678";

        WalletCaller.WalletLib.INSTANCE.BearInit("./tmp");
        String fromAddress = WalletCaller.WalletLib.INSTANCE.GetAddress(name);

        Coin coin = new Coin();
        coin.setDenom("cet");
        coin.setAmount("600000");
        List<Coin> fees = new ArrayList<>();
        fees.add(coin);


        BaseReq baseReq = createBaseReq(fromAddress, fees);

        ApiContext context = new ApiContext(fromAddress, name, password, baseReq);
        context.refreshAccNumAndSeq();



        Coin sendCoin = new Coin();
        sendCoin.setDenom("cet");
        sendCoin.setAmount("1000000");
        List<Coin> sendCoins = new ArrayList<>();
        sendCoins.add(sendCoin);

        Account account = new Account();
        account.setBaseReq(context.getBaseReq());
        account.setAmount(sendCoins);
        account.setUnlockTime("0");

        BankApi bankApi = new BankApi();
        StdTx stdTx = bankApi.sendCoins(toAddress, account);
        String stdTxStr = context.getJson().serializeWithNull(stdTx);
        BroadcastTxCommitResult broadcastTxCommitResult = context.signAndBroadcast(stdTxStr);
        System.out.println(broadcastTxCommitResult.toString());


        TransactionsApi transactionsApi = new TransactionsApi();
        BroadcastTxCommitResult txCommitResult = transactionsApi.getTxByHash("DFE3A2DC4CF5F2C2B02089F1C4C9C8249CBBE2AF8C40338E286938ACA0E3A9E5");
        System.out.println(txCommitResult);

    }

    private static BaseReq createBaseReq(String address, List<Coin> fees) {
        BaseReq req = new BaseReq();


        String memo = "";
        String chainId = "coinexdex-test1";
        String accountNumber = "0";
        String sequence = "0";
        String gas = "30000";
        String gasAdjustment = "1.1";
        Boolean simulate = false;

        req.setFrom(address);
        req.setMemo(memo);
        req.setChainId(chainId);
        req.setAccountNumber(accountNumber);
        req.setSequence(sequence);
        req.setGas(gas);
        req.setGasAdjustment(gasAdjustment);
        req.setSimulate(simulate);
        req.setFees(fees);

        return req;
    }
}

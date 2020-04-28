package org.coinex.dex.client.example;

import org.coinex.dex.client.ApiException;
import org.coinex.dex.client.api.BankApi;
import org.coinex.dex.client.context.ApiContext;
import org.coinex.dex.client.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ApiException {
        String address = "coinex10c22dwn7hxps77tnkpj5pzu9zcpq5zf76xms55";
        String name = "key_name";
        String password = "12345678";

        Coin coin = new Coin();
        coin.setDenom("cet");
        coin.setAmount("50000000");
        List<Coin> fees = new ArrayList<>();
        fees.add(coin);


        BaseReq baseReq = createBaseReq(address, fees);

        ApiContext context = new ApiContext(address, name, password, baseReq);
        context.refreshAccNumAndSeq();



        Coin sendCoin = new Coin();
        sendCoin.setDenom("cet");
        sendCoin.setAmount("500");
        List<Coin> sendCoins = new ArrayList<>();
        sendCoins.add(sendCoin);

        Account account = new Account();
        account.setBaseReq(context.getBaseReq());
        account.setAmount(sendCoins);
        account.setUnlockTime("0");

//        BankApi bankApi = new BankApi();
//        StdTx stdTx = bankApi.sendCoins("coinex1h6favnlytw3lgpy8cm6lcv530z0ctj6rplwt06", account);
//        stdTx.getValue().setSignatures(new ArrayList<StdTxCoreSignatures>());
//        String stdTxStr = context.getJson().serialize(stdTx);
//        context.signAndBroadcast(stdTxStr);
    }

    private static BaseReq createBaseReq(String address, List<Coin> fees) {
        BaseReq req = new BaseReq();


        String from = address;
        String memo = "";
        String chainId = "coinexdex-test1";
        String accountNumber = "0";
        String sequence = "0";
        String gas = "500000";
        String gasAdjustment = "1.1";
        Boolean simulate = false;

        req.setFrom(from);
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

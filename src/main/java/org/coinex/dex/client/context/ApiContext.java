package org.coinex.dex.client.context;

import com.google.gson.reflect.TypeToken;
import org.coinex.dex.client.ApiClient;
import org.coinex.dex.client.JSON;
import org.coinex.dex.client.api.AuthApi;
import org.coinex.dex.client.ApiException;
import org.coinex.dex.client.api.TransactionsApi;
import org.coinex.dex.client.model.*;

import java.lang.reflect.Type;

public class ApiContext {


    private String fromAddress;
    private String name;
    private String password;
    private BaseReq baseReq;
    private ApiClient client;
    private JSON json;


    public String getName() {
        return name;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public String getPassword() {
        return password;
    }

    public BaseReq getBaseReq() {
        return baseReq;
    }

    public ApiClient getClient() {
        return client;
    }

    public JSON getJson() {
        return json;
    }

    public ApiContext(String fromAddress, String name, String password, BaseReq baseReq) {
        this.fromAddress = fromAddress;
        this.name = name;
        this.password = password;
        this.baseReq = baseReq;
        this.client = new ApiClient();
        this.json = new JSON();
    }

    public void refreshAccNumAndSeq() throws ApiException {
        AuthApi authApi = new AuthApi();
        InlineResponse2004 data = authApi.getAccount(fromAddress);
        this.baseReq.setAccountNumber(data.getResult().getAccountNumber());
        this.baseReq.setSequence(data.getResult().getSequence());

    }

    public BroadcastTxCommitResult signAndBroadcast(String unsignedBytes) throws ApiException {
        String bytes = WalletCaller.WalletLib.INSTANCE.SignAndBuildBroadcast(name, password, unsignedBytes, baseReq.getChainId()
                , "block", Long.parseUnsignedLong(baseReq.getAccountNumber()), Long.parseUnsignedLong(baseReq.getSequence()));

        Type txBroadcastType = new TypeToken<TxBroadcast>(){}.getType();
        TxBroadcast txBroadcast = json.deserialize(bytes, txBroadcastType);
        TransactionsApi transactionsApi = new TransactionsApi();
        return transactionsApi.broadcastTx(txBroadcast);
    }

}

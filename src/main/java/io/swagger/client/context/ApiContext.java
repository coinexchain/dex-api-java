package io.swagger.client.context;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AuthApi;
import io.swagger.client.model.BaseReq;
import io.swagger.client.model.InlineResponse2004;

public class ApiContext {


    private String fromAddress;
    private String name;
    private String password;
    private BaseReq baseReq;
    private ApiClient client;


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

    public ApiContext(String fromAddress, String name, String password, BaseReq baseReq) {
        this.fromAddress = fromAddress;
        this.name = name;
        this.password = password;
        this.baseReq = baseReq;
        this.client = new ApiClient();
    }

    public void refreshAccNumAndSeq() throws ApiException {
        AuthApi authApi = new AuthApi();
        InlineResponse2004 data = authApi.getAccount(fromAddress);
        this.baseReq.setAccountNumber(data.getResult().getAccountNumber());
        this.baseReq.setSequence(data.getResult().getSequence());

    }

}

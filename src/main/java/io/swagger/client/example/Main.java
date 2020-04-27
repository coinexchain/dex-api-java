package io.swagger.client.example;

import io.swagger.client.ApiException;
import io.swagger.client.api.AuthApi;
import io.swagger.client.api.TendermintApi;
import io.swagger.client.model.BlockQuery;
import io.swagger.client.model.InlineResponse2004;

public class Main {
    public static void main(String[] args) throws ApiException {
//        String address = "coinex10hmcj9sp6gef5244wxkwt9jgweuwpp9fjcmwng";
//        AuthApi authApi = new AuthApi();
//        InlineResponse2004 data = authApi.getAccount(address);
        TendermintApi tendermintApi = new TendermintApi();
        BlockQuery data = tendermintApi.getLatestBlock();
        System.out.println(data.toString());
    }
}

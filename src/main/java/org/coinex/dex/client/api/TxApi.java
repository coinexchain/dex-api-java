/*
 * CET-Lite for CoinEx Chain
 * A REST interface for state queries, transaction generation and broadcasting.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coinex.dex.client.api;

import org.coinex.dex.client.ApiCallback;
import org.coinex.dex.client.ApiClient;
import org.coinex.dex.client.ApiException;
import org.coinex.dex.client.ApiResponse;
import org.coinex.dex.client.Configuration;
import org.coinex.dex.client.Pair;
import org.coinex.dex.client.ProgressRequestBody;
import org.coinex.dex.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.coinex.dex.client.model.InlineResponse20062;
import org.coinex.dex.client.model.Tx;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxApi {
    private ApiClient apiClient;

    public TxApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TxApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getTxFromTradeServer
     * @param hash Tx hash (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTxFromTradeServerCall(String hash, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tx/txs/{hash}"
            .replaceAll("\\{" + "hash" + "\\}", apiClient.escapeString(hash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTxFromTradeServerValidateBeforeCall(String hash, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new ApiException("Missing the required parameter 'hash' when calling getTxFromTradeServer(Async)");
        }
        

        com.squareup.okhttp.Call call = getTxFromTradeServerCall(hash, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Tx from trade server by hash
     * 
     * @param hash Tx hash (required)
     * @return Tx
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tx getTxFromTradeServer(String hash) throws ApiException {
        ApiResponse<Tx> resp = getTxFromTradeServerWithHttpInfo(hash);
        return resp.getData();
    }

    /**
     * Get a Tx from trade server by hash
     * 
     * @param hash Tx hash (required)
     * @return ApiResponse&lt;Tx&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tx> getTxFromTradeServerWithHttpInfo(String hash) throws ApiException {
        com.squareup.okhttp.Call call = getTxFromTradeServerValidateBeforeCall(hash, null, null);
        Type localVarReturnType = new TypeToken<Tx>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Tx from trade server by hash (asynchronously)
     * 
     * @param hash Tx hash (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTxFromTradeServerAsync(String hash, final ApiCallback<Tx> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTxFromTradeServerValidateBeforeCall(hash, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tx>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryIncome
     * @param account Bech32 address (required)
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param token Symbol (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryIncomeCall(String account, Long time, Long sid, Integer count, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tx/incomes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (account != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("account", account));
        if (time != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("time", time));
        if (sid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sid", sid));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call queryIncomeValidateBeforeCall(String account, Long time, Long sid, Integer count, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'account' is set
        if (account == null) {
            throw new ApiException("Missing the required parameter 'account' when calling queryIncome(Async)");
        }
        
        // verify the required parameter 'time' is set
        if (time == null) {
            throw new ApiException("Missing the required parameter 'time' when calling queryIncome(Async)");
        }
        
        // verify the required parameter 'sid' is set
        if (sid == null) {
            throw new ApiException("Missing the required parameter 'sid' when calling queryIncome(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling queryIncome(Async)");
        }
        

        com.squareup.okhttp.Call call = queryIncomeCall(account, time, sid, count, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query account all income until to given time
     * Query income info
     * @param account Bech32 address (required)
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param token Symbol (optional)
     * @return InlineResponse20062
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20062 queryIncome(String account, Long time, Long sid, Integer count, String token) throws ApiException {
        ApiResponse<InlineResponse20062> resp = queryIncomeWithHttpInfo(account, time, sid, count, token);
        return resp.getData();
    }

    /**
     * Query account all income until to given time
     * Query income info
     * @param account Bech32 address (required)
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param token Symbol (optional)
     * @return ApiResponse&lt;InlineResponse20062&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20062> queryIncomeWithHttpInfo(String account, Long time, Long sid, Integer count, String token) throws ApiException {
        com.squareup.okhttp.Call call = queryIncomeValidateBeforeCall(account, time, sid, count, token, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20062>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query account all income until to given time (asynchronously)
     * Query income info
     * @param account Bech32 address (required)
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param token Symbol (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryIncomeAsync(String account, Long time, Long sid, Integer count, String token, final ApiCallback<InlineResponse20062> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = queryIncomeValidateBeforeCall(account, time, sid, count, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20062>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryTx
     * @param account Bech32 address (required)
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param token Symbol (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryTxCall(String account, Long time, Long sid, Integer count, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tx/txs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (account != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("account", account));
        if (time != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("time", time));
        if (sid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sid", sid));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call queryTxValidateBeforeCall(String account, Long time, Long sid, Integer count, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'account' is set
        if (account == null) {
            throw new ApiException("Missing the required parameter 'account' when calling queryTx(Async)");
        }
        
        // verify the required parameter 'time' is set
        if (time == null) {
            throw new ApiException("Missing the required parameter 'time' when calling queryTx(Async)");
        }
        
        // verify the required parameter 'sid' is set
        if (sid == null) {
            throw new ApiException("Missing the required parameter 'sid' when calling queryTx(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling queryTx(Async)");
        }
        

        com.squareup.okhttp.Call call = queryTxCall(account, time, sid, count, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query transactions
     * Query transactions signed by given account until to given time
     * @param account Bech32 address (required)
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param token Symbol (optional)
     * @return InlineResponse20062
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20062 queryTx(String account, Long time, Long sid, Integer count, String token) throws ApiException {
        ApiResponse<InlineResponse20062> resp = queryTxWithHttpInfo(account, time, sid, count, token);
        return resp.getData();
    }

    /**
     * Query transactions
     * Query transactions signed by given account until to given time
     * @param account Bech32 address (required)
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param token Symbol (optional)
     * @return ApiResponse&lt;InlineResponse20062&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20062> queryTxWithHttpInfo(String account, Long time, Long sid, Integer count, String token) throws ApiException {
        com.squareup.okhttp.Call call = queryTxValidateBeforeCall(account, time, sid, count, token, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20062>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query transactions (asynchronously)
     * Query transactions signed by given account until to given time
     * @param account Bech32 address (required)
     * @param time Unix timestamp (required)
     * @param sid Sequence id (required)
     * @param count Querier count limited to 1024 (required)
     * @param token Symbol (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryTxAsync(String account, Long time, Long sid, Integer count, String token, final ApiCallback<InlineResponse20062> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = queryTxValidateBeforeCall(account, time, sid, count, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20062>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

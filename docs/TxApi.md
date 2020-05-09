# TxApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTxFromTradeServer**](TxApi.md#getTxFromTradeServer) | **GET** /tx/txs/{hash} | Get a Tx from trade server by hash
[**queryIncome**](TxApi.md#queryIncome) | **GET** /tx/incomes | Query account all income until to given time
[**queryTx**](TxApi.md#queryTx) | **GET** /tx/txs | Query transactions


<a name="getTxFromTradeServer"></a>
# **getTxFromTradeServer**
> Tx getTxFromTradeServer(hash)

Get a Tx from trade server by hash

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TxApi;


TxApi apiInstance = new TxApi();
String hash = "2B6D7633C460DAABFCA47592B7F76A95CE95C52B515179C9E9BA49AA620377BA"; // String | Tx hash
try {
    Tx result = apiInstance.getTxFromTradeServer(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TxApi#getTxFromTradeServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| Tx hash |

### Return type

[**Tx**](Tx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryIncome"></a>
# **queryIncome**
> InlineResponse20062 queryIncome(account, time, sid, count, token)

Query account all income until to given time

Query income info

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TxApi;


TxApi apiInstance = new TxApi();
String account = "account_example"; // String | Bech32 address
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier count limited to 1024
String token = "token_example"; // String | Symbol
try {
    InlineResponse20062 result = apiInstance.queryIncome(account, time, sid, count, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TxApi#queryIncome");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Bech32 address |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier count limited to 1024 |
 **token** | **String**| Symbol | [optional]

### Return type

[**InlineResponse20062**](InlineResponse20062.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryTx"></a>
# **queryTx**
> InlineResponse20062 queryTx(account, time, sid, count, token)

Query transactions

Query transactions signed by given account until to given time

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TxApi;


TxApi apiInstance = new TxApi();
String account = "account_example"; // String | Bech32 address
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier count limited to 1024
String token = "token_example"; // String | Symbol
try {
    InlineResponse20062 result = apiInstance.queryTx(account, time, sid, count, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TxApi#queryTx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Bech32 address |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier count limited to 1024 |
 **token** | **String**| Symbol | [optional]

### Return type

[**InlineResponse20062**](InlineResponse20062.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# BancorApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryBancorDeal**](BancorApi.md#queryBancorDeal) | **GET** /bancorlite/deals | Query bancor market deal


<a name="queryBancorDeal"></a>
# **queryBancorDeal**
> InlineResponse20057 queryBancorDeal(market, time, sid, count)

Query bancor market deal

Query bancor market deal until to given time

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BancorApi;


BancorApi apiInstance = new BancorApi();
String market = "market_example"; // String | B:stock/money
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier deal count limited to 1024
try {
    InlineResponse20057 result = apiInstance.queryBancorDeal(market, time, sid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorApi#queryBancorDeal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**| B:stock/money |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier deal count limited to 1024 |

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


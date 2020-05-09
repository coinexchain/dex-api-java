# ExpiryApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryRedelegation**](ExpiryApi.md#queryRedelegation) | **GET** /expiry/redelegations | Query redelegation
[**queryUnbonding**](ExpiryApi.md#queryUnbonding) | **GET** /expiry/unbondings | Query Unbonding
[**queryUnlock**](ExpiryApi.md#queryUnlock) | **GET** /expiry/unlocks | Query Unlock
[**querylocked**](ExpiryApi.md#querylocked) | **GET** /expiry/lockeds | Query lock tx


<a name="queryRedelegation"></a>
# **queryRedelegation**
> InlineResponse20058 queryRedelegation(account, time, sid, count)

Query redelegation

Query delegator&#39;s redelegation-completion info

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.ExpiryApi;


ExpiryApi apiInstance = new ExpiryApi();
String account = "account_example"; // String | Bech32 address
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier count limited to 1024
try {
    InlineResponse20058 result = apiInstance.queryRedelegation(account, time, sid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpiryApi#queryRedelegation");
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

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryUnbonding"></a>
# **queryUnbonding**
> InlineResponse20059 queryUnbonding(account, time, sid, count)

Query Unbonding

Query delegator&#39;s unbonding-completion info

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.ExpiryApi;


ExpiryApi apiInstance = new ExpiryApi();
String account = "account_example"; // String | Bech32 address
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier count
try {
    InlineResponse20059 result = apiInstance.queryUnbonding(account, time, sid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpiryApi#queryUnbonding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Bech32 address |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier count |

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryUnlock"></a>
# **queryUnlock**
> InlineResponse20061 queryUnlock(account, time, sid, count, token)

Query Unlock

Query Unlock info

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.ExpiryApi;


ExpiryApi apiInstance = new ExpiryApi();
String account = "account_example"; // String | Bech32 address
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier count
String token = "token_example"; // String | Symbol
try {
    InlineResponse20061 result = apiInstance.queryUnlock(account, time, sid, count, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpiryApi#queryUnlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Bech32 address |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier count |
 **token** | **String**| Symbol | [optional]

### Return type

[**InlineResponse20061**](InlineResponse20061.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="querylocked"></a>
# **querylocked**
> InlineResponse20060 querylocked(account, time, sid, count, token)

Query lock tx

Query lock transfer info

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.ExpiryApi;


ExpiryApi apiInstance = new ExpiryApi();
String account = "account_example"; // String | Bech32 address
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier count
String token = "token_example"; // String | Symbol
try {
    InlineResponse20060 result = apiInstance.querylocked(account, time, sid, count, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpiryApi#querylocked");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Bech32 address |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier count |
 **token** | **String**| Symbol | [optional]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


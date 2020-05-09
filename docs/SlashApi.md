# SlashApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**querySlash**](SlashApi.md#querySlash) | **GET** /slash/slashings | Query validator slash info


<a name="querySlash"></a>
# **querySlash**
> InlineResponse20064 querySlash(time, sid, count)

Query validator slash info

Query validator slash power, reason, and jailed status etc

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.SlashApi;


SlashApi apiInstance = new SlashApi();
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier count limited to 1024
try {
    InlineResponse20064 result = apiInstance.querySlash(time, sid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlashApi#querySlash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier count limited to 1024 |

### Return type

[**InlineResponse20064**](InlineResponse20064.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


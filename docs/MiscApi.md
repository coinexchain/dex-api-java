# MiscApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryBlockTimes**](MiscApi.md#queryBlockTimes) | **GET** /misc/block-times | Query block time
[**queryDonation**](MiscApi.md#queryDonation) | **GET** /misc/donations | Query donations info
[**queryLastBlock**](MiscApi.md#queryLastBlock) | **GET** /misc/height | Query least block info


<a name="queryBlockTimes"></a>
# **queryBlockTimes**
> List&lt;Long&gt; queryBlockTimes(height, count)

Query block time

Query the block time up to given height

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MiscApi;


MiscApi apiInstance = new MiscApi();
Long height = 789L; // Long | Block height
Integer count = 56; // Integer | Querier count limited to 1024
try {
    List<Long> result = apiInstance.queryBlockTimes(height, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#queryBlockTimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **height** | **Long**| Block height |
 **count** | **Integer**| Querier count limited to 1024 |

### Return type

**List&lt;Long&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryDonation"></a>
# **queryDonation**
> InlineResponse20054 queryDonation(time, sid, count)

Query donations info

Query donations by DonateToCommunityPool or CommentToken

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MiscApi;


MiscApi apiInstance = new MiscApi();
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier count limited to 1024
try {
    InlineResponse20054 result = apiInstance.queryDonation(time, sid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#queryDonation");
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

[**InlineResponse20054**](InlineResponse20054.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryLastBlock"></a>
# **queryLastBlock**
> InlineResponse20053 queryLastBlock()

Query least block info

Query least block info

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MiscApi;


MiscApi apiInstance = new MiscApi();
try {
    InlineResponse20053 result = apiInstance.queryLastBlock();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#queryLastBlock");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


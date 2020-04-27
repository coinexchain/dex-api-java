# IncentiveApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIncentiveParams**](IncentiveApi.md#getIncentiveParams) | **GET** /incentive/parameters | Get the current incentive parameters


<a name="getIncentiveParams"></a>
# **getIncentiveParams**
> InlineResponse20036 getIncentiveParams()

Get the current incentive parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IncentiveApi;


IncentiveApi apiInstance = new IncentiveApi();
try {
    InlineResponse20036 result = apiInstance.getIncentiveParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IncentiveApi#getIncentiveParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# TendermintApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlock**](TendermintApi.md#getBlock) | **GET** /blocks/{height} | Get a block at a certain height
[**getLatestBlock**](TendermintApi.md#getLatestBlock) | **GET** /blocks/latest | Get the latest block
[**getLatestValidatorSet**](TendermintApi.md#getLatestValidatorSet) | **GET** /validatorsets/latest | Get the latest validator set
[**getNodeInfo**](TendermintApi.md#getNodeInfo) | **GET** /node_info | The properties of the connected node
[**getSyncing**](TendermintApi.md#getSyncing) | **GET** /syncing | Syncing state of node
[**getValidatorSet**](TendermintApi.md#getValidatorSet) | **GET** /validatorsets/{height} | Get a validator set a certain height


<a name="getBlock"></a>
# **getBlock**
> BlockQuery getBlock(height)

Get a block at a certain height

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TendermintApi;


TendermintApi apiInstance = new TendermintApi();
BigDecimal height = new BigDecimal(); // BigDecimal | Block height
try {
    BlockQuery result = apiInstance.getBlock(height);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TendermintApi#getBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **height** | **BigDecimal**| Block height |

### Return type

[**BlockQuery**](BlockQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLatestBlock"></a>
# **getLatestBlock**
> BlockQuery getLatestBlock()

Get the latest block

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TendermintApi;


TendermintApi apiInstance = new TendermintApi();
try {
    BlockQuery result = apiInstance.getLatestBlock();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TendermintApi#getLatestBlock");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BlockQuery**](BlockQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLatestValidatorSet"></a>
# **getLatestValidatorSet**
> InlineResponse2001 getLatestValidatorSet()

Get the latest validator set

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TendermintApi;


TendermintApi apiInstance = new TendermintApi();
try {
    InlineResponse2001 result = apiInstance.getLatestValidatorSet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TendermintApi#getLatestValidatorSet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNodeInfo"></a>
# **getNodeInfo**
> InlineResponse200 getNodeInfo()

The properties of the connected node

Information about the connected node

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TendermintApi;


TendermintApi apiInstance = new TendermintApi();
try {
    InlineResponse200 result = apiInstance.getNodeInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TendermintApi#getNodeInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSyncing"></a>
# **getSyncing**
> getSyncing()

Syncing state of node

Get if the node is currently syning with other nodes

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TendermintApi;


TendermintApi apiInstance = new TendermintApi();
try {
    apiInstance.getSyncing();
} catch (ApiException e) {
    System.err.println("Exception when calling TendermintApi#getSyncing");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getValidatorSet"></a>
# **getValidatorSet**
> InlineResponse2002 getValidatorSet(height)

Get a validator set a certain height

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.TendermintApi;


TendermintApi apiInstance = new TendermintApi();
BigDecimal height = new BigDecimal(); // BigDecimal | Block height
try {
    InlineResponse2002 result = apiInstance.getValidatorSet(height);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TendermintApi#getValidatorSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **height** | **BigDecimal**| Block height |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# SlashingApi

All URIs are relative to *https://dex-api.coinex.org/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSigningInfo**](SlashingApi.md#getSigningInfo) | **GET** /slashing/validators/{validatorPubKey}/signing_info | Get sign info of given validator
[**getSigningInfos**](SlashingApi.md#getSigningInfos) | **GET** /slashing/signing_infos | Get sign info of given all validators
[**getSlashingParams**](SlashingApi.md#getSlashingParams) | **GET** /slashing/parameters | Get the current slashing parameters
[**unjailValidator**](SlashingApi.md#unjailValidator) | **POST** /slashing/validators/{validatorAddr}/unjail | Unjail a jailed validator

<a name="getSigningInfo"></a>
# **getSigningInfo**
> Object getSigningInfo(validatorPubKey)

Get sign info of given validator

Get sign info of given validator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SlashingApi;


SlashingApi apiInstance = new SlashingApi();
String validatorPubKey = "validatorPubKey_example"; // String | Bech32 validator public key
try {
    Object result = apiInstance.getSigningInfo(validatorPubKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlashingApi#getSigningInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorPubKey** | **String**| Bech32 validator public key |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSigningInfos"></a>
# **getSigningInfos**
> Object getSigningInfos(page, limit)

Get sign info of given all validators

Get sign info of all validators

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SlashingApi;


SlashingApi apiInstance = new SlashingApi();
Integer page = 56; // Integer | Page number
Integer limit = 56; // Integer | Maximum number of items per page
try {
    Object result = apiInstance.getSigningInfos(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlashingApi#getSigningInfos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number |
 **limit** | **Integer**| Maximum number of items per page |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlashingParams"></a>
# **getSlashingParams**
> Object getSlashingParams()

Get the current slashing parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SlashingApi;


SlashingApi apiInstance = new SlashingApi();
try {
    Object result = apiInstance.getSlashingParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlashingApi#getSlashingParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unjailValidator"></a>
# **unjailValidator**
> BroadcastTxCommitResult unjailValidator(body, validatorAddr)

Unjail a jailed validator

Send transaction to unjail a jailed validator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SlashingApi;


SlashingApi apiInstance = new SlashingApi();
Object body = null; // Object | 
String validatorAddr = "validatorAddr_example"; // String | Bech32 validator address
try {
    BroadcastTxCommitResult result = apiInstance.unjailValidator(body, validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlashingApi#unjailValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **validatorAddr** | **String**| Bech32 validator address |

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


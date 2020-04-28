# SlashingApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSigningInfo**](SlashingApi.md#getSigningInfo) | **GET** /slashing/validators/{validatorPubKey}/signing_info | Get sign info of given validator
[**getSigningInfos**](SlashingApi.md#getSigningInfos) | **GET** /slashing/signing_infos | Get sign info of given all validators
[**getSlashingParams**](SlashingApi.md#getSlashingParams) | **GET** /slashing/parameters | Get the current slashing parameters
[**unjailValidator**](SlashingApi.md#unjailValidator) | **POST** /slashing/validators/{validatorAddr}/unjail | Unjail a jailed validator


<a name="getSigningInfo"></a>
# **getSigningInfo**
> InlineResponse20015 getSigningInfo(validatorPubKey)

Get sign info of given validator

Get sign info of given validator

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.SlashingApi;


SlashingApi apiInstance = new SlashingApi();
String validatorPubKey = "coinexvalconspub1zcjduepq7mft6gfls57a0a42d7uhx656cckhfvtrlmw744jv4q0mvlv0dypskehfk8"; // String | Bech32 validator public key
try {
    InlineResponse20015 result = apiInstance.getSigningInfo(validatorPubKey);
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

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSigningInfos"></a>
# **getSigningInfos**
> InlineResponse20016 getSigningInfos(page, limit)

Get sign info of given all validators

Get sign info of all validators

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.SlashingApi;


SlashingApi apiInstance = new SlashingApi();
Integer page = 1; // Integer | Page number
Integer limit = 5; // Integer | Maximum number of items per page
try {
    InlineResponse20016 result = apiInstance.getSigningInfos(page, limit);
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

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlashingParams"></a>
# **getSlashingParams**
> InlineResponse20017 getSlashingParams()

Get the current slashing parameters

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.SlashingApi;


SlashingApi apiInstance = new SlashingApi();
try {
    InlineResponse20017 result = apiInstance.getSlashingParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlashingApi#getSlashingParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unjailValidator"></a>
# **unjailValidator**
> BroadcastTxCommitResult unjailValidator(validatorAddr, unjailBody)

Unjail a jailed validator

Send transaction to unjail a jailed validator

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.SlashingApi;


SlashingApi apiInstance = new SlashingApi();
String validatorAddr = "coinexvaloper1qwl879nx9t6kef4supyazayf7vjhennyh568ys"; // String | Bech32 validator address
UnjailBody unjailBody = new UnjailBody(); // UnjailBody | 
try {
    BroadcastTxCommitResult result = apiInstance.unjailValidator(validatorAddr, unjailBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlashingApi#unjailValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorAddr** | **String**| Bech32 validator address |
 **unjailBody** | [**UnjailBody**](UnjailBody.md)|  |

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


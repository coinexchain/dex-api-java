# AliasApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddressFromAlias**](AliasApi.md#getAddressFromAlias) | **GET** /alias/address-of-alias/{alias} | Given an alias, query the corresponding address
[**getAliasParams**](AliasApi.md#getAliasParams) | **GET** /alias/parameters | Get the current alias parameters
[**getAliasesFromAddress**](AliasApi.md#getAliasesFromAddress) | **GET** /alias/aliases-of-address/{address} | Given an account&#39;s address, query all the corresponding aliases
[**updateAlias**](AliasApi.md#updateAlias) | **POST** /alias/update | Add or remove alias for an address


<a name="getAddressFromAlias"></a>
# **getAddressFromAlias**
> InlineResponse20048 getAddressFromAlias(alias)

Given an alias, query the corresponding address

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.AliasApi;


AliasApi apiInstance = new AliasApi();
String alias = "superman"; // String | The alias to be queried
try {
    InlineResponse20048 result = apiInstance.getAddressFromAlias(alias);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#getAddressFromAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**| The alias to be queried |

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAliasParams"></a>
# **getAliasParams**
> InlineResponse20050 getAliasParams()

Get the current alias parameters

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.AliasApi;


AliasApi apiInstance = new AliasApi();
try {
    InlineResponse20050 result = apiInstance.getAliasParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#getAliasParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAliasesFromAddress"></a>
# **getAliasesFromAddress**
> InlineResponse20049 getAliasesFromAddress(address)

Given an account&#39;s address, query all the corresponding aliases

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.AliasApi;


AliasApi apiInstance = new AliasApi();
String address = "coinex1dmz7e2fddhejdz5n7e3qc5szx3zn2gj3ta8rwj"; // String | The account's address to be queried
try {
    InlineResponse20049 result = apiInstance.getAliasesFromAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#getAliasesFromAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The account&#39;s address to be queried |

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAlias"></a>
# **updateAlias**
> StdTx updateAlias(aliasUpdateReq)

Add or remove alias for an address

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.AliasApi;


AliasApi apiInstance = new AliasApi();
AliasUpdateReq aliasUpdateReq = new AliasUpdateReq(); // AliasUpdateReq | update an address's aliases
try {
    StdTx result = apiInstance.updateAlias(aliasUpdateReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#updateAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasUpdateReq** | [**AliasUpdateReq**](AliasUpdateReq.md)| update an address&#39;s aliases |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


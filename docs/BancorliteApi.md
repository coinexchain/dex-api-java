# BancorliteApi

All URIs are relative to *https://dex-api.coinex.org/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bancorCancel**](BancorliteApi.md#bancorCancel) | **POST** /bancorlite/bancor-cancel | cancel bancor
[**bancorInit**](BancorliteApi.md#bancorInit) | **POST** /bancorlite/bancor-init | create bancor
[**bancorTrade**](BancorliteApi.md#bancorTrade) | **POST** /bancorlite/bancor-trade | trade with bancor
[**getBancorInfo**](BancorliteApi.md#getBancorInfo) | **GET** /bancorlite/pools/{symbol} | get the bancor pool info
[**getBancorInfos**](BancorliteApi.md#getBancorInfos) | **GET** /bancorlite/infos | get all bancor infos
[**getBancorliteParams**](BancorliteApi.md#getBancorliteParams) | **GET** /bancorlite/parameters | Get the current bancorlite parameters

<a name="bancorCancel"></a>
# **bancorCancel**
> StdTx bancorCancel(body)

cancel bancor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
Object body = null; // Object | cancel bancor
try {
    StdTx result = apiInstance.bancorCancel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#bancorCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| cancel bancor |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bancorInit"></a>
# **bancorInit**
> StdTx bancorInit(body)

create bancor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
Object body = null; // Object | create bancor
try {
    StdTx result = apiInstance.bancorInit(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#bancorInit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| create bancor |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bancorTrade"></a>
# **bancorTrade**
> StdTx bancorTrade(body)

trade with bancor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
Object body = null; // Object | trade with bancor
try {
    StdTx result = apiInstance.bancorTrade(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#bancorTrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| trade with bancor |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBancorInfo"></a>
# **getBancorInfo**
> Map&lt;String, Object&gt; getBancorInfo(symbol)

get the bancor pool info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
String symbol = "symbol_example"; // String | stock and money pair
try {
    Map<String, Object> result = apiInstance.getBancorInfo(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#getBancorInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| stock and money pair |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBancorInfos"></a>
# **getBancorInfos**
> Object getBancorInfos()

get all bancor infos

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
try {
    Object result = apiInstance.getBancorInfos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#getBancorInfos");
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

<a name="getBancorliteParams"></a>
# **getBancorliteParams**
> Object getBancorliteParams()

Get the current bancorlite parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
try {
    Object result = apiInstance.getBancorliteParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#getBancorliteParams");
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


# BancorliteApi

All URIs are relative to *https://dex-api.coinex.org*

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
> StdTx bancorCancel(bancorCancel)

cancel bancor

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
BancorCancel bancorCancel = new BancorCancel(); // BancorCancel | cancel bancor
try {
    StdTx result = apiInstance.bancorCancel(bancorCancel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#bancorCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bancorCancel** | [**BancorCancel**](BancorCancel.md)| cancel bancor |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bancorInit"></a>
# **bancorInit**
> StdTx bancorInit(bancorInit)

create bancor

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
BancorInit bancorInit = new BancorInit(); // BancorInit | create bancor
try {
    StdTx result = apiInstance.bancorInit(bancorInit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#bancorInit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bancorInit** | [**BancorInit**](BancorInit.md)| create bancor |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bancorTrade"></a>
# **bancorTrade**
> StdTx bancorTrade(bancorTrade)

trade with bancor

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
BancorTrade bancorTrade = new BancorTrade(); // BancorTrade | trade with bancor
try {
    StdTx result = apiInstance.bancorTrade(bancorTrade);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#bancorTrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bancorTrade** | [**BancorTrade**](BancorTrade.md)| trade with bancor |

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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
String symbol = "btc-cet"; // String | stock and money pair
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
> InlineResponse20052 getBancorInfos()

get all bancor infos

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
try {
    InlineResponse20052 result = apiInstance.getBancorInfos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#getBancorInfos");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBancorliteParams"></a>
# **getBancorliteParams**
> InlineResponse20051 getBancorliteParams()

Get the current bancorlite parameters

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BancorliteApi;


BancorliteApi apiInstance = new BancorliteApi();
try {
    InlineResponse20051 result = apiInstance.getBancorliteParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BancorliteApi#getBancorliteParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


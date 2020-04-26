# AuthApi

All URIs are relative to *https://dex-api.coinex.org/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AuthApi.md#getAccount) | **GET** /auth/accounts/{address} | Get the account information on blockchain
[**getAuthParams**](AuthApi.md#getAuthParams) | **GET** /auth/parameters | Get the current auth parameters
[**setReferee**](AuthApi.md#setReferee) | **POST** /auth/accounts/{address}/referee | Set referee for account

<a name="getAccount"></a>
# **getAccount**
> Object getAccount(address)

Get the account information on blockchain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String address = "address_example"; // String | Account address
try {
    Object result = apiInstance.getAccount(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Account address |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuthParams"></a>
# **getAuthParams**
> Object getAuthParams()

Get the current auth parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    Object result = apiInstance.getAuthParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthParams");
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

<a name="setReferee"></a>
# **setReferee**
> StdTx setReferee(body, address)

Set referee for account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
Object body = null; // Object | Referee
String address = "address_example"; // String | Account address in bech32 format
try {
    StdTx result = apiInstance.setReferee(body, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#setReferee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Referee |
 **address** | **String**| Account address in bech32 format |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# AuthApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AuthApi.md#getAccount) | **GET** /auth/accounts/{address} | Get the account information on blockchain
[**getAuthParams**](AuthApi.md#getAuthParams) | **GET** /auth/parameters | Get the current auth parameters
[**setReferee**](AuthApi.md#setReferee) | **POST** /auth/accounts/{address}/referee | Set referee for account


<a name="getAccount"></a>
# **getAccount**
> InlineResponse2004 getAccount(address)

Get the account information on blockchain

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String address = "address_example"; // String | Account address
try {
    InlineResponse2004 result = apiInstance.getAccount(address);
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

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuthParams"></a>
# **getAuthParams**
> InlineResponse20034 getAuthParams()

Get the current auth parameters

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    InlineResponse20034 result = apiInstance.getAuthParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setReferee"></a>
# **setReferee**
> StdTx setReferee(address, referee)

Set referee for account

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String address = "address_example"; // String | Account address in bech32 format
Referee referee = new Referee(); // Referee | Referee
try {
    StdTx result = apiInstance.setReferee(address, referee);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#setReferee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Account address in bech32 format |
 **referee** | [**Referee**](Referee.md)| Referee |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


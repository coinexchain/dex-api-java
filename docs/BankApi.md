# BankApi

All URIs are relative to *https://dex-api.coinex.org/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddressBalances**](BankApi.md#getAddressBalances) | **GET** /bank/balances/{address} | Get the account balances
[**getBankParams**](BankApi.md#getBankParams) | **GET** /bank/parameters | Get the current bankx parameters
[**sendCoins**](BankApi.md#sendCoins) | **POST** /bank/accounts/{address}/transfers | Send coins from one account to another
[**setMemoRequired**](BankApi.md#setMemoRequired) | **POST** /bank/accounts/memo | Mark if memo is required to receive coins
[**transferSupervisedCoins**](BankApi.md#transferSupervisedCoins) | **POST** /bank/accounts/{address}/supervised_transfers | Operate a supervised transfer

<a name="getAddressBalances"></a>
# **getAddressBalances**
> Map&lt;String, Object&gt; getAddressBalances(address)

Get the account balances

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BankApi;


BankApi apiInstance = new BankApi();
String address = "address_example"; // String | Account address in bech32 format
try {
    Map<String, Object> result = apiInstance.getAddressBalances(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#getAddressBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Account address in bech32 format |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankParams"></a>
# **getBankParams**
> Object getBankParams()

Get the current bankx parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BankApi;


BankApi apiInstance = new BankApi();
try {
    Object result = apiInstance.getBankParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#getBankParams");
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

<a name="sendCoins"></a>
# **sendCoins**
> StdTx sendCoins(body, address)

Send coins from one account to another

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BankApi;


BankApi apiInstance = new BankApi();
Object body = null; // Object | The sender and tx information
String address = "address_example"; // String | Account address in bech32 format
try {
    StdTx result = apiInstance.sendCoins(body, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#sendCoins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| The sender and tx information |
 **address** | **String**| Account address in bech32 format |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMemoRequired"></a>
# **setMemoRequired**
> StdTx setMemoRequired(body)

Mark if memo is required to receive coins

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BankApi;


BankApi apiInstance = new BankApi();
Object body = null; // Object | The mark
try {
    StdTx result = apiInstance.setMemoRequired(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#setMemoRequired");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| The mark |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transferSupervisedCoins"></a>
# **transferSupervisedCoins**
> StdTx transferSupervisedCoins(body, address)

Operate a supervised transfer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BankApi;


BankApi apiInstance = new BankApi();
Object body = null; // Object | The sender and tx information
String address = "address_example"; // String | Account address in bech32 format
try {
    StdTx result = apiInstance.transferSupervisedCoins(body, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#transferSupervisedCoins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| The sender and tx information |
 **address** | **String**| Account address in bech32 format |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


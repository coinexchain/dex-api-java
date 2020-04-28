# BankApi

All URIs are relative to *https://dex-api.coinex.org*

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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BankApi;


BankApi apiInstance = new BankApi();
String address = "coinex16gdxm24ht2mxtpz9cma6tr6a6d47x63hlq4pxt"; // String | Account address in bech32 format
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
> InlineResponse20035 getBankParams()

Get the current bankx parameters

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BankApi;


BankApi apiInstance = new BankApi();
try {
    InlineResponse20035 result = apiInstance.getBankParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#getBankParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendCoins"></a>
# **sendCoins**
> StdTx sendCoins(address, account)

Send coins from one account to another

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BankApi;


BankApi apiInstance = new BankApi();
String address = "coinex16gdxm24ht2mxtpz9cma6tr6a6d47x63hlq4pxt"; // String | Account address in bech32 format
Account account = new Account(); // Account | The sender and tx information
try {
    StdTx result = apiInstance.sendCoins(address, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#sendCoins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Account address in bech32 format |
 **account** | [**Account**](Account.md)| The sender and tx information |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMemoRequired"></a>
# **setMemoRequired**
> StdTx setMemoRequired(account)

Mark if memo is required to receive coins

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BankApi;


BankApi apiInstance = new BankApi();
Account1 account = new Account1(); // Account1 | The mark
try {
    StdTx result = apiInstance.setMemoRequired(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#setMemoRequired");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account1**](Account1.md)| The mark |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transferSupervisedCoins"></a>
# **transferSupervisedCoins**
> StdTx transferSupervisedCoins(address, postTxBody)

Operate a supervised transfer

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.BankApi;


BankApi apiInstance = new BankApi();
String address = "coinex16gdxm24ht2mxtpz9cma6tr6a6d47x63hlq4pxt"; // String | Account address in bech32 format
PostTxBody postTxBody = new PostTxBody(); // PostTxBody | The sender and tx information
try {
    StdTx result = apiInstance.transferSupervisedCoins(address, postTxBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankApi#transferSupervisedCoins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Account address in bech32 format |
 **postTxBody** | [**PostTxBody**](PostTxBody.md)| The sender and tx information |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# AssetApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWhitelist**](AssetApi.md#addWhitelist) | **POST** /asset/tokens/{symbol}/forbidden/whitelist | Add forbid whitelist
[**burnToken**](AssetApi.md#burnToken) | **POST** /asset/tokens/{symbol}/burns | Burn token
[**forbidAddr**](AssetApi.md#forbidAddr) | **POST** /asset/tokens/{symbol}/forbidden/addresses | Forbid address
[**forbidToken**](AssetApi.md#forbidToken) | **POST** /asset/tokens/{symbol}/forbids | Forbid token
[**getAssetParams**](AssetApi.md#getAssetParams) | **GET** /asset/parameters | Get the current asset parameters
[**getForbiddenAddresses**](AssetApi.md#getForbiddenAddresses) | **GET** /asset/tokens/{symbol}/forbidden/addresses | query forbidden addresses
[**getReservedSymbols**](AssetApi.md#getReservedSymbols) | **GET** /asset/tokens/reserved/symbols | List reserved symbols
[**getToken**](AssetApi.md#getToken) | **GET** /asset/tokens/{symbol} | queryToken
[**getTokenList**](AssetApi.md#getTokenList) | **GET** /asset/tokens | List tokens
[**getWhitelist**](AssetApi.md#getWhitelist) | **GET** /asset/tokens/{symbol}/forbidden/whitelist | queryWhitelist
[**issueToken**](AssetApi.md#issueToken) | **POST** /asset/tokens | Issue token
[**mintToken**](AssetApi.md#mintToken) | **POST** /asset/tokens/{symbol}/mints | Mint token
[**modifyTokenInfo**](AssetApi.md#modifyTokenInfo) | **POST** /asset/tokens/{symbol}/infos | Modify token info
[**removeWhitelist**](AssetApi.md#removeWhitelist) | **POST** /asset/tokens/{symbol}/unforbidden/whitelist | Remove forbid whitelist
[**transferOwnership**](AssetApi.md#transferOwnership) | **POST** /asset/tokens/{symbol}/ownerships | Transfer ownership
[**unForbidAddr**](AssetApi.md#unForbidAddr) | **POST** /asset/tokens/{symbol}/unforbidden/addresses | UnForbid address
[**unFrobidToken**](AssetApi.md#unFrobidToken) | **POST** /asset/tokens/{symbol}/unforbids | UnForbid token


<a name="addWhitelist"></a>
# **addWhitelist**
> StdTx addWhitelist(symbol, whitelist)

Add forbid whitelist

Add forbiddable token whitelist addr

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
Whitelist whitelist = new Whitelist(); // Whitelist | token whitelist addr
try {
    StdTx result = apiInstance.addWhitelist(symbol, whitelist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#addWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **whitelist** | [**Whitelist**](Whitelist.md)| token whitelist addr |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="burnToken"></a>
# **burnToken**
> StdTx burnToken(symbol, amount)

Burn token

Burn burnable token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
Amount2 amount = new Amount2(); // Amount2 | burn token amount
try {
    StdTx result = apiInstance.burnToken(symbol, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#burnToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **amount** | [**Amount2**](Amount2.md)| burn token amount |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forbidAddr"></a>
# **forbidAddr**
> StdTx forbidAddr(symbol, addresses)

Forbid address

Add forbidden addresses

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
Addresses addresses = new Addresses(); // Addresses | forbidden addresses
try {
    StdTx result = apiInstance.forbidAddr(symbol, addresses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#forbidAddr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **addresses** | [**Addresses**](Addresses.md)| forbidden addresses |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forbidToken"></a>
# **forbidToken**
> StdTx forbidToken(symbol, baseReq)

Forbid token

Forbid forbiddable token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
BaseReq baseReq = new BaseReq(); // BaseReq | base req
try {
    StdTx result = apiInstance.forbidToken(symbol, baseReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#forbidToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **baseReq** | [**BaseReq**](BaseReq.md)| base req |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssetParams"></a>
# **getAssetParams**
> InlineResponse20037 getAssetParams()

Get the current asset parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
try {
    InlineResponse20037 result = apiInstance.getAssetParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getAssetParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getForbiddenAddresses"></a>
# **getForbiddenAddresses**
> InlineResponse20040 getForbiddenAddresses(symbol)

query forbidden addresses

Get forbidden addresses with provided &#x60;symbol&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
try {
    InlineResponse20040 result = apiInstance.getForbiddenAddresses(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getForbiddenAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReservedSymbols"></a>
# **getReservedSymbols**
> InlineResponse20041 getReservedSymbols()

List reserved symbols

List all reserved symbols

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
try {
    InlineResponse20041 result = apiInstance.getReservedSymbols();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getReservedSymbols");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getToken"></a>
# **getToken**
> InlineResponse20039 getToken(symbol)

queryToken

Get token with provided &#x60;symbol&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
try {
    InlineResponse20039 result = apiInstance.getToken(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenList"></a>
# **getTokenList**
> InlineResponse20038 getTokenList()

List tokens

List all existing tokens

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
try {
    InlineResponse20038 result = apiInstance.getTokenList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getTokenList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWhitelist"></a>
# **getWhitelist**
> InlineResponse20040 getWhitelist(symbol)

queryWhitelist

Get token whitelist with provided &#x60;symbol&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
try {
    InlineResponse20040 result = apiInstance.getWhitelist(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="issueToken"></a>
# **issueToken**
> StdTx issueToken(tokenInfo)

Issue token

Issue a new Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
IssueToken tokenInfo = new IssueToken(); // IssueToken | the detail info about the Token to issue
try {
    StdTx result = apiInstance.issueToken(tokenInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#issueToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenInfo** | [**IssueToken**](IssueToken.md)| the detail info about the Token to issue |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mintToken"></a>
# **mintToken**
> StdTx mintToken(symbol, amount)

Mint token

Mint mintable token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
Amount1 amount = new Amount1(); // Amount1 | mint token amount
try {
    StdTx result = apiInstance.mintToken(symbol, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#mintToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **amount** | [**Amount1**](Amount1.md)| mint token amount |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyTokenInfo"></a>
# **modifyTokenInfo**
> StdTx modifyTokenInfo(symbol, info)

Modify token info

Modify token info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
Info info = new Info(); // Info | new token info
try {
    StdTx result = apiInstance.modifyTokenInfo(symbol, info);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#modifyTokenInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **info** | [**Info**](Info.md)| new token info |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeWhitelist"></a>
# **removeWhitelist**
> StdTx removeWhitelist(symbol, whitelist)

Remove forbid whitelist

Remove forbiddable token whitelist addr

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
Whitelist whitelist = new Whitelist(); // Whitelist | token whitelist addr
try {
    StdTx result = apiInstance.removeWhitelist(symbol, whitelist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#removeWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **whitelist** | [**Whitelist**](Whitelist.md)| token whitelist addr |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transferOwnership"></a>
# **transferOwnership**
> StdTx transferOwnership(symbol, newOwner)

Transfer ownership

Transfer token owner ship

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
NewOwner newOwner = new NewOwner(); // NewOwner | transfer ownership to new owner
try {
    StdTx result = apiInstance.transferOwnership(symbol, newOwner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#transferOwnership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **newOwner** | [**NewOwner**](NewOwner.md)| transfer ownership to new owner |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unForbidAddr"></a>
# **unForbidAddr**
> StdTx unForbidAddr(symbol, addresses)

UnForbid address

Remove forbidden addresses

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
Addresses addresses = new Addresses(); // Addresses | un forbidden addresses
try {
    StdTx result = apiInstance.unForbidAddr(symbol, addresses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#unForbidAddr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **addresses** | [**Addresses**](Addresses.md)| un forbidden addresses |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unFrobidToken"></a>
# **unFrobidToken**
> StdTx unFrobidToken(symbol, baseReq)

UnForbid token

UnForbid forbiddable token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
String symbol = "symbol_example"; // String | token symbol
BaseReq1 baseReq = new BaseReq1(); // BaseReq1 | base req
try {
    StdTx result = apiInstance.unFrobidToken(symbol, baseReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#unFrobidToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| token symbol |
 **baseReq** | [**BaseReq1**](BaseReq1.md)| base req |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


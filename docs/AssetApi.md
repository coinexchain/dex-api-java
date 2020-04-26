# AssetApi

All URIs are relative to *https://dex-api.coinex.org/*

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
> StdTx addWhitelist(body, symbol)

Add forbid whitelist

Add forbiddable token whitelist addr

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Whitelist body = new Whitelist(); // Whitelist | token whitelist addr
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.addWhitelist(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#addWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Whitelist**](Whitelist.md)| token whitelist addr |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="burnToken"></a>
# **burnToken**
> StdTx burnToken(body, symbol)

Burn token

Burn burnable token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Object body = null; // Object | burn token amount
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.burnToken(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#burnToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| burn token amount |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forbidAddr"></a>
# **forbidAddr**
> StdTx forbidAddr(body, symbol)

Forbid address

Add forbidden addresses

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Addresses body = new Addresses(); // Addresses | forbidden addresses
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.forbidAddr(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#forbidAddr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Addresses**](Addresses.md)| forbidden addresses |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forbidToken"></a>
# **forbidToken**
> StdTx forbidToken(body, symbol)

Forbid token

Forbid forbiddable token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Object body = null; // Object | base req
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.forbidToken(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#forbidToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| base req |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssetParams"></a>
# **getAssetParams**
> Object getAssetParams()

Get the current asset parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
try {
    Object result = apiInstance.getAssetParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getAssetParams");
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

<a name="getForbiddenAddresses"></a>
# **getForbiddenAddresses**
> Object getForbiddenAddresses(symbol)

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
    Object result = apiInstance.getForbiddenAddresses(symbol);
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReservedSymbols"></a>
# **getReservedSymbols**
> Object getReservedSymbols()

List reserved symbols

List all reserved symbols

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
try {
    Object result = apiInstance.getReservedSymbols();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getReservedSymbols");
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

<a name="getToken"></a>
# **getToken**
> Object getToken(symbol)

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
    Object result = apiInstance.getToken(symbol);
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenList"></a>
# **getTokenList**
> Object getTokenList()

List tokens

List all existing tokens

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
try {
    Object result = apiInstance.getTokenList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#getTokenList");
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

<a name="getWhitelist"></a>
# **getWhitelist**
> Object getWhitelist(symbol)

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
    Object result = apiInstance.getWhitelist(symbol);
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="issueToken"></a>
# **issueToken**
> StdTx issueToken(body)

Issue token

Issue a new Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
IssueToken body = new IssueToken(); // IssueToken | the detail info about the Token to issue
try {
    StdTx result = apiInstance.issueToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#issueToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IssueToken**](IssueToken.md)| the detail info about the Token to issue |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mintToken"></a>
# **mintToken**
> StdTx mintToken(body, symbol)

Mint token

Mint mintable token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Object body = null; // Object | mint token amount
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.mintToken(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#mintToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| mint token amount |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyTokenInfo"></a>
# **modifyTokenInfo**
> StdTx modifyTokenInfo(body, symbol)

Modify token info

Modify token info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Object body = null; // Object | new token info
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.modifyTokenInfo(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#modifyTokenInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| new token info |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeWhitelist"></a>
# **removeWhitelist**
> StdTx removeWhitelist(body, symbol)

Remove forbid whitelist

Remove forbiddable token whitelist addr

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Whitelist body = new Whitelist(); // Whitelist | token whitelist addr
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.removeWhitelist(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#removeWhitelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Whitelist**](Whitelist.md)| token whitelist addr |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transferOwnership"></a>
# **transferOwnership**
> StdTx transferOwnership(body, symbol)

Transfer ownership

Transfer token owner ship

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Object body = null; // Object | transfer ownership to new owner
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.transferOwnership(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#transferOwnership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| transfer ownership to new owner |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unForbidAddr"></a>
# **unForbidAddr**
> StdTx unForbidAddr(body, symbol)

UnForbid address

Remove forbidden addresses

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Addresses body = new Addresses(); // Addresses | un forbidden addresses
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.unForbidAddr(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#unForbidAddr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Addresses**](Addresses.md)| un forbidden addresses |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unFrobidToken"></a>
# **unFrobidToken**
> StdTx unFrobidToken(body, symbol)

UnForbid token

UnForbid forbiddable token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetApi;


AssetApi apiInstance = new AssetApi();
Object body = null; // Object | base req
String symbol = "symbol_example"; // String | token symbol
try {
    StdTx result = apiInstance.unFrobidToken(body, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetApi#unFrobidToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| base req |
 **symbol** | **String**| token symbol |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


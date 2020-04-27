# MarketApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](MarketApi.md#cancelOrder) | **POST** /market/cancel-order | Cancel the order
[**cancelTradingPair**](MarketApi.md#cancelTradingPair) | **POST** /market/cancel-trading-pair | Cancel the trading-pair
[**createGteOrder**](MarketApi.md#createGteOrder) | **POST** /market/gte-orders | Create GTE order in blockchain
[**createIocOrder**](MarketApi.md#createIocOrder) | **POST** /market/ioc-orders | Create IOC order in blockchain
[**createTradingPair**](MarketApi.md#createTradingPair) | **POST** /market/trading-pairs | Create trading-pair in blockchain
[**getMarketParams**](MarketApi.md#getMarketParams) | **GET** /market/parameters | Get the current market parameters
[**getOrder**](MarketApi.md#getOrder) | **GET** /market/orders/{order-id} | Query order info
[**getOrders**](MarketApi.md#getOrders) | **GET** /market/orders/account/{address} | Query user order-id list
[**getOrdersInMarket**](MarketApi.md#getOrdersInMarket) | **GET** /market/orderbook/{stock}/{money} | Query trading-pair&#39;s orderbook
[**getTradingPair**](MarketApi.md#getTradingPair) | **GET** /market/trading-pairs/{stock}/{money} | Query trading-pair info
[**modifyPricePrecision**](MarketApi.md#modifyPricePrecision) | **POST** /market/price-precision | Modify the price precision of the trading pair in the dex
[**queryTradingPairs**](MarketApi.md#queryTradingPairs) | **GET** /market/exist-trading-pairs | Query all trading-pair infos in blockchain


<a name="cancelOrder"></a>
# **cancelOrder**
> StdTx cancelOrder(orderInfo)

Cancel the order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
OrderInfo orderInfo = new OrderInfo(); // OrderInfo | cancel order tx
try {
    StdTx result = apiInstance.cancelOrder(orderInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderInfo** | [**OrderInfo**](OrderInfo.md)| cancel order tx |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelTradingPair"></a>
# **cancelTradingPair**
> StdTx cancelTradingPair(info)

Cancel the trading-pair

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
Info2 info = new Info2(); // Info2 | cancel trading-pair in dex
try {
    StdTx result = apiInstance.cancelTradingPair(info);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#cancelTradingPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **info** | [**Info2**](Info2.md)| cancel trading-pair in dex |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGteOrder"></a>
# **createGteOrder**
> StdTx createGteOrder(orderInfo)

Create GTE order in blockchain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
object orderInfo = new object(); // object | create order tx
try {
    StdTx result = apiInstance.createGteOrder(orderInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#createGteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderInfo** | [**object**](.md)| create order tx |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIocOrder"></a>
# **createIocOrder**
> StdTx createIocOrder(orderInfo)

Create IOC order in blockchain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
object orderInfo = new object(); // object | create order tx
try {
    StdTx result = apiInstance.createIocOrder(orderInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#createIocOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderInfo** | [**object**](.md)| create order tx |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTradingPair"></a>
# **createTradingPair**
> StdTx createTradingPair(info)

Create trading-pair in blockchain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
object info = new object(); // object | Create trading-pair
try {
    StdTx result = apiInstance.createTradingPair(info);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#createTradingPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **info** | [**object**](.md)| Create trading-pair |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketParams"></a>
# **getMarketParams**
> InlineResponse20042 getMarketParams()

Get the current market parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
try {
    InlineResponse20042 result = apiInstance.getMarketParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> InlineResponse20046 getOrder(orderId)

Query order info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String orderId = "orderId_example"; // String | The order id
try {
    InlineResponse20046 result = apiInstance.getOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id |

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrders"></a>
# **getOrders**
> InlineResponse20047 getOrders(address)

Query user order-id list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String address = "address_example"; // String | The user address
try {
    InlineResponse20047 result = apiInstance.getOrders(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The user address |

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrdersInMarket"></a>
# **getOrdersInMarket**
> InlineResponse20045 getOrdersInMarket(stock, money)

Query trading-pair&#39;s orderbook

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String stock = "stock_example"; // String | stock symbol
String money = "money_example"; // String | money symbol
try {
    InlineResponse20045 result = apiInstance.getOrdersInMarket(stock, money);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getOrdersInMarket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stock** | **String**| stock symbol |
 **money** | **String**| money symbol |

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTradingPair"></a>
# **getTradingPair**
> InlineResponse20044 getTradingPair(stock, money)

Query trading-pair info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String stock = "stock_example"; // String | stock symbol
String money = "money_example"; // String | money symbol
try {
    InlineResponse20044 result = apiInstance.getTradingPair(stock, money);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getTradingPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stock** | **String**| stock symbol |
 **money** | **String**| money symbol |

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyPricePrecision"></a>
# **modifyPricePrecision**
> StdTx modifyPricePrecision(info)

Modify the price precision of the trading pair in the dex

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
Info1 info = new Info1(); // Info1 | trading-pair, price-precision as params
try {
    StdTx result = apiInstance.modifyPricePrecision(info);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#modifyPricePrecision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **info** | [**Info1**](Info1.md)| trading-pair, price-precision as params |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryTradingPairs"></a>
# **queryTradingPairs**
> InlineResponse20043 queryTradingPairs()

Query all trading-pair infos in blockchain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
try {
    InlineResponse20043 result = apiInstance.queryTradingPairs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#queryTradingPairs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


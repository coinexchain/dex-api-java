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
[**queryCandleStick**](MarketApi.md#queryCandleStick) | **GET** /market/candle-sticks | Query market candleStick
[**queryDeal**](MarketApi.md#queryDeal) | **GET** /market/deals | Query market deal
[**queryDepth**](MarketApi.md#queryDepth) | **GET** /market/depths | Query market depth
[**queryOrder**](MarketApi.md#queryOrder) | **GET** /market/user-orders | Query account&#39;s order
[**queryTickers**](MarketApi.md#queryTickers) | **GET** /market/tickers | Query market tickers
[**queryTradingPairs**](MarketApi.md#queryTradingPairs) | **GET** /market/exist-trading-pairs | Query all trading-pair infos in blockchain


<a name="cancelOrder"></a>
# **cancelOrder**
> StdTx cancelOrder(orderInfo)

Cancel the order

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String orderId = "coinex1dmz7e2fddhejdz5n7e3qc5szx3zn2gj3ta8rwj"; // String | The order id
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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String address = "coinex1dmz7e2fddhejdz5n7e3qc5szx3zn2gj3ta8rwj"; // String | The user address
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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String stock = "btc"; // String | stock symbol
String money = "cet"; // String | money symbol
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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String stock = "btc"; // String | stock symbol
String money = "cet"; // String | money symbol
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
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


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

<a name="queryCandleStick"></a>
# **queryCandleStick**
> List&lt;CandleStick&gt; queryCandleStick(market, timespan, time, sid, count)

Query market candleStick

Query candleStick until to given time

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String market = "market_example"; // String | stock/money
String timespan = "timespan_example"; // String | 1min/1hour/1day
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier candleStick count limited to 1024
try {
    List<CandleStick> result = apiInstance.queryCandleStick(market, timespan, time, sid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#queryCandleStick");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**| stock/money |
 **timespan** | **String**| 1min/1hour/1day |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier candleStick count limited to 1024 |

### Return type

[**List&lt;CandleStick&gt;**](CandleStick.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryDeal"></a>
# **queryDeal**
> InlineResponse20056 queryDeal(market, time, sid, count)

Query market deal

Query market deal until to given time

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String market = "market_example"; // String | stock/money
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier deal count limited to 1024
try {
    InlineResponse20056 result = apiInstance.queryDeal(market, time, sid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#queryDeal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**| stock/money |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier deal count limited to 1024 |

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryDepth"></a>
# **queryDepth**
> InlineResponse20055 queryDepth(market, count)

Query market depth

Query purchases and sales of a market at all price levels

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String market = "market_example"; // String | stock/money
Integer count = 56; // Integer | Querier count limited to 1024
try {
    InlineResponse20055 result = apiInstance.queryDepth(market, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#queryDepth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**| stock/money |
 **count** | **Integer**| Querier count limited to 1024 |

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryOrder"></a>
# **queryOrder**
> UserOrder queryOrder(account, time, sid, count, token, tag)

Query account&#39;s order

Query account&#39;s order activities in all markets until to given time

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String account = "account_example"; // String | Bech32 address
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier order count limited to 1024
String token = "token_example"; // String | Symbol
String tag = "tag_example"; // String | Filter responses type by tag string create/fill/cancel
try {
    UserOrder result = apiInstance.queryOrder(account, time, sid, count, token, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#queryOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Bech32 address |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier order count limited to 1024 |
 **token** | **String**| Symbol | [optional]
 **tag** | **String**| Filter responses type by tag string create/fill/cancel | [optional]

### Return type

[**UserOrder**](UserOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryTickers"></a>
# **queryTickers**
> List&lt;Tickers&gt; queryTickers(marketList)

Query market tickers

Query tickers info

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
List<String> marketList = Arrays.asList("marketList_example"); // List<String> | Market count limited to 1~100
try {
    List<Tickers> result = apiInstance.queryTickers(marketList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#queryTickers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketList** | [**List&lt;String&gt;**](String.md)| Market count limited to 1~100 |

### Return type

[**List&lt;Tickers&gt;**](Tickers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryTradingPairs"></a>
# **queryTradingPairs**
> InlineResponse20043 queryTradingPairs()

Query all trading-pair infos in blockchain

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.MarketApi;


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


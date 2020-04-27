
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderType** | **Integer** | The identify of the price limit : 2; (Currently, only price limit orders are supported) | 
**tradingPair** | **String** |  | 
**pricePrecision** | **String** |  |  [optional]
**price** | **String** |  | 
**quantity** | **String** |  | 
**side** | **Integer** | The buying or selling direction of an order.(buy : 1; sell : 2) | 
**identify** | **Integer** | A transaction can contain multiple order creation messages, the identify field was added to the order creation message to give each order a unique ID. So the order ID consists of user address, user sequence, identify. | 




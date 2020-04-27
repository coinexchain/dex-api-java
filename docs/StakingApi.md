# StakingApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDelegations**](StakingApi.md#getDelegations) | **GET** /staking/delegators/{delegatorAddr}/delegations | Get all delegations from a delegator
[**getDelegationsOfValidator**](StakingApi.md#getDelegationsOfValidator) | **GET** /staking/validators/{validatorAddr}/delegations | Get all delegations from a validator
[**getDelegationsToValidator**](StakingApi.md#getDelegationsToValidator) | **GET** /staking/delegators/{delegatorAddr}/delegations/{validatorAddr} | Query the current delegation between a delegator and a validator
[**getDelegatorTxs**](StakingApi.md#getDelegatorTxs) | **GET** /staking/delegators/{delegatorAddr}/txs | Get all staking txs (i.e msgs) from a delegator
[**getRedelegations**](StakingApi.md#getRedelegations) | **GET** /staking/redelegations | Get all redelegations (filter by query params)
[**getStakingParameters**](StakingApi.md#getStakingParameters) | **GET** /staking/parameters | Get the current staking parameter values
[**getStakingPool**](StakingApi.md#getStakingPool) | **GET** /staking/pool | Get the current state of the staking pool
[**getUndelegationsBetween**](StakingApi.md#getUndelegationsBetween) | **GET** /staking/delegators/{delegatorAddr}/unbonding_delegations/{validatorAddr} | Query all unbonding delegations between a delegator and a validator
[**getUndelegationsOfDelegator**](StakingApi.md#getUndelegationsOfDelegator) | **GET** /staking/delegators/{delegatorAddr}/unbonding_delegations | Get all unbonding delegations from a delegator
[**getUndelegationsOfValidator**](StakingApi.md#getUndelegationsOfValidator) | **GET** /staking/validators/{validatorAddr}/unbonding_delegations | Get all unbonding delegations from a validator
[**getValidator**](StakingApi.md#getValidator) | **GET** /staking/validators/{validatorAddr} | Query the information from a single validator
[**getValidatorOfDelegator**](StakingApi.md#getValidatorOfDelegator) | **GET** /staking/delegators/{delegatorAddr}/validators/{validatorAddr} | Query a validator that a delegator is bonded to
[**getValidators**](StakingApi.md#getValidators) | **GET** /staking/validators | Get all validator candidates. By default it returns only the bonded validators.
[**getValidatorsOfDelegator**](StakingApi.md#getValidatorsOfDelegator) | **GET** /staking/delegators/{delegatorAddr}/validators | Query all validators that a delegator is bonded to
[**submitDelegation**](StakingApi.md#submitDelegation) | **POST** /staking/delegators/{delegatorAddr}/delegations | Submit delegation
[**submitRedelegation**](StakingApi.md#submitRedelegation) | **POST** /staking/delegators/{delegatorAddr}/redelegations | Submit a redelegation
[**undelegate**](StakingApi.md#undelegate) | **POST** /staking/delegators/{delegatorAddr}/unbonding_delegations | Submit an unbonding delegation


<a name="getDelegations"></a>
# **getDelegations**
> InlineResponse2005 getDelegations(delegatorAddr)

Get all delegations from a delegator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
try {
    InlineResponse2005 result = apiInstance.getDelegations(delegatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getDelegations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDelegationsOfValidator"></a>
# **getDelegationsOfValidator**
> InlineResponse2005 getDelegationsOfValidator(validatorAddr)

Get all delegations from a validator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String validatorAddr = "validatorAddr_example"; // String | Bech32 OperatorAddress of validator
try {
    InlineResponse2005 result = apiInstance.getDelegationsOfValidator(validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getDelegationsOfValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDelegationsToValidator"></a>
# **getDelegationsToValidator**
> InlineResponse2006 getDelegationsToValidator(delegatorAddr, validatorAddr)

Query the current delegation between a delegator and a validator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
String validatorAddr = "validatorAddr_example"; // String | Bech32 OperatorAddress of validator
try {
    InlineResponse2006 result = apiInstance.getDelegationsToValidator(delegatorAddr, validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getDelegationsToValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDelegatorTxs"></a>
# **getDelegatorTxs**
> List&lt;PaginatedQueryTxs&gt; getDelegatorTxs(delegatorAddr)

Get all staking txs (i.e msgs) from a delegator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
try {
    List<PaginatedQueryTxs> result = apiInstance.getDelegatorTxs(delegatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getDelegatorTxs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |

### Return type

[**List&lt;PaginatedQueryTxs&gt;**](PaginatedQueryTxs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRedelegations"></a>
# **getRedelegations**
> InlineResponse2009 getRedelegations(delegator, validatorFrom, validatorTo)

Get all redelegations (filter by query params)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegator = "delegator_example"; // String | Bech32 AccAddress of Delegator
String validatorFrom = "validatorFrom_example"; // String | Bech32 ValAddress of SrcValidator
String validatorTo = "validatorTo_example"; // String | Bech32 ValAddress of DstValidator
try {
    InlineResponse2009 result = apiInstance.getRedelegations(delegator, validatorFrom, validatorTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getRedelegations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegator** | **String**| Bech32 AccAddress of Delegator | [optional]
 **validatorFrom** | **String**| Bech32 ValAddress of SrcValidator | [optional]
 **validatorTo** | **String**| Bech32 ValAddress of DstValidator | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStakingParameters"></a>
# **getStakingParameters**
> InlineResponse20014 getStakingParameters()

Get the current staking parameter values

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
try {
    InlineResponse20014 result = apiInstance.getStakingParameters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getStakingParameters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStakingPool"></a>
# **getStakingPool**
> InlineResponse20013 getStakingPool()

Get the current state of the staking pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
try {
    InlineResponse20013 result = apiInstance.getStakingPool();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getStakingPool");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUndelegationsBetween"></a>
# **getUndelegationsBetween**
> InlineResponse2008 getUndelegationsBetween(delegatorAddr, validatorAddr)

Query all unbonding delegations between a delegator and a validator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
String validatorAddr = "validatorAddr_example"; // String | Bech32 OperatorAddress of validator
try {
    InlineResponse2008 result = apiInstance.getUndelegationsBetween(delegatorAddr, validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getUndelegationsBetween");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUndelegationsOfDelegator"></a>
# **getUndelegationsOfDelegator**
> InlineResponse2007 getUndelegationsOfDelegator(delegatorAddr)

Get all unbonding delegations from a delegator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
try {
    InlineResponse2007 result = apiInstance.getUndelegationsOfDelegator(delegatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getUndelegationsOfDelegator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUndelegationsOfValidator"></a>
# **getUndelegationsOfValidator**
> InlineResponse20012 getUndelegationsOfValidator(validatorAddr)

Get all unbonding delegations from a validator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String validatorAddr = "validatorAddr_example"; // String | Bech32 OperatorAddress of validator
try {
    InlineResponse20012 result = apiInstance.getUndelegationsOfValidator(validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getUndelegationsOfValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getValidator"></a>
# **getValidator**
> InlineResponse20011 getValidator(validatorAddr)

Query the information from a single validator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String validatorAddr = "validatorAddr_example"; // String | Bech32 OperatorAddress of validator
try {
    InlineResponse20011 result = apiInstance.getValidator(validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getValidatorOfDelegator"></a>
# **getValidatorOfDelegator**
> InlineResponse20011 getValidatorOfDelegator(delegatorAddr, validatorAddr)

Query a validator that a delegator is bonded to

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
String validatorAddr = "validatorAddr_example"; // String | Bech32 ValAddress of Delegator
try {
    InlineResponse20011 result = apiInstance.getValidatorOfDelegator(delegatorAddr, validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getValidatorOfDelegator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **validatorAddr** | **String**| Bech32 ValAddress of Delegator |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getValidators"></a>
# **getValidators**
> InlineResponse20010 getValidators(status, page, limit)

Get all validator candidates. By default it returns only the bonded validators.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String status = "status_example"; // String | The validator bond status. Must be either 'bonded', 'unbonded', or 'unbonding'.
Integer page = 56; // Integer | The page number.
Integer limit = 56; // Integer | The maximum number of items per page.
try {
    InlineResponse20010 result = apiInstance.getValidators(status, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getValidators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| The validator bond status. Must be either &#39;bonded&#39;, &#39;unbonded&#39;, or &#39;unbonding&#39;. | [optional]
 **page** | **Integer**| The page number. | [optional]
 **limit** | **Integer**| The maximum number of items per page. | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getValidatorsOfDelegator"></a>
# **getValidatorsOfDelegator**
> InlineResponse20010 getValidatorsOfDelegator(delegatorAddr)

Query all validators that a delegator is bonded to

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
try {
    InlineResponse20010 result = apiInstance.getValidatorsOfDelegator(delegatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#getValidatorsOfDelegator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitDelegation"></a>
# **submitDelegation**
> BroadcastTxCommitResult submitDelegation(delegatorAddr, delegation)

Submit delegation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
Delegation delegation = new Delegation(); // Delegation | submit delegation to provided validator
try {
    BroadcastTxCommitResult result = apiInstance.submitDelegation(delegatorAddr, delegation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#submitDelegation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **delegation** | [**Delegation**](Delegation.md)| submit delegation to provided validator | [optional]

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitRedelegation"></a>
# **submitRedelegation**
> StdTx submitRedelegation(delegatorAddr, delegation)

Submit a redelegation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
Delegation2 delegation = new Delegation2(); // Delegation2 | The sender and tx information
try {
    StdTx result = apiInstance.submitRedelegation(delegatorAddr, delegation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#submitRedelegation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **delegation** | [**Delegation2**](Delegation2.md)| The sender and tx information | [optional]

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="undelegate"></a>
# **undelegate**
> BroadcastTxCommitResult undelegate(delegatorAddr, delegation)

Submit an unbonding delegation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StakingApi;


StakingApi apiInstance = new StakingApi();
String delegatorAddr = "delegatorAddr_example"; // String | Bech32 AccAddress of Delegator
Delegation1 delegation = new Delegation1(); // Delegation1 | The password of the account to remove from the KMS
try {
    BroadcastTxCommitResult result = apiInstance.undelegate(delegatorAddr, delegation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakingApi#undelegate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **delegation** | [**Delegation1**](Delegation1.md)| The password of the account to remove from the KMS | [optional]

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


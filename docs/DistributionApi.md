# DistributionApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**donateToCommunityPool**](DistributionApi.md#donateToCommunityPool) | **POST** /distribution/{accAddress}/donates | Donate to the community pool
[**getAllRewards**](DistributionApi.md#getAllRewards) | **GET** /distribution/delegators/{delegatorAddr}/rewards | Get the total rewards balance from all delegations
[**getCommunityPool**](DistributionApi.md#getCommunityPool) | **GET** /distribution/community_pool | Community pool parameters
[**getDistributionInfo**](DistributionApi.md#getDistributionInfo) | **GET** /distribution/validators/{validatorAddr} | Validator distribution information
[**getDistributionParams**](DistributionApi.md#getDistributionParams) | **GET** /distribution/parameters | Fee distribution parameters
[**getOutstandingRewards**](DistributionApi.md#getOutstandingRewards) | **GET** /distribution/validators/{validatorAddr}/outstanding_rewards | Fee distribution outstanding rewards of a single validator
[**getRewardByValidator**](DistributionApi.md#getRewardByValidator) | **GET** /distribution/delegators/{delegatorAddr}/rewards/{validatorAddr} | Query a delegation reward
[**getValidatorRewards**](DistributionApi.md#getValidatorRewards) | **GET** /distribution/validators/{validatorAddr}/rewards | Commission and self-delegation rewards of a single validator
[**getWithdrawAddress**](DistributionApi.md#getWithdrawAddress) | **GET** /distribution/delegators/{delegatorAddr}/withdraw_address | Get the rewards withdrawal address
[**setWithdrawAddress**](DistributionApi.md#setWithdrawAddress) | **POST** /distribution/delegators/{delegatorAddr}/withdraw_address | Replace the rewards withdrawal address
[**withdrawAllRewards**](DistributionApi.md#withdrawAllRewards) | **POST** /distribution/delegators/{delegatorAddr}/rewards | Withdraw all the delegator&#39;s delegation rewards
[**withdrawAllValidatorRewards**](DistributionApi.md#withdrawAllValidatorRewards) | **POST** /distribution/validators/{validatorAddr}/rewards | Withdraw the validator&#39;s rewards
[**withdrawRewardsByValidator**](DistributionApi.md#withdrawRewardsByValidator) | **POST** /distribution/delegators/{delegatorAddr}/rewards/{validatorAddr} | Withdraw a delegation reward


<a name="donateToCommunityPool"></a>
# **donateToCommunityPool**
> StdTx donateToCommunityPool(accAddress, amount)

Donate to the community pool

Donate some amount of cet to the community pool

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String accAddress = "coinex1628t2zxa9antj3qtkg7xj2m4t68uljqvyjqrup"; // String | Account address of the user
Amount amount = new Amount(); // Amount | Amount of cet to donate
try {
    StdTx result = apiInstance.donateToCommunityPool(accAddress, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#donateToCommunityPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accAddress** | **String**| Account address of the user |
 **amount** | [**Amount**](Amount.md)| Amount of cet to donate |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllRewards"></a>
# **getAllRewards**
> InlineResponse20029 getAllRewards(delegatorAddr)

Get the total rewards balance from all delegations

Get the sum of all the rewards earned by delegations by a single delegator

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String delegatorAddr = "coinex167w96tdvmazakdwkw2u57227eduula2cy572lf"; // String | Bech32 AccAddress of Delegator
try {
    InlineResponse20029 result = apiInstance.getAllRewards(delegatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#getAllRewards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommunityPool"></a>
# **getCommunityPool**
> Object getCommunityPool()

Community pool parameters

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
try {
    Object result = apiInstance.getCommunityPool();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#getCommunityPool");
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

<a name="getDistributionInfo"></a>
# **getDistributionInfo**
> InlineResponse20032 getDistributionInfo(validatorAddr)

Validator distribution information

Query the distribution information of a single validator

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String validatorAddr = "coinexvaloper1qwl879nx9t6kef4supyazayf7vjhennyh568ys"; // String | Bech32 OperatorAddress of validator
try {
    InlineResponse20032 result = apiInstance.getDistributionInfo(validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#getDistributionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistributionParams"></a>
# **getDistributionParams**
> InlineResponse20033 getDistributionParams()

Fee distribution parameters

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
try {
    InlineResponse20033 result = apiInstance.getDistributionParams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#getDistributionParams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOutstandingRewards"></a>
# **getOutstandingRewards**
> Object getOutstandingRewards(validatorAddr)

Fee distribution outstanding rewards of a single validator

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String validatorAddr = "coinexvaloper1qwl879nx9t6kef4supyazayf7vjhennyh568ys"; // String | Bech32 OperatorAddress of validator
try {
    Object result = apiInstance.getOutstandingRewards(validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#getOutstandingRewards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRewardByValidator"></a>
# **getRewardByValidator**
> InlineResponse20030 getRewardByValidator(delegatorAddr, validatorAddr)

Query a delegation reward

Query a single delegation reward by a delegator

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String delegatorAddr = "coinex167w96tdvmazakdwkw2u57227eduula2cy572lf"; // String | Bech32 AccAddress of Delegator
String validatorAddr = "coinexvaloper1qwl879nx9t6kef4supyazayf7vjhennyh568ys"; // String | Bech32 OperatorAddress of validator
try {
    InlineResponse20030 result = apiInstance.getRewardByValidator(delegatorAddr, validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#getRewardByValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getValidatorRewards"></a>
# **getValidatorRewards**
> InlineResponse20030 getValidatorRewards(validatorAddr)

Commission and self-delegation rewards of a single validator

Query the commission and self-delegation rewards of validator.

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String validatorAddr = "coinexvaloper1qwl879nx9t6kef4supyazayf7vjhennyh568ys"; // String | Bech32 OperatorAddress of validator
try {
    InlineResponse20030 result = apiInstance.getValidatorRewards(validatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#getValidatorRewards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWithdrawAddress"></a>
# **getWithdrawAddress**
> InlineResponse20031 getWithdrawAddress(delegatorAddr)

Get the rewards withdrawal address

Get the delegations&#39; rewards withdrawal address. This is the address in which the user will receive the reward funds

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String delegatorAddr = "coinex167w96tdvmazakdwkw2u57227eduula2cy572lf"; // String | Bech32 AccAddress of Delegator
try {
    InlineResponse20031 result = apiInstance.getWithdrawAddress(delegatorAddr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#getWithdrawAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setWithdrawAddress"></a>
# **setWithdrawAddress**
> BroadcastTxCommitResult setWithdrawAddress(delegatorAddr, withdrawRequestBody)

Replace the rewards withdrawal address

Replace the delegations&#39; rewards withdrawal address for a new one.

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String delegatorAddr = "coinex167w96tdvmazakdwkw2u57227eduula2cy572lf"; // String | Bech32 AccAddress of Delegator
WithdrawRequestBody2 withdrawRequestBody = new WithdrawRequestBody2(); // WithdrawRequestBody2 | 
try {
    BroadcastTxCommitResult result = apiInstance.setWithdrawAddress(delegatorAddr, withdrawRequestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#setWithdrawAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **withdrawRequestBody** | [**WithdrawRequestBody2**](WithdrawRequestBody2.md)|  | [optional]

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="withdrawAllRewards"></a>
# **withdrawAllRewards**
> BroadcastTxCommitResult withdrawAllRewards(delegatorAddr, withdrawRequestBody)

Withdraw all the delegator&#39;s delegation rewards

Withdraw all the delegator&#39;s delegation rewards

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String delegatorAddr = "coinex167w96tdvmazakdwkw2u57227eduula2cy572lf"; // String | Bech32 AccAddress of Delegator
WithdrawRequestBody withdrawRequestBody = new WithdrawRequestBody(); // WithdrawRequestBody | 
try {
    BroadcastTxCommitResult result = apiInstance.withdrawAllRewards(delegatorAddr, withdrawRequestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#withdrawAllRewards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **withdrawRequestBody** | [**WithdrawRequestBody**](WithdrawRequestBody.md)|  | [optional]

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="withdrawAllValidatorRewards"></a>
# **withdrawAllValidatorRewards**
> BroadcastTxCommitResult withdrawAllValidatorRewards(validatorAddr, withdrawRequestBody)

Withdraw the validator&#39;s rewards

Withdraw the validator&#39;s self-delegation and commissions rewards

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String validatorAddr = "coinexvaloper1qwl879nx9t6kef4supyazayf7vjhennyh568ys"; // String | Bech32 OperatorAddress of validator
WithdrawRequestBody3 withdrawRequestBody = new WithdrawRequestBody3(); // WithdrawRequestBody3 | 
try {
    BroadcastTxCommitResult result = apiInstance.withdrawAllValidatorRewards(validatorAddr, withdrawRequestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#withdrawAllValidatorRewards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |
 **withdrawRequestBody** | [**WithdrawRequestBody3**](WithdrawRequestBody3.md)|  | [optional]

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="withdrawRewardsByValidator"></a>
# **withdrawRewardsByValidator**
> BroadcastTxCommitResult withdrawRewardsByValidator(delegatorAddr, validatorAddr, withdrawRequestBody)

Withdraw a delegation reward

Withdraw a delegator&#39;s delegation reward from a single validator

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.DistributionApi;


DistributionApi apiInstance = new DistributionApi();
String delegatorAddr = "coinex167w96tdvmazakdwkw2u57227eduula2cy572lf"; // String | Bech32 AccAddress of Delegator
String validatorAddr = "coinexvaloper1qwl879nx9t6kef4supyazayf7vjhennyh568ys"; // String | Bech32 OperatorAddress of validator
WithdrawRequestBody1 withdrawRequestBody = new WithdrawRequestBody1(); // WithdrawRequestBody1 | 
try {
    BroadcastTxCommitResult result = apiInstance.withdrawRewardsByValidator(delegatorAddr, validatorAddr, withdrawRequestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributionApi#withdrawRewardsByValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegatorAddr** | **String**| Bech32 AccAddress of Delegator |
 **validatorAddr** | **String**| Bech32 OperatorAddress of validator |
 **withdrawRequestBody** | [**WithdrawRequestBody1**](WithdrawRequestBody1.md)|  | [optional]

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


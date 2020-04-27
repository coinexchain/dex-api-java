# GovernanceApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**depositToProposal**](GovernanceApi.md#depositToProposal) | **POST** /gov/proposals/{proposalId}/deposits | Deposit tokens to a proposal
[**getDepositByAddr**](GovernanceApi.md#getDepositByAddr) | **GET** /gov/proposals/{proposalId}/deposits/{depositor} | Query deposit
[**getDepositParameters**](GovernanceApi.md#getDepositParameters) | **GET** /gov/parameters/deposit | Query governance deposit parameters
[**getDeposits**](GovernanceApi.md#getDeposits) | **GET** /gov/proposals/{proposalId}/deposits | Query deposits
[**getProposalByID**](GovernanceApi.md#getProposalByID) | **GET** /gov/proposals/{proposalId} | Query a proposal
[**getProposals**](GovernanceApi.md#getProposals) | **GET** /gov/proposals | Query proposals
[**getProposer**](GovernanceApi.md#getProposer) | **GET** /gov/proposals/{proposalId}/proposer | Query proposer
[**getTally**](GovernanceApi.md#getTally) | **GET** /gov/proposals/{proposalId}/tally | Get a proposal&#39;s tally result at the current time
[**getTallyingParameters**](GovernanceApi.md#getTallyingParameters) | **GET** /gov/parameters/tallying | Query governance tally parameters
[**getVoterByAddr**](GovernanceApi.md#getVoterByAddr) | **GET** /gov/proposals/{proposalId}/votes/{voter} | Query vote
[**getVoters**](GovernanceApi.md#getVoters) | **GET** /gov/proposals/{proposalId}/votes | Query voters
[**getVotingParameters**](GovernanceApi.md#getVotingParameters) | **GET** /gov/parameters/voting | Query governance voting parameters
[**submitCommunityPoolSpendProposal**](GovernanceApi.md#submitCommunityPoolSpendProposal) | **POST** /gov/proposals/community_pool_spend | Generate a community pool spend proposal transaction
[**submitParameterChangeProposal**](GovernanceApi.md#submitParameterChangeProposal) | **POST** /gov/proposals/param_change | Generate a parameter change proposal transaction
[**submitProposal**](GovernanceApi.md#submitProposal) | **POST** /gov/proposals | Submit a proposal
[**voteProposal**](GovernanceApi.md#voteProposal) | **POST** /gov/proposals/{proposalId}/votes | Vote a proposal


<a name="depositToProposal"></a>
# **depositToProposal**
> BroadcastTxCommitResult depositToProposal(proposalId, postDepositBody)

Deposit tokens to a proposal

Send transaction to deposit tokens to a proposal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | proposal id
PostDepositBody postDepositBody = new PostDepositBody(); // PostDepositBody | 
try {
    BroadcastTxCommitResult result = apiInstance.depositToProposal(proposalId, postDepositBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#depositToProposal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**| proposal id |
 **postDepositBody** | [**PostDepositBody**](PostDepositBody.md)|  |

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDepositByAddr"></a>
# **getDepositByAddr**
> InlineResponse20022 getDepositByAddr(proposalId, depositor)

Query deposit

Query deposit by proposalId and depositor address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | proposal id
String depositor = "depositor_example"; // String | Bech32 depositor address
try {
    InlineResponse20022 result = apiInstance.getDepositByAddr(proposalId, depositor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getDepositByAddr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**| proposal id |
 **depositor** | **String**| Bech32 depositor address |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDepositParameters"></a>
# **getDepositParameters**
> InlineResponse20026 getDepositParameters()

Query governance deposit parameters

Query governance deposit parameters. The max_deposit_period units are in nanoseconds.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
try {
    InlineResponse20026 result = apiInstance.getDepositParameters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getDepositParameters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeposits"></a>
# **getDeposits**
> InlineResponse20021 getDeposits(proposalId)

Query deposits

Query deposits by proposalId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | 
try {
    InlineResponse20021 result = apiInstance.getDeposits(proposalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getDeposits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**|  |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProposalByID"></a>
# **getProposalByID**
> InlineResponse20019 getProposalByID(proposalId)

Query a proposal

Query a proposal by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | 
try {
    InlineResponse20019 result = apiInstance.getProposalByID(proposalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getProposalByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**|  |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProposals"></a>
# **getProposals**
> InlineResponse20018 getProposals(voter, depositor, status)

Query proposals

Query proposals information with parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String voter = "voter_example"; // String | voter address
String depositor = "depositor_example"; // String | depositor address
String status = "status_example"; // String | proposal status, valid values can be `\"deposit_period\"`, `\"voting_period\"`, `\"passed\"`, `\"rejected\"`
try {
    InlineResponse20018 result = apiInstance.getProposals(voter, depositor, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getProposals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voter** | **String**| voter address | [optional]
 **depositor** | **String**| depositor address | [optional]
 **status** | **String**| proposal status, valid values can be &#x60;\&quot;deposit_period\&quot;&#x60;, &#x60;\&quot;voting_period\&quot;&#x60;, &#x60;\&quot;passed\&quot;&#x60;, &#x60;\&quot;rejected\&quot;&#x60; | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProposer"></a>
# **getProposer**
> InlineResponse20020 getProposer(proposalId)

Query proposer

Query for the proposer for a proposal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | 
try {
    InlineResponse20020 result = apiInstance.getProposer(proposalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getProposer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**|  |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTally"></a>
# **getTally**
> InlineResponse20025 getTally(proposalId)

Get a proposal&#39;s tally result at the current time

Gets a proposal&#39;s tally result at the current time. If the proposal is pending deposits (i.e status &#39;DepositPeriod&#39;) it returns an empty tally result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | proposal id
try {
    InlineResponse20025 result = apiInstance.getTally(proposalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getTally");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**| proposal id |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTallyingParameters"></a>
# **getTallyingParameters**
> InlineResponse20027 getTallyingParameters()

Query governance tally parameters

Query governance tally parameters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
try {
    InlineResponse20027 result = apiInstance.getTallyingParameters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getTallyingParameters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVoterByAddr"></a>
# **getVoterByAddr**
> InlineResponse20024 getVoterByAddr(proposalId, voter)

Query vote

Query vote information by proposal Id and voter address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | proposal id
String voter = "voter_example"; // String | Bech32 voter address
try {
    InlineResponse20024 result = apiInstance.getVoterByAddr(proposalId, voter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getVoterByAddr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**| proposal id |
 **voter** | **String**| Bech32 voter address |

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVoters"></a>
# **getVoters**
> InlineResponse20023 getVoters(proposalId)

Query voters

Query voters information by proposalId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | proposal id
try {
    InlineResponse20023 result = apiInstance.getVoters(proposalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getVoters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**| proposal id |

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVotingParameters"></a>
# **getVotingParameters**
> InlineResponse20028 getVotingParameters()

Query governance voting parameters

Query governance voting parameters. The voting_period units are in nanoseconds.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
try {
    InlineResponse20028 result = apiInstance.getVotingParameters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#getVotingParameters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitCommunityPoolSpendProposal"></a>
# **submitCommunityPoolSpendProposal**
> StdTx submitCommunityPoolSpendProposal(postProposalBody)

Generate a community pool spend proposal transaction

Generate a community pool spend proposal transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
PostProposalBody2 postProposalBody = new PostProposalBody2(); // PostProposalBody2 | The community pool spend proposal body contains coin amount to be spent
try {
    StdTx result = apiInstance.submitCommunityPoolSpendProposal(postProposalBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#submitCommunityPoolSpendProposal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postProposalBody** | [**PostProposalBody2**](PostProposalBody2.md)| The community pool spend proposal body contains coin amount to be spent |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitParameterChangeProposal"></a>
# **submitParameterChangeProposal**
> StdTx submitParameterChangeProposal(postProposalBody)

Generate a parameter change proposal transaction

Generate a parameter change proposal transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
PostProposalBody1 postProposalBody = new PostProposalBody1(); // PostProposalBody1 | The parameter change proposal body that contains all parameter changes
try {
    StdTx result = apiInstance.submitParameterChangeProposal(postProposalBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#submitParameterChangeProposal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postProposalBody** | [**PostProposalBody1**](PostProposalBody1.md)| The parameter change proposal body that contains all parameter changes |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitProposal"></a>
# **submitProposal**
> StdTx submitProposal(postProposalBody)

Submit a proposal

Send transaction to submit a proposal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
PostProposalBody postProposalBody = new PostProposalBody(); // PostProposalBody | valid value of `\"proposal_type\"` can be `\"text\"`, `\"parameter_change\"`, `\"software_upgrade\"`
try {
    StdTx result = apiInstance.submitProposal(postProposalBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#submitProposal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postProposalBody** | [**PostProposalBody**](PostProposalBody.md)| valid value of &#x60;\&quot;proposal_type\&quot;&#x60; can be &#x60;\&quot;text\&quot;&#x60;, &#x60;\&quot;parameter_change\&quot;&#x60;, &#x60;\&quot;software_upgrade\&quot;&#x60; |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="voteProposal"></a>
# **voteProposal**
> BroadcastTxCommitResult voteProposal(proposalId, postVoteBody)

Vote a proposal

Send transaction to vote a proposal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GovernanceApi;


GovernanceApi apiInstance = new GovernanceApi();
String proposalId = "proposalId_example"; // String | proposal id
PostVoteBody postVoteBody = new PostVoteBody(); // PostVoteBody | valid value of `\"option\"` field can be `\"yes\"`, `\"no\"`, `\"no_with_veto\"` and `\"abstain\"`
try {
    BroadcastTxCommitResult result = apiInstance.voteProposal(proposalId, postVoteBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GovernanceApi#voteProposal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proposalId** | **String**| proposal id |
 **postVoteBody** | [**PostVoteBody**](PostVoteBody.md)| valid value of &#x60;\&quot;option\&quot;&#x60; field can be &#x60;\&quot;yes\&quot;&#x60;, &#x60;\&quot;no\&quot;&#x60;, &#x60;\&quot;no_with_veto\&quot;&#x60; and &#x60;\&quot;abstain\&quot;&#x60; |

### Return type

[**BroadcastTxCommitResult**](BroadcastTxCommitResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


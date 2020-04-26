# CommentApi

All URIs are relative to *https://dex-api.coinex.org/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**followupComment**](CommentApi.md#followupComment) | **POST** /comment/followup-comment | Post a follow-up comment under some thread
[**newThread**](CommentApi.md#newThread) | **POST** /comment/new-thread | Post a new comment to open a new thread
[**rewardComments**](CommentApi.md#rewardComments) | **POST** /comment/reward-comments | reward some comments with coins

<a name="followupComment"></a>
# **followupComment**
> StdTx followupComment(body)

Post a follow-up comment under some thread

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Object body = null; // Object | Post a follow-up comment
try {
    StdTx result = apiInstance.followupComment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#followupComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Post a follow-up comment |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newThread"></a>
# **newThread**
> StdTx newThread(body)

Post a new comment to open a new thread

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Object body = null; // Object | open a new thread
try {
    StdTx result = apiInstance.newThread(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#newThread");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| open a new thread |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rewardComments"></a>
# **rewardComments**
> StdTx rewardComments(body)

reward some comments with coins

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Object body = null; // Object | reward some comments
try {
    StdTx result = apiInstance.rewardComments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#rewardComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| reward some comments |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


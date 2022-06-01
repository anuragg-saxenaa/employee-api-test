# EmployeesApi

All URIs are relative to *https://anurag.saxena.ca/ext/api/v2/employees*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeesEmployeeIdGet**](EmployeesApi.md#employeesEmployeeIdGet) | **GET** /employees/{employee_id} | Get employee by ID
[**employeesEmployeeIdPut**](EmployeesApi.md#employeesEmployeeIdPut) | **PUT** /employees/{employee_id} | Create/Modify employee
[**employeesGet**](EmployeesApi.md#employeesGet) | **GET** /employees/ | Get all employees


<a name="employeesEmployeeIdGet"></a>
# **employeesEmployeeIdGet**
> EmployeeDetails employeesEmployeeIdGet(employeeId)

Get employee by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeesApi;


EmployeesApi apiInstance = new EmployeesApi();
String employeeId = "employeeId_example"; // String | get employee by ID
try {
    EmployeeDetails result = apiInstance.employeesEmployeeIdGet(employeeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeesApi#employeesEmployeeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeId** | **String**| get employee by ID |

### Return type

[**EmployeeDetails**](EmployeeDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="employeesEmployeeIdPut"></a>
# **employeesEmployeeIdPut**
> SuccessResponse employeesEmployeeIdPut(employeeId, body)

Create/Modify employee

Create/Modify employee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeesApi;


EmployeesApi apiInstance = new EmployeesApi();
String employeeId = "employeeId_example"; // String | get employee by ID
EmployeeUpdate body = new EmployeeUpdate(); // EmployeeUpdate | Object with fields to be updated
try {
    SuccessResponse result = apiInstance.employeesEmployeeIdPut(employeeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeesApi#employeesEmployeeIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeId** | **String**| get employee by ID |
 **body** | [**EmployeeUpdate**](EmployeeUpdate.md)| Object with fields to be updated | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="employeesGet"></a>
# **employeesGet**
> EmployeeDetails employeesGet()

Get all employees

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeesApi;


EmployeesApi apiInstance = new EmployeesApi();
try {
    EmployeeDetails result = apiInstance.employeesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeesApi#employeesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EmployeeDetails**](EmployeeDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


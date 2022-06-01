/*
 * Employee API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.EmployeeDetails;
import io.swagger.client.model.EmployeeUpdate;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.SuccessResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesApi {
    private ApiClient apiClient;

    public EmployeesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmployeesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for employeesEmployeeIdGet
     * @param employeeId get employee by ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call employeesEmployeeIdGetCall(String employeeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/employees/{employee_id}"
            .replaceAll("\\{" + "employee_id" + "\\}", apiClient.escapeString(employeeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call employeesEmployeeIdGetValidateBeforeCall(String employeeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling employeesEmployeeIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = employeesEmployeeIdGetCall(employeeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get employee by ID
     * 
     * @param employeeId get employee by ID (required)
     * @return EmployeeDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmployeeDetails employeesEmployeeIdGet(String employeeId) throws ApiException {
        ApiResponse<EmployeeDetails> resp = employeesEmployeeIdGetWithHttpInfo(employeeId);
        return resp.getData();
    }

    /**
     * Get employee by ID
     * 
     * @param employeeId get employee by ID (required)
     * @return ApiResponse&lt;EmployeeDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmployeeDetails> employeesEmployeeIdGetWithHttpInfo(String employeeId) throws ApiException {
        com.squareup.okhttp.Call call = employeesEmployeeIdGetValidateBeforeCall(employeeId, null, null);
        Type localVarReturnType = new TypeToken<EmployeeDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get employee by ID (asynchronously)
     * 
     * @param employeeId get employee by ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call employeesEmployeeIdGetAsync(String employeeId, final ApiCallback<EmployeeDetails> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = employeesEmployeeIdGetValidateBeforeCall(employeeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmployeeDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for employeesEmployeeIdPut
     * @param employeeId get employee by ID (required)
     * @param body Object with fields to be updated (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call employeesEmployeeIdPutCall(String employeeId, EmployeeUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/employees/{employee_id}"
            .replaceAll("\\{" + "employee_id" + "\\}", apiClient.escapeString(employeeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call employeesEmployeeIdPutValidateBeforeCall(String employeeId, EmployeeUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling employeesEmployeeIdPut(Async)");
        }
        

        com.squareup.okhttp.Call call = employeesEmployeeIdPutCall(employeeId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create/Modify employee
     * Create/Modify employee
     * @param employeeId get employee by ID (required)
     * @param body Object with fields to be updated (optional)
     * @return SuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SuccessResponse employeesEmployeeIdPut(String employeeId, EmployeeUpdate body) throws ApiException {
        ApiResponse<SuccessResponse> resp = employeesEmployeeIdPutWithHttpInfo(employeeId, body);
        return resp.getData();
    }

    /**
     * Create/Modify employee
     * Create/Modify employee
     * @param employeeId get employee by ID (required)
     * @param body Object with fields to be updated (optional)
     * @return ApiResponse&lt;SuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SuccessResponse> employeesEmployeeIdPutWithHttpInfo(String employeeId, EmployeeUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = employeesEmployeeIdPutValidateBeforeCall(employeeId, body, null, null);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create/Modify employee (asynchronously)
     * Create/Modify employee
     * @param employeeId get employee by ID (required)
     * @param body Object with fields to be updated (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call employeesEmployeeIdPutAsync(String employeeId, EmployeeUpdate body, final ApiCallback<SuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = employeesEmployeeIdPutValidateBeforeCall(employeeId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for employeesGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call employeesGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/employees/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call employeesGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = employeesGetCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all employees
     * 
     * @return EmployeeDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmployeeDetails employeesGet() throws ApiException {
        ApiResponse<EmployeeDetails> resp = employeesGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get all employees
     * 
     * @return ApiResponse&lt;EmployeeDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmployeeDetails> employeesGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = employeesGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<EmployeeDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all employees (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call employeesGetAsync(final ApiCallback<EmployeeDetails> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = employeesGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmployeeDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 0.8.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiCallback;
import net.troja.eve.esi.ApiClient;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.ApiResponse;
import net.troja.eve.esi.Configuration;
import net.troja.eve.esi.Pair;
import net.troja.eve.esi.ProgressRequestBody;
import net.troja.eve.esi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import net.troja.eve.esi.model.IncursionsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IncursionsApi {
    private ApiClient localVarApiClient;

    public IncursionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IncursionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getIncursions
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getIncursionsCall(String datasource, String ifNoneMatch, final ApiCallback _callback)
            throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/incursions/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", localVarApiClient.parameterToString(ifNoneMatch));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getIncursionsValidateBeforeCall(String datasource, String ifNoneMatch,
            final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = getIncursionsCall(datasource, ifNoneMatch, _callback);
        return localVarCall;

    }

    /**
     * List incursions Return a list of current incursions --- This route is
     * cached for up to 300 seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;IncursionsResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<IncursionsResponse> getIncursions(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<IncursionsResponse>> localVarResp = getIncursionsWithHttpInfo(datasource, ifNoneMatch);
        return localVarResp.getData();
    }

    /**
     * List incursions Return a list of current incursions --- This route is
     * cached for up to 300 seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;IncursionsResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<IncursionsResponse>> getIncursionsWithHttpInfo(String datasource, String ifNoneMatch)
            throws ApiException {
        okhttp3.Call localVarCall = getIncursionsValidateBeforeCall(datasource, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<List<IncursionsResponse>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List incursions (asynchronously) Return a list of current incursions ---
     * This route is cached for up to 300 seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getIncursionsAsync(String datasource, String ifNoneMatch,
            final ApiCallback<List<IncursionsResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIncursionsValidateBeforeCall(datasource, ifNoneMatch, _callback);
        Type localVarReturnType = new TypeToken<List<IncursionsResponse>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

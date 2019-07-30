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

import net.troja.eve.esi.model.UiNewMail;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInterfaceApi {
    private ApiClient localVarApiClient;

    public UserInterfaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserInterfaceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for postUiAutopilotWaypoint
     * 
     * @param addToBeginning
     *            Whether this solar system should be added to the beginning of
     *            all waypoints (required)
     * @param clearOtherWaypoints
     *            Whether clean other waypoints beforing adding this one
     *            (required)
     * @param destinationId
     *            The destination to travel to, can be solar system, station or
     *            structure&#39;s id (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call postUiAutopilotWaypointCall(Boolean addToBeginning, Boolean clearOtherWaypoints,
            Long destinationId, String datasource, String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v2/ui/autopilot/waypoint/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (addToBeginning != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("add_to_beginning", addToBeginning));
        }

        if (clearOtherWaypoints != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("clear_other_waypoints", clearOtherWaypoints));
        }

        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (destinationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("destination_id", destinationId));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postUiAutopilotWaypointValidateBeforeCall(Boolean addToBeginning, Boolean clearOtherWaypoints,
            Long destinationId, String datasource, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'addToBeginning' is set
        if (addToBeginning == null) {
            throw new ApiException(
                    "Missing the required parameter 'addToBeginning' when calling postUiAutopilotWaypoint(Async)");
        }

        // verify the required parameter 'clearOtherWaypoints' is set
        if (clearOtherWaypoints == null) {
            throw new ApiException(
                    "Missing the required parameter 'clearOtherWaypoints' when calling postUiAutopilotWaypoint(Async)");
        }

        // verify the required parameter 'destinationId' is set
        if (destinationId == null) {
            throw new ApiException(
                    "Missing the required parameter 'destinationId' when calling postUiAutopilotWaypoint(Async)");
        }

        okhttp3.Call localVarCall = postUiAutopilotWaypointCall(addToBeginning, clearOtherWaypoints, destinationId,
                datasource, token, _callback);
        return localVarCall;

    }

    /**
     * Set Autopilot Waypoint Set a solar system as autopilot waypoint --- SSO
     * Scope: esi-ui.write_waypoint.v1
     * 
     * @param addToBeginning
     *            Whether this solar system should be added to the beginning of
     *            all waypoints (required)
     * @param clearOtherWaypoints
     *            Whether clean other waypoints beforing adding this one
     *            (required)
     * @param destinationId
     *            The destination to travel to, can be solar system, station or
     *            structure&#39;s id (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiAutopilotWaypoint(Boolean addToBeginning, Boolean clearOtherWaypoints, Long destinationId,
            String datasource, String token) throws ApiException {
        postUiAutopilotWaypointWithHttpInfo(addToBeginning, clearOtherWaypoints, destinationId, datasource, token);
    }

    /**
     * Set Autopilot Waypoint Set a solar system as autopilot waypoint --- SSO
     * Scope: esi-ui.write_waypoint.v1
     * 
     * @param addToBeginning
     *            Whether this solar system should be added to the beginning of
     *            all waypoints (required)
     * @param clearOtherWaypoints
     *            Whether clean other waypoints beforing adding this one
     *            (required)
     * @param destinationId
     *            The destination to travel to, can be solar system, station or
     *            structure&#39;s id (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiAutopilotWaypointWithHttpInfo(Boolean addToBeginning, Boolean clearOtherWaypoints,
            Long destinationId, String datasource, String token) throws ApiException {
        okhttp3.Call localVarCall = postUiAutopilotWaypointValidateBeforeCall(addToBeginning, clearOtherWaypoints,
                destinationId, datasource, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Set Autopilot Waypoint (asynchronously) Set a solar system as autopilot
     * waypoint --- SSO Scope: esi-ui.write_waypoint.v1
     * 
     * @param addToBeginning
     *            Whether this solar system should be added to the beginning of
     *            all waypoints (required)
     * @param clearOtherWaypoints
     *            Whether clean other waypoints beforing adding this one
     *            (required)
     * @param destinationId
     *            The destination to travel to, can be solar system, station or
     *            structure&#39;s id (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call postUiAutopilotWaypointAsync(Boolean addToBeginning, Boolean clearOtherWaypoints,
            Long destinationId, String datasource, String token, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = postUiAutopilotWaypointValidateBeforeCall(addToBeginning, clearOtherWaypoints,
                destinationId, datasource, token, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for postUiOpenwindowContract
     * 
     * @param contractId
     *            The contract to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call postUiOpenwindowContractCall(Integer contractId, String datasource, String token,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/ui/openwindow/contract/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (contractId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("contract_id", contractId));
        }

        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postUiOpenwindowContractValidateBeforeCall(Integer contractId, String datasource,
            String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new ApiException(
                    "Missing the required parameter 'contractId' when calling postUiOpenwindowContract(Async)");
        }

        okhttp3.Call localVarCall = postUiOpenwindowContractCall(contractId, datasource, token, _callback);
        return localVarCall;

    }

    /**
     * Open Contract Window Open the contract window inside the client --- SSO
     * Scope: esi-ui.open_window.v1
     * 
     * @param contractId
     *            The contract to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiOpenwindowContract(Integer contractId, String datasource, String token) throws ApiException {
        postUiOpenwindowContractWithHttpInfo(contractId, datasource, token);
    }

    /**
     * Open Contract Window Open the contract window inside the client --- SSO
     * Scope: esi-ui.open_window.v1
     * 
     * @param contractId
     *            The contract to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowContractWithHttpInfo(Integer contractId, String datasource, String token)
            throws ApiException {
        okhttp3.Call localVarCall = postUiOpenwindowContractValidateBeforeCall(contractId, datasource, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Open Contract Window (asynchronously) Open the contract window inside the
     * client --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param contractId
     *            The contract to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call postUiOpenwindowContractAsync(Integer contractId, String datasource, String token,
            final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = postUiOpenwindowContractValidateBeforeCall(contractId, datasource, token, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for postUiOpenwindowInformation
     * 
     * @param targetId
     *            The target to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call postUiOpenwindowInformationCall(Integer targetId, String datasource, String token,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/ui/openwindow/information/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (targetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_id", targetId));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postUiOpenwindowInformationValidateBeforeCall(Integer targetId, String datasource,
            String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new ApiException(
                    "Missing the required parameter 'targetId' when calling postUiOpenwindowInformation(Async)");
        }

        okhttp3.Call localVarCall = postUiOpenwindowInformationCall(targetId, datasource, token, _callback);
        return localVarCall;

    }

    /**
     * Open Information Window Open the information window for a character,
     * corporation or alliance inside the client --- SSO Scope:
     * esi-ui.open_window.v1
     * 
     * @param targetId
     *            The target to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiOpenwindowInformation(Integer targetId, String datasource, String token) throws ApiException {
        postUiOpenwindowInformationWithHttpInfo(targetId, datasource, token);
    }

    /**
     * Open Information Window Open the information window for a character,
     * corporation or alliance inside the client --- SSO Scope:
     * esi-ui.open_window.v1
     * 
     * @param targetId
     *            The target to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowInformationWithHttpInfo(Integer targetId, String datasource, String token)
            throws ApiException {
        okhttp3.Call localVarCall = postUiOpenwindowInformationValidateBeforeCall(targetId, datasource, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Open Information Window (asynchronously) Open the information window for
     * a character, corporation or alliance inside the client --- SSO Scope:
     * esi-ui.open_window.v1
     * 
     * @param targetId
     *            The target to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call postUiOpenwindowInformationAsync(Integer targetId, String datasource, String token,
            final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = postUiOpenwindowInformationValidateBeforeCall(targetId, datasource, token,
                _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for postUiOpenwindowMarketdetails
     * 
     * @param typeId
     *            The item type to open in market window (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call postUiOpenwindowMarketdetailsCall(Integer typeId, String datasource, String token,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/ui/openwindow/marketdetails/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (typeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type_id", typeId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postUiOpenwindowMarketdetailsValidateBeforeCall(Integer typeId, String datasource,
            String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new ApiException(
                    "Missing the required parameter 'typeId' when calling postUiOpenwindowMarketdetails(Async)");
        }

        okhttp3.Call localVarCall = postUiOpenwindowMarketdetailsCall(typeId, datasource, token, _callback);
        return localVarCall;

    }

    /**
     * Open Market Details Open the market details window for a specific typeID
     * inside the client --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param typeId
     *            The item type to open in market window (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiOpenwindowMarketdetails(Integer typeId, String datasource, String token) throws ApiException {
        postUiOpenwindowMarketdetailsWithHttpInfo(typeId, datasource, token);
    }

    /**
     * Open Market Details Open the market details window for a specific typeID
     * inside the client --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param typeId
     *            The item type to open in market window (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowMarketdetailsWithHttpInfo(Integer typeId, String datasource, String token)
            throws ApiException {
        okhttp3.Call localVarCall = postUiOpenwindowMarketdetailsValidateBeforeCall(typeId, datasource, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Open Market Details (asynchronously) Open the market details window for a
     * specific typeID inside the client --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param typeId
     *            The item type to open in market window (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call postUiOpenwindowMarketdetailsAsync(Integer typeId, String datasource, String token,
            final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = postUiOpenwindowMarketdetailsValidateBeforeCall(typeId, datasource, token,
                _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for postUiOpenwindowNewmail
     * 
     * @param newMail
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call postUiOpenwindowNewmailCall(UiNewMail newMail, String datasource, String token,
            final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = newMail;

        // create path and map variables
        String localVarPath = "/v1/ui/openwindow/newmail/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {

        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postUiOpenwindowNewmailValidateBeforeCall(UiNewMail newMail, String datasource, String token,
            final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'newMail' is set
        if (newMail == null) {
            throw new ApiException(
                    "Missing the required parameter 'newMail' when calling postUiOpenwindowNewmail(Async)");
        }

        okhttp3.Call localVarCall = postUiOpenwindowNewmailCall(newMail, datasource, token, _callback);
        return localVarCall;

    }

    /**
     * Open New Mail Window Open the New Mail window, according to settings from
     * the request if applicable --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param newMail
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiOpenwindowNewmail(UiNewMail newMail, String datasource, String token) throws ApiException {
        postUiOpenwindowNewmailWithHttpInfo(newMail, datasource, token);
    }

    /**
     * Open New Mail Window Open the New Mail window, according to settings from
     * the request if applicable --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param newMail
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowNewmailWithHttpInfo(UiNewMail newMail, String datasource, String token)
            throws ApiException {
        okhttp3.Call localVarCall = postUiOpenwindowNewmailValidateBeforeCall(newMail, datasource, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Open New Mail Window (asynchronously) Open the New Mail window, according
     * to settings from the request if applicable --- SSO Scope:
     * esi-ui.open_window.v1
     * 
     * @param newMail
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call postUiOpenwindowNewmailAsync(UiNewMail newMail, String datasource, String token,
            final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = postUiOpenwindowNewmailValidateBeforeCall(newMail, datasource, token, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

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

import net.troja.eve.esi.model.CharacterLocationResponse;
import net.troja.eve.esi.model.CharacterOnlineResponse;
import net.troja.eve.esi.model.CharacterShipResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationApi {
    private ApiClient localVarApiClient;

    public LocationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LocationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdLocation
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getCharactersCharacterIdLocationCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/location/".replaceAll("\\{" + "character_id" + "\\}",
                localVarApiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
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

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharactersCharacterIdLocationValidateBeforeCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdLocation(Async)");
        }

        okhttp3.Call localVarCall = getCharactersCharacterIdLocationCall(characterId, datasource, ifNoneMatch, token,
                _callback);
        return localVarCall;

    }

    /**
     * Get character location Information about the characters current location.
     * Returns the current solar system id, and also the current station or
     * structure ID if applicable --- This route is cached for up to 5 seconds
     * SSO Scope: esi-location.read_location.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return CharacterLocationResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public CharacterLocationResponse getCharactersCharacterIdLocation(Integer characterId, String datasource,
            String ifNoneMatch, String token) throws ApiException {
        ApiResponse<CharacterLocationResponse> localVarResp = getCharactersCharacterIdLocationWithHttpInfo(characterId,
                datasource, ifNoneMatch, token);
        return localVarResp.getData();
    }

    /**
     * Get character location Information about the characters current location.
     * Returns the current solar system id, and also the current station or
     * structure ID if applicable --- This route is cached for up to 5 seconds
     * SSO Scope: esi-location.read_location.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;CharacterLocationResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<CharacterLocationResponse> getCharactersCharacterIdLocationWithHttpInfo(Integer characterId,
            String datasource, String ifNoneMatch, String token) throws ApiException {
        okhttp3.Call localVarCall = getCharactersCharacterIdLocationValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<CharacterLocationResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get character location (asynchronously) Information about the characters
     * current location. Returns the current solar system id, and also the
     * current station or structure ID if applicable --- This route is cached
     * for up to 5 seconds SSO Scope: esi-location.read_location.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getCharactersCharacterIdLocationAsync(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback<CharacterLocationResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getCharactersCharacterIdLocationValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, _callback);
        Type localVarReturnType = new TypeToken<CharacterLocationResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getCharactersCharacterIdOnline
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getCharactersCharacterIdOnlineCall(Integer characterId, String datasource, String ifNoneMatch,
            String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v2/characters/{character_id}/online/".replaceAll("\\{" + "character_id" + "\\}",
                localVarApiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
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

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharactersCharacterIdOnlineValidateBeforeCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdOnline(Async)");
        }

        okhttp3.Call localVarCall = getCharactersCharacterIdOnlineCall(characterId, datasource, ifNoneMatch, token,
                _callback);
        return localVarCall;

    }

    /**
     * Get character online Checks if the character is currently online --- This
     * route is cached for up to 60 seconds SSO Scope:
     * esi-location.read_online.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return CharacterOnlineResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public CharacterOnlineResponse getCharactersCharacterIdOnline(Integer characterId, String datasource,
            String ifNoneMatch, String token) throws ApiException {
        ApiResponse<CharacterOnlineResponse> localVarResp = getCharactersCharacterIdOnlineWithHttpInfo(characterId,
                datasource, ifNoneMatch, token);
        return localVarResp.getData();
    }

    /**
     * Get character online Checks if the character is currently online --- This
     * route is cached for up to 60 seconds SSO Scope:
     * esi-location.read_online.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;CharacterOnlineResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<CharacterOnlineResponse> getCharactersCharacterIdOnlineWithHttpInfo(Integer characterId,
            String datasource, String ifNoneMatch, String token) throws ApiException {
        okhttp3.Call localVarCall = getCharactersCharacterIdOnlineValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<CharacterOnlineResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get character online (asynchronously) Checks if the character is
     * currently online --- This route is cached for up to 60 seconds SSO Scope:
     * esi-location.read_online.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getCharactersCharacterIdOnlineAsync(Integer characterId, String datasource, String ifNoneMatch,
            String token, final ApiCallback<CharacterOnlineResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCharactersCharacterIdOnlineValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, _callback);
        Type localVarReturnType = new TypeToken<CharacterOnlineResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getCharactersCharacterIdShip
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public okhttp3.Call getCharactersCharacterIdShipCall(Integer characterId, String datasource, String ifNoneMatch,
            String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/ship/".replaceAll("\\{" + "character_id" + "\\}",
                localVarApiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
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

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharactersCharacterIdShipValidateBeforeCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdShip(Async)");
        }

        okhttp3.Call localVarCall = getCharactersCharacterIdShipCall(characterId, datasource, ifNoneMatch, token,
                _callback);
        return localVarCall;

    }

    /**
     * Get current ship Get the current ship type, name and id --- This route is
     * cached for up to 5 seconds SSO Scope: esi-location.read_ship_type.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return CharacterShipResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public CharacterShipResponse getCharactersCharacterIdShip(Integer characterId, String datasource,
            String ifNoneMatch, String token) throws ApiException {
        ApiResponse<CharacterShipResponse> localVarResp = getCharactersCharacterIdShipWithHttpInfo(characterId,
                datasource, ifNoneMatch, token);
        return localVarResp.getData();
    }

    /**
     * Get current ship Get the current ship type, name and id --- This route is
     * cached for up to 5 seconds SSO Scope: esi-location.read_ship_type.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;CharacterShipResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<CharacterShipResponse> getCharactersCharacterIdShipWithHttpInfo(Integer characterId,
            String datasource, String ifNoneMatch, String token) throws ApiException {
        okhttp3.Call localVarCall = getCharactersCharacterIdShipValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<CharacterShipResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get current ship (asynchronously) Get the current ship type, name and id
     * --- This route is cached for up to 5 seconds SSO Scope:
     * esi-location.read_ship_type.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public okhttp3.Call getCharactersCharacterIdShipAsync(Integer characterId, String datasource, String ifNoneMatch,
            String token, final ApiCallback<CharacterShipResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCharactersCharacterIdShipValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, _callback);
        Type localVarReturnType = new TypeToken<CharacterShipResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

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

import net.troja.eve.esi.model.CharacterFitting;
import net.troja.eve.esi.model.CharacterFittingResponse;
import net.troja.eve.esi.model.CharacterFittingsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FittingsApi {
    private ApiClient localVarApiClient;

    public FittingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FittingsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteCharactersCharacterIdFittingsFittingId
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param fittingId
     *            ID for a fitting of this character (required)
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
    public okhttp3.Call deleteCharactersCharacterIdFittingsFittingIdCall(Integer characterId, Integer fittingId,
            String datasource, String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/fittings/{fitting_id}/".replaceAll(
                "\\{" + "character_id" + "\\}", localVarApiClient.escapeString(characterId.toString())).replaceAll(
                "\\{" + "fitting_id" + "\\}", localVarApiClient.escapeString(fittingId.toString()));

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

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCharactersCharacterIdFittingsFittingIdValidateBeforeCall(Integer characterId,
            Integer fittingId, String datasource, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling deleteCharactersCharacterIdFittingsFittingId(Async)");
        }

        // verify the required parameter 'fittingId' is set
        if (fittingId == null) {
            throw new ApiException(
                    "Missing the required parameter 'fittingId' when calling deleteCharactersCharacterIdFittingsFittingId(Async)");
        }

        okhttp3.Call localVarCall = deleteCharactersCharacterIdFittingsFittingIdCall(characterId, fittingId,
                datasource, token, _callback);
        return localVarCall;

    }

    /**
     * Delete fitting Delete a fitting from a character --- SSO Scope:
     * esi-fittings.write_fittings.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param fittingId
     *            ID for a fitting of this character (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void deleteCharactersCharacterIdFittingsFittingId(Integer characterId, Integer fittingId, String datasource,
            String token) throws ApiException {
        deleteCharactersCharacterIdFittingsFittingIdWithHttpInfo(characterId, fittingId, datasource, token);
    }

    /**
     * Delete fitting Delete a fitting from a character --- SSO Scope:
     * esi-fittings.write_fittings.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param fittingId
     *            ID for a fitting of this character (required)
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
    public ApiResponse<Void> deleteCharactersCharacterIdFittingsFittingIdWithHttpInfo(Integer characterId,
            Integer fittingId, String datasource, String token) throws ApiException {
        okhttp3.Call localVarCall = deleteCharactersCharacterIdFittingsFittingIdValidateBeforeCall(characterId,
                fittingId, datasource, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete fitting (asynchronously) Delete a fitting from a character --- SSO
     * Scope: esi-fittings.write_fittings.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param fittingId
     *            ID for a fitting of this character (required)
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
    public okhttp3.Call deleteCharactersCharacterIdFittingsFittingIdAsync(Integer characterId, Integer fittingId,
            String datasource, String token, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCharactersCharacterIdFittingsFittingIdValidateBeforeCall(characterId,
                fittingId, datasource, token, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for getCharactersCharacterIdFittings
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
    public okhttp3.Call getCharactersCharacterIdFittingsCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v2/characters/{character_id}/fittings/".replaceAll("\\{" + "character_id" + "\\}",
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
    private okhttp3.Call getCharactersCharacterIdFittingsValidateBeforeCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdFittings(Async)");
        }

        okhttp3.Call localVarCall = getCharactersCharacterIdFittingsCall(characterId, datasource, ifNoneMatch, token,
                _callback);
        return localVarCall;

    }

    /**
     * Get fittings Return fittings of a character --- This route is cached for
     * up to 300 seconds SSO Scope: esi-fittings.read_fittings.v1
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
     * @return List&lt;CharacterFittingsResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<CharacterFittingsResponse> getCharactersCharacterIdFittings(Integer characterId, String datasource,
            String ifNoneMatch, String token) throws ApiException {
        ApiResponse<List<CharacterFittingsResponse>> localVarResp = getCharactersCharacterIdFittingsWithHttpInfo(
                characterId, datasource, ifNoneMatch, token);
        return localVarResp.getData();
    }

    /**
     * Get fittings Return fittings of a character --- This route is cached for
     * up to 300 seconds SSO Scope: esi-fittings.read_fittings.v1
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
     * @return ApiResponse&lt;List&lt;CharacterFittingsResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<CharacterFittingsResponse>> getCharactersCharacterIdFittingsWithHttpInfo(
            Integer characterId, String datasource, String ifNoneMatch, String token) throws ApiException {
        okhttp3.Call localVarCall = getCharactersCharacterIdFittingsValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<List<CharacterFittingsResponse>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get fittings (asynchronously) Return fittings of a character --- This
     * route is cached for up to 300 seconds SSO Scope:
     * esi-fittings.read_fittings.v1
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
    public okhttp3.Call getCharactersCharacterIdFittingsAsync(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback<List<CharacterFittingsResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getCharactersCharacterIdFittingsValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, _callback);
        Type localVarReturnType = new TypeToken<List<CharacterFittingsResponse>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for postCharactersCharacterIdFittings
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param fitting
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
    public okhttp3.Call postCharactersCharacterIdFittingsCall(Integer characterId, CharacterFitting fitting,
            String datasource, String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = fitting;

        // create path and map variables
        String localVarPath = "/v2/characters/{character_id}/fittings/".replaceAll("\\{" + "character_id" + "\\}",
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
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
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
    private okhttp3.Call postCharactersCharacterIdFittingsValidateBeforeCall(Integer characterId,
            CharacterFitting fitting, String datasource, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling postCharactersCharacterIdFittings(Async)");
        }

        // verify the required parameter 'fitting' is set
        if (fitting == null) {
            throw new ApiException(
                    "Missing the required parameter 'fitting' when calling postCharactersCharacterIdFittings(Async)");
        }

        okhttp3.Call localVarCall = postCharactersCharacterIdFittingsCall(characterId, fitting, datasource, token,
                _callback);
        return localVarCall;

    }

    /**
     * Create fitting Save a new fitting for a character --- SSO Scope:
     * esi-fittings.write_fittings.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param fitting
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return CharacterFittingResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public CharacterFittingResponse postCharactersCharacterIdFittings(Integer characterId, CharacterFitting fitting,
            String datasource, String token) throws ApiException {
        ApiResponse<CharacterFittingResponse> localVarResp = postCharactersCharacterIdFittingsWithHttpInfo(characterId,
                fitting, datasource, token);
        return localVarResp.getData();
    }

    /**
     * Create fitting Save a new fitting for a character --- SSO Scope:
     * esi-fittings.write_fittings.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param fitting
     *            (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;CharacterFittingResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<CharacterFittingResponse> postCharactersCharacterIdFittingsWithHttpInfo(Integer characterId,
            CharacterFitting fitting, String datasource, String token) throws ApiException {
        okhttp3.Call localVarCall = postCharactersCharacterIdFittingsValidateBeforeCall(characterId, fitting,
                datasource, token, null);
        Type localVarReturnType = new TypeToken<CharacterFittingResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create fitting (asynchronously) Save a new fitting for a character ---
     * SSO Scope: esi-fittings.write_fittings.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param fitting
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
    public okhttp3.Call postCharactersCharacterIdFittingsAsync(Integer characterId, CharacterFitting fitting,
            String datasource, String token, final ApiCallback<CharacterFittingResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postCharactersCharacterIdFittingsValidateBeforeCall(characterId, fitting,
                datasource, token, _callback);
        Type localVarReturnType = new TypeToken<CharacterFittingResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

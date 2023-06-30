/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import net.troja.eve.esi.ApiException;

/**
 * API tests for RoutesApi
 */
public class RoutesApiTest extends GeneralApiTest {

    private final RoutesApi api = new RoutesApi();

    /**
     * Get route
     *
     * Get the systems between origin and destination  ---  This route is cached for up to 86400 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getRouteOriginDestinationTest() throws ApiException {

        final Set<Integer> avoid = null;
        final Set<Set<Integer>> connections = null;

        final List<Integer> response = api.getRouteOriginDestination(SOLARSYSTEM_ID_ALIKARA, SOLARSYSTEM_ID_JITA, avoid, connections, DATASOURCE, null, null);

        assertThat(response.size(), equalTo(3));
    }

}

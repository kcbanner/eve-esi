/**
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

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterClonesResponse;

/**
 * API tests for ClonesApi
 */
public class ClonesApiTest extends GeneralApiTest {

    private ClonesApi api;

    /**
     * Get clones
     *
     * A list of the character&#39;s clones --- Alternate route:
     * &#x60;/v2/characters/{character_id}/clones/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/clones/&#x60; --- This route is
     * cached for up to 120 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdClonesTest() throws ApiException {
        api = new ClonesApi(apiClient);

        final CharacterClonesResponse response = api.getCharactersCharacterIdClones(characterId, DATASOURCE, null, null,
                null);

        assertThat(response, notNullValue());
        assertThat(response.getJumpClones().size(), greaterThan(0));
    }

}

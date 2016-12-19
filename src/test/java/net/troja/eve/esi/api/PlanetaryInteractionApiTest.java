/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.2.dev3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterPlanetResponse;
import net.troja.eve.esi.model.CharacterPlanetsResponse;
import net.troja.eve.esi.model.PlanetFactorySchematicResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlanetaryInteractionApi
 */
public class PlanetaryInteractionApiTest {

    private final PlanetaryInteractionApi api = new PlanetaryInteractionApi();

    
    /**
     * Get colonies
     *
     * Returns a list of all planetary colonies owned by a character.  ---  Alternate route: &#x60;/v1/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/planets/&#x60;   ---  This route is cached for up to 600 seconds  SSO Scope: esi-planets.manage_planets.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPlanetsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // List<CharacterPlanetsResponse> response = api.getCharactersCharacterIdPlanets(characterId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get colony layout
     *
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information on this endpoint will not update until this criteria is met.  ---  Alternate route: &#x60;/v1/characters/{character_id}/planets/{planet_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/planets/{planet_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/planets/{planet_id}/&#x60;   ---  This route is cached for up to 600 seconds  SSO Scope: esi-planets.manage_planets.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPlanetsPlanetIdTest() throws ApiException {
        Integer characterId = null;
        Integer planetId = null;
        String datasource = null;
        // CharacterPlanetResponse response = api.getCharactersCharacterIdPlanetsPlanetId(characterId, planetId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get schematic information
     *
     * Get information on a planetary factory schematic  ---  Alternate route: &#x60;/v1/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/legacy/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/dev/universe/schematics/{schematic_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseSchematicsSchematicIdTest() throws ApiException {
        Integer schematicId = null;
        String datasource = null;
        // PlanetFactorySchematicResponse response = api.getUniverseSchematicsSchematicId(schematicId, datasource);

        // TODO: test validations
    }
    
}

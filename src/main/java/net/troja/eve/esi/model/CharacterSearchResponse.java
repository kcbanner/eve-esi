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

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterSearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AGENT = "agent";
    @SerializedName(SERIALIZED_NAME_AGENT)
    private List<Integer> agent = new ArrayList<>();

    public static final String SERIALIZED_NAME_CHARACTER = "character";
    @SerializedName(SERIALIZED_NAME_CHARACTER)
    private List<Integer> character = new ArrayList<>();

    public static final String SERIALIZED_NAME_ALLIANCE = "alliance";
    @SerializedName(SERIALIZED_NAME_ALLIANCE)
    private List<Integer> alliance = new ArrayList<>();

    public static final String SERIALIZED_NAME_CONSTELLATION = "constellation";
    @SerializedName(SERIALIZED_NAME_CONSTELLATION)
    private List<Integer> constellation = new ArrayList<>();

    public static final String SERIALIZED_NAME_CORPORATION = "corporation";
    @SerializedName(SERIALIZED_NAME_CORPORATION)
    private List<Integer> corporation = new ArrayList<>();

    public static final String SERIALIZED_NAME_FACTION = "faction";
    @SerializedName(SERIALIZED_NAME_FACTION)
    private List<Integer> faction = new ArrayList<>();

    public static final String SERIALIZED_NAME_STATION = "station";
    @SerializedName(SERIALIZED_NAME_STATION)
    private List<Integer> station = new ArrayList<>();

    public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventory_type";
    @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
    private List<Integer> inventoryType = new ArrayList<>();

    public static final String SERIALIZED_NAME_REGION = "region";
    @SerializedName(SERIALIZED_NAME_REGION)
    private List<Integer> region = new ArrayList<>();

    public static final String SERIALIZED_NAME_STRUCTURE = "structure";
    @SerializedName(SERIALIZED_NAME_STRUCTURE)
    private List<Long> structure = new ArrayList<>();

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM = "solar_system";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM)
    private List<Integer> solarSystem = new ArrayList<>();

    public CharacterSearchResponse agent(List<Integer> agent) {
        this.agent = agent;
        return this;
    }

    public CharacterSearchResponse addAgentItem(Integer agentItem) {
        if (this.agent == null) {
            this.agent = new ArrayList<>();
        }
        this.agent.add(agentItem);
        return this;
    }

    /**
     * agent array
     * 
     * @return agent
     **/
    @ApiModelProperty(value = "agent array")
    public List<Integer> getAgent() {
        return agent;
    }

    public void setAgent(List<Integer> agent) {
        this.agent = agent;
    }

    public CharacterSearchResponse character(List<Integer> character) {
        this.character = character;
        return this;
    }

    public CharacterSearchResponse addCharacterItem(Integer characterItem) {
        if (this.character == null) {
            this.character = new ArrayList<>();
        }
        this.character.add(characterItem);
        return this;
    }

    /**
     * character array
     * 
     * @return character
     **/
    @ApiModelProperty(value = "character array")
    public List<Integer> getCharacter() {
        return character;
    }

    public void setCharacter(List<Integer> character) {
        this.character = character;
    }

    public CharacterSearchResponse alliance(List<Integer> alliance) {
        this.alliance = alliance;
        return this;
    }

    public CharacterSearchResponse addAllianceItem(Integer allianceItem) {
        if (this.alliance == null) {
            this.alliance = new ArrayList<>();
        }
        this.alliance.add(allianceItem);
        return this;
    }

    /**
     * alliance array
     * 
     * @return alliance
     **/
    @ApiModelProperty(value = "alliance array")
    public List<Integer> getAlliance() {
        return alliance;
    }

    public void setAlliance(List<Integer> alliance) {
        this.alliance = alliance;
    }

    public CharacterSearchResponse constellation(List<Integer> constellation) {
        this.constellation = constellation;
        return this;
    }

    public CharacterSearchResponse addConstellationItem(Integer constellationItem) {
        if (this.constellation == null) {
            this.constellation = new ArrayList<>();
        }
        this.constellation.add(constellationItem);
        return this;
    }

    /**
     * constellation array
     * 
     * @return constellation
     **/
    @ApiModelProperty(value = "constellation array")
    public List<Integer> getConstellation() {
        return constellation;
    }

    public void setConstellation(List<Integer> constellation) {
        this.constellation = constellation;
    }

    public CharacterSearchResponse corporation(List<Integer> corporation) {
        this.corporation = corporation;
        return this;
    }

    public CharacterSearchResponse addCorporationItem(Integer corporationItem) {
        if (this.corporation == null) {
            this.corporation = new ArrayList<>();
        }
        this.corporation.add(corporationItem);
        return this;
    }

    /**
     * corporation array
     * 
     * @return corporation
     **/
    @ApiModelProperty(value = "corporation array")
    public List<Integer> getCorporation() {
        return corporation;
    }

    public void setCorporation(List<Integer> corporation) {
        this.corporation = corporation;
    }

    public CharacterSearchResponse faction(List<Integer> faction) {
        this.faction = faction;
        return this;
    }

    public CharacterSearchResponse addFactionItem(Integer factionItem) {
        if (this.faction == null) {
            this.faction = new ArrayList<>();
        }
        this.faction.add(factionItem);
        return this;
    }

    /**
     * faction array
     * 
     * @return faction
     **/
    @ApiModelProperty(value = "faction array")
    public List<Integer> getFaction() {
        return faction;
    }

    public void setFaction(List<Integer> faction) {
        this.faction = faction;
    }

    public CharacterSearchResponse station(List<Integer> station) {
        this.station = station;
        return this;
    }

    public CharacterSearchResponse addStationItem(Integer stationItem) {
        if (this.station == null) {
            this.station = new ArrayList<>();
        }
        this.station.add(stationItem);
        return this;
    }

    /**
     * station array
     * 
     * @return station
     **/
    @ApiModelProperty(value = "station array")
    public List<Integer> getStation() {
        return station;
    }

    public void setStation(List<Integer> station) {
        this.station = station;
    }

    public CharacterSearchResponse inventoryType(List<Integer> inventoryType) {
        this.inventoryType = inventoryType;
        return this;
    }

    public CharacterSearchResponse addInventoryTypeItem(Integer inventoryTypeItem) {
        if (this.inventoryType == null) {
            this.inventoryType = new ArrayList<>();
        }
        this.inventoryType.add(inventoryTypeItem);
        return this;
    }

    /**
     * inventory_type array
     * 
     * @return inventoryType
     **/
    @ApiModelProperty(value = "inventory_type array")
    public List<Integer> getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(List<Integer> inventoryType) {
        this.inventoryType = inventoryType;
    }

    public CharacterSearchResponse region(List<Integer> region) {
        this.region = region;
        return this;
    }

    public CharacterSearchResponse addRegionItem(Integer regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        this.region.add(regionItem);
        return this;
    }

    /**
     * region array
     * 
     * @return region
     **/
    @ApiModelProperty(value = "region array")
    public List<Integer> getRegion() {
        return region;
    }

    public void setRegion(List<Integer> region) {
        this.region = region;
    }

    public CharacterSearchResponse structure(List<Long> structure) {
        this.structure = structure;
        return this;
    }

    public CharacterSearchResponse addStructureItem(Long structureItem) {
        if (this.structure == null) {
            this.structure = new ArrayList<>();
        }
        this.structure.add(structureItem);
        return this;
    }

    /**
     * structure array
     * 
     * @return structure
     **/
    @ApiModelProperty(value = "structure array")
    public List<Long> getStructure() {
        return structure;
    }

    public void setStructure(List<Long> structure) {
        this.structure = structure;
    }

    public CharacterSearchResponse solarSystem(List<Integer> solarSystem) {
        this.solarSystem = solarSystem;
        return this;
    }

    public CharacterSearchResponse addSolarSystemItem(Integer solarSystemItem) {
        if (this.solarSystem == null) {
            this.solarSystem = new ArrayList<>();
        }
        this.solarSystem.add(solarSystemItem);
        return this;
    }

    /**
     * solar_system array
     * 
     * @return solarSystem
     **/
    @ApiModelProperty(value = "solar_system array")
    public List<Integer> getSolarSystem() {
        return solarSystem;
    }

    public void setSolarSystem(List<Integer> solarSystem) {
        this.solarSystem = solarSystem;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterSearchResponse characterSearchResponse = (CharacterSearchResponse) o;
        return Objects.equals(this.agent, characterSearchResponse.agent)
                && Objects.equals(this.character, characterSearchResponse.character)
                && Objects.equals(this.alliance, characterSearchResponse.alliance)
                && Objects.equals(this.constellation, characterSearchResponse.constellation)
                && Objects.equals(this.corporation, characterSearchResponse.corporation)
                && Objects.equals(this.faction, characterSearchResponse.faction)
                && Objects.equals(this.station, characterSearchResponse.station)
                && Objects.equals(this.inventoryType, characterSearchResponse.inventoryType)
                && Objects.equals(this.region, characterSearchResponse.region)
                && Objects.equals(this.structure, characterSearchResponse.structure)
                && Objects.equals(this.solarSystem, characterSearchResponse.solarSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agent, character, alliance, constellation, corporation, faction, station, inventoryType,
                region, structure, solarSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterSearchResponse {\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    character: ").append(toIndentedString(character)).append("\n");
        sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
        sb.append("    constellation: ").append(toIndentedString(constellation)).append("\n");
        sb.append("    corporation: ").append(toIndentedString(corporation)).append("\n");
        sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
        sb.append("    station: ").append(toIndentedString(station)).append("\n");
        sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
        sb.append("    solarSystem: ").append(toIndentedString(solarSystem)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

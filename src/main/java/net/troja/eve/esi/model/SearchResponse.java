/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.7.15
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
public class SearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AGENT = "agent";
    @SerializedName(SERIALIZED_NAME_AGENT)
    private List<Integer> agent = null;

    public static final String SERIALIZED_NAME_ALLIANCE = "alliance";
    @SerializedName(SERIALIZED_NAME_ALLIANCE)
    private List<Integer> alliance = null;

    public static final String SERIALIZED_NAME_CHARACTER = "character";
    @SerializedName(SERIALIZED_NAME_CHARACTER)
    private List<Integer> character = null;

    public static final String SERIALIZED_NAME_CONSTELLATION = "constellation";
    @SerializedName(SERIALIZED_NAME_CONSTELLATION)
    private List<Integer> constellation = null;

    public static final String SERIALIZED_NAME_CORPORATION = "corporation";
    @SerializedName(SERIALIZED_NAME_CORPORATION)
    private List<Integer> corporation = null;

    public static final String SERIALIZED_NAME_FACTION = "faction";
    @SerializedName(SERIALIZED_NAME_FACTION)
    private List<Integer> faction = null;

    public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventory_type";
    @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
    private List<Integer> inventoryType = null;

    public static final String SERIALIZED_NAME_REGION = "region";
    @SerializedName(SERIALIZED_NAME_REGION)
    private List<Integer> region = null;

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM = "solar_system";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM)
    private List<Integer> solarSystem = null;

    public static final String SERIALIZED_NAME_STATION = "station";
    @SerializedName(SERIALIZED_NAME_STATION)
    private List<Integer> station = null;

    public SearchResponse agent(List<Integer> agent) {

        this.agent = agent;
        return this;
    }

    public SearchResponse addAgentItem(Integer agentItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "agent array")
    public List<Integer> getAgent() {
        return agent;
    }

    public void setAgent(List<Integer> agent) {
        this.agent = agent;
    }

    public SearchResponse alliance(List<Integer> alliance) {

        this.alliance = alliance;
        return this;
    }

    public SearchResponse addAllianceItem(Integer allianceItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "alliance array")
    public List<Integer> getAlliance() {
        return alliance;
    }

    public void setAlliance(List<Integer> alliance) {
        this.alliance = alliance;
    }

    public SearchResponse character(List<Integer> character) {

        this.character = character;
        return this;
    }

    public SearchResponse addCharacterItem(Integer characterItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "character array")
    public List<Integer> getCharacter() {
        return character;
    }

    public void setCharacter(List<Integer> character) {
        this.character = character;
    }

    public SearchResponse constellation(List<Integer> constellation) {

        this.constellation = constellation;
        return this;
    }

    public SearchResponse addConstellationItem(Integer constellationItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "constellation array")
    public List<Integer> getConstellation() {
        return constellation;
    }

    public void setConstellation(List<Integer> constellation) {
        this.constellation = constellation;
    }

    public SearchResponse corporation(List<Integer> corporation) {

        this.corporation = corporation;
        return this;
    }

    public SearchResponse addCorporationItem(Integer corporationItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "corporation array")
    public List<Integer> getCorporation() {
        return corporation;
    }

    public void setCorporation(List<Integer> corporation) {
        this.corporation = corporation;
    }

    public SearchResponse faction(List<Integer> faction) {

        this.faction = faction;
        return this;
    }

    public SearchResponse addFactionItem(Integer factionItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "faction array")
    public List<Integer> getFaction() {
        return faction;
    }

    public void setFaction(List<Integer> faction) {
        this.faction = faction;
    }

    public SearchResponse inventoryType(List<Integer> inventoryType) {

        this.inventoryType = inventoryType;
        return this;
    }

    public SearchResponse addInventoryTypeItem(Integer inventoryTypeItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "inventory_type array")
    public List<Integer> getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(List<Integer> inventoryType) {
        this.inventoryType = inventoryType;
    }

    public SearchResponse region(List<Integer> region) {

        this.region = region;
        return this;
    }

    public SearchResponse addRegionItem(Integer regionItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "region array")
    public List<Integer> getRegion() {
        return region;
    }

    public void setRegion(List<Integer> region) {
        this.region = region;
    }

    public SearchResponse solarSystem(List<Integer> solarSystem) {

        this.solarSystem = solarSystem;
        return this;
    }

    public SearchResponse addSolarSystemItem(Integer solarSystemItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "solar_system array")
    public List<Integer> getSolarSystem() {
        return solarSystem;
    }

    public void setSolarSystem(List<Integer> solarSystem) {
        this.solarSystem = solarSystem;
    }

    public SearchResponse station(List<Integer> station) {

        this.station = station;
        return this;
    }

    public SearchResponse addStationItem(Integer stationItem) {
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
    @javax.annotation.Nullable
    @ApiModelProperty(value = "station array")
    public List<Integer> getStation() {
        return station;
    }

    public void setStation(List<Integer> station) {
        this.station = station;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) o;
        return Objects.equals(this.agent, searchResponse.agent)
                && Objects.equals(this.alliance, searchResponse.alliance)
                && Objects.equals(this.character, searchResponse.character)
                && Objects.equals(this.constellation, searchResponse.constellation)
                && Objects.equals(this.corporation, searchResponse.corporation)
                && Objects.equals(this.faction, searchResponse.faction)
                && Objects.equals(this.inventoryType, searchResponse.inventoryType)
                && Objects.equals(this.region, searchResponse.region)
                && Objects.equals(this.solarSystem, searchResponse.solarSystem)
                && Objects.equals(this.station, searchResponse.station);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agent, alliance, character, constellation, corporation, faction, inventoryType, region,
                solarSystem, station);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResponse {\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
        sb.append("    character: ").append(toIndentedString(character)).append("\n");
        sb.append("    constellation: ").append(toIndentedString(constellation)).append("\n");
        sb.append("    corporation: ").append(toIndentedString(corporation)).append("\n");
        sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
        sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    solarSystem: ").append(toIndentedString(solarSystem)).append("\n");
        sb.append("    station: ").append(toIndentedString(station)).append("\n");
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

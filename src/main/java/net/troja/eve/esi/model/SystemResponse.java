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
import net.troja.eve.esi.model.Position;
import net.troja.eve.esi.model.SystemPlanet;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class SystemResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_STAR_ID = "star_id";
    @SerializedName(SERIALIZED_NAME_STAR_ID)
    private Integer starId;

    public static final String SERIALIZED_NAME_STARGATES = "stargates";
    @SerializedName(SERIALIZED_NAME_STARGATES)
    private List<Integer> stargates = new ArrayList<>();

    public static final String SERIALIZED_NAME_SECURITY_STATUS = "security_status";
    @SerializedName(SERIALIZED_NAME_SECURITY_STATUS)
    private Float securityStatus;

    public static final String SERIALIZED_NAME_PLANETS = "planets";
    @SerializedName(SERIALIZED_NAME_PLANETS)
    private List<SystemPlanet> planets = new ArrayList<>();

    public static final String SERIALIZED_NAME_SYSTEM_ID = "system_id";
    @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
    private Integer systemId;

    public static final String SERIALIZED_NAME_SECURITY_CLASS = "security_class";
    @SerializedName(SERIALIZED_NAME_SECURITY_CLASS)
    private String securityClass;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_POSITION = "position";
    @SerializedName(SERIALIZED_NAME_POSITION)
    private Position position = null;

    public static final String SERIALIZED_NAME_STATIONS = "stations";
    @SerializedName(SERIALIZED_NAME_STATIONS)
    private List<Integer> stations = new ArrayList<>();

    public static final String SERIALIZED_NAME_CONSTELLATION_ID = "constellation_id";
    @SerializedName(SERIALIZED_NAME_CONSTELLATION_ID)
    private Integer constellationId;

    public SystemResponse starId(Integer starId) {
        this.starId = starId;
        return this;
    }

    /**
     * star_id integer
     * 
     * @return starId
     **/
    @ApiModelProperty(value = "star_id integer")
    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    public SystemResponse stargates(List<Integer> stargates) {
        this.stargates = stargates;
        return this;
    }

    public SystemResponse addStargatesItem(Integer stargatesItem) {
        if (this.stargates == null) {
            this.stargates = new ArrayList<>();
        }
        this.stargates.add(stargatesItem);
        return this;
    }

    /**
     * stargates array
     * 
     * @return stargates
     **/
    @ApiModelProperty(value = "stargates array")
    public List<Integer> getStargates() {
        return stargates;
    }

    public void setStargates(List<Integer> stargates) {
        this.stargates = stargates;
    }

    public SystemResponse securityStatus(Float securityStatus) {
        this.securityStatus = securityStatus;
        return this;
    }

    /**
     * security_status number
     * 
     * @return securityStatus
     **/
    @ApiModelProperty(required = true, value = "security_status number")
    public Float getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(Float securityStatus) {
        this.securityStatus = securityStatus;
    }

    public SystemResponse planets(List<SystemPlanet> planets) {
        this.planets = planets;
        return this;
    }

    public SystemResponse addPlanetsItem(SystemPlanet planetsItem) {
        if (this.planets == null) {
            this.planets = new ArrayList<>();
        }
        this.planets.add(planetsItem);
        return this;
    }

    /**
     * planets array
     * 
     * @return planets
     **/
    @ApiModelProperty(value = "planets array")
    public List<SystemPlanet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<SystemPlanet> planets) {
        this.planets = planets;
    }

    public SystemResponse systemId(Integer systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * system_id integer
     * 
     * @return systemId
     **/
    @ApiModelProperty(required = true, value = "system_id integer")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public SystemResponse securityClass(String securityClass) {
        this.securityClass = securityClass;
        return this;
    }

    /**
     * security_class string
     * 
     * @return securityClass
     **/
    @ApiModelProperty(value = "security_class string")
    public String getSecurityClass() {
        return securityClass;
    }

    public void setSecurityClass(String securityClass) {
        this.securityClass = securityClass;
    }

    public SystemResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SystemResponse position(Position position) {
        this.position = position;
        return this;
    }

    /**
     * Get position
     * 
     * @return position
     **/
    @ApiModelProperty(required = true, value = "")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public SystemResponse stations(List<Integer> stations) {
        this.stations = stations;
        return this;
    }

    public SystemResponse addStationsItem(Integer stationsItem) {
        if (this.stations == null) {
            this.stations = new ArrayList<>();
        }
        this.stations.add(stationsItem);
        return this;
    }

    /**
     * stations array
     * 
     * @return stations
     **/
    @ApiModelProperty(value = "stations array")
    public List<Integer> getStations() {
        return stations;
    }

    public void setStations(List<Integer> stations) {
        this.stations = stations;
    }

    public SystemResponse constellationId(Integer constellationId) {
        this.constellationId = constellationId;
        return this;
    }

    /**
     * The constellation this solar system is in
     * 
     * @return constellationId
     **/
    @ApiModelProperty(required = true, value = "The constellation this solar system is in")
    public Integer getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(Integer constellationId) {
        this.constellationId = constellationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemResponse systemResponse = (SystemResponse) o;
        return Objects.equals(this.starId, systemResponse.starId)
                && Objects.equals(this.stargates, systemResponse.stargates)
                && Objects.equals(this.securityStatus, systemResponse.securityStatus)
                && Objects.equals(this.planets, systemResponse.planets)
                && Objects.equals(this.systemId, systemResponse.systemId)
                && Objects.equals(this.securityClass, systemResponse.securityClass)
                && Objects.equals(this.name, systemResponse.name)
                && Objects.equals(this.position, systemResponse.position)
                && Objects.equals(this.stations, systemResponse.stations)
                && Objects.equals(this.constellationId, systemResponse.constellationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starId, stargates, securityStatus, planets, systemId, securityClass, name, position,
                stations, constellationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemResponse {\n");
        sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
        sb.append("    stargates: ").append(toIndentedString(stargates)).append("\n");
        sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
        sb.append("    planets: ").append(toIndentedString(planets)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    securityClass: ").append(toIndentedString(securityClass)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    stations: ").append(toIndentedString(stations)).append("\n");
        sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
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

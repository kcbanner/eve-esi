/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.17
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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConstellationResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONSTELLATION_ID = "constellation_id";
    @SerializedName(SERIALIZED_NAME_CONSTELLATION_ID)
    private Integer constellationId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_POSITION = "position";
    @SerializedName(SERIALIZED_NAME_POSITION)
    private Position position;

    public static final String SERIALIZED_NAME_REGION_ID = "region_id";
    @SerializedName(SERIALIZED_NAME_REGION_ID)
    private Integer regionId;

    public static final String SERIALIZED_NAME_SYSTEMS = "systems";
    @SerializedName(SERIALIZED_NAME_SYSTEMS)
    private List<Integer> systems = new ArrayList<>();

    public ConstellationResponse() {
    }

    public ConstellationResponse constellationId(Integer constellationId) {

        this.constellationId = constellationId;
        return this;
    }

    /**
     * constellation_id integer
     * 
     * @return constellationId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "constellation_id integer")
    public Integer getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(Integer constellationId) {
        this.constellationId = constellationId;
    }

    public ConstellationResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConstellationResponse position(Position position) {

        this.position = position;
        return this;
    }

    /**
     * Get position
     * 
     * @return position
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ConstellationResponse regionId(Integer regionId) {

        this.regionId = regionId;
        return this;
    }

    /**
     * The region this constellation is in
     * 
     * @return regionId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The region this constellation is in")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public ConstellationResponse systems(List<Integer> systems) {

        this.systems = systems;
        return this;
    }

    public ConstellationResponse addSystemsItem(Integer systemsItem) {
        this.systems.add(systemsItem);
        return this;
    }

    /**
     * systems array
     * 
     * @return systems
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "systems array")
    public List<Integer> getSystems() {
        return systems;
    }

    public void setSystems(List<Integer> systems) {
        this.systems = systems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConstellationResponse constellationResponse = (ConstellationResponse) o;
        return Objects.equals(this.constellationId, constellationResponse.constellationId)
                && Objects.equals(this.name, constellationResponse.name)
                && Objects.equals(this.position, constellationResponse.position)
                && Objects.equals(this.regionId, constellationResponse.regionId)
                && Objects.equals(this.systems, constellationResponse.systems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constellationId, name, position, regionId, systems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConstellationResponse {\n");
        sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    systems: ").append(toIndentedString(systems)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

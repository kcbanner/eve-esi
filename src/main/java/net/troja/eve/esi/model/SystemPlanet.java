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
import java.io.Serializable;

/**
 * planet object
 */
@ApiModel(description = "planet object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SystemPlanet implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ASTEROID_BELTS = "asteroid_belts";
    @SerializedName(SERIALIZED_NAME_ASTEROID_BELTS)
    private List<Integer> asteroidBelts = null;

    public static final String SERIALIZED_NAME_MOONS = "moons";
    @SerializedName(SERIALIZED_NAME_MOONS)
    private List<Integer> moons = null;

    public static final String SERIALIZED_NAME_PLANET_ID = "planet_id";
    @SerializedName(SERIALIZED_NAME_PLANET_ID)
    private Integer planetId;

    public SystemPlanet() {
    }

    public SystemPlanet asteroidBelts(List<Integer> asteroidBelts) {

        this.asteroidBelts = asteroidBelts;
        return this;
    }

    public SystemPlanet addAsteroidBeltsItem(Integer asteroidBeltsItem) {
        if (this.asteroidBelts == null) {
            this.asteroidBelts = new ArrayList<>();
        }
        this.asteroidBelts.add(asteroidBeltsItem);
        return this;
    }

    /**
     * asteroid_belts array
     * 
     * @return asteroidBelts
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "asteroid_belts array")
    public List<Integer> getAsteroidBelts() {
        return asteroidBelts;
    }

    public void setAsteroidBelts(List<Integer> asteroidBelts) {
        this.asteroidBelts = asteroidBelts;
    }

    public SystemPlanet moons(List<Integer> moons) {

        this.moons = moons;
        return this;
    }

    public SystemPlanet addMoonsItem(Integer moonsItem) {
        if (this.moons == null) {
            this.moons = new ArrayList<>();
        }
        this.moons.add(moonsItem);
        return this;
    }

    /**
     * moons array
     * 
     * @return moons
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "moons array")
    public List<Integer> getMoons() {
        return moons;
    }

    public void setMoons(List<Integer> moons) {
        this.moons = moons;
    }

    public SystemPlanet planetId(Integer planetId) {

        this.planetId = planetId;
        return this;
    }

    /**
     * planet_id integer
     * 
     * @return planetId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "planet_id integer")
    public Integer getPlanetId() {
        return planetId;
    }

    public void setPlanetId(Integer planetId) {
        this.planetId = planetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemPlanet systemPlanet = (SystemPlanet) o;
        return Objects.equals(this.asteroidBelts, systemPlanet.asteroidBelts)
                && Objects.equals(this.moons, systemPlanet.moons)
                && Objects.equals(this.planetId, systemPlanet.planetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asteroidBelts, moons, planetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemPlanet {\n");
        sb.append("    asteroidBelts: ").append(toIndentedString(asteroidBelts)).append("\n");
        sb.append("    moons: ").append(toIndentedString(moons)).append("\n");
        sb.append("    planetId: ").append(toIndentedString(planetId)).append("\n");
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

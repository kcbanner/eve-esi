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
import net.troja.eve.esi.model.SystemCostIndice;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndustrySystemsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COST_INDICES = "cost_indices";
    @SerializedName(SERIALIZED_NAME_COST_INDICES)
    private List<SystemCostIndice> costIndices = new ArrayList<>();

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM_ID = "solar_system_id";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_ID)
    private Integer solarSystemId;

    public IndustrySystemsResponse() {
    }

    public IndustrySystemsResponse costIndices(List<SystemCostIndice> costIndices) {

        this.costIndices = costIndices;
        return this;
    }

    public IndustrySystemsResponse addCostIndicesItem(SystemCostIndice costIndicesItem) {
        this.costIndices.add(costIndicesItem);
        return this;
    }

    /**
     * cost_indices array
     * 
     * @return costIndices
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "cost_indices array")
    public List<SystemCostIndice> getCostIndices() {
        return costIndices;
    }

    public void setCostIndices(List<SystemCostIndice> costIndices) {
        this.costIndices = costIndices;
    }

    public IndustrySystemsResponse solarSystemId(Integer solarSystemId) {

        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * solar_system_id integer
     * 
     * @return solarSystemId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "solar_system_id integer")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndustrySystemsResponse industrySystemsResponse = (IndustrySystemsResponse) o;
        return Objects.equals(this.costIndices, industrySystemsResponse.costIndices)
                && Objects.equals(this.solarSystemId, industrySystemsResponse.solarSystemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costIndices, solarSystemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndustrySystemsResponse {\n");
        sb.append("    costIndices: ").append(toIndentedString(costIndices)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
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

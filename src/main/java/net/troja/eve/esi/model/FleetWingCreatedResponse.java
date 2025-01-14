/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.12
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
import java.io.Serializable;

/**
 * 201 created object
 */
@ApiModel(description = "201 created object")
public class FleetWingCreatedResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_WING_ID = "wing_id";
    @SerializedName(SERIALIZED_NAME_WING_ID)
    private Long wingId;

    public FleetWingCreatedResponse wingId(Long wingId) {

        this.wingId = wingId;
        return this;
    }

    /**
     * The wing_id of the newly created wing
     * 
     * @return wingId
     **/
    @ApiModelProperty(required = true, value = "The wing_id of the newly created wing")
    public Long getWingId() {
        return wingId;
    }

    public void setWingId(Long wingId) {
        this.wingId = wingId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FleetWingCreatedResponse fleetWingCreatedResponse = (FleetWingCreatedResponse) o;
        return Objects.equals(this.wingId, fleetWingCreatedResponse.wingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FleetWingCreatedResponse {\n");
        sb.append("    wingId: ").append(toIndentedString(wingId)).append("\n");
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

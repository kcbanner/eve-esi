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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationFacilitiesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SYSTEM_ID = "system_id";
    @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
    private Integer systemId;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public static final String SERIALIZED_NAME_FACILITY_ID = "facility_id";
    @SerializedName(SERIALIZED_NAME_FACILITY_ID)
    private Long facilityId;

    public CorporationFacilitiesResponse systemId(Integer systemId) {
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

    public CorporationFacilitiesResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public CorporationFacilitiesResponse facilityId(Long facilityId) {
        this.facilityId = facilityId;
        return this;
    }

    /**
     * facility_id integer
     * 
     * @return facilityId
     **/
    @ApiModelProperty(required = true, value = "facility_id integer")
    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationFacilitiesResponse corporationFacilitiesResponse = (CorporationFacilitiesResponse) o;
        return Objects.equals(this.systemId, corporationFacilitiesResponse.systemId)
                && Objects.equals(this.typeId, corporationFacilitiesResponse.typeId)
                && Objects.equals(this.facilityId, corporationFacilitiesResponse.facilityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemId, typeId, facilityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationFacilitiesResponse {\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    facilityId: ").append(toIndentedString(facilityId)).append("\n");
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

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

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class AllianceNamesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("alliance_id")
    private Integer allianceId = null;

    @JsonProperty("alliance_name")
    private String allianceName = null;

    public AllianceNamesResponse allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * alliance_id integer
     * 
     * @return allianceId
     **/
    @ApiModelProperty(example = "null", required = true, value = "alliance_id integer")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public AllianceNamesResponse allianceName(String allianceName) {
        this.allianceName = allianceName;
        return this;
    }

    /**
     * alliance_name string
     * 
     * @return allianceName
     **/
    @ApiModelProperty(example = "null", required = true, value = "alliance_name string")
    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllianceNamesResponse allianceNamesResponse = (AllianceNamesResponse) o;
        return Objects.equals(this.allianceId, allianceNamesResponse.allianceId)
                && Objects.equals(this.allianceName, allianceNamesResponse.allianceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceId, allianceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllianceNamesResponse {\n");

        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    allianceName: ").append(toIndentedString(allianceName)).append("\n");
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
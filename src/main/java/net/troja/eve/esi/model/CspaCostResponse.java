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
 * 201 created object
 */
@ApiModel(description = "201 created object")
public class CspaCostResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("cost")
    private Long cost = null;

    public CspaCostResponse cost(Long cost) {
        this.cost = cost;
        return this;
    }

    /**
     * cost integer
     * 
     * @return cost
     **/
    @ApiModelProperty(example = "null", value = "cost integer")
    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CspaCostResponse cspaCostResponse = (CspaCostResponse) o;
        return Objects.equals(this.cost, cspaCostResponse.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CspaCostResponse {\n");

        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

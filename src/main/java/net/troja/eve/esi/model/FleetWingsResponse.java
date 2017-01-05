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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.Squad;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class FleetWingsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("squads")
    private List<Squad> squads = new ArrayList<Squad>();

    public FleetWingsResponse id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * id integer
     * 
     * @return id
     **/
    @ApiModelProperty(example = "null", required = true, value = "id integer")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FleetWingsResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FleetWingsResponse squads(List<Squad> squads) {
        this.squads = squads;
        return this;
    }

    public FleetWingsResponse addSquadsItem(Squad squadsItem) {
        this.squads.add(squadsItem);
        return this;
    }

    /**
     * squads array
     * 
     * @return squads
     **/
    @ApiModelProperty(example = "null", required = true, value = "squads array")
    public List<Squad> getSquads() {
        return squads;
    }

    public void setSquads(List<Squad> squads) {
        this.squads = squads;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FleetWingsResponse fleetWingsResponse = (FleetWingsResponse) o;
        return Objects.equals(this.id, fleetWingsResponse.id) && Objects.equals(this.name, fleetWingsResponse.name)
                && Objects.equals(this.squads, fleetWingsResponse.squads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, squads);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FleetWingsResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    squads: ").append(toIndentedString(squads)).append("\n");
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
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
import java.io.Serializable;

/**
 * constellation object
 */
@ApiModel(description = "constellation object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UniverseIdsConstellation implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public UniverseIdsConstellation() {
    }

    public UniverseIdsConstellation id(Integer id) {

        this.id = id;
        return this;
    }

    /**
     * id integer
     * 
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "id integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UniverseIdsConstellation name(String name) {

        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UniverseIdsConstellation universeIdsConstellation = (UniverseIdsConstellation) o;
        return Objects.equals(this.id, universeIdsConstellation.id)
                && Objects.equals(this.name, universeIdsConstellation.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniverseIdsConstellation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

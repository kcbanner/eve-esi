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
 * wallet object
 */
@ApiModel(description = "wallet object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CorporationDivisionsWallet implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DIVISION = "division";
    @SerializedName(SERIALIZED_NAME_DIVISION)
    private Integer division;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public CorporationDivisionsWallet() {
    }

    public CorporationDivisionsWallet division(Integer division) {

        this.division = division;
        return this;
    }

    /**
     * division integer minimum: 1 maximum: 7
     * 
     * @return division
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "division integer")
    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    public CorporationDivisionsWallet name(String name) {

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
        CorporationDivisionsWallet corporationDivisionsWallet = (CorporationDivisionsWallet) o;
        return Objects.equals(this.division, corporationDivisionsWallet.division)
                && Objects.equals(this.name, corporationDivisionsWallet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(division, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationDivisionsWallet {\n");
        sb.append("    division: ").append(toIndentedString(division)).append("\n");
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

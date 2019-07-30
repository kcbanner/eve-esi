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
 * dogma_effect object
 */
@ApiModel(description = "dogma_effect object")
public class DogmaDynamicEffect implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
    @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
    private Boolean isDefault;

    public static final String SERIALIZED_NAME_EFFECT_ID = "effect_id";
    @SerializedName(SERIALIZED_NAME_EFFECT_ID)
    private Integer effectId;

    public DogmaDynamicEffect isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * is_default boolean
     * 
     * @return isDefault
     **/
    @ApiModelProperty(required = true, value = "is_default boolean")
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public DogmaDynamicEffect effectId(Integer effectId) {
        this.effectId = effectId;
        return this;
    }

    /**
     * effect_id integer
     * 
     * @return effectId
     **/
    @ApiModelProperty(required = true, value = "effect_id integer")
    public Integer getEffectId() {
        return effectId;
    }

    public void setEffectId(Integer effectId) {
        this.effectId = effectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DogmaDynamicEffect dogmaDynamicEffect = (DogmaDynamicEffect) o;
        return Objects.equals(this.isDefault, dogmaDynamicEffect.isDefault)
                && Objects.equals(this.effectId, dogmaDynamicEffect.effectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDefault, effectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DogmaDynamicEffect {\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
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

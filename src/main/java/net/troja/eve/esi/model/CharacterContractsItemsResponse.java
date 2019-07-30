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
public class CharacterContractsItemsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IS_INCLUDED = "is_included";
    @SerializedName(SERIALIZED_NAME_IS_INCLUDED)
    private Boolean isIncluded;

    public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
    @SerializedName(SERIALIZED_NAME_RECORD_ID)
    private Long recordId;

    public static final String SERIALIZED_NAME_IS_SINGLETON = "is_singleton";
    @SerializedName(SERIALIZED_NAME_IS_SINGLETON)
    private Boolean isSingleton;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";
    @SerializedName(SERIALIZED_NAME_QUANTITY)
    private Integer quantity;

    public static final String SERIALIZED_NAME_RAW_QUANTITY = "raw_quantity";
    @SerializedName(SERIALIZED_NAME_RAW_QUANTITY)
    private Integer rawQuantity;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public CharacterContractsItemsResponse isIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
        return this;
    }

    /**
     * true if the contract issuer has submitted this item with the contract,
     * false if the isser is asking for this item in the contract
     * 
     * @return isIncluded
     **/
    @ApiModelProperty(required = true, value = "true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract")
    public Boolean getIsIncluded() {
        return isIncluded;
    }

    public void setIsIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
    }

    public CharacterContractsItemsResponse recordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * Unique ID for the item
     * 
     * @return recordId
     **/
    @ApiModelProperty(required = true, value = "Unique ID for the item")
    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public CharacterContractsItemsResponse isSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
        return this;
    }

    /**
     * is_singleton boolean
     * 
     * @return isSingleton
     **/
    @ApiModelProperty(required = true, value = "is_singleton boolean")
    public Boolean getIsSingleton() {
        return isSingleton;
    }

    public void setIsSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
    }

    public CharacterContractsItemsResponse quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Number of items in the stack
     * 
     * @return quantity
     **/
    @ApiModelProperty(required = true, value = "Number of items in the stack")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CharacterContractsItemsResponse rawQuantity(Integer rawQuantity) {
        this.rawQuantity = rawQuantity;
        return this;
    }

    /**
     * -1 indicates that the item is a singleton (non-stackable). If the item
     * happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy
     * 
     * @return rawQuantity
     **/
    @ApiModelProperty(value = "-1 indicates that the item is a singleton (non-stackable). If the item happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy")
    public Integer getRawQuantity() {
        return rawQuantity;
    }

    public void setRawQuantity(Integer rawQuantity) {
        this.rawQuantity = rawQuantity;
    }

    public CharacterContractsItemsResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * Type ID for item
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "Type ID for item")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterContractsItemsResponse characterContractsItemsResponse = (CharacterContractsItemsResponse) o;
        return Objects.equals(this.isIncluded, characterContractsItemsResponse.isIncluded)
                && Objects.equals(this.recordId, characterContractsItemsResponse.recordId)
                && Objects.equals(this.isSingleton, characterContractsItemsResponse.isSingleton)
                && Objects.equals(this.quantity, characterContractsItemsResponse.quantity)
                && Objects.equals(this.rawQuantity, characterContractsItemsResponse.rawQuantity)
                && Objects.equals(this.typeId, characterContractsItemsResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isIncluded, recordId, isSingleton, quantity, rawQuantity, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterContractsItemsResponse {\n");
        sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    isSingleton: ").append(toIndentedString(isSingleton)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    rawQuantity: ").append(toIndentedString(rawQuantity)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

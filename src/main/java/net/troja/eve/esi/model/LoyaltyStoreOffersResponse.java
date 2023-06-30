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
import net.troja.eve.esi.model.RequiredItem;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LoyaltyStoreOffersResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AK_COST = "ak_cost";
    @SerializedName(SERIALIZED_NAME_AK_COST)
    private Integer akCost;

    public static final String SERIALIZED_NAME_ISK_COST = "isk_cost";
    @SerializedName(SERIALIZED_NAME_ISK_COST)
    private Long iskCost;

    public static final String SERIALIZED_NAME_LP_COST = "lp_cost";
    @SerializedName(SERIALIZED_NAME_LP_COST)
    private Integer lpCost;

    public static final String SERIALIZED_NAME_OFFER_ID = "offer_id";
    @SerializedName(SERIALIZED_NAME_OFFER_ID)
    private Integer offerId;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";
    @SerializedName(SERIALIZED_NAME_QUANTITY)
    private Integer quantity;

    public static final String SERIALIZED_NAME_REQUIRED_ITEMS = "required_items";
    @SerializedName(SERIALIZED_NAME_REQUIRED_ITEMS)
    private List<RequiredItem> requiredItems = new ArrayList<>();

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public LoyaltyStoreOffersResponse() {
    }

    public LoyaltyStoreOffersResponse akCost(Integer akCost) {

        this.akCost = akCost;
        return this;
    }

    /**
     * Analysis kredit cost
     * 
     * @return akCost
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Analysis kredit cost")
    public Integer getAkCost() {
        return akCost;
    }

    public void setAkCost(Integer akCost) {
        this.akCost = akCost;
    }

    public LoyaltyStoreOffersResponse iskCost(Long iskCost) {

        this.iskCost = iskCost;
        return this;
    }

    /**
     * isk_cost integer
     * 
     * @return iskCost
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "isk_cost integer")
    public Long getIskCost() {
        return iskCost;
    }

    public void setIskCost(Long iskCost) {
        this.iskCost = iskCost;
    }

    public LoyaltyStoreOffersResponse lpCost(Integer lpCost) {

        this.lpCost = lpCost;
        return this;
    }

    /**
     * lp_cost integer
     * 
     * @return lpCost
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "lp_cost integer")
    public Integer getLpCost() {
        return lpCost;
    }

    public void setLpCost(Integer lpCost) {
        this.lpCost = lpCost;
    }

    public LoyaltyStoreOffersResponse offerId(Integer offerId) {

        this.offerId = offerId;
        return this;
    }

    /**
     * offer_id integer
     * 
     * @return offerId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "offer_id integer")
    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public LoyaltyStoreOffersResponse quantity(Integer quantity) {

        this.quantity = quantity;
        return this;
    }

    /**
     * quantity integer
     * 
     * @return quantity
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "quantity integer")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LoyaltyStoreOffersResponse requiredItems(List<RequiredItem> requiredItems) {

        this.requiredItems = requiredItems;
        return this;
    }

    public LoyaltyStoreOffersResponse addRequiredItemsItem(RequiredItem requiredItemsItem) {
        this.requiredItems.add(requiredItemsItem);
        return this;
    }

    /**
     * required_items array
     * 
     * @return requiredItems
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "required_items array")
    public List<RequiredItem> getRequiredItems() {
        return requiredItems;
    }

    public void setRequiredItems(List<RequiredItem> requiredItems) {
        this.requiredItems = requiredItems;
    }

    public LoyaltyStoreOffersResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoyaltyStoreOffersResponse loyaltyStoreOffersResponse = (LoyaltyStoreOffersResponse) o;
        return Objects.equals(this.akCost, loyaltyStoreOffersResponse.akCost)
                && Objects.equals(this.iskCost, loyaltyStoreOffersResponse.iskCost)
                && Objects.equals(this.lpCost, loyaltyStoreOffersResponse.lpCost)
                && Objects.equals(this.offerId, loyaltyStoreOffersResponse.offerId)
                && Objects.equals(this.quantity, loyaltyStoreOffersResponse.quantity)
                && Objects.equals(this.requiredItems, loyaltyStoreOffersResponse.requiredItems)
                && Objects.equals(this.typeId, loyaltyStoreOffersResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(akCost, iskCost, lpCost, offerId, quantity, requiredItems, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoyaltyStoreOffersResponse {\n");
        sb.append("    akCost: ").append(toIndentedString(akCost)).append("\n");
        sb.append("    iskCost: ").append(toIndentedString(iskCost)).append("\n");
        sb.append("    lpCost: ").append(toIndentedString(lpCost)).append("\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    requiredItems: ").append(toIndentedString(requiredItems)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

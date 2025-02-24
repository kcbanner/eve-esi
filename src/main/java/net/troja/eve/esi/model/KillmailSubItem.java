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
 * item object
 */
@ApiModel(description = "item object")
public class KillmailSubItem implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FLAG = "flag";
    @SerializedName(SERIALIZED_NAME_FLAG)
    private Integer flag;

    public static final String SERIALIZED_NAME_ITEM_TYPE_ID = "item_type_id";
    @SerializedName(SERIALIZED_NAME_ITEM_TYPE_ID)
    private Integer itemTypeId;

    public static final String SERIALIZED_NAME_QUANTITY_DESTROYED = "quantity_destroyed";
    @SerializedName(SERIALIZED_NAME_QUANTITY_DESTROYED)
    private Long quantityDestroyed;

    public static final String SERIALIZED_NAME_QUANTITY_DROPPED = "quantity_dropped";
    @SerializedName(SERIALIZED_NAME_QUANTITY_DROPPED)
    private Long quantityDropped;

    public static final String SERIALIZED_NAME_SINGLETON = "singleton";
    @SerializedName(SERIALIZED_NAME_SINGLETON)
    private Integer singleton;

    public KillmailSubItem flag(Integer flag) {

        this.flag = flag;
        return this;
    }

    /**
     * flag integer
     * 
     * @return flag
     **/
    @ApiModelProperty(required = true, value = "flag integer")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public KillmailSubItem itemTypeId(Integer itemTypeId) {

        this.itemTypeId = itemTypeId;
        return this;
    }

    /**
     * item_type_id integer
     * 
     * @return itemTypeId
     **/
    @ApiModelProperty(required = true, value = "item_type_id integer")
    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public KillmailSubItem quantityDestroyed(Long quantityDestroyed) {

        this.quantityDestroyed = quantityDestroyed;
        return this;
    }

    /**
     * quantity_destroyed integer
     * 
     * @return quantityDestroyed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "quantity_destroyed integer")
    public Long getQuantityDestroyed() {
        return quantityDestroyed;
    }

    public void setQuantityDestroyed(Long quantityDestroyed) {
        this.quantityDestroyed = quantityDestroyed;
    }

    public KillmailSubItem quantityDropped(Long quantityDropped) {

        this.quantityDropped = quantityDropped;
        return this;
    }

    /**
     * quantity_dropped integer
     * 
     * @return quantityDropped
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "quantity_dropped integer")
    public Long getQuantityDropped() {
        return quantityDropped;
    }

    public void setQuantityDropped(Long quantityDropped) {
        this.quantityDropped = quantityDropped;
    }

    public KillmailSubItem singleton(Integer singleton) {

        this.singleton = singleton;
        return this;
    }

    /**
     * singleton integer
     * 
     * @return singleton
     **/
    @ApiModelProperty(required = true, value = "singleton integer")
    public Integer getSingleton() {
        return singleton;
    }

    public void setSingleton(Integer singleton) {
        this.singleton = singleton;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillmailSubItem killmailSubItem = (KillmailSubItem) o;
        return Objects.equals(this.flag, killmailSubItem.flag)
                && Objects.equals(this.itemTypeId, killmailSubItem.itemTypeId)
                && Objects.equals(this.quantityDestroyed, killmailSubItem.quantityDestroyed)
                && Objects.equals(this.quantityDropped, killmailSubItem.quantityDropped)
                && Objects.equals(this.singleton, killmailSubItem.singleton);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flag, itemTypeId, quantityDestroyed, quantityDropped, singleton);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillmailSubItem {\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
        sb.append("    quantityDestroyed: ").append(toIndentedString(quantityDestroyed)).append("\n");
        sb.append("    quantityDropped: ").append(toIndentedString(quantityDropped)).append("\n");
        sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
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

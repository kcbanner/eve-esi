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
 * Optional object that is returned if a bookmark was made on a particular item.
 */
@ApiModel(description = "Optional object that is returned if a bookmark was made on a particular item.")
public class CharacterBookmarkItem implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
    @SerializedName(SERIALIZED_NAME_ITEM_ID)
    private Long itemId;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public CharacterBookmarkItem itemId(Long itemId) {

        this.itemId = itemId;
        return this;
    }

    /**
     * item_id integer
     * 
     * @return itemId
     **/
    @ApiModelProperty(required = true, value = "item_id integer")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public CharacterBookmarkItem typeId(Integer typeId) {

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterBookmarkItem characterBookmarkItem = (CharacterBookmarkItem) o;
        return Objects.equals(this.itemId, characterBookmarkItem.itemId)
                && Objects.equals(this.typeId, characterBookmarkItem.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterBookmarkItem {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

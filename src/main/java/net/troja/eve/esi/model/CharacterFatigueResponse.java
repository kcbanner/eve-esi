/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.7.15
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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterFatigueResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_JUMP_FATIGUE_EXPIRE_DATE = "jump_fatigue_expire_date";
    @SerializedName(SERIALIZED_NAME_JUMP_FATIGUE_EXPIRE_DATE)
    private OffsetDateTime jumpFatigueExpireDate;

    public static final String SERIALIZED_NAME_LAST_JUMP_DATE = "last_jump_date";
    @SerializedName(SERIALIZED_NAME_LAST_JUMP_DATE)
    private OffsetDateTime lastJumpDate;

    public static final String SERIALIZED_NAME_LAST_UPDATE_DATE = "last_update_date";
    @SerializedName(SERIALIZED_NAME_LAST_UPDATE_DATE)
    private OffsetDateTime lastUpdateDate;

    public CharacterFatigueResponse jumpFatigueExpireDate(OffsetDateTime jumpFatigueExpireDate) {

        this.jumpFatigueExpireDate = jumpFatigueExpireDate;
        return this;
    }

    /**
     * Character&#39;s jump fatigue expiry
     * 
     * @return jumpFatigueExpireDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Character's jump fatigue expiry")
    public OffsetDateTime getJumpFatigueExpireDate() {
        return jumpFatigueExpireDate;
    }

    public void setJumpFatigueExpireDate(OffsetDateTime jumpFatigueExpireDate) {
        this.jumpFatigueExpireDate = jumpFatigueExpireDate;
    }

    public CharacterFatigueResponse lastJumpDate(OffsetDateTime lastJumpDate) {

        this.lastJumpDate = lastJumpDate;
        return this;
    }

    /**
     * Character&#39;s last jump activation
     * 
     * @return lastJumpDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Character's last jump activation")
    public OffsetDateTime getLastJumpDate() {
        return lastJumpDate;
    }

    public void setLastJumpDate(OffsetDateTime lastJumpDate) {
        this.lastJumpDate = lastJumpDate;
    }

    public CharacterFatigueResponse lastUpdateDate(OffsetDateTime lastUpdateDate) {

        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    /**
     * Character&#39;s last jump update
     * 
     * @return lastUpdateDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Character's last jump update")
    public OffsetDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(OffsetDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterFatigueResponse characterFatigueResponse = (CharacterFatigueResponse) o;
        return Objects.equals(this.jumpFatigueExpireDate, characterFatigueResponse.jumpFatigueExpireDate)
                && Objects.equals(this.lastJumpDate, characterFatigueResponse.lastJumpDate)
                && Objects.equals(this.lastUpdateDate, characterFatigueResponse.lastUpdateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jumpFatigueExpireDate, lastJumpDate, lastUpdateDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterFatigueResponse {\n");
        sb.append("    jumpFatigueExpireDate: ").append(toIndentedString(jumpFatigueExpireDate)).append("\n");
        sb.append("    lastJumpDate: ").append(toIndentedString(lastJumpDate)).append("\n");
        sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
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

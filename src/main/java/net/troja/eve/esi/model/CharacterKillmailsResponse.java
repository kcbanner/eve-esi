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
public class CharacterKillmailsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_KILLMAIL_HASH = "killmail_hash";
    @SerializedName(SERIALIZED_NAME_KILLMAIL_HASH)
    private String killmailHash;

    public static final String SERIALIZED_NAME_KILLMAIL_ID = "killmail_id";
    @SerializedName(SERIALIZED_NAME_KILLMAIL_ID)
    private Integer killmailId;

    public CharacterKillmailsResponse killmailHash(String killmailHash) {
        this.killmailHash = killmailHash;
        return this;
    }

    /**
     * A hash of this killmail
     * 
     * @return killmailHash
     **/
    @ApiModelProperty(required = true, value = "A hash of this killmail")
    public String getKillmailHash() {
        return killmailHash;
    }

    public void setKillmailHash(String killmailHash) {
        this.killmailHash = killmailHash;
    }

    public CharacterKillmailsResponse killmailId(Integer killmailId) {
        this.killmailId = killmailId;
        return this;
    }

    /**
     * ID of this killmail
     * 
     * @return killmailId
     **/
    @ApiModelProperty(required = true, value = "ID of this killmail")
    public Integer getKillmailId() {
        return killmailId;
    }

    public void setKillmailId(Integer killmailId) {
        this.killmailId = killmailId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterKillmailsResponse characterKillmailsResponse = (CharacterKillmailsResponse) o;
        return Objects.equals(this.killmailHash, characterKillmailsResponse.killmailHash)
                && Objects.equals(this.killmailId, characterKillmailsResponse.killmailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(killmailHash, killmailId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterKillmailsResponse {\n");
        sb.append("    killmailHash: ").append(toIndentedString(killmailHash)).append("\n");
        sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
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

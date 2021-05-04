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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterAffiliationResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ALLIANCE_ID = "alliance_id";
    @SerializedName(SERIALIZED_NAME_ALLIANCE_ID)
    private Integer allianceId;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public static final String SERIALIZED_NAME_CORPORATION_ID = "corporation_id";
    @SerializedName(SERIALIZED_NAME_CORPORATION_ID)
    private Integer corporationId;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public CharacterAffiliationResponse allianceId(Integer allianceId) {

        this.allianceId = allianceId;
        return this;
    }

    /**
     * The character&#39;s alliance ID, if their corporation is in an alliance
     * 
     * @return allianceId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The character's alliance ID, if their corporation is in an alliance")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public CharacterAffiliationResponse characterId(Integer characterId) {

        this.characterId = characterId;
        return this;
    }

    /**
     * The character&#39;s ID
     * 
     * @return characterId
     **/
    @ApiModelProperty(required = true, value = "The character's ID")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public CharacterAffiliationResponse corporationId(Integer corporationId) {

        this.corporationId = corporationId;
        return this;
    }

    /**
     * The character&#39;s corporation ID
     * 
     * @return corporationId
     **/
    @ApiModelProperty(required = true, value = "The character's corporation ID")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public CharacterAffiliationResponse factionId(Integer factionId) {

        this.factionId = factionId;
        return this;
    }

    /**
     * The character&#39;s faction ID, if their corporation is in a faction
     * 
     * @return factionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The character's faction ID, if their corporation is in a faction")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterAffiliationResponse characterAffiliationResponse = (CharacterAffiliationResponse) o;
        return Objects.equals(this.allianceId, characterAffiliationResponse.allianceId)
                && Objects.equals(this.characterId, characterAffiliationResponse.characterId)
                && Objects.equals(this.corporationId, characterAffiliationResponse.corporationId)
                && Objects.equals(this.factionId, characterAffiliationResponse.factionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceId, characterId, corporationId, factionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterAffiliationResponse {\n");
        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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

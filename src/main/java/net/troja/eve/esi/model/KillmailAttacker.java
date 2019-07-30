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
 * attacker object
 */
@ApiModel(description = "attacker object")
public class KillmailAttacker implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SHIP_TYPE_ID = "ship_type_id";
    @SerializedName(SERIALIZED_NAME_SHIP_TYPE_ID)
    private Integer shipTypeId;

    public static final String SERIALIZED_NAME_ALLIANCE_ID = "alliance_id";
    @SerializedName(SERIALIZED_NAME_ALLIANCE_ID)
    private Integer allianceId;

    public static final String SERIALIZED_NAME_CORPORATION_ID = "corporation_id";
    @SerializedName(SERIALIZED_NAME_CORPORATION_ID)
    private Integer corporationId;

    public static final String SERIALIZED_NAME_SECURITY_STATUS = "security_status";
    @SerializedName(SERIALIZED_NAME_SECURITY_STATUS)
    private Float securityStatus;

    public static final String SERIALIZED_NAME_WEAPON_TYPE_ID = "weapon_type_id";
    @SerializedName(SERIALIZED_NAME_WEAPON_TYPE_ID)
    private Integer weaponTypeId;

    public static final String SERIALIZED_NAME_DAMAGE_DONE = "damage_done";
    @SerializedName(SERIALIZED_NAME_DAMAGE_DONE)
    private Integer damageDone;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public static final String SERIALIZED_NAME_FINAL_BLOW = "final_blow";
    @SerializedName(SERIALIZED_NAME_FINAL_BLOW)
    private Boolean finalBlow;

    public KillmailAttacker shipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * What ship was the attacker flying
     * 
     * @return shipTypeId
     **/
    @ApiModelProperty(value = "What ship was the attacker flying ")
    public Integer getShipTypeId() {
        return shipTypeId;
    }

    public void setShipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
    }

    public KillmailAttacker allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * alliance_id integer
     * 
     * @return allianceId
     **/
    @ApiModelProperty(value = "alliance_id integer")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public KillmailAttacker corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public KillmailAttacker securityStatus(Float securityStatus) {
        this.securityStatus = securityStatus;
        return this;
    }

    /**
     * Security status for the attacker
     * 
     * @return securityStatus
     **/
    @ApiModelProperty(required = true, value = "Security status for the attacker ")
    public Float getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(Float securityStatus) {
        this.securityStatus = securityStatus;
    }

    public KillmailAttacker weaponTypeId(Integer weaponTypeId) {
        this.weaponTypeId = weaponTypeId;
        return this;
    }

    /**
     * What weapon was used by the attacker for the kill
     * 
     * @return weaponTypeId
     **/
    @ApiModelProperty(value = "What weapon was used by the attacker for the kill ")
    public Integer getWeaponTypeId() {
        return weaponTypeId;
    }

    public void setWeaponTypeId(Integer weaponTypeId) {
        this.weaponTypeId = weaponTypeId;
    }

    public KillmailAttacker damageDone(Integer damageDone) {
        this.damageDone = damageDone;
        return this;
    }

    /**
     * damage_done integer
     * 
     * @return damageDone
     **/
    @ApiModelProperty(required = true, value = "damage_done integer")
    public Integer getDamageDone() {
        return damageDone;
    }

    public void setDamageDone(Integer damageDone) {
        this.damageDone = damageDone;
    }

    public KillmailAttacker factionId(Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * faction_id integer
     * 
     * @return factionId
     **/
    @ApiModelProperty(value = "faction_id integer")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public KillmailAttacker characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public KillmailAttacker finalBlow(Boolean finalBlow) {
        this.finalBlow = finalBlow;
        return this;
    }

    /**
     * Was the attacker the one to achieve the final blow
     * 
     * @return finalBlow
     **/
    @ApiModelProperty(required = true, value = "Was the attacker the one to achieve the final blow ")
    public Boolean getFinalBlow() {
        return finalBlow;
    }

    public void setFinalBlow(Boolean finalBlow) {
        this.finalBlow = finalBlow;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillmailAttacker killmailAttacker = (KillmailAttacker) o;
        return Objects.equals(this.shipTypeId, killmailAttacker.shipTypeId)
                && Objects.equals(this.allianceId, killmailAttacker.allianceId)
                && Objects.equals(this.corporationId, killmailAttacker.corporationId)
                && Objects.equals(this.securityStatus, killmailAttacker.securityStatus)
                && Objects.equals(this.weaponTypeId, killmailAttacker.weaponTypeId)
                && Objects.equals(this.damageDone, killmailAttacker.damageDone)
                && Objects.equals(this.factionId, killmailAttacker.factionId)
                && Objects.equals(this.characterId, killmailAttacker.characterId)
                && Objects.equals(this.finalBlow, killmailAttacker.finalBlow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipTypeId, allianceId, corporationId, securityStatus, weaponTypeId, damageDone, factionId,
                characterId, finalBlow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillmailAttacker {\n");
        sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
        sb.append("    weaponTypeId: ").append(toIndentedString(weaponTypeId)).append("\n");
        sb.append("    damageDone: ").append(toIndentedString(damageDone)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    finalBlow: ").append(toIndentedString(finalBlow)).append("\n");
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

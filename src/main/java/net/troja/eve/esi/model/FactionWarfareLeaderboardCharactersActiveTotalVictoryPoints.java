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
 * active_total object
 */
@ApiModel(description = "active_total object")
public class FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private Integer amount;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints amount(Integer amount) {

        this.amount = amount;
        return this;
    }

    /**
     * Amount of victory points
     * 
     * @return amount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Amount of victory points")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints characterId(Integer characterId) {

        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints factionWarfareLeaderboardCharactersActiveTotalVictoryPoints = (FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints) o;
        return Objects.equals(this.amount, factionWarfareLeaderboardCharactersActiveTotalVictoryPoints.amount)
                && Objects.equals(this.characterId,
                        factionWarfareLeaderboardCharactersActiveTotalVictoryPoints.characterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, characterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
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

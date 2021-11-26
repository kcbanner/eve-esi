/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.10.1
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
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationsKills;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationsVictoryPoints;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class FactionWarfareLeaderboardCorporationsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_KILLS = "kills";
    @SerializedName(SERIALIZED_NAME_KILLS)
    private FactionWarfareLeaderboardCorporationsKills kills;

    public static final String SERIALIZED_NAME_VICTORY_POINTS = "victory_points";
    @SerializedName(SERIALIZED_NAME_VICTORY_POINTS)
    private FactionWarfareLeaderboardCorporationsVictoryPoints victoryPoints;

    public FactionWarfareLeaderboardCorporationsResponse kills(FactionWarfareLeaderboardCorporationsKills kills) {

        this.kills = kills;
        return this;
    }

    /**
     * Get kills
     * 
     * @return kills
     **/
    @ApiModelProperty(required = true, value = "")
    public FactionWarfareLeaderboardCorporationsKills getKills() {
        return kills;
    }

    public void setKills(FactionWarfareLeaderboardCorporationsKills kills) {
        this.kills = kills;
    }

    public FactionWarfareLeaderboardCorporationsResponse victoryPoints(
            FactionWarfareLeaderboardCorporationsVictoryPoints victoryPoints) {

        this.victoryPoints = victoryPoints;
        return this;
    }

    /**
     * Get victoryPoints
     * 
     * @return victoryPoints
     **/
    @ApiModelProperty(required = true, value = "")
    public FactionWarfareLeaderboardCorporationsVictoryPoints getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(FactionWarfareLeaderboardCorporationsVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCorporationsResponse factionWarfareLeaderboardCorporationsResponse = (FactionWarfareLeaderboardCorporationsResponse) o;
        return Objects.equals(this.kills, factionWarfareLeaderboardCorporationsResponse.kills)
                && Objects.equals(this.victoryPoints, factionWarfareLeaderboardCorporationsResponse.victoryPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kills, victoryPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCorporationsResponse {\n");
        sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
        sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
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

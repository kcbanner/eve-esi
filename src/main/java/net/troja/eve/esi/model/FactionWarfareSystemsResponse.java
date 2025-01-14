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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class FactionWarfareSystemsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * contested string
     */
    @JsonAdapter(ContestedEnum.Adapter.class)
    public enum ContestedEnum {
        CAPTURED("captured"),

        CONTESTED("contested"),

        UNCONTESTED("uncontested"),

        VULNERABLE("vulnerable");

        private String value;

        ContestedEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ContestedEnum fromValue(String value) {
            for (ContestedEnum b : ContestedEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ContestedEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ContestedEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ContestedEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ContestedEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_CONTESTED = "contested";
    @SerializedName(SERIALIZED_NAME_CONTESTED)
    private String contested;
    private ContestedEnum contestedEnum;

    public static final String SERIALIZED_NAME_OCCUPIER_FACTION_ID = "occupier_faction_id";
    @SerializedName(SERIALIZED_NAME_OCCUPIER_FACTION_ID)
    private Integer occupierFactionId;

    public static final String SERIALIZED_NAME_OWNER_FACTION_ID = "owner_faction_id";
    @SerializedName(SERIALIZED_NAME_OWNER_FACTION_ID)
    private Integer ownerFactionId;

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM_ID = "solar_system_id";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_ID)
    private Integer solarSystemId;

    public static final String SERIALIZED_NAME_VICTORY_POINTS = "victory_points";
    @SerializedName(SERIALIZED_NAME_VICTORY_POINTS)
    private Integer victoryPoints;

    public static final String SERIALIZED_NAME_VICTORY_POINTS_THRESHOLD = "victory_points_threshold";
    @SerializedName(SERIALIZED_NAME_VICTORY_POINTS_THRESHOLD)
    private Integer victoryPointsThreshold;

    public FactionWarfareSystemsResponse contested(ContestedEnum contestedEnum) {

        this.contestedEnum = contestedEnum;
        return this;
    }

    public FactionWarfareSystemsResponse contestedString(String contested) {

        this.contested = contested;
        return this;
    }

    /**
     * contested string
     * 
     * @return contested
     **/
    @ApiModelProperty(required = true, value = "contested string")
    public ContestedEnum getContested() {
        if (contestedEnum == null) {
            contestedEnum = ContestedEnum.fromValue(contested);
        }
        return contestedEnum;
    }

    public String getContestedString() {
        return contested;
    }

    public void setContested(ContestedEnum contestedEnum) {
        this.contestedEnum = contestedEnum;
    }

    public void setContestedString(String contested) {
        this.contested = contested;
    }

    public FactionWarfareSystemsResponse occupierFactionId(Integer occupierFactionId) {

        this.occupierFactionId = occupierFactionId;
        return this;
    }

    /**
     * occupier_faction_id integer
     * 
     * @return occupierFactionId
     **/
    @ApiModelProperty(required = true, value = "occupier_faction_id integer")
    public Integer getOccupierFactionId() {
        return occupierFactionId;
    }

    public void setOccupierFactionId(Integer occupierFactionId) {
        this.occupierFactionId = occupierFactionId;
    }

    public FactionWarfareSystemsResponse ownerFactionId(Integer ownerFactionId) {

        this.ownerFactionId = ownerFactionId;
        return this;
    }

    /**
     * owner_faction_id integer
     * 
     * @return ownerFactionId
     **/
    @ApiModelProperty(required = true, value = "owner_faction_id integer")
    public Integer getOwnerFactionId() {
        return ownerFactionId;
    }

    public void setOwnerFactionId(Integer ownerFactionId) {
        this.ownerFactionId = ownerFactionId;
    }

    public FactionWarfareSystemsResponse solarSystemId(Integer solarSystemId) {

        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * solar_system_id integer
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(required = true, value = "solar_system_id integer")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public FactionWarfareSystemsResponse victoryPoints(Integer victoryPoints) {

        this.victoryPoints = victoryPoints;
        return this;
    }

    /**
     * victory_points integer
     * 
     * @return victoryPoints
     **/
    @ApiModelProperty(required = true, value = "victory_points integer")
    public Integer getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(Integer victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public FactionWarfareSystemsResponse victoryPointsThreshold(Integer victoryPointsThreshold) {

        this.victoryPointsThreshold = victoryPointsThreshold;
        return this;
    }

    /**
     * victory_points_threshold integer
     * 
     * @return victoryPointsThreshold
     **/
    @ApiModelProperty(required = true, value = "victory_points_threshold integer")
    public Integer getVictoryPointsThreshold() {
        return victoryPointsThreshold;
    }

    public void setVictoryPointsThreshold(Integer victoryPointsThreshold) {
        this.victoryPointsThreshold = victoryPointsThreshold;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareSystemsResponse factionWarfareSystemsResponse = (FactionWarfareSystemsResponse) o;
        return Objects.equals(this.contested, factionWarfareSystemsResponse.contested)
                && Objects.equals(this.occupierFactionId, factionWarfareSystemsResponse.occupierFactionId)
                && Objects.equals(this.ownerFactionId, factionWarfareSystemsResponse.ownerFactionId)
                && Objects.equals(this.solarSystemId, factionWarfareSystemsResponse.solarSystemId)
                && Objects.equals(this.victoryPoints, factionWarfareSystemsResponse.victoryPoints)
                && Objects.equals(this.victoryPointsThreshold, factionWarfareSystemsResponse.victoryPointsThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contested, occupierFactionId, ownerFactionId, solarSystemId, victoryPoints,
                victoryPointsThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareSystemsResponse {\n");
        sb.append("    contested: ").append(toIndentedString(contested)).append("\n");
        sb.append("    occupierFactionId: ").append(toIndentedString(occupierFactionId)).append("\n");
        sb.append("    ownerFactionId: ").append(toIndentedString(ownerFactionId)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
        sb.append("    victoryPointsThreshold: ").append(toIndentedString(victoryPointsThreshold)).append("\n");
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

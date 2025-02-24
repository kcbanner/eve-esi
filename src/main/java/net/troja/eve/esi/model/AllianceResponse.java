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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class AllianceResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CREATOR_CORPORATION_ID = "creator_corporation_id";
    @SerializedName(SERIALIZED_NAME_CREATOR_CORPORATION_ID)
    private Integer creatorCorporationId;

    public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
    @SerializedName(SERIALIZED_NAME_CREATOR_ID)
    private Integer creatorId;

    public static final String SERIALIZED_NAME_DATE_FOUNDED = "date_founded";
    @SerializedName(SERIALIZED_NAME_DATE_FOUNDED)
    private OffsetDateTime dateFounded;

    public static final String SERIALIZED_NAME_EXECUTOR_CORPORATION_ID = "executor_corporation_id";
    @SerializedName(SERIALIZED_NAME_EXECUTOR_CORPORATION_ID)
    private Integer executorCorporationId;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_TICKER = "ticker";
    @SerializedName(SERIALIZED_NAME_TICKER)
    private String ticker;

    public AllianceResponse creatorCorporationId(Integer creatorCorporationId) {

        this.creatorCorporationId = creatorCorporationId;
        return this;
    }

    /**
     * ID of the corporation that created the alliance
     * 
     * @return creatorCorporationId
     **/
    @ApiModelProperty(required = true, value = "ID of the corporation that created the alliance")
    public Integer getCreatorCorporationId() {
        return creatorCorporationId;
    }

    public void setCreatorCorporationId(Integer creatorCorporationId) {
        this.creatorCorporationId = creatorCorporationId;
    }

    public AllianceResponse creatorId(Integer creatorId) {

        this.creatorId = creatorId;
        return this;
    }

    /**
     * ID of the character that created the alliance
     * 
     * @return creatorId
     **/
    @ApiModelProperty(required = true, value = "ID of the character that created the alliance")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public AllianceResponse dateFounded(OffsetDateTime dateFounded) {

        this.dateFounded = dateFounded;
        return this;
    }

    /**
     * date_founded string
     * 
     * @return dateFounded
     **/
    @ApiModelProperty(required = true, value = "date_founded string")
    public OffsetDateTime getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(OffsetDateTime dateFounded) {
        this.dateFounded = dateFounded;
    }

    public AllianceResponse executorCorporationId(Integer executorCorporationId) {

        this.executorCorporationId = executorCorporationId;
        return this;
    }

    /**
     * the executor corporation ID, if this alliance is not closed
     * 
     * @return executorCorporationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "the executor corporation ID, if this alliance is not closed")
    public Integer getExecutorCorporationId() {
        return executorCorporationId;
    }

    public void setExecutorCorporationId(Integer executorCorporationId) {
        this.executorCorporationId = executorCorporationId;
    }

    public AllianceResponse factionId(Integer factionId) {

        this.factionId = factionId;
        return this;
    }

    /**
     * Faction ID this alliance is fighting for, if this alliance is enlisted in
     * factional warfare
     * 
     * @return factionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Faction ID this alliance is fighting for, if this alliance is enlisted in factional warfare")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public AllianceResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * the full name of the alliance
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "the full name of the alliance")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AllianceResponse ticker(String ticker) {

        this.ticker = ticker;
        return this;
    }

    /**
     * the short name of the alliance
     * 
     * @return ticker
     **/
    @ApiModelProperty(required = true, value = "the short name of the alliance")
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllianceResponse allianceResponse = (AllianceResponse) o;
        return Objects.equals(this.creatorCorporationId, allianceResponse.creatorCorporationId)
                && Objects.equals(this.creatorId, allianceResponse.creatorId)
                && Objects.equals(this.dateFounded, allianceResponse.dateFounded)
                && Objects.equals(this.executorCorporationId, allianceResponse.executorCorporationId)
                && Objects.equals(this.factionId, allianceResponse.factionId)
                && Objects.equals(this.name, allianceResponse.name)
                && Objects.equals(this.ticker, allianceResponse.ticker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creatorCorporationId, creatorId, dateFounded, executorCorporationId, factionId, name,
                ticker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllianceResponse {\n");
        sb.append("    creatorCorporationId: ").append(toIndentedString(creatorCorporationId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    dateFounded: ").append(toIndentedString(dateFounded)).append("\n");
        sb.append("    executorCorporationId: ").append(toIndentedString(executorCorporationId)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

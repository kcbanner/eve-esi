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
public class CharacterResearchAgentsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
    @SerializedName(SERIALIZED_NAME_AGENT_ID)
    private Integer agentId;

    public static final String SERIALIZED_NAME_POINTS_PER_DAY = "points_per_day";
    @SerializedName(SERIALIZED_NAME_POINTS_PER_DAY)
    private Float pointsPerDay;

    public static final String SERIALIZED_NAME_REMAINDER_POINTS = "remainder_points";
    @SerializedName(SERIALIZED_NAME_REMAINDER_POINTS)
    private Float remainderPoints;

    public static final String SERIALIZED_NAME_SKILL_TYPE_ID = "skill_type_id";
    @SerializedName(SERIALIZED_NAME_SKILL_TYPE_ID)
    private Integer skillTypeId;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private OffsetDateTime startedAt;

    public CharacterResearchAgentsResponse agentId(Integer agentId) {

        this.agentId = agentId;
        return this;
    }

    /**
     * agent_id integer
     * 
     * @return agentId
     **/
    @ApiModelProperty(required = true, value = "agent_id integer")
    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public CharacterResearchAgentsResponse pointsPerDay(Float pointsPerDay) {

        this.pointsPerDay = pointsPerDay;
        return this;
    }

    /**
     * points_per_day number
     * 
     * @return pointsPerDay
     **/
    @ApiModelProperty(required = true, value = "points_per_day number")
    public Float getPointsPerDay() {
        return pointsPerDay;
    }

    public void setPointsPerDay(Float pointsPerDay) {
        this.pointsPerDay = pointsPerDay;
    }

    public CharacterResearchAgentsResponse remainderPoints(Float remainderPoints) {

        this.remainderPoints = remainderPoints;
        return this;
    }

    /**
     * remainder_points number
     * 
     * @return remainderPoints
     **/
    @ApiModelProperty(required = true, value = "remainder_points number")
    public Float getRemainderPoints() {
        return remainderPoints;
    }

    public void setRemainderPoints(Float remainderPoints) {
        this.remainderPoints = remainderPoints;
    }

    public CharacterResearchAgentsResponse skillTypeId(Integer skillTypeId) {

        this.skillTypeId = skillTypeId;
        return this;
    }

    /**
     * skill_type_id integer
     * 
     * @return skillTypeId
     **/
    @ApiModelProperty(required = true, value = "skill_type_id integer")
    public Integer getSkillTypeId() {
        return skillTypeId;
    }

    public void setSkillTypeId(Integer skillTypeId) {
        this.skillTypeId = skillTypeId;
    }

    public CharacterResearchAgentsResponse startedAt(OffsetDateTime startedAt) {

        this.startedAt = startedAt;
        return this;
    }

    /**
     * started_at string
     * 
     * @return startedAt
     **/
    @ApiModelProperty(required = true, value = "started_at string")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterResearchAgentsResponse characterResearchAgentsResponse = (CharacterResearchAgentsResponse) o;
        return Objects.equals(this.agentId, characterResearchAgentsResponse.agentId)
                && Objects.equals(this.pointsPerDay, characterResearchAgentsResponse.pointsPerDay)
                && Objects.equals(this.remainderPoints, characterResearchAgentsResponse.remainderPoints)
                && Objects.equals(this.skillTypeId, characterResearchAgentsResponse.skillTypeId)
                && Objects.equals(this.startedAt, characterResearchAgentsResponse.startedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, pointsPerDay, remainderPoints, skillTypeId, startedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterResearchAgentsResponse {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    pointsPerDay: ").append(toIndentedString(pointsPerDay)).append("\n");
        sb.append("    remainderPoints: ").append(toIndentedString(remainderPoints)).append("\n");
        sb.append("    skillTypeId: ").append(toIndentedString(skillTypeId)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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

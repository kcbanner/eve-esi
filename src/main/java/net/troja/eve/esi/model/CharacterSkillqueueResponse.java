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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterSkillqueueResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_QUEUE_POSITION = "queue_position";
    @SerializedName(SERIALIZED_NAME_QUEUE_POSITION)
    private Integer queuePosition;

    public static final String SERIALIZED_NAME_FINISH_DATE = "finish_date";
    @SerializedName(SERIALIZED_NAME_FINISH_DATE)
    private OffsetDateTime finishDate;

    public static final String SERIALIZED_NAME_LEVEL_END_SP = "level_end_sp";
    @SerializedName(SERIALIZED_NAME_LEVEL_END_SP)
    private Integer levelEndSp;

    public static final String SERIALIZED_NAME_LEVEL_START_SP = "level_start_sp";
    @SerializedName(SERIALIZED_NAME_LEVEL_START_SP)
    private Integer levelStartSp;

    public static final String SERIALIZED_NAME_FINISHED_LEVEL = "finished_level";
    @SerializedName(SERIALIZED_NAME_FINISHED_LEVEL)
    private Integer finishedLevel;

    public static final String SERIALIZED_NAME_SKILL_ID = "skill_id";
    @SerializedName(SERIALIZED_NAME_SKILL_ID)
    private Integer skillId;

    public static final String SERIALIZED_NAME_TRAINING_START_SP = "training_start_sp";
    @SerializedName(SERIALIZED_NAME_TRAINING_START_SP)
    private Integer trainingStartSp;

    public static final String SERIALIZED_NAME_START_DATE = "start_date";
    @SerializedName(SERIALIZED_NAME_START_DATE)
    private OffsetDateTime startDate;

    public CharacterSkillqueueResponse queuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
        return this;
    }

    /**
     * queue_position integer
     * 
     * @return queuePosition
     **/
    @ApiModelProperty(required = true, value = "queue_position integer")
    public Integer getQueuePosition() {
        return queuePosition;
    }

    public void setQueuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
    }

    public CharacterSkillqueueResponse finishDate(OffsetDateTime finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    /**
     * Date on which training of the skill will complete. Omitted if the skill
     * queue is paused.
     * 
     * @return finishDate
     **/
    @ApiModelProperty(value = "Date on which training of the skill will complete. Omitted if the skill queue is paused.")
    public OffsetDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(OffsetDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public CharacterSkillqueueResponse levelEndSp(Integer levelEndSp) {
        this.levelEndSp = levelEndSp;
        return this;
    }

    /**
     * level_end_sp integer
     * 
     * @return levelEndSp
     **/
    @ApiModelProperty(value = "level_end_sp integer")
    public Integer getLevelEndSp() {
        return levelEndSp;
    }

    public void setLevelEndSp(Integer levelEndSp) {
        this.levelEndSp = levelEndSp;
    }

    public CharacterSkillqueueResponse levelStartSp(Integer levelStartSp) {
        this.levelStartSp = levelStartSp;
        return this;
    }

    /**
     * Amount of SP that was in the skill when it started training it&#39;s
     * current level. Used to calculate % of current level complete.
     * 
     * @return levelStartSp
     **/
    @ApiModelProperty(value = "Amount of SP that was in the skill when it started training it's current level. Used to calculate % of current level complete.")
    public Integer getLevelStartSp() {
        return levelStartSp;
    }

    public void setLevelStartSp(Integer levelStartSp) {
        this.levelStartSp = levelStartSp;
    }

    public CharacterSkillqueueResponse finishedLevel(Integer finishedLevel) {
        this.finishedLevel = finishedLevel;
        return this;
    }

    /**
     * finished_level integer minimum: 0 maximum: 5
     * 
     * @return finishedLevel
     **/
    @ApiModelProperty(required = true, value = "finished_level integer")
    public Integer getFinishedLevel() {
        return finishedLevel;
    }

    public void setFinishedLevel(Integer finishedLevel) {
        this.finishedLevel = finishedLevel;
    }

    public CharacterSkillqueueResponse skillId(Integer skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * skill_id integer
     * 
     * @return skillId
     **/
    @ApiModelProperty(required = true, value = "skill_id integer")
    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public CharacterSkillqueueResponse trainingStartSp(Integer trainingStartSp) {
        this.trainingStartSp = trainingStartSp;
        return this;
    }

    /**
     * training_start_sp integer
     * 
     * @return trainingStartSp
     **/
    @ApiModelProperty(value = "training_start_sp integer")
    public Integer getTrainingStartSp() {
        return trainingStartSp;
    }

    public void setTrainingStartSp(Integer trainingStartSp) {
        this.trainingStartSp = trainingStartSp;
    }

    public CharacterSkillqueueResponse startDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * start_date string
     * 
     * @return startDate
     **/
    @ApiModelProperty(value = "start_date string")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterSkillqueueResponse characterSkillqueueResponse = (CharacterSkillqueueResponse) o;
        return Objects.equals(this.queuePosition, characterSkillqueueResponse.queuePosition)
                && Objects.equals(this.finishDate, characterSkillqueueResponse.finishDate)
                && Objects.equals(this.levelEndSp, characterSkillqueueResponse.levelEndSp)
                && Objects.equals(this.levelStartSp, characterSkillqueueResponse.levelStartSp)
                && Objects.equals(this.finishedLevel, characterSkillqueueResponse.finishedLevel)
                && Objects.equals(this.skillId, characterSkillqueueResponse.skillId)
                && Objects.equals(this.trainingStartSp, characterSkillqueueResponse.trainingStartSp)
                && Objects.equals(this.startDate, characterSkillqueueResponse.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queuePosition, finishDate, levelEndSp, levelStartSp, finishedLevel, skillId,
                trainingStartSp, startDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterSkillqueueResponse {\n");
        sb.append("    queuePosition: ").append(toIndentedString(queuePosition)).append("\n");
        sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
        sb.append("    levelEndSp: ").append(toIndentedString(levelEndSp)).append("\n");
        sb.append("    levelStartSp: ").append(toIndentedString(levelStartSp)).append("\n");
        sb.append("    finishedLevel: ").append(toIndentedString(finishedLevel)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    trainingStartSp: ").append(toIndentedString(trainingStartSp)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

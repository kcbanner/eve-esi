/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.17
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CharacterIndustryJobsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
    @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
    private Integer activityId;

    public static final String SERIALIZED_NAME_BLUEPRINT_ID = "blueprint_id";
    @SerializedName(SERIALIZED_NAME_BLUEPRINT_ID)
    private Long blueprintId;

    public static final String SERIALIZED_NAME_BLUEPRINT_LOCATION_ID = "blueprint_location_id";
    @SerializedName(SERIALIZED_NAME_BLUEPRINT_LOCATION_ID)
    private Long blueprintLocationId;

    public static final String SERIALIZED_NAME_BLUEPRINT_TYPE_ID = "blueprint_type_id";
    @SerializedName(SERIALIZED_NAME_BLUEPRINT_TYPE_ID)
    private Integer blueprintTypeId;

    public static final String SERIALIZED_NAME_COMPLETED_CHARACTER_ID = "completed_character_id";
    @SerializedName(SERIALIZED_NAME_COMPLETED_CHARACTER_ID)
    private Integer completedCharacterId;

    public static final String SERIALIZED_NAME_COMPLETED_DATE = "completed_date";
    @SerializedName(SERIALIZED_NAME_COMPLETED_DATE)
    private OffsetDateTime completedDate;

    public static final String SERIALIZED_NAME_COST = "cost";
    @SerializedName(SERIALIZED_NAME_COST)
    private Double cost;

    public static final String SERIALIZED_NAME_DURATION = "duration";
    @SerializedName(SERIALIZED_NAME_DURATION)
    private Integer duration;

    public static final String SERIALIZED_NAME_END_DATE = "end_date";
    @SerializedName(SERIALIZED_NAME_END_DATE)
    private OffsetDateTime endDate;

    public static final String SERIALIZED_NAME_FACILITY_ID = "facility_id";
    @SerializedName(SERIALIZED_NAME_FACILITY_ID)
    private Long facilityId;

    public static final String SERIALIZED_NAME_INSTALLER_ID = "installer_id";
    @SerializedName(SERIALIZED_NAME_INSTALLER_ID)
    private Integer installerId;

    public static final String SERIALIZED_NAME_JOB_ID = "job_id";
    @SerializedName(SERIALIZED_NAME_JOB_ID)
    private Integer jobId;

    public static final String SERIALIZED_NAME_LICENSED_RUNS = "licensed_runs";
    @SerializedName(SERIALIZED_NAME_LICENSED_RUNS)
    private Integer licensedRuns;

    public static final String SERIALIZED_NAME_OUTPUT_LOCATION_ID = "output_location_id";
    @SerializedName(SERIALIZED_NAME_OUTPUT_LOCATION_ID)
    private Long outputLocationId;

    public static final String SERIALIZED_NAME_PAUSE_DATE = "pause_date";
    @SerializedName(SERIALIZED_NAME_PAUSE_DATE)
    private OffsetDateTime pauseDate;

    public static final String SERIALIZED_NAME_PROBABILITY = "probability";
    @SerializedName(SERIALIZED_NAME_PROBABILITY)
    private Float probability;

    public static final String SERIALIZED_NAME_PRODUCT_TYPE_ID = "product_type_id";
    @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE_ID)
    private Integer productTypeId;

    public static final String SERIALIZED_NAME_RUNS = "runs";
    @SerializedName(SERIALIZED_NAME_RUNS)
    private Integer runs;

    public static final String SERIALIZED_NAME_START_DATE = "start_date";
    @SerializedName(SERIALIZED_NAME_START_DATE)
    private OffsetDateTime startDate;

    public static final String SERIALIZED_NAME_STATION_ID = "station_id";
    @SerializedName(SERIALIZED_NAME_STATION_ID)
    private Long stationId;

    /**
     * status string
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        ACTIVE("active"),

        CANCELLED("cancelled"),

        DELIVERED("delivered"),

        PAUSED("paused"),

        READY("ready"),

        REVERTED("reverted");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private String status;
    private StatusEnum statusEnum;

    public static final String SERIALIZED_NAME_SUCCESSFUL_RUNS = "successful_runs";
    @SerializedName(SERIALIZED_NAME_SUCCESSFUL_RUNS)
    private Integer successfulRuns;

    public CharacterIndustryJobsResponse() {
    }

    public CharacterIndustryJobsResponse activityId(Integer activityId) {

        this.activityId = activityId;
        return this;
    }

    /**
     * Job activity ID
     * 
     * @return activityId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Job activity ID")
    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public CharacterIndustryJobsResponse blueprintId(Long blueprintId) {

        this.blueprintId = blueprintId;
        return this;
    }

    /**
     * blueprint_id integer
     * 
     * @return blueprintId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "blueprint_id integer")
    public Long getBlueprintId() {
        return blueprintId;
    }

    public void setBlueprintId(Long blueprintId) {
        this.blueprintId = blueprintId;
    }

    public CharacterIndustryJobsResponse blueprintLocationId(Long blueprintLocationId) {

        this.blueprintLocationId = blueprintLocationId;
        return this;
    }

    /**
     * Location ID of the location from which the blueprint was installed.
     * Normally a station ID, but can also be an asset (e.g. container) or
     * corporation facility
     * 
     * @return blueprintLocationId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility")
    public Long getBlueprintLocationId() {
        return blueprintLocationId;
    }

    public void setBlueprintLocationId(Long blueprintLocationId) {
        this.blueprintLocationId = blueprintLocationId;
    }

    public CharacterIndustryJobsResponse blueprintTypeId(Integer blueprintTypeId) {

        this.blueprintTypeId = blueprintTypeId;
        return this;
    }

    /**
     * blueprint_type_id integer
     * 
     * @return blueprintTypeId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "blueprint_type_id integer")
    public Integer getBlueprintTypeId() {
        return blueprintTypeId;
    }

    public void setBlueprintTypeId(Integer blueprintTypeId) {
        this.blueprintTypeId = blueprintTypeId;
    }

    public CharacterIndustryJobsResponse completedCharacterId(Integer completedCharacterId) {

        this.completedCharacterId = completedCharacterId;
        return this;
    }

    /**
     * ID of the character which completed this job
     * 
     * @return completedCharacterId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of the character which completed this job")
    public Integer getCompletedCharacterId() {
        return completedCharacterId;
    }

    public void setCompletedCharacterId(Integer completedCharacterId) {
        this.completedCharacterId = completedCharacterId;
    }

    public CharacterIndustryJobsResponse completedDate(OffsetDateTime completedDate) {

        this.completedDate = completedDate;
        return this;
    }

    /**
     * Date and time when this job was completed
     * 
     * @return completedDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Date and time when this job was completed")
    public OffsetDateTime getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(OffsetDateTime completedDate) {
        this.completedDate = completedDate;
    }

    public CharacterIndustryJobsResponse cost(Double cost) {

        this.cost = cost;
        return this;
    }

    /**
     * The sume of job installation fee and industry facility tax
     * 
     * @return cost
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The sume of job installation fee and industry facility tax")
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public CharacterIndustryJobsResponse duration(Integer duration) {

        this.duration = duration;
        return this;
    }

    /**
     * Job duration in seconds
     * 
     * @return duration
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Job duration in seconds")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CharacterIndustryJobsResponse endDate(OffsetDateTime endDate) {

        this.endDate = endDate;
        return this;
    }

    /**
     * Date and time when this job finished
     * 
     * @return endDate
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Date and time when this job finished")
    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }

    public CharacterIndustryJobsResponse facilityId(Long facilityId) {

        this.facilityId = facilityId;
        return this;
    }

    /**
     * ID of the facility where this job is running
     * 
     * @return facilityId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "ID of the facility where this job is running")
    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public CharacterIndustryJobsResponse installerId(Integer installerId) {

        this.installerId = installerId;
        return this;
    }

    /**
     * ID of the character which installed this job
     * 
     * @return installerId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "ID of the character which installed this job")
    public Integer getInstallerId() {
        return installerId;
    }

    public void setInstallerId(Integer installerId) {
        this.installerId = installerId;
    }

    public CharacterIndustryJobsResponse jobId(Integer jobId) {

        this.jobId = jobId;
        return this;
    }

    /**
     * Unique job ID
     * 
     * @return jobId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Unique job ID")
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public CharacterIndustryJobsResponse licensedRuns(Integer licensedRuns) {

        this.licensedRuns = licensedRuns;
        return this;
    }

    /**
     * Number of runs blueprint is licensed for
     * 
     * @return licensedRuns
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Number of runs blueprint is licensed for")
    public Integer getLicensedRuns() {
        return licensedRuns;
    }

    public void setLicensedRuns(Integer licensedRuns) {
        this.licensedRuns = licensedRuns;
    }

    public CharacterIndustryJobsResponse outputLocationId(Long outputLocationId) {

        this.outputLocationId = outputLocationId;
        return this;
    }

    /**
     * Location ID of the location to which the output of the job will be
     * delivered. Normally a station ID, but can also be a corporation facility
     * 
     * @return outputLocationId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility")
    public Long getOutputLocationId() {
        return outputLocationId;
    }

    public void setOutputLocationId(Long outputLocationId) {
        this.outputLocationId = outputLocationId;
    }

    public CharacterIndustryJobsResponse pauseDate(OffsetDateTime pauseDate) {

        this.pauseDate = pauseDate;
        return this;
    }

    /**
     * Date and time when this job was paused (i.e. time when the facility where
     * this job was installed went offline)
     * 
     * @return pauseDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Date and time when this job was paused (i.e. time when the facility where this job was installed went offline)")
    public OffsetDateTime getPauseDate() {
        return pauseDate;
    }

    public void setPauseDate(OffsetDateTime pauseDate) {
        this.pauseDate = pauseDate;
    }

    public CharacterIndustryJobsResponse probability(Float probability) {

        this.probability = probability;
        return this;
    }

    /**
     * Chance of success for invention
     * 
     * @return probability
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Chance of success for invention")
    public Float getProbability() {
        return probability;
    }

    public void setProbability(Float probability) {
        this.probability = probability;
    }

    public CharacterIndustryJobsResponse productTypeId(Integer productTypeId) {

        this.productTypeId = productTypeId;
        return this;
    }

    /**
     * Type ID of product (manufactured, copied or invented)
     * 
     * @return productTypeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Type ID of product (manufactured, copied or invented)")
    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public CharacterIndustryJobsResponse runs(Integer runs) {

        this.runs = runs;
        return this;
    }

    /**
     * Number of runs for a manufacturing job, or number of copies to make for a
     * blueprint copy
     * 
     * @return runs
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Number of runs for a manufacturing job, or number of copies to make for a blueprint copy")
    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public CharacterIndustryJobsResponse startDate(OffsetDateTime startDate) {

        this.startDate = startDate;
        return this;
    }

    /**
     * Date and time when this job started
     * 
     * @return startDate
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Date and time when this job started")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public CharacterIndustryJobsResponse stationId(Long stationId) {

        this.stationId = stationId;
        return this;
    }

    /**
     * ID of the station where industry facility is located
     * 
     * @return stationId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "ID of the station where industry facility is located")
    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public CharacterIndustryJobsResponse status(StatusEnum statusEnum) {

        this.statusEnum = statusEnum;
        return this;
    }

    public CharacterIndustryJobsResponse statusString(String status) {

        this.status = status;
        return this;
    }

    /**
     * status string
     * 
     * @return status
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "status string")
    public StatusEnum getStatus() {
        if (statusEnum == null) {
            statusEnum = StatusEnum.fromValue(status);
        }
        return statusEnum;
    }

    public String getStatusString() {
        return status;
    }

    public void setStatus(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public void setStatusString(String status) {
        this.status = status;
    }

    public CharacterIndustryJobsResponse successfulRuns(Integer successfulRuns) {

        this.successfulRuns = successfulRuns;
        return this;
    }

    /**
     * Number of successful runs for this job. Equal to runs unless this is an
     * invention job
     * 
     * @return successfulRuns
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Number of successful runs for this job. Equal to runs unless this is an invention job")
    public Integer getSuccessfulRuns() {
        return successfulRuns;
    }

    public void setSuccessfulRuns(Integer successfulRuns) {
        this.successfulRuns = successfulRuns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterIndustryJobsResponse characterIndustryJobsResponse = (CharacterIndustryJobsResponse) o;
        return Objects.equals(this.activityId, characterIndustryJobsResponse.activityId)
                && Objects.equals(this.blueprintId, characterIndustryJobsResponse.blueprintId)
                && Objects.equals(this.blueprintLocationId, characterIndustryJobsResponse.blueprintLocationId)
                && Objects.equals(this.blueprintTypeId, characterIndustryJobsResponse.blueprintTypeId)
                && Objects.equals(this.completedCharacterId, characterIndustryJobsResponse.completedCharacterId)
                && Objects.equals(this.completedDate, characterIndustryJobsResponse.completedDate)
                && Objects.equals(this.cost, characterIndustryJobsResponse.cost)
                && Objects.equals(this.duration, characterIndustryJobsResponse.duration)
                && Objects.equals(this.endDate, characterIndustryJobsResponse.endDate)
                && Objects.equals(this.facilityId, characterIndustryJobsResponse.facilityId)
                && Objects.equals(this.installerId, characterIndustryJobsResponse.installerId)
                && Objects.equals(this.jobId, characterIndustryJobsResponse.jobId)
                && Objects.equals(this.licensedRuns, characterIndustryJobsResponse.licensedRuns)
                && Objects.equals(this.outputLocationId, characterIndustryJobsResponse.outputLocationId)
                && Objects.equals(this.pauseDate, characterIndustryJobsResponse.pauseDate)
                && Objects.equals(this.probability, characterIndustryJobsResponse.probability)
                && Objects.equals(this.productTypeId, characterIndustryJobsResponse.productTypeId)
                && Objects.equals(this.runs, characterIndustryJobsResponse.runs)
                && Objects.equals(this.startDate, characterIndustryJobsResponse.startDate)
                && Objects.equals(this.stationId, characterIndustryJobsResponse.stationId)
                && Objects.equals(this.status, characterIndustryJobsResponse.status)
                && Objects.equals(this.successfulRuns, characterIndustryJobsResponse.successfulRuns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId, blueprintId, blueprintLocationId, blueprintTypeId, completedCharacterId,
                completedDate, cost, duration, endDate, facilityId, installerId, jobId, licensedRuns, outputLocationId,
                pauseDate, probability, productTypeId, runs, startDate, stationId, status, successfulRuns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterIndustryJobsResponse {\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    blueprintId: ").append(toIndentedString(blueprintId)).append("\n");
        sb.append("    blueprintLocationId: ").append(toIndentedString(blueprintLocationId)).append("\n");
        sb.append("    blueprintTypeId: ").append(toIndentedString(blueprintTypeId)).append("\n");
        sb.append("    completedCharacterId: ").append(toIndentedString(completedCharacterId)).append("\n");
        sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    facilityId: ").append(toIndentedString(facilityId)).append("\n");
        sb.append("    installerId: ").append(toIndentedString(installerId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    licensedRuns: ").append(toIndentedString(licensedRuns)).append("\n");
        sb.append("    outputLocationId: ").append(toIndentedString(outputLocationId)).append("\n");
        sb.append("    pauseDate: ").append(toIndentedString(pauseDate)).append("\n");
        sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
        sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
        sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    successfulRuns: ").append(toIndentedString(successfulRuns)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

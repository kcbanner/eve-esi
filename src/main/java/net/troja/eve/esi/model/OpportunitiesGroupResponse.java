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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpportunitiesGroupResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONNECTED_GROUPS = "connected_groups";
    @SerializedName(SERIALIZED_NAME_CONNECTED_GROUPS)
    private List<Integer> connectedGroups = new ArrayList<>();

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
    @SerializedName(SERIALIZED_NAME_GROUP_ID)
    private Integer groupId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
    @SerializedName(SERIALIZED_NAME_NOTIFICATION)
    private String notification;

    public static final String SERIALIZED_NAME_REQUIRED_TASKS = "required_tasks";
    @SerializedName(SERIALIZED_NAME_REQUIRED_TASKS)
    private List<Integer> requiredTasks = new ArrayList<>();

    public OpportunitiesGroupResponse() {
    }

    public OpportunitiesGroupResponse connectedGroups(List<Integer> connectedGroups) {

        this.connectedGroups = connectedGroups;
        return this;
    }

    public OpportunitiesGroupResponse addConnectedGroupsItem(Integer connectedGroupsItem) {
        this.connectedGroups.add(connectedGroupsItem);
        return this;
    }

    /**
     * The groups that are connected to this group on the opportunities map
     * 
     * @return connectedGroups
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The groups that are connected to this group on the opportunities map")
    public List<Integer> getConnectedGroups() {
        return connectedGroups;
    }

    public void setConnectedGroups(List<Integer> connectedGroups) {
        this.connectedGroups = connectedGroups;
    }

    public OpportunitiesGroupResponse description(String description) {

        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OpportunitiesGroupResponse groupId(Integer groupId) {

        this.groupId = groupId;
        return this;
    }

    /**
     * group_id integer
     * 
     * @return groupId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "group_id integer")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public OpportunitiesGroupResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpportunitiesGroupResponse notification(String notification) {

        this.notification = notification;
        return this;
    }

    /**
     * notification string
     * 
     * @return notification
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "notification string")
    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public OpportunitiesGroupResponse requiredTasks(List<Integer> requiredTasks) {

        this.requiredTasks = requiredTasks;
        return this;
    }

    public OpportunitiesGroupResponse addRequiredTasksItem(Integer requiredTasksItem) {
        this.requiredTasks.add(requiredTasksItem);
        return this;
    }

    /**
     * Tasks need to complete for this group
     * 
     * @return requiredTasks
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Tasks need to complete for this group")
    public List<Integer> getRequiredTasks() {
        return requiredTasks;
    }

    public void setRequiredTasks(List<Integer> requiredTasks) {
        this.requiredTasks = requiredTasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpportunitiesGroupResponse opportunitiesGroupResponse = (OpportunitiesGroupResponse) o;
        return Objects.equals(this.connectedGroups, opportunitiesGroupResponse.connectedGroups)
                && Objects.equals(this.description, opportunitiesGroupResponse.description)
                && Objects.equals(this.groupId, opportunitiesGroupResponse.groupId)
                && Objects.equals(this.name, opportunitiesGroupResponse.name)
                && Objects.equals(this.notification, opportunitiesGroupResponse.notification)
                && Objects.equals(this.requiredTasks, opportunitiesGroupResponse.requiredTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectedGroups, description, groupId, name, notification, requiredTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpportunitiesGroupResponse {\n");
        sb.append("    connectedGroups: ").append(toIndentedString(connectedGroups)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
        sb.append("    requiredTasks: ").append(toIndentedString(requiredTasks)).append("\n");
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

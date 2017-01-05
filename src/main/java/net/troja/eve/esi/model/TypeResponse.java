/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.2.dev3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class TypeResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("category_id")
    private Integer categoryId = null;

    @JsonProperty("graphic_id")
    private Integer graphicId = null;

    @JsonProperty("group_id")
    private Integer groupId = null;

    @JsonProperty("icon_id")
    private Integer iconId = null;

    @JsonProperty("type_description")
    private String typeDescription = null;

    @JsonProperty("type_name")
    private String typeName = null;

    public TypeResponse categoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * category_id integer
     * 
     * @return categoryId
     **/
    @ApiModelProperty(example = "null", required = true, value = "category_id integer")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public TypeResponse graphicId(Integer graphicId) {
        this.graphicId = graphicId;
        return this;
    }

    /**
     * graphic_id integer
     * 
     * @return graphicId
     **/
    @ApiModelProperty(example = "null", value = "graphic_id integer")
    public Integer getGraphicId() {
        return graphicId;
    }

    public void setGraphicId(Integer graphicId) {
        this.graphicId = graphicId;
    }

    public TypeResponse groupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * group_id integer
     * 
     * @return groupId
     **/
    @ApiModelProperty(example = "null", required = true, value = "group_id integer")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public TypeResponse iconId(Integer iconId) {
        this.iconId = iconId;
        return this;
    }

    /**
     * icon_id integer
     * 
     * @return iconId
     **/
    @ApiModelProperty(example = "null", value = "icon_id integer")
    public Integer getIconId() {
        return iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public TypeResponse typeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
        return this;
    }

    /**
     * type_description string
     * 
     * @return typeDescription
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_description string")
    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public TypeResponse typeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * type_name string
     * 
     * @return typeName
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_name string")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TypeResponse typeResponse = (TypeResponse) o;
        return Objects.equals(this.categoryId, typeResponse.categoryId)
                && Objects.equals(this.graphicId, typeResponse.graphicId)
                && Objects.equals(this.groupId, typeResponse.groupId)
                && Objects.equals(this.iconId, typeResponse.iconId)
                && Objects.equals(this.typeDescription, typeResponse.typeDescription)
                && Objects.equals(this.typeName, typeResponse.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, graphicId, groupId, iconId, typeDescription, typeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeResponse {\n");

        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    graphicId: ").append(toIndentedString(graphicId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
        sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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
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
 * content object
 */
@ApiModel(description = "content object")
public class PlanetContent implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("content")
    private Integer content = null;

    @JsonProperty("content_quantity")
    private Long contentQuantity = null;

    public PlanetContent content(Integer content) {
        this.content = content;
        return this;
    }

    /**
     * content integer
     * 
     * @return content
     **/
    @ApiModelProperty(example = "null", value = "content integer")
    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public PlanetContent contentQuantity(Long contentQuantity) {
        this.contentQuantity = contentQuantity;
        return this;
    }

    /**
     * content_quantity integer
     * 
     * @return contentQuantity
     **/
    @ApiModelProperty(example = "null", required = true, value = "content_quantity integer")
    public Long getContentQuantity() {
        return contentQuantity;
    }

    public void setContentQuantity(Long contentQuantity) {
        this.contentQuantity = contentQuantity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetContent planetContent = (PlanetContent) o;
        return Objects.equals(this.content, planetContent.content)
                && Objects.equals(this.contentQuantity, planetContent.contentQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, contentQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetContent {\n");

        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    contentQuantity: ").append(toIndentedString(contentQuantity)).append("\n");
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

/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
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
 * response schema
 */
@ApiModel(description = "response schema")
public class CharacterCalendarEvent implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * response string
     */
    public enum ResponseEnum {
        ACCEPTED("accepted"),

        DECLINED("declined"),

        TENTATIVE("tentative");

        private String value;

        ResponseEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResponseEnum fromValue(String text) {
            for (ResponseEnum b : ResponseEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("response")
    private ResponseEnum response = null;

    public CharacterCalendarEvent response(ResponseEnum response) {
        this.response = response;
        return this;
    }

    /**
     * response string
     * 
     * @return response
     **/
    @ApiModelProperty(example = "null", required = true, value = "response string")
    public ResponseEnum getResponse() {
        return response;
    }

    public void setResponse(ResponseEnum response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterCalendarEvent characterCalendarEvent = (CharacterCalendarEvent) o;
        return Objects.equals(this.response, characterCalendarEvent.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterCalendarEvent {\n");

        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterStandingsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * from_type string
     */
    @JsonAdapter(FromTypeEnum.Adapter.class)
    public enum FromTypeEnum {
        AGENT("agent"),

        NPC_CORP("npc_corp"),

        FACTION("faction");

        private String value;

        FromTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FromTypeEnum fromValue(String value) {
            for (FromTypeEnum b : FromTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<FromTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FromTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FromTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FromTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_FROM_TYPE = "from_type";
    @SerializedName(SERIALIZED_NAME_FROM_TYPE)
    private FromTypeEnum fromType;

    public static final String SERIALIZED_NAME_STANDING = "standing";
    @SerializedName(SERIALIZED_NAME_STANDING)
    private Float standing;

    public static final String SERIALIZED_NAME_FROM_ID = "from_id";
    @SerializedName(SERIALIZED_NAME_FROM_ID)
    private Integer fromId;

    public CharacterStandingsResponse fromType(FromTypeEnum fromType) {
        this.fromType = fromType;
        return this;
    }

    /**
     * from_type string
     * 
     * @return fromType
     **/
    @ApiModelProperty(required = true, value = "from_type string")
    public FromTypeEnum getFromType() {
        return fromType;
    }

    public void setFromType(FromTypeEnum fromType) {
        this.fromType = fromType;
    }

    public CharacterStandingsResponse standing(Float standing) {
        this.standing = standing;
        return this;
    }

    /**
     * standing number
     * 
     * @return standing
     **/
    @ApiModelProperty(required = true, value = "standing number")
    public Float getStanding() {
        return standing;
    }

    public void setStanding(Float standing) {
        this.standing = standing;
    }

    public CharacterStandingsResponse fromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    /**
     * from_id integer
     * 
     * @return fromId
     **/
    @ApiModelProperty(required = true, value = "from_id integer")
    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStandingsResponse characterStandingsResponse = (CharacterStandingsResponse) o;
        return Objects.equals(this.fromType, characterStandingsResponse.fromType)
                && Objects.equals(this.standing, characterStandingsResponse.standing)
                && Objects.equals(this.fromId, characterStandingsResponse.fromId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromType, standing, fromId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStandingsResponse {\n");
        sb.append("    fromType: ").append(toIndentedString(fromType)).append("\n");
        sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
        sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
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

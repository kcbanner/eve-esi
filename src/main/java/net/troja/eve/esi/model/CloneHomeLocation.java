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
 * home_location object
 */
@ApiModel(description = "home_location object")
public class CloneHomeLocation implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
    @SerializedName(SERIALIZED_NAME_LOCATION_ID)
    private Long locationId;

    /**
     * location_type string
     */
    @JsonAdapter(LocationTypeEnum.Adapter.class)
    public enum LocationTypeEnum {
        STATION("station"),

        STRUCTURE("structure");

        private String value;

        LocationTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LocationTypeEnum fromValue(String value) {
            for (LocationTypeEnum b : LocationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<LocationTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LocationTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LocationTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LocationTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
    @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
    private LocationTypeEnum locationType;

    public CloneHomeLocation locationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(value = "location_id integer")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CloneHomeLocation locationType(LocationTypeEnum locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     * location_type string
     * 
     * @return locationType
     **/
    @ApiModelProperty(value = "location_type string")
    public LocationTypeEnum getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationTypeEnum locationType) {
        this.locationType = locationType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloneHomeLocation cloneHomeLocation = (CloneHomeLocation) o;
        return Objects.equals(this.locationId, cloneHomeLocation.locationId)
                && Objects.equals(this.locationType, cloneHomeLocation.locationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneHomeLocation {\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
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

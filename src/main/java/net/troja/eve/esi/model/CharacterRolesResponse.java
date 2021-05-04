/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.7.15
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
public class CharacterRolesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * role string
     */
    @JsonAdapter(RolesEnum.Adapter.class)
    public enum RolesEnum {
        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        ACCOUNTANT("Accountant"),

        AUDITOR("Auditor"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        CONTRACT_MANAGER("Contract_Manager"),

        DIPLOMAT("Diplomat"),

        DIRECTOR("Director"),

        FACTORY_MANAGER("Factory_Manager"),

        FITTING_MANAGER("Fitting_Manager"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_OFFICE("Rent_Office"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        SECURITY_OFFICER("Security_Officer"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        STATION_MANAGER("Station_Manager"),

        TRADER("Trader");

        private String value;

        RolesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RolesEnum fromValue(String value) {
            for (RolesEnum b : RolesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<RolesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RolesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RolesEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ROLES = "roles";
    @SerializedName(SERIALIZED_NAME_ROLES)
    private List<String> roles = null;
    private List<RolesEnum> rolesEnum = null;

    /**
     * roles_at_base string
     */
    @JsonAdapter(RolesAtBaseEnum.Adapter.class)
    public enum RolesAtBaseEnum {
        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        ACCOUNTANT("Accountant"),

        AUDITOR("Auditor"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        CONTRACT_MANAGER("Contract_Manager"),

        DIPLOMAT("Diplomat"),

        DIRECTOR("Director"),

        FACTORY_MANAGER("Factory_Manager"),

        FITTING_MANAGER("Fitting_Manager"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_OFFICE("Rent_Office"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        SECURITY_OFFICER("Security_Officer"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        STATION_MANAGER("Station_Manager"),

        TRADER("Trader");

        private String value;

        RolesAtBaseEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RolesAtBaseEnum fromValue(String value) {
            for (RolesAtBaseEnum b : RolesAtBaseEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<RolesAtBaseEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RolesAtBaseEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RolesAtBaseEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RolesAtBaseEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ROLES_AT_BASE = "roles_at_base";
    @SerializedName(SERIALIZED_NAME_ROLES_AT_BASE)
    private List<String> rolesAtBase = null;
    private List<RolesAtBaseEnum> rolesAtBaseEnum = null;

    /**
     * roles_at_hq string
     */
    @JsonAdapter(RolesAtHqEnum.Adapter.class)
    public enum RolesAtHqEnum {
        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        ACCOUNTANT("Accountant"),

        AUDITOR("Auditor"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        CONTRACT_MANAGER("Contract_Manager"),

        DIPLOMAT("Diplomat"),

        DIRECTOR("Director"),

        FACTORY_MANAGER("Factory_Manager"),

        FITTING_MANAGER("Fitting_Manager"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_OFFICE("Rent_Office"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        SECURITY_OFFICER("Security_Officer"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        STATION_MANAGER("Station_Manager"),

        TRADER("Trader");

        private String value;

        RolesAtHqEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RolesAtHqEnum fromValue(String value) {
            for (RolesAtHqEnum b : RolesAtHqEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<RolesAtHqEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RolesAtHqEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RolesAtHqEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RolesAtHqEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ROLES_AT_HQ = "roles_at_hq";
    @SerializedName(SERIALIZED_NAME_ROLES_AT_HQ)
    private List<String> rolesAtHq = null;
    private List<RolesAtHqEnum> rolesAtHqEnum = null;

    /**
     * roles_at_other string
     */
    @JsonAdapter(RolesAtOtherEnum.Adapter.class)
    public enum RolesAtOtherEnum {
        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        ACCOUNTANT("Accountant"),

        AUDITOR("Auditor"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        CONTRACT_MANAGER("Contract_Manager"),

        DIPLOMAT("Diplomat"),

        DIRECTOR("Director"),

        FACTORY_MANAGER("Factory_Manager"),

        FITTING_MANAGER("Fitting_Manager"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_OFFICE("Rent_Office"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        SECURITY_OFFICER("Security_Officer"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        STATION_MANAGER("Station_Manager"),

        TRADER("Trader");

        private String value;

        RolesAtOtherEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RolesAtOtherEnum fromValue(String value) {
            for (RolesAtOtherEnum b : RolesAtOtherEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<RolesAtOtherEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RolesAtOtherEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RolesAtOtherEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RolesAtOtherEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ROLES_AT_OTHER = "roles_at_other";
    @SerializedName(SERIALIZED_NAME_ROLES_AT_OTHER)
    private List<String> rolesAtOther = null;
    private List<RolesAtOtherEnum> rolesAtOtherEnum = null;

    public CharacterRolesResponse roles(List<RolesEnum> rolesEnum) {

        this.rolesEnum = rolesEnum;
        return this;
    }

    public CharacterRolesResponse rolesString(List<String> roles) {

        this.roles = roles;
        return this;
    }

    public CharacterRolesResponse addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * roles array
     * 
     * @return roles
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "roles array")
    public List<RolesEnum> getRoles() {
        if (rolesEnum == null) {
            rolesEnum = new ArrayList<>();
            for (String value : roles) {
                rolesEnum.add(RolesEnum.fromValue(value));
            }
        }
        return rolesEnum;
    }

    public List<String> getRolesString() {
        return roles;
    }

    public void setRoles(List<RolesEnum> rolesEnum) {
        this.rolesEnum = rolesEnum;
    }

    public void setRolesString(List<String> roles) {
        this.roles = roles;
    }

    public CharacterRolesResponse rolesAtBase(List<RolesAtBaseEnum> rolesAtBaseEnum) {

        this.rolesAtBaseEnum = rolesAtBaseEnum;
        return this;
    }

    public CharacterRolesResponse rolesAtBaseString(List<String> rolesAtBase) {

        this.rolesAtBase = rolesAtBase;
        return this;
    }

    public CharacterRolesResponse addRolesAtBaseItem(String rolesAtBaseItem) {
        if (this.rolesAtBase == null) {
            this.rolesAtBase = new ArrayList<>();
        }
        this.rolesAtBase.add(rolesAtBaseItem);
        return this;
    }

    /**
     * roles_at_base array
     * 
     * @return rolesAtBase
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "roles_at_base array")
    public List<RolesAtBaseEnum> getRolesAtBase() {
        if (rolesAtBaseEnum == null) {
            rolesAtBaseEnum = new ArrayList<>();
            for (String value : rolesAtBase) {
                rolesAtBaseEnum.add(RolesAtBaseEnum.fromValue(value));
            }
        }
        return rolesAtBaseEnum;
    }

    public List<String> getRolesAtBaseString() {
        return rolesAtBase;
    }

    public void setRolesAtBase(List<RolesAtBaseEnum> rolesAtBaseEnum) {
        this.rolesAtBaseEnum = rolesAtBaseEnum;
    }

    public void setRolesAtBaseString(List<String> rolesAtBase) {
        this.rolesAtBase = rolesAtBase;
    }

    public CharacterRolesResponse rolesAtHq(List<RolesAtHqEnum> rolesAtHqEnum) {

        this.rolesAtHqEnum = rolesAtHqEnum;
        return this;
    }

    public CharacterRolesResponse rolesAtHqString(List<String> rolesAtHq) {

        this.rolesAtHq = rolesAtHq;
        return this;
    }

    public CharacterRolesResponse addRolesAtHqItem(String rolesAtHqItem) {
        if (this.rolesAtHq == null) {
            this.rolesAtHq = new ArrayList<>();
        }
        this.rolesAtHq.add(rolesAtHqItem);
        return this;
    }

    /**
     * roles_at_hq array
     * 
     * @return rolesAtHq
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "roles_at_hq array")
    public List<RolesAtHqEnum> getRolesAtHq() {
        if (rolesAtHqEnum == null) {
            rolesAtHqEnum = new ArrayList<>();
            for (String value : rolesAtHq) {
                rolesAtHqEnum.add(RolesAtHqEnum.fromValue(value));
            }
        }
        return rolesAtHqEnum;
    }

    public List<String> getRolesAtHqString() {
        return rolesAtHq;
    }

    public void setRolesAtHq(List<RolesAtHqEnum> rolesAtHqEnum) {
        this.rolesAtHqEnum = rolesAtHqEnum;
    }

    public void setRolesAtHqString(List<String> rolesAtHq) {
        this.rolesAtHq = rolesAtHq;
    }

    public CharacterRolesResponse rolesAtOther(List<RolesAtOtherEnum> rolesAtOtherEnum) {

        this.rolesAtOtherEnum = rolesAtOtherEnum;
        return this;
    }

    public CharacterRolesResponse rolesAtOtherString(List<String> rolesAtOther) {

        this.rolesAtOther = rolesAtOther;
        return this;
    }

    public CharacterRolesResponse addRolesAtOtherItem(String rolesAtOtherItem) {
        if (this.rolesAtOther == null) {
            this.rolesAtOther = new ArrayList<>();
        }
        this.rolesAtOther.add(rolesAtOtherItem);
        return this;
    }

    /**
     * roles_at_other array
     * 
     * @return rolesAtOther
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "roles_at_other array")
    public List<RolesAtOtherEnum> getRolesAtOther() {
        if (rolesAtOtherEnum == null) {
            rolesAtOtherEnum = new ArrayList<>();
            for (String value : rolesAtOther) {
                rolesAtOtherEnum.add(RolesAtOtherEnum.fromValue(value));
            }
        }
        return rolesAtOtherEnum;
    }

    public List<String> getRolesAtOtherString() {
        return rolesAtOther;
    }

    public void setRolesAtOther(List<RolesAtOtherEnum> rolesAtOtherEnum) {
        this.rolesAtOtherEnum = rolesAtOtherEnum;
    }

    public void setRolesAtOtherString(List<String> rolesAtOther) {
        this.rolesAtOther = rolesAtOther;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterRolesResponse characterRolesResponse = (CharacterRolesResponse) o;
        return Objects.equals(this.roles, characterRolesResponse.roles)
                && Objects.equals(this.rolesAtBase, characterRolesResponse.rolesAtBase)
                && Objects.equals(this.rolesAtHq, characterRolesResponse.rolesAtHq)
                && Objects.equals(this.rolesAtOther, characterRolesResponse.rolesAtOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roles, rolesAtBase, rolesAtHq, rolesAtOther);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterRolesResponse {\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    rolesAtBase: ").append(toIndentedString(rolesAtBase)).append("\n");
        sb.append("    rolesAtHq: ").append(toIndentedString(rolesAtHq)).append("\n");
        sb.append("    rolesAtOther: ").append(toIndentedString(rolesAtOther)).append("\n");
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

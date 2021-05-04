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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationContainersLogsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * action string
     */
    @JsonAdapter(ActionEnum.Adapter.class)
    public enum ActionEnum {
        ADD("add"),

        ASSEMBLE("assemble"),

        CONFIGURE("configure"),

        ENTER_PASSWORD("enter_password"),

        LOCK("lock"),

        MOVE("move"),

        REPACKAGE("repackage"),

        SET_NAME("set_name"),

        SET_PASSWORD("set_password"),

        UNLOCK("unlock");

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ActionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ActionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ActionEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ACTION = "action";
    @SerializedName(SERIALIZED_NAME_ACTION)
    private String action;
    private ActionEnum actionEnum;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public static final String SERIALIZED_NAME_CONTAINER_ID = "container_id";
    @SerializedName(SERIALIZED_NAME_CONTAINER_ID)
    private Long containerId;

    public static final String SERIALIZED_NAME_CONTAINER_TYPE_ID = "container_type_id";
    @SerializedName(SERIALIZED_NAME_CONTAINER_TYPE_ID)
    private Integer containerTypeId;

    /**
     * location_flag string
     */
    @JsonAdapter(LocationFlagEnum.Adapter.class)
    public enum LocationFlagEnum {
        ASSETSAFETY("AssetSafety"),

        AUTOFIT("AutoFit"),

        BONUS("Bonus"),

        BOOSTER("Booster"),

        BOOSTERBAY("BoosterBay"),

        CAPSULE("Capsule"),

        CARGO("Cargo"),

        CORPDELIVERIES("CorpDeliveries"),

        CORPSAG1("CorpSAG1"),

        CORPSAG2("CorpSAG2"),

        CORPSAG3("CorpSAG3"),

        CORPSAG4("CorpSAG4"),

        CORPSAG5("CorpSAG5"),

        CORPSAG6("CorpSAG6"),

        CORPSAG7("CorpSAG7"),

        CRATELOOT("CrateLoot"),

        DELIVERIES("Deliveries"),

        DRONEBAY("DroneBay"),

        DUSTBATTLE("DustBattle"),

        DUSTDATABANK("DustDatabank"),

        FIGHTERBAY("FighterBay"),

        FIGHTERTUBE0("FighterTube0"),

        FIGHTERTUBE1("FighterTube1"),

        FIGHTERTUBE2("FighterTube2"),

        FIGHTERTUBE3("FighterTube3"),

        FIGHTERTUBE4("FighterTube4"),

        FLEETHANGAR("FleetHangar"),

        FRIGATEESCAPEBAY("FrigateEscapeBay"),

        HANGAR("Hangar"),

        HANGARALL("HangarAll"),

        HISLOT0("HiSlot0"),

        HISLOT1("HiSlot1"),

        HISLOT2("HiSlot2"),

        HISLOT3("HiSlot3"),

        HISLOT4("HiSlot4"),

        HISLOT5("HiSlot5"),

        HISLOT6("HiSlot6"),

        HISLOT7("HiSlot7"),

        HIDDENMODIFIERS("HiddenModifiers"),

        IMPLANT("Implant"),

        IMPOUNDED("Impounded"),

        JUNKYARDREPROCESSED("JunkyardReprocessed"),

        JUNKYARDTRASHED("JunkyardTrashed"),

        LOSLOT0("LoSlot0"),

        LOSLOT1("LoSlot1"),

        LOSLOT2("LoSlot2"),

        LOSLOT3("LoSlot3"),

        LOSLOT4("LoSlot4"),

        LOSLOT5("LoSlot5"),

        LOSLOT6("LoSlot6"),

        LOSLOT7("LoSlot7"),

        LOCKED("Locked"),

        MEDSLOT0("MedSlot0"),

        MEDSLOT1("MedSlot1"),

        MEDSLOT2("MedSlot2"),

        MEDSLOT3("MedSlot3"),

        MEDSLOT4("MedSlot4"),

        MEDSLOT5("MedSlot5"),

        MEDSLOT6("MedSlot6"),

        MEDSLOT7("MedSlot7"),

        OFFICEFOLDER("OfficeFolder"),

        PILOT("Pilot"),

        PLANETSURFACE("PlanetSurface"),

        QUAFEBAY("QuafeBay"),

        QUANTUMCOREROOM("QuantumCoreRoom"),

        REWARD("Reward"),

        RIGSLOT0("RigSlot0"),

        RIGSLOT1("RigSlot1"),

        RIGSLOT2("RigSlot2"),

        RIGSLOT3("RigSlot3"),

        RIGSLOT4("RigSlot4"),

        RIGSLOT5("RigSlot5"),

        RIGSLOT6("RigSlot6"),

        RIGSLOT7("RigSlot7"),

        SECONDARYSTORAGE("SecondaryStorage"),

        SERVICESLOT0("ServiceSlot0"),

        SERVICESLOT1("ServiceSlot1"),

        SERVICESLOT2("ServiceSlot2"),

        SERVICESLOT3("ServiceSlot3"),

        SERVICESLOT4("ServiceSlot4"),

        SERVICESLOT5("ServiceSlot5"),

        SERVICESLOT6("ServiceSlot6"),

        SERVICESLOT7("ServiceSlot7"),

        SHIPHANGAR("ShipHangar"),

        SHIPOFFLINE("ShipOffline"),

        SKILL("Skill"),

        SKILLINTRAINING("SkillInTraining"),

        SPECIALIZEDAMMOHOLD("SpecializedAmmoHold"),

        SPECIALIZEDCOMMANDCENTERHOLD("SpecializedCommandCenterHold"),

        SPECIALIZEDFUELBAY("SpecializedFuelBay"),

        SPECIALIZEDGASHOLD("SpecializedGasHold"),

        SPECIALIZEDINDUSTRIALSHIPHOLD("SpecializedIndustrialShipHold"),

        SPECIALIZEDLARGESHIPHOLD("SpecializedLargeShipHold"),

        SPECIALIZEDMATERIALBAY("SpecializedMaterialBay"),

        SPECIALIZEDMEDIUMSHIPHOLD("SpecializedMediumShipHold"),

        SPECIALIZEDMINERALHOLD("SpecializedMineralHold"),

        SPECIALIZEDOREHOLD("SpecializedOreHold"),

        SPECIALIZEDPLANETARYCOMMODITIESHOLD("SpecializedPlanetaryCommoditiesHold"),

        SPECIALIZEDSALVAGEHOLD("SpecializedSalvageHold"),

        SPECIALIZEDSHIPHOLD("SpecializedShipHold"),

        SPECIALIZEDSMALLSHIPHOLD("SpecializedSmallShipHold"),

        STRUCTUREACTIVE("StructureActive"),

        STRUCTUREFUEL("StructureFuel"),

        STRUCTUREINACTIVE("StructureInactive"),

        STRUCTUREOFFLINE("StructureOffline"),

        SUBSYSTEMBAY("SubSystemBay"),

        SUBSYSTEMSLOT0("SubSystemSlot0"),

        SUBSYSTEMSLOT1("SubSystemSlot1"),

        SUBSYSTEMSLOT2("SubSystemSlot2"),

        SUBSYSTEMSLOT3("SubSystemSlot3"),

        SUBSYSTEMSLOT4("SubSystemSlot4"),

        SUBSYSTEMSLOT5("SubSystemSlot5"),

        SUBSYSTEMSLOT6("SubSystemSlot6"),

        SUBSYSTEMSLOT7("SubSystemSlot7"),

        UNLOCKED("Unlocked"),

        WALLET("Wallet"),

        WARDROBE("Wardrobe");

        private String value;

        LocationFlagEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LocationFlagEnum fromValue(String value) {
            for (LocationFlagEnum b : LocationFlagEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<LocationFlagEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LocationFlagEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LocationFlagEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LocationFlagEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_LOCATION_FLAG = "location_flag";
    @SerializedName(SERIALIZED_NAME_LOCATION_FLAG)
    private String locationFlag;
    private LocationFlagEnum locationFlagEnum;

    public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
    @SerializedName(SERIALIZED_NAME_LOCATION_ID)
    private Long locationId;

    public static final String SERIALIZED_NAME_LOGGED_AT = "logged_at";
    @SerializedName(SERIALIZED_NAME_LOGGED_AT)
    private OffsetDateTime loggedAt;

    public static final String SERIALIZED_NAME_NEW_CONFIG_BITMASK = "new_config_bitmask";
    @SerializedName(SERIALIZED_NAME_NEW_CONFIG_BITMASK)
    private Integer newConfigBitmask;

    public static final String SERIALIZED_NAME_OLD_CONFIG_BITMASK = "old_config_bitmask";
    @SerializedName(SERIALIZED_NAME_OLD_CONFIG_BITMASK)
    private Integer oldConfigBitmask;

    /**
     * Type of password set if action is of type SetPassword or EnterPassword
     */
    @JsonAdapter(PasswordTypeEnum.Adapter.class)
    public enum PasswordTypeEnum {
        CONFIG("config"),

        GENERAL("general");

        private String value;

        PasswordTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PasswordTypeEnum fromValue(String value) {
            for (PasswordTypeEnum b : PasswordTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PasswordTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PasswordTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PasswordTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PasswordTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_PASSWORD_TYPE = "password_type";
    @SerializedName(SERIALIZED_NAME_PASSWORD_TYPE)
    private String passwordType;
    private PasswordTypeEnum passwordTypeEnum;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";
    @SerializedName(SERIALIZED_NAME_QUANTITY)
    private Integer quantity;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public CorporationContainersLogsResponse action(ActionEnum actionEnum) {

        this.actionEnum = actionEnum;
        return this;
    }

    public CorporationContainersLogsResponse actionString(String action) {

        this.action = action;
        return this;
    }

    /**
     * action string
     * 
     * @return action
     **/
    @ApiModelProperty(required = true, value = "action string")
    public ActionEnum getAction() {
        if (actionEnum == null) {
            actionEnum = ActionEnum.fromValue(action);
        }
        return actionEnum;
    }

    public String getActionString() {
        return action;
    }

    public void setAction(ActionEnum actionEnum) {
        this.actionEnum = actionEnum;
    }

    public void setActionString(String action) {
        this.action = action;
    }

    public CorporationContainersLogsResponse characterId(Integer characterId) {

        this.characterId = characterId;
        return this;
    }

    /**
     * ID of the character who performed the action.
     * 
     * @return characterId
     **/
    @ApiModelProperty(required = true, value = "ID of the character who performed the action.")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public CorporationContainersLogsResponse containerId(Long containerId) {

        this.containerId = containerId;
        return this;
    }

    /**
     * ID of the container
     * 
     * @return containerId
     **/
    @ApiModelProperty(required = true, value = "ID of the container")
    public Long getContainerId() {
        return containerId;
    }

    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }

    public CorporationContainersLogsResponse containerTypeId(Integer containerTypeId) {

        this.containerTypeId = containerTypeId;
        return this;
    }

    /**
     * Type ID of the container
     * 
     * @return containerTypeId
     **/
    @ApiModelProperty(required = true, value = "Type ID of the container")
    public Integer getContainerTypeId() {
        return containerTypeId;
    }

    public void setContainerTypeId(Integer containerTypeId) {
        this.containerTypeId = containerTypeId;
    }

    public CorporationContainersLogsResponse locationFlag(LocationFlagEnum locationFlagEnum) {

        this.locationFlagEnum = locationFlagEnum;
        return this;
    }

    public CorporationContainersLogsResponse locationFlagString(String locationFlag) {

        this.locationFlag = locationFlag;
        return this;
    }

    /**
     * location_flag string
     * 
     * @return locationFlag
     **/
    @ApiModelProperty(required = true, value = "location_flag string")
    public LocationFlagEnum getLocationFlag() {
        if (locationFlagEnum == null) {
            locationFlagEnum = LocationFlagEnum.fromValue(locationFlag);
        }
        return locationFlagEnum;
    }

    public String getLocationFlagString() {
        return locationFlag;
    }

    public void setLocationFlag(LocationFlagEnum locationFlagEnum) {
        this.locationFlagEnum = locationFlagEnum;
    }

    public void setLocationFlagString(String locationFlag) {
        this.locationFlag = locationFlag;
    }

    public CorporationContainersLogsResponse locationId(Long locationId) {

        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(required = true, value = "location_id integer")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CorporationContainersLogsResponse loggedAt(OffsetDateTime loggedAt) {

        this.loggedAt = loggedAt;
        return this;
    }

    /**
     * Timestamp when this log was created
     * 
     * @return loggedAt
     **/
    @ApiModelProperty(required = true, value = "Timestamp when this log was created")
    public OffsetDateTime getLoggedAt() {
        return loggedAt;
    }

    public void setLoggedAt(OffsetDateTime loggedAt) {
        this.loggedAt = loggedAt;
    }

    public CorporationContainersLogsResponse newConfigBitmask(Integer newConfigBitmask) {

        this.newConfigBitmask = newConfigBitmask;
        return this;
    }

    /**
     * new_config_bitmask integer
     * 
     * @return newConfigBitmask
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "new_config_bitmask integer")
    public Integer getNewConfigBitmask() {
        return newConfigBitmask;
    }

    public void setNewConfigBitmask(Integer newConfigBitmask) {
        this.newConfigBitmask = newConfigBitmask;
    }

    public CorporationContainersLogsResponse oldConfigBitmask(Integer oldConfigBitmask) {

        this.oldConfigBitmask = oldConfigBitmask;
        return this;
    }

    /**
     * old_config_bitmask integer
     * 
     * @return oldConfigBitmask
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "old_config_bitmask integer")
    public Integer getOldConfigBitmask() {
        return oldConfigBitmask;
    }

    public void setOldConfigBitmask(Integer oldConfigBitmask) {
        this.oldConfigBitmask = oldConfigBitmask;
    }

    public CorporationContainersLogsResponse passwordType(PasswordTypeEnum passwordTypeEnum) {

        this.passwordTypeEnum = passwordTypeEnum;
        return this;
    }

    public CorporationContainersLogsResponse passwordTypeString(String passwordType) {

        this.passwordType = passwordType;
        return this;
    }

    /**
     * Type of password set if action is of type SetPassword or EnterPassword
     * 
     * @return passwordType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Type of password set if action is of type SetPassword or EnterPassword")
    public PasswordTypeEnum getPasswordType() {
        if (passwordTypeEnum == null) {
            passwordTypeEnum = PasswordTypeEnum.fromValue(passwordType);
        }
        return passwordTypeEnum;
    }

    public String getPasswordTypeString() {
        return passwordType;
    }

    public void setPasswordType(PasswordTypeEnum passwordTypeEnum) {
        this.passwordTypeEnum = passwordTypeEnum;
    }

    public void setPasswordTypeString(String passwordType) {
        this.passwordType = passwordType;
    }

    public CorporationContainersLogsResponse quantity(Integer quantity) {

        this.quantity = quantity;
        return this;
    }

    /**
     * Quantity of the item being acted upon
     * 
     * @return quantity
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Quantity of the item being acted upon")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CorporationContainersLogsResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * Type ID of the item being acted upon
     * 
     * @return typeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Type ID of the item being acted upon")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationContainersLogsResponse corporationContainersLogsResponse = (CorporationContainersLogsResponse) o;
        return Objects.equals(this.action, corporationContainersLogsResponse.action)
                && Objects.equals(this.characterId, corporationContainersLogsResponse.characterId)
                && Objects.equals(this.containerId, corporationContainersLogsResponse.containerId)
                && Objects.equals(this.containerTypeId, corporationContainersLogsResponse.containerTypeId)
                && Objects.equals(this.locationFlag, corporationContainersLogsResponse.locationFlag)
                && Objects.equals(this.locationId, corporationContainersLogsResponse.locationId)
                && Objects.equals(this.loggedAt, corporationContainersLogsResponse.loggedAt)
                && Objects.equals(this.newConfigBitmask, corporationContainersLogsResponse.newConfigBitmask)
                && Objects.equals(this.oldConfigBitmask, corporationContainersLogsResponse.oldConfigBitmask)
                && Objects.equals(this.passwordType, corporationContainersLogsResponse.passwordType)
                && Objects.equals(this.quantity, corporationContainersLogsResponse.quantity)
                && Objects.equals(this.typeId, corporationContainersLogsResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, characterId, containerId, containerTypeId, locationFlag, locationId, loggedAt,
                newConfigBitmask, oldConfigBitmask, passwordType, quantity, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationContainersLogsResponse {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerTypeId: ").append(toIndentedString(containerTypeId)).append("\n");
        sb.append("    locationFlag: ").append(toIndentedString(locationFlag)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    loggedAt: ").append(toIndentedString(loggedAt)).append("\n");
        sb.append("    newConfigBitmask: ").append(toIndentedString(newConfigBitmask)).append("\n");
        sb.append("    oldConfigBitmask: ").append(toIndentedString(oldConfigBitmask)).append("\n");
        sb.append("    passwordType: ").append(toIndentedString(passwordType)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

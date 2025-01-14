/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.12
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
public class CorporationOrdersResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DURATION = "duration";
    @SerializedName(SERIALIZED_NAME_DURATION)
    private Integer duration;

    public static final String SERIALIZED_NAME_ESCROW = "escrow";
    @SerializedName(SERIALIZED_NAME_ESCROW)
    private Double escrow;

    public static final String SERIALIZED_NAME_IS_BUY_ORDER = "is_buy_order";
    @SerializedName(SERIALIZED_NAME_IS_BUY_ORDER)
    private Boolean isBuyOrder;

    public static final String SERIALIZED_NAME_ISSUED = "issued";
    @SerializedName(SERIALIZED_NAME_ISSUED)
    private OffsetDateTime issued;

    public static final String SERIALIZED_NAME_ISSUED_BY = "issued_by";
    @SerializedName(SERIALIZED_NAME_ISSUED_BY)
    private Integer issuedBy;

    public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
    @SerializedName(SERIALIZED_NAME_LOCATION_ID)
    private Long locationId;

    public static final String SERIALIZED_NAME_MIN_VOLUME = "min_volume";
    @SerializedName(SERIALIZED_NAME_MIN_VOLUME)
    private Integer minVolume;

    public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    private Long orderId;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private Double price;

    /**
     * Valid order range, numbers are ranges in jumps
     */
    @JsonAdapter(RangeEnum.Adapter.class)
    public enum RangeEnum {
        _1("1"),

        _10("10"),

        _2("2"),

        _20("20"),

        _3("3"),

        _30("30"),

        _4("4"),

        _40("40"),

        _5("5"),

        REGION("region"),

        SOLARSYSTEM("solarsystem"),

        STATION("station");

        private String value;

        RangeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RangeEnum fromValue(String value) {
            for (RangeEnum b : RangeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<RangeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RangeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RangeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RangeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_RANGE = "range";
    @SerializedName(SERIALIZED_NAME_RANGE)
    private String range;
    private RangeEnum rangeEnum;

    public static final String SERIALIZED_NAME_REGION_ID = "region_id";
    @SerializedName(SERIALIZED_NAME_REGION_ID)
    private Integer regionId;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public static final String SERIALIZED_NAME_VOLUME_REMAIN = "volume_remain";
    @SerializedName(SERIALIZED_NAME_VOLUME_REMAIN)
    private Integer volumeRemain;

    public static final String SERIALIZED_NAME_VOLUME_TOTAL = "volume_total";
    @SerializedName(SERIALIZED_NAME_VOLUME_TOTAL)
    private Integer volumeTotal;

    public static final String SERIALIZED_NAME_WALLET_DIVISION = "wallet_division";
    @SerializedName(SERIALIZED_NAME_WALLET_DIVISION)
    private Integer walletDivision;

    public CorporationOrdersResponse duration(Integer duration) {

        this.duration = duration;
        return this;
    }

    /**
     * Number of days for which order is valid (starting from the issued date).
     * An order expires at time issued + duration
     * 
     * @return duration
     **/
    @ApiModelProperty(required = true, value = "Number of days for which order is valid (starting from the issued date). An order expires at time issued + duration")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CorporationOrdersResponse escrow(Double escrow) {

        this.escrow = escrow;
        return this;
    }

    /**
     * For buy orders, the amount of ISK in escrow
     * 
     * @return escrow
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "For buy orders, the amount of ISK in escrow")
    public Double getEscrow() {
        return escrow;
    }

    public void setEscrow(Double escrow) {
        this.escrow = escrow;
    }

    public CorporationOrdersResponse isBuyOrder(Boolean isBuyOrder) {

        this.isBuyOrder = isBuyOrder;
        return this;
    }

    /**
     * True if the order is a bid (buy) order
     * 
     * @return isBuyOrder
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "True if the order is a bid (buy) order")
    public Boolean getIsBuyOrder() {
        return isBuyOrder;
    }

    public void setIsBuyOrder(Boolean isBuyOrder) {
        this.isBuyOrder = isBuyOrder;
    }

    public CorporationOrdersResponse issued(OffsetDateTime issued) {

        this.issued = issued;
        return this;
    }

    /**
     * Date and time when this order was issued
     * 
     * @return issued
     **/
    @ApiModelProperty(required = true, value = "Date and time when this order was issued")
    public OffsetDateTime getIssued() {
        return issued;
    }

    public void setIssued(OffsetDateTime issued) {
        this.issued = issued;
    }

    public CorporationOrdersResponse issuedBy(Integer issuedBy) {

        this.issuedBy = issuedBy;
        return this;
    }

    /**
     * The character who issued this order
     * 
     * @return issuedBy
     **/
    @ApiModelProperty(required = true, value = "The character who issued this order")
    public Integer getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Integer issuedBy) {
        this.issuedBy = issuedBy;
    }

    public CorporationOrdersResponse locationId(Long locationId) {

        this.locationId = locationId;
        return this;
    }

    /**
     * ID of the location where order was placed
     * 
     * @return locationId
     **/
    @ApiModelProperty(required = true, value = "ID of the location where order was placed")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CorporationOrdersResponse minVolume(Integer minVolume) {

        this.minVolume = minVolume;
        return this;
    }

    /**
     * For buy orders, the minimum quantity that will be accepted in a matching
     * sell order
     * 
     * @return minVolume
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "For buy orders, the minimum quantity that will be accepted in a matching sell order")
    public Integer getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(Integer minVolume) {
        this.minVolume = minVolume;
    }

    public CorporationOrdersResponse orderId(Long orderId) {

        this.orderId = orderId;
        return this;
    }

    /**
     * Unique order ID
     * 
     * @return orderId
     **/
    @ApiModelProperty(required = true, value = "Unique order ID")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public CorporationOrdersResponse price(Double price) {

        this.price = price;
        return this;
    }

    /**
     * Cost per unit for this order
     * 
     * @return price
     **/
    @ApiModelProperty(required = true, value = "Cost per unit for this order")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CorporationOrdersResponse range(RangeEnum rangeEnum) {

        this.rangeEnum = rangeEnum;
        return this;
    }

    public CorporationOrdersResponse rangeString(String range) {

        this.range = range;
        return this;
    }

    /**
     * Valid order range, numbers are ranges in jumps
     * 
     * @return range
     **/
    @ApiModelProperty(required = true, value = "Valid order range, numbers are ranges in jumps")
    public RangeEnum getRange() {
        if (rangeEnum == null) {
            rangeEnum = RangeEnum.fromValue(range);
        }
        return rangeEnum;
    }

    public String getRangeString() {
        return range;
    }

    public void setRange(RangeEnum rangeEnum) {
        this.rangeEnum = rangeEnum;
    }

    public void setRangeString(String range) {
        this.range = range;
    }

    public CorporationOrdersResponse regionId(Integer regionId) {

        this.regionId = regionId;
        return this;
    }

    /**
     * ID of the region where order was placed
     * 
     * @return regionId
     **/
    @ApiModelProperty(required = true, value = "ID of the region where order was placed")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public CorporationOrdersResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * The type ID of the item transacted in this order
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "The type ID of the item transacted in this order")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public CorporationOrdersResponse volumeRemain(Integer volumeRemain) {

        this.volumeRemain = volumeRemain;
        return this;
    }

    /**
     * Quantity of items still required or offered
     * 
     * @return volumeRemain
     **/
    @ApiModelProperty(required = true, value = "Quantity of items still required or offered")
    public Integer getVolumeRemain() {
        return volumeRemain;
    }

    public void setVolumeRemain(Integer volumeRemain) {
        this.volumeRemain = volumeRemain;
    }

    public CorporationOrdersResponse volumeTotal(Integer volumeTotal) {

        this.volumeTotal = volumeTotal;
        return this;
    }

    /**
     * Quantity of items required or offered at time order was placed
     * 
     * @return volumeTotal
     **/
    @ApiModelProperty(required = true, value = "Quantity of items required or offered at time order was placed")
    public Integer getVolumeTotal() {
        return volumeTotal;
    }

    public void setVolumeTotal(Integer volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    public CorporationOrdersResponse walletDivision(Integer walletDivision) {

        this.walletDivision = walletDivision;
        return this;
    }

    /**
     * The corporation wallet division used for this order. minimum: 1 maximum:
     * 7
     * 
     * @return walletDivision
     **/
    @ApiModelProperty(required = true, value = "The corporation wallet division used for this order.")
    public Integer getWalletDivision() {
        return walletDivision;
    }

    public void setWalletDivision(Integer walletDivision) {
        this.walletDivision = walletDivision;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationOrdersResponse corporationOrdersResponse = (CorporationOrdersResponse) o;
        return Objects.equals(this.duration, corporationOrdersResponse.duration)
                && Objects.equals(this.escrow, corporationOrdersResponse.escrow)
                && Objects.equals(this.isBuyOrder, corporationOrdersResponse.isBuyOrder)
                && Objects.equals(this.issued, corporationOrdersResponse.issued)
                && Objects.equals(this.issuedBy, corporationOrdersResponse.issuedBy)
                && Objects.equals(this.locationId, corporationOrdersResponse.locationId)
                && Objects.equals(this.minVolume, corporationOrdersResponse.minVolume)
                && Objects.equals(this.orderId, corporationOrdersResponse.orderId)
                && Objects.equals(this.price, corporationOrdersResponse.price)
                && Objects.equals(this.range, corporationOrdersResponse.range)
                && Objects.equals(this.regionId, corporationOrdersResponse.regionId)
                && Objects.equals(this.typeId, corporationOrdersResponse.typeId)
                && Objects.equals(this.volumeRemain, corporationOrdersResponse.volumeRemain)
                && Objects.equals(this.volumeTotal, corporationOrdersResponse.volumeTotal)
                && Objects.equals(this.walletDivision, corporationOrdersResponse.walletDivision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, escrow, isBuyOrder, issued, issuedBy, locationId, minVolume, orderId, price,
                range, regionId, typeId, volumeRemain, volumeTotal, walletDivision);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationOrdersResponse {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    escrow: ").append(toIndentedString(escrow)).append("\n");
        sb.append("    isBuyOrder: ").append(toIndentedString(isBuyOrder)).append("\n");
        sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
        sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    volumeRemain: ").append(toIndentedString(volumeRemain)).append("\n");
        sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
        sb.append("    walletDivision: ").append(toIndentedString(walletDivision)).append("\n");
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

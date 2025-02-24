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
 * wallet transaction
 */
@ApiModel(description = "wallet transaction")
public class CorporationWalletTransactionsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
    @SerializedName(SERIALIZED_NAME_CLIENT_ID)
    private Integer clientId;

    public static final String SERIALIZED_NAME_DATE = "date";
    @SerializedName(SERIALIZED_NAME_DATE)
    private OffsetDateTime date;

    public static final String SERIALIZED_NAME_IS_BUY = "is_buy";
    @SerializedName(SERIALIZED_NAME_IS_BUY)
    private Boolean isBuy;

    public static final String SERIALIZED_NAME_JOURNAL_REF_ID = "journal_ref_id";
    @SerializedName(SERIALIZED_NAME_JOURNAL_REF_ID)
    private Long journalRefId;

    public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
    @SerializedName(SERIALIZED_NAME_LOCATION_ID)
    private Long locationId;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";
    @SerializedName(SERIALIZED_NAME_QUANTITY)
    private Integer quantity;

    public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
    @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
    private Long transactionId;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public static final String SERIALIZED_NAME_UNIT_PRICE = "unit_price";
    @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
    private Double unitPrice;

    public CorporationWalletTransactionsResponse clientId(Integer clientId) {

        this.clientId = clientId;
        return this;
    }

    /**
     * client_id integer
     * 
     * @return clientId
     **/
    @ApiModelProperty(required = true, value = "client_id integer")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public CorporationWalletTransactionsResponse date(OffsetDateTime date) {

        this.date = date;
        return this;
    }

    /**
     * Date and time of transaction
     * 
     * @return date
     **/
    @ApiModelProperty(required = true, value = "Date and time of transaction")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public CorporationWalletTransactionsResponse isBuy(Boolean isBuy) {

        this.isBuy = isBuy;
        return this;
    }

    /**
     * is_buy boolean
     * 
     * @return isBuy
     **/
    @ApiModelProperty(required = true, value = "is_buy boolean")
    public Boolean getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Boolean isBuy) {
        this.isBuy = isBuy;
    }

    public CorporationWalletTransactionsResponse journalRefId(Long journalRefId) {

        this.journalRefId = journalRefId;
        return this;
    }

    /**
     * -1 if there is no corresponding wallet journal entry
     * 
     * @return journalRefId
     **/
    @ApiModelProperty(required = true, value = "-1 if there is no corresponding wallet journal entry")
    public Long getJournalRefId() {
        return journalRefId;
    }

    public void setJournalRefId(Long journalRefId) {
        this.journalRefId = journalRefId;
    }

    public CorporationWalletTransactionsResponse locationId(Long locationId) {

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

    public CorporationWalletTransactionsResponse quantity(Integer quantity) {

        this.quantity = quantity;
        return this;
    }

    /**
     * quantity integer
     * 
     * @return quantity
     **/
    @ApiModelProperty(required = true, value = "quantity integer")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CorporationWalletTransactionsResponse transactionId(Long transactionId) {

        this.transactionId = transactionId;
        return this;
    }

    /**
     * Unique transaction ID
     * 
     * @return transactionId
     **/
    @ApiModelProperty(required = true, value = "Unique transaction ID")
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public CorporationWalletTransactionsResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public CorporationWalletTransactionsResponse unitPrice(Double unitPrice) {

        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Amount paid per unit
     * 
     * @return unitPrice
     **/
    @ApiModelProperty(required = true, value = "Amount paid per unit")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationWalletTransactionsResponse corporationWalletTransactionsResponse = (CorporationWalletTransactionsResponse) o;
        return Objects.equals(this.clientId, corporationWalletTransactionsResponse.clientId)
                && Objects.equals(this.date, corporationWalletTransactionsResponse.date)
                && Objects.equals(this.isBuy, corporationWalletTransactionsResponse.isBuy)
                && Objects.equals(this.journalRefId, corporationWalletTransactionsResponse.journalRefId)
                && Objects.equals(this.locationId, corporationWalletTransactionsResponse.locationId)
                && Objects.equals(this.quantity, corporationWalletTransactionsResponse.quantity)
                && Objects.equals(this.transactionId, corporationWalletTransactionsResponse.transactionId)
                && Objects.equals(this.typeId, corporationWalletTransactionsResponse.typeId)
                && Objects.equals(this.unitPrice, corporationWalletTransactionsResponse.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(clientId, date, isBuy, journalRefId, locationId, quantity, transactionId, typeId, unitPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationWalletTransactionsResponse {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    isBuy: ").append(toIndentedString(isBuy)).append("\n");
        sb.append("    journalRefId: ").append(toIndentedString(journalRefId)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

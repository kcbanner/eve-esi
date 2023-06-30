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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CharacterContractsBidsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private Float amount;

    public static final String SERIALIZED_NAME_BID_ID = "bid_id";
    @SerializedName(SERIALIZED_NAME_BID_ID)
    private Integer bidId;

    public static final String SERIALIZED_NAME_BIDDER_ID = "bidder_id";
    @SerializedName(SERIALIZED_NAME_BIDDER_ID)
    private Integer bidderId;

    public static final String SERIALIZED_NAME_DATE_BID = "date_bid";
    @SerializedName(SERIALIZED_NAME_DATE_BID)
    private OffsetDateTime dateBid;

    public CharacterContractsBidsResponse() {
    }

    public CharacterContractsBidsResponse amount(Float amount) {

        this.amount = amount;
        return this;
    }

    /**
     * The amount bid, in ISK
     * 
     * @return amount
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The amount bid, in ISK")
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public CharacterContractsBidsResponse bidId(Integer bidId) {

        this.bidId = bidId;
        return this;
    }

    /**
     * Unique ID for the bid
     * 
     * @return bidId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Unique ID for the bid")
    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public CharacterContractsBidsResponse bidderId(Integer bidderId) {

        this.bidderId = bidderId;
        return this;
    }

    /**
     * Character ID of the bidder
     * 
     * @return bidderId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Character ID of the bidder")
    public Integer getBidderId() {
        return bidderId;
    }

    public void setBidderId(Integer bidderId) {
        this.bidderId = bidderId;
    }

    public CharacterContractsBidsResponse dateBid(OffsetDateTime dateBid) {

        this.dateBid = dateBid;
        return this;
    }

    /**
     * Datetime when the bid was placed
     * 
     * @return dateBid
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Datetime when the bid was placed")
    public OffsetDateTime getDateBid() {
        return dateBid;
    }

    public void setDateBid(OffsetDateTime dateBid) {
        this.dateBid = dateBid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterContractsBidsResponse characterContractsBidsResponse = (CharacterContractsBidsResponse) o;
        return Objects.equals(this.amount, characterContractsBidsResponse.amount)
                && Objects.equals(this.bidId, characterContractsBidsResponse.bidId)
                && Objects.equals(this.bidderId, characterContractsBidsResponse.bidderId)
                && Objects.equals(this.dateBid, characterContractsBidsResponse.dateBid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, bidId, bidderId, dateBid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterContractsBidsResponse {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    bidId: ").append(toIndentedString(bidId)).append("\n");
        sb.append("    bidderId: ").append(toIndentedString(bidderId)).append("\n");
        sb.append("    dateBid: ").append(toIndentedString(dateBid)).append("\n");
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

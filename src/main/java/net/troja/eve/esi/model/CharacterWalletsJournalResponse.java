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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterWalletsJournalResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("amount")
    private Float amount = null;

    @JsonProperty("argument_name")
    private String argumentName = null;

    @JsonProperty("argument_value")
    private Integer argumentValue = null;

    @JsonProperty("balance")
    private Float balance = null;

    @JsonProperty("date")
    private OffsetDateTime date = null;

    @JsonProperty("first_party_id")
    private Integer firstPartyId = null;

    /**
     * first_party_type string
     */
    public enum FirstPartyTypeEnum {
        CHARACTER("character"),

        CORPORATION("corporation"),

        ALLIANCE("alliance"),

        FACTION("faction");

        private String value;

        FirstPartyTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FirstPartyTypeEnum fromValue(String text) {
            for (FirstPartyTypeEnum b : FirstPartyTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("first_party_type")
    private FirstPartyTypeEnum firstPartyType = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("ref_id")
    private Long refId = null;

    @JsonProperty("ref_type_id")
    private Integer refTypeId = null;

    @JsonProperty("second_party_id")
    private Integer secondPartyId = null;

    /**
     * second_party_type string
     */
    public enum SecondPartyTypeEnum {
        CHARACTER("character"),

        CORPORATION("corporation"),

        ALLIANCE("alliance"),

        FACTION("faction");

        private String value;

        SecondPartyTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SecondPartyTypeEnum fromValue(String text) {
            for (SecondPartyTypeEnum b : SecondPartyTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("second_party_type")
    private SecondPartyTypeEnum secondPartyType = null;

    @JsonProperty("tax_amount")
    private Float taxAmount = null;

    @JsonProperty("tax_reciever_id")
    private Integer taxRecieverId = null;

    public CharacterWalletsJournalResponse amount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Transaction amount. Positive when value transferred to the first party.
     * Negative otherwise
     * 
     * @return amount
     **/
    @ApiModelProperty(example = "null", value = "Transaction amount. Positive when value transferred to the first party. Negative otherwise")
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public CharacterWalletsJournalResponse argumentName(String argumentName) {
        this.argumentName = argumentName;
        return this;
    }

    /**
     * argument_name string
     * 
     * @return argumentName
     **/
    @ApiModelProperty(example = "null", value = "argument_name string")
    public String getArgumentName() {
        return argumentName;
    }

    public void setArgumentName(String argumentName) {
        this.argumentName = argumentName;
    }

    public CharacterWalletsJournalResponse argumentValue(Integer argumentValue) {
        this.argumentValue = argumentValue;
        return this;
    }

    /**
     * argument_value integer
     * 
     * @return argumentValue
     **/
    @ApiModelProperty(example = "null", value = "argument_value integer")
    public Integer getArgumentValue() {
        return argumentValue;
    }

    public void setArgumentValue(Integer argumentValue) {
        this.argumentValue = argumentValue;
    }

    public CharacterWalletsJournalResponse balance(Float balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Wallet balance after transaction occurred
     * 
     * @return balance
     **/
    @ApiModelProperty(example = "null", value = "Wallet balance after transaction occurred")
    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public CharacterWalletsJournalResponse date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Date and time of transaction
     * 
     * @return date
     **/
    @ApiModelProperty(example = "null", required = true, value = "Date and time of transaction")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public CharacterWalletsJournalResponse firstPartyId(Integer firstPartyId) {
        this.firstPartyId = firstPartyId;
        return this;
    }

    /**
     * first_party_id integer
     * 
     * @return firstPartyId
     **/
    @ApiModelProperty(example = "null", value = "first_party_id integer")
    public Integer getFirstPartyId() {
        return firstPartyId;
    }

    public void setFirstPartyId(Integer firstPartyId) {
        this.firstPartyId = firstPartyId;
    }

    public CharacterWalletsJournalResponse firstPartyType(FirstPartyTypeEnum firstPartyType) {
        this.firstPartyType = firstPartyType;
        return this;
    }

    /**
     * first_party_type string
     * 
     * @return firstPartyType
     **/
    @ApiModelProperty(example = "null", value = "first_party_type string")
    public FirstPartyTypeEnum getFirstPartyType() {
        return firstPartyType;
    }

    public void setFirstPartyType(FirstPartyTypeEnum firstPartyType) {
        this.firstPartyType = firstPartyType;
    }

    public CharacterWalletsJournalResponse reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * reason string
     * 
     * @return reason
     **/
    @ApiModelProperty(example = "null", value = "reason string")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public CharacterWalletsJournalResponse refId(Long refId) {
        this.refId = refId;
        return this;
    }

    /**
     * Unique journal reference ID
     * 
     * @return refId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique journal reference ID")
    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public CharacterWalletsJournalResponse refTypeId(Integer refTypeId) {
        this.refTypeId = refTypeId;
        return this;
    }

    /**
     * Transaction type
     * 
     * @return refTypeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Transaction type")
    public Integer getRefTypeId() {
        return refTypeId;
    }

    public void setRefTypeId(Integer refTypeId) {
        this.refTypeId = refTypeId;
    }

    public CharacterWalletsJournalResponse secondPartyId(Integer secondPartyId) {
        this.secondPartyId = secondPartyId;
        return this;
    }

    /**
     * second_party_id integer
     * 
     * @return secondPartyId
     **/
    @ApiModelProperty(example = "null", value = "second_party_id integer")
    public Integer getSecondPartyId() {
        return secondPartyId;
    }

    public void setSecondPartyId(Integer secondPartyId) {
        this.secondPartyId = secondPartyId;
    }

    public CharacterWalletsJournalResponse secondPartyType(SecondPartyTypeEnum secondPartyType) {
        this.secondPartyType = secondPartyType;
        return this;
    }

    /**
     * second_party_type string
     * 
     * @return secondPartyType
     **/
    @ApiModelProperty(example = "null", value = "second_party_type string")
    public SecondPartyTypeEnum getSecondPartyType() {
        return secondPartyType;
    }

    public void setSecondPartyType(SecondPartyTypeEnum secondPartyType) {
        this.secondPartyType = secondPartyType;
    }

    public CharacterWalletsJournalResponse taxAmount(Float taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Tax amount received for tax related transactions
     * 
     * @return taxAmount
     **/
    @ApiModelProperty(example = "null", value = "Tax amount received for tax related transactions")
    public Float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public CharacterWalletsJournalResponse taxRecieverId(Integer taxRecieverId) {
        this.taxRecieverId = taxRecieverId;
        return this;
    }

    /**
     * For tax related transactions, gives the corporation ID of the entity
     * receiving the tax
     * 
     * @return taxRecieverId
     **/
    @ApiModelProperty(example = "null", value = "For tax related transactions, gives the corporation ID of the entity receiving the tax")
    public Integer getTaxRecieverId() {
        return taxRecieverId;
    }

    public void setTaxRecieverId(Integer taxRecieverId) {
        this.taxRecieverId = taxRecieverId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterWalletsJournalResponse characterWalletsJournalResponse = (CharacterWalletsJournalResponse) o;
        return Objects.equals(this.amount, characterWalletsJournalResponse.amount)
                && Objects.equals(this.argumentName, characterWalletsJournalResponse.argumentName)
                && Objects.equals(this.argumentValue, characterWalletsJournalResponse.argumentValue)
                && Objects.equals(this.balance, characterWalletsJournalResponse.balance)
                && Objects.equals(this.date, characterWalletsJournalResponse.date)
                && Objects.equals(this.firstPartyId, characterWalletsJournalResponse.firstPartyId)
                && Objects.equals(this.firstPartyType, characterWalletsJournalResponse.firstPartyType)
                && Objects.equals(this.reason, characterWalletsJournalResponse.reason)
                && Objects.equals(this.refId, characterWalletsJournalResponse.refId)
                && Objects.equals(this.refTypeId, characterWalletsJournalResponse.refTypeId)
                && Objects.equals(this.secondPartyId, characterWalletsJournalResponse.secondPartyId)
                && Objects.equals(this.secondPartyType, characterWalletsJournalResponse.secondPartyType)
                && Objects.equals(this.taxAmount, characterWalletsJournalResponse.taxAmount)
                && Objects.equals(this.taxRecieverId, characterWalletsJournalResponse.taxRecieverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, argumentName, argumentValue, balance, date, firstPartyId, firstPartyType, reason,
                refId, refTypeId, secondPartyId, secondPartyType, taxAmount, taxRecieverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterWalletsJournalResponse {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    argumentName: ").append(toIndentedString(argumentName)).append("\n");
        sb.append("    argumentValue: ").append(toIndentedString(argumentValue)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    firstPartyId: ").append(toIndentedString(firstPartyId)).append("\n");
        sb.append("    firstPartyType: ").append(toIndentedString(firstPartyType)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
        sb.append("    refTypeId: ").append(toIndentedString(refTypeId)).append("\n");
        sb.append("    secondPartyId: ").append(toIndentedString(secondPartyId)).append("\n");
        sb.append("    secondPartyType: ").append(toIndentedString(secondPartyType)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
        sb.append("    taxRecieverId: ").append(toIndentedString(taxRecieverId)).append("\n");
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

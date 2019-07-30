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
 * market object
 */
@ApiModel(description = "market object")
public class CharacterStatsMarket implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACCEPT_CONTRACTS_COURIER = "accept_contracts_courier";
    @SerializedName(SERIALIZED_NAME_ACCEPT_CONTRACTS_COURIER)
    private Long acceptContractsCourier;

    public static final String SERIALIZED_NAME_BUY_ORDERS_PLACED = "buy_orders_placed";
    @SerializedName(SERIALIZED_NAME_BUY_ORDERS_PLACED)
    private Long buyOrdersPlaced;

    public static final String SERIALIZED_NAME_ISK_SPENT = "isk_spent";
    @SerializedName(SERIALIZED_NAME_ISK_SPENT)
    private Long iskSpent;

    public static final String SERIALIZED_NAME_CREATE_CONTRACTS_AUCTION = "create_contracts_auction";
    @SerializedName(SERIALIZED_NAME_CREATE_CONTRACTS_AUCTION)
    private Long createContractsAuction;

    public static final String SERIALIZED_NAME_CREATE_CONTRACTS_ITEM_EXCHANGE = "create_contracts_item_exchange";
    @SerializedName(SERIALIZED_NAME_CREATE_CONTRACTS_ITEM_EXCHANGE)
    private Long createContractsItemExchange;

    public static final String SERIALIZED_NAME_SEARCH_CONTRACTS = "search_contracts";
    @SerializedName(SERIALIZED_NAME_SEARCH_CONTRACTS)
    private Long searchContracts;

    public static final String SERIALIZED_NAME_ISK_GAINED = "isk_gained";
    @SerializedName(SERIALIZED_NAME_ISK_GAINED)
    private Long iskGained;

    public static final String SERIALIZED_NAME_ACCEPT_CONTRACTS_ITEM_EXCHANGE = "accept_contracts_item_exchange";
    @SerializedName(SERIALIZED_NAME_ACCEPT_CONTRACTS_ITEM_EXCHANGE)
    private Long acceptContractsItemExchange;

    public static final String SERIALIZED_NAME_DELIVER_COURIER_CONTRACT = "deliver_courier_contract";
    @SerializedName(SERIALIZED_NAME_DELIVER_COURIER_CONTRACT)
    private Long deliverCourierContract;

    public static final String SERIALIZED_NAME_CANCEL_MARKET_ORDER = "cancel_market_order";
    @SerializedName(SERIALIZED_NAME_CANCEL_MARKET_ORDER)
    private Long cancelMarketOrder;

    public static final String SERIALIZED_NAME_SELL_ORDERS_PLACED = "sell_orders_placed";
    @SerializedName(SERIALIZED_NAME_SELL_ORDERS_PLACED)
    private Long sellOrdersPlaced;

    public static final String SERIALIZED_NAME_CREATE_CONTRACTS_COURIER = "create_contracts_courier";
    @SerializedName(SERIALIZED_NAME_CREATE_CONTRACTS_COURIER)
    private Long createContractsCourier;

    public static final String SERIALIZED_NAME_MODIFY_MARKET_ORDER = "modify_market_order";
    @SerializedName(SERIALIZED_NAME_MODIFY_MARKET_ORDER)
    private Long modifyMarketOrder;

    public CharacterStatsMarket acceptContractsCourier(Long acceptContractsCourier) {
        this.acceptContractsCourier = acceptContractsCourier;
        return this;
    }

    /**
     * accept_contracts_courier integer
     * 
     * @return acceptContractsCourier
     **/
    @ApiModelProperty(value = "accept_contracts_courier integer")
    public Long getAcceptContractsCourier() {
        return acceptContractsCourier;
    }

    public void setAcceptContractsCourier(Long acceptContractsCourier) {
        this.acceptContractsCourier = acceptContractsCourier;
    }

    public CharacterStatsMarket buyOrdersPlaced(Long buyOrdersPlaced) {
        this.buyOrdersPlaced = buyOrdersPlaced;
        return this;
    }

    /**
     * buy_orders_placed integer
     * 
     * @return buyOrdersPlaced
     **/
    @ApiModelProperty(value = "buy_orders_placed integer")
    public Long getBuyOrdersPlaced() {
        return buyOrdersPlaced;
    }

    public void setBuyOrdersPlaced(Long buyOrdersPlaced) {
        this.buyOrdersPlaced = buyOrdersPlaced;
    }

    public CharacterStatsMarket iskSpent(Long iskSpent) {
        this.iskSpent = iskSpent;
        return this;
    }

    /**
     * isk_spent integer
     * 
     * @return iskSpent
     **/
    @ApiModelProperty(value = "isk_spent integer")
    public Long getIskSpent() {
        return iskSpent;
    }

    public void setIskSpent(Long iskSpent) {
        this.iskSpent = iskSpent;
    }

    public CharacterStatsMarket createContractsAuction(Long createContractsAuction) {
        this.createContractsAuction = createContractsAuction;
        return this;
    }

    /**
     * create_contracts_auction integer
     * 
     * @return createContractsAuction
     **/
    @ApiModelProperty(value = "create_contracts_auction integer")
    public Long getCreateContractsAuction() {
        return createContractsAuction;
    }

    public void setCreateContractsAuction(Long createContractsAuction) {
        this.createContractsAuction = createContractsAuction;
    }

    public CharacterStatsMarket createContractsItemExchange(Long createContractsItemExchange) {
        this.createContractsItemExchange = createContractsItemExchange;
        return this;
    }

    /**
     * create_contracts_item_exchange integer
     * 
     * @return createContractsItemExchange
     **/
    @ApiModelProperty(value = "create_contracts_item_exchange integer")
    public Long getCreateContractsItemExchange() {
        return createContractsItemExchange;
    }

    public void setCreateContractsItemExchange(Long createContractsItemExchange) {
        this.createContractsItemExchange = createContractsItemExchange;
    }

    public CharacterStatsMarket searchContracts(Long searchContracts) {
        this.searchContracts = searchContracts;
        return this;
    }

    /**
     * search_contracts integer
     * 
     * @return searchContracts
     **/
    @ApiModelProperty(value = "search_contracts integer")
    public Long getSearchContracts() {
        return searchContracts;
    }

    public void setSearchContracts(Long searchContracts) {
        this.searchContracts = searchContracts;
    }

    public CharacterStatsMarket iskGained(Long iskGained) {
        this.iskGained = iskGained;
        return this;
    }

    /**
     * isk_gained integer
     * 
     * @return iskGained
     **/
    @ApiModelProperty(value = "isk_gained integer")
    public Long getIskGained() {
        return iskGained;
    }

    public void setIskGained(Long iskGained) {
        this.iskGained = iskGained;
    }

    public CharacterStatsMarket acceptContractsItemExchange(Long acceptContractsItemExchange) {
        this.acceptContractsItemExchange = acceptContractsItemExchange;
        return this;
    }

    /**
     * accept_contracts_item_exchange integer
     * 
     * @return acceptContractsItemExchange
     **/
    @ApiModelProperty(value = "accept_contracts_item_exchange integer")
    public Long getAcceptContractsItemExchange() {
        return acceptContractsItemExchange;
    }

    public void setAcceptContractsItemExchange(Long acceptContractsItemExchange) {
        this.acceptContractsItemExchange = acceptContractsItemExchange;
    }

    public CharacterStatsMarket deliverCourierContract(Long deliverCourierContract) {
        this.deliverCourierContract = deliverCourierContract;
        return this;
    }

    /**
     * deliver_courier_contract integer
     * 
     * @return deliverCourierContract
     **/
    @ApiModelProperty(value = "deliver_courier_contract integer")
    public Long getDeliverCourierContract() {
        return deliverCourierContract;
    }

    public void setDeliverCourierContract(Long deliverCourierContract) {
        this.deliverCourierContract = deliverCourierContract;
    }

    public CharacterStatsMarket cancelMarketOrder(Long cancelMarketOrder) {
        this.cancelMarketOrder = cancelMarketOrder;
        return this;
    }

    /**
     * cancel_market_order integer
     * 
     * @return cancelMarketOrder
     **/
    @ApiModelProperty(value = "cancel_market_order integer")
    public Long getCancelMarketOrder() {
        return cancelMarketOrder;
    }

    public void setCancelMarketOrder(Long cancelMarketOrder) {
        this.cancelMarketOrder = cancelMarketOrder;
    }

    public CharacterStatsMarket sellOrdersPlaced(Long sellOrdersPlaced) {
        this.sellOrdersPlaced = sellOrdersPlaced;
        return this;
    }

    /**
     * sell_orders_placed integer
     * 
     * @return sellOrdersPlaced
     **/
    @ApiModelProperty(value = "sell_orders_placed integer")
    public Long getSellOrdersPlaced() {
        return sellOrdersPlaced;
    }

    public void setSellOrdersPlaced(Long sellOrdersPlaced) {
        this.sellOrdersPlaced = sellOrdersPlaced;
    }

    public CharacterStatsMarket createContractsCourier(Long createContractsCourier) {
        this.createContractsCourier = createContractsCourier;
        return this;
    }

    /**
     * create_contracts_courier integer
     * 
     * @return createContractsCourier
     **/
    @ApiModelProperty(value = "create_contracts_courier integer")
    public Long getCreateContractsCourier() {
        return createContractsCourier;
    }

    public void setCreateContractsCourier(Long createContractsCourier) {
        this.createContractsCourier = createContractsCourier;
    }

    public CharacterStatsMarket modifyMarketOrder(Long modifyMarketOrder) {
        this.modifyMarketOrder = modifyMarketOrder;
        return this;
    }

    /**
     * modify_market_order integer
     * 
     * @return modifyMarketOrder
     **/
    @ApiModelProperty(value = "modify_market_order integer")
    public Long getModifyMarketOrder() {
        return modifyMarketOrder;
    }

    public void setModifyMarketOrder(Long modifyMarketOrder) {
        this.modifyMarketOrder = modifyMarketOrder;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsMarket characterStatsMarket = (CharacterStatsMarket) o;
        return Objects.equals(this.acceptContractsCourier, characterStatsMarket.acceptContractsCourier)
                && Objects.equals(this.buyOrdersPlaced, characterStatsMarket.buyOrdersPlaced)
                && Objects.equals(this.iskSpent, characterStatsMarket.iskSpent)
                && Objects.equals(this.createContractsAuction, characterStatsMarket.createContractsAuction)
                && Objects.equals(this.createContractsItemExchange, characterStatsMarket.createContractsItemExchange)
                && Objects.equals(this.searchContracts, characterStatsMarket.searchContracts)
                && Objects.equals(this.iskGained, characterStatsMarket.iskGained)
                && Objects.equals(this.acceptContractsItemExchange, characterStatsMarket.acceptContractsItemExchange)
                && Objects.equals(this.deliverCourierContract, characterStatsMarket.deliverCourierContract)
                && Objects.equals(this.cancelMarketOrder, characterStatsMarket.cancelMarketOrder)
                && Objects.equals(this.sellOrdersPlaced, characterStatsMarket.sellOrdersPlaced)
                && Objects.equals(this.createContractsCourier, characterStatsMarket.createContractsCourier)
                && Objects.equals(this.modifyMarketOrder, characterStatsMarket.modifyMarketOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptContractsCourier, buyOrdersPlaced, iskSpent, createContractsAuction,
                createContractsItemExchange, searchContracts, iskGained, acceptContractsItemExchange,
                deliverCourierContract, cancelMarketOrder, sellOrdersPlaced, createContractsCourier, modifyMarketOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsMarket {\n");
        sb.append("    acceptContractsCourier: ").append(toIndentedString(acceptContractsCourier)).append("\n");
        sb.append("    buyOrdersPlaced: ").append(toIndentedString(buyOrdersPlaced)).append("\n");
        sb.append("    iskSpent: ").append(toIndentedString(iskSpent)).append("\n");
        sb.append("    createContractsAuction: ").append(toIndentedString(createContractsAuction)).append("\n");
        sb.append("    createContractsItemExchange: ").append(toIndentedString(createContractsItemExchange))
                .append("\n");
        sb.append("    searchContracts: ").append(toIndentedString(searchContracts)).append("\n");
        sb.append("    iskGained: ").append(toIndentedString(iskGained)).append("\n");
        sb.append("    acceptContractsItemExchange: ").append(toIndentedString(acceptContractsItemExchange))
                .append("\n");
        sb.append("    deliverCourierContract: ").append(toIndentedString(deliverCourierContract)).append("\n");
        sb.append("    cancelMarketOrder: ").append(toIndentedString(cancelMarketOrder)).append("\n");
        sb.append("    sellOrdersPlaced: ").append(toIndentedString(sellOrdersPlaced)).append("\n");
        sb.append("    createContractsCourier: ").append(toIndentedString(createContractsCourier)).append("\n");
        sb.append("    modifyMarketOrder: ").append(toIndentedString(modifyMarketOrder)).append("\n");
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

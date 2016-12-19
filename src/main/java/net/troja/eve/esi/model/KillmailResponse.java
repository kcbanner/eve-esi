/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.2.dev3
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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.KillmailAttacker;
import net.troja.eve.esi.model.KillmailVictim;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class KillmailResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("attackers")
    private List<KillmailAttacker> attackers = new ArrayList<KillmailAttacker>();

    @JsonProperty("killmail_id")
    private Integer killmailId = null;

    @JsonProperty("killmail_time")
    private OffsetDateTime killmailTime = null;

    @JsonProperty("moon_id")
    private Integer moonId = null;

    @JsonProperty("solar_system_id")
    private Integer solarSystemId = null;

    @JsonProperty("victim")
    private KillmailVictim victim = null;

    @JsonProperty("war_id")
    private Integer warId = null;

    public KillmailResponse attackers(List<KillmailAttacker> attackers) {
        this.attackers = attackers;
        return this;
    }

    public KillmailResponse addAttackersItem(KillmailAttacker attackersItem) {
        this.attackers.add(attackersItem);
        return this;
    }

    /**
     * attackers array
     * 
     * @return attackers
     **/
    @ApiModelProperty(example = "null", required = true, value = "attackers array")
    public List<KillmailAttacker> getAttackers() {
        return attackers;
    }

    public void setAttackers(List<KillmailAttacker> attackers) {
        this.attackers = attackers;
    }

    public KillmailResponse killmailId(Integer killmailId) {
        this.killmailId = killmailId;
        return this;
    }

    /**
     * ID of the killmail
     * 
     * @return killmailId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of the killmail")
    public Integer getKillmailId() {
        return killmailId;
    }

    public void setKillmailId(Integer killmailId) {
        this.killmailId = killmailId;
    }

    public KillmailResponse killmailTime(OffsetDateTime killmailTime) {
        this.killmailTime = killmailTime;
        return this;
    }

    /**
     * Time that the victim was killed and the killmail generated
     * 
     * @return killmailTime
     **/
    @ApiModelProperty(example = "null", required = true, value = "Time that the victim was killed and the killmail generated ")
    public OffsetDateTime getKillmailTime() {
        return killmailTime;
    }

    public void setKillmailTime(OffsetDateTime killmailTime) {
        this.killmailTime = killmailTime;
    }

    public KillmailResponse moonId(Integer moonId) {
        this.moonId = moonId;
        return this;
    }

    /**
     * Moon if the kill took place at one
     * 
     * @return moonId
     **/
    @ApiModelProperty(example = "null", value = "Moon if the kill took place at one")
    public Integer getMoonId() {
        return moonId;
    }

    public void setMoonId(Integer moonId) {
        this.moonId = moonId;
    }

    public KillmailResponse solarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * Solar system that the kill took place in
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Solar system that the kill took place in ")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public KillmailResponse victim(KillmailVictim victim) {
        this.victim = victim;
        return this;
    }

    /**
     * Get victim
     * 
     * @return victim
     **/
    @ApiModelProperty(example = "null", value = "")
    public KillmailVictim getVictim() {
        return victim;
    }

    public void setVictim(KillmailVictim victim) {
        this.victim = victim;
    }

    public KillmailResponse warId(Integer warId) {
        this.warId = warId;
        return this;
    }

    /**
     * War if the killmail is generated in relation to an official war
     * 
     * @return warId
     **/
    @ApiModelProperty(example = "null", value = "War if the killmail is generated in relation to an official war ")
    public Integer getWarId() {
        return warId;
    }

    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillmailResponse killmailResponse = (KillmailResponse) o;
        return Objects.equals(this.attackers, killmailResponse.attackers)
                && Objects.equals(this.killmailId, killmailResponse.killmailId)
                && Objects.equals(this.killmailTime, killmailResponse.killmailTime)
                && Objects.equals(this.moonId, killmailResponse.moonId)
                && Objects.equals(this.solarSystemId, killmailResponse.solarSystemId)
                && Objects.equals(this.victim, killmailResponse.victim)
                && Objects.equals(this.warId, killmailResponse.warId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackers, killmailId, killmailTime, moonId, solarSystemId, victim, warId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillmailResponse {\n");

        sb.append("    attackers: ").append(toIndentedString(attackers)).append("\n");
        sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
        sb.append("    killmailTime: ").append(toIndentedString(killmailTime)).append("\n");
        sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    victim: ").append(toIndentedString(victim)).append("\n");
        sb.append("    warId: ").append(toIndentedString(warId)).append("\n");
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

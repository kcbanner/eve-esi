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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * new_mail object
 */
@ApiModel(description = "new_mail object")
public class UiNewMail implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BODY = "body";
    @SerializedName(SERIALIZED_NAME_BODY)
    private String body;

    public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
    @SerializedName(SERIALIZED_NAME_RECIPIENTS)
    private List<Integer> recipients = new ArrayList<>();

    public static final String SERIALIZED_NAME_SUBJECT = "subject";
    @SerializedName(SERIALIZED_NAME_SUBJECT)
    private String subject;

    public static final String SERIALIZED_NAME_TO_CORP_OR_ALLIANCE_ID = "to_corp_or_alliance_id";
    @SerializedName(SERIALIZED_NAME_TO_CORP_OR_ALLIANCE_ID)
    private Integer toCorpOrAllianceId;

    public static final String SERIALIZED_NAME_TO_MAILING_LIST_ID = "to_mailing_list_id";
    @SerializedName(SERIALIZED_NAME_TO_MAILING_LIST_ID)
    private Integer toMailingListId;

    public UiNewMail body(String body) {
        this.body = body;
        return this;
    }

    /**
     * body string
     * 
     * @return body
     **/
    @ApiModelProperty(required = true, value = "body string")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public UiNewMail recipients(List<Integer> recipients) {
        this.recipients = recipients;
        return this;
    }

    public UiNewMail addRecipientsItem(Integer recipientsItem) {
        this.recipients.add(recipientsItem);
        return this;
    }

    /**
     * recipients array
     * 
     * @return recipients
     **/
    @ApiModelProperty(required = true, value = "recipients array")
    public List<Integer> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Integer> recipients) {
        this.recipients = recipients;
    }

    public UiNewMail subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * subject string
     * 
     * @return subject
     **/
    @ApiModelProperty(required = true, value = "subject string")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UiNewMail toCorpOrAllianceId(Integer toCorpOrAllianceId) {
        this.toCorpOrAllianceId = toCorpOrAllianceId;
        return this;
    }

    /**
     * to_corp_or_alliance_id integer
     * 
     * @return toCorpOrAllianceId
     **/
    @ApiModelProperty(value = "to_corp_or_alliance_id integer")
    public Integer getToCorpOrAllianceId() {
        return toCorpOrAllianceId;
    }

    public void setToCorpOrAllianceId(Integer toCorpOrAllianceId) {
        this.toCorpOrAllianceId = toCorpOrAllianceId;
    }

    public UiNewMail toMailingListId(Integer toMailingListId) {
        this.toMailingListId = toMailingListId;
        return this;
    }

    /**
     * Corporations, alliances and mailing lists are all types of mailing
     * groups. You may only send to one mailing group, at a time, so you may
     * fill out either this field or the to_corp_or_alliance_ids field
     * 
     * @return toMailingListId
     **/
    @ApiModelProperty(value = "Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field")
    public Integer getToMailingListId() {
        return toMailingListId;
    }

    public void setToMailingListId(Integer toMailingListId) {
        this.toMailingListId = toMailingListId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UiNewMail uiNewMail = (UiNewMail) o;
        return Objects.equals(this.body, uiNewMail.body) && Objects.equals(this.recipients, uiNewMail.recipients)
                && Objects.equals(this.subject, uiNewMail.subject)
                && Objects.equals(this.toCorpOrAllianceId, uiNewMail.toCorpOrAllianceId)
                && Objects.equals(this.toMailingListId, uiNewMail.toMailingListId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, recipients, subject, toCorpOrAllianceId, toMailingListId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UiNewMail {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    toCorpOrAllianceId: ").append(toIndentedString(toCorpOrAllianceId)).append("\n");
        sb.append("    toMailingListId: ").append(toIndentedString(toMailingListId)).append("\n");
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

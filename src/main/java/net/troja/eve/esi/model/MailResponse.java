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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.Recipient;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class MailResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BODY = "body";
    @SerializedName(SERIALIZED_NAME_BODY)
    private String body;

    public static final String SERIALIZED_NAME_FROM = "from";
    @SerializedName(SERIALIZED_NAME_FROM)
    private Integer from;

    public static final String SERIALIZED_NAME_LABELS = "labels";
    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<Integer> labels = null;

    public static final String SERIALIZED_NAME_READ = "read";
    @SerializedName(SERIALIZED_NAME_READ)
    private Boolean read;

    public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
    @SerializedName(SERIALIZED_NAME_RECIPIENTS)
    private List<Recipient> recipients = null;

    public static final String SERIALIZED_NAME_SUBJECT = "subject";
    @SerializedName(SERIALIZED_NAME_SUBJECT)
    private String subject;

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    private OffsetDateTime timestamp;

    public MailResponse body(String body) {

        this.body = body;
        return this;
    }

    /**
     * Mail&#39;s body
     * 
     * @return body
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Mail's body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public MailResponse from(Integer from) {

        this.from = from;
        return this;
    }

    /**
     * From whom the mail was sent
     * 
     * @return from
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "From whom the mail was sent")
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public MailResponse labels(List<Integer> labels) {

        this.labels = labels;
        return this;
    }

    public MailResponse addLabelsItem(Integer labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Labels attached to the mail
     * 
     * @return labels
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Labels attached to the mail")
    public List<Integer> getLabels() {
        return labels;
    }

    public void setLabels(List<Integer> labels) {
        this.labels = labels;
    }

    public MailResponse read(Boolean read) {

        this.read = read;
        return this;
    }

    /**
     * Whether the mail is flagged as read
     * 
     * @return read
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Whether the mail is flagged as read")
    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public MailResponse recipients(List<Recipient> recipients) {

        this.recipients = recipients;
        return this;
    }

    public MailResponse addRecipientsItem(Recipient recipientsItem) {
        if (this.recipients == null) {
            this.recipients = new ArrayList<>();
        }
        this.recipients.add(recipientsItem);
        return this;
    }

    /**
     * Recipients of the mail
     * 
     * @return recipients
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Recipients of the mail")
    public List<Recipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    public MailResponse subject(String subject) {

        this.subject = subject;
        return this;
    }

    /**
     * Mail subject
     * 
     * @return subject
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Mail subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MailResponse timestamp(OffsetDateTime timestamp) {

        this.timestamp = timestamp;
        return this;
    }

    /**
     * When the mail was sent
     * 
     * @return timestamp
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "When the mail was sent")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MailResponse mailResponse = (MailResponse) o;
        return Objects.equals(this.body, mailResponse.body) && Objects.equals(this.from, mailResponse.from)
                && Objects.equals(this.labels, mailResponse.labels) && Objects.equals(this.read, mailResponse.read)
                && Objects.equals(this.recipients, mailResponse.recipients)
                && Objects.equals(this.subject, mailResponse.subject)
                && Objects.equals(this.timestamp, mailResponse.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, from, labels, read, recipients, subject, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

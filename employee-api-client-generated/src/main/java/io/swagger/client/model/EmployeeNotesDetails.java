/*
 * Employee API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
import org.threeten.bp.OffsetDateTime;

/**
 * An employee note
 */
@ApiModel(description = "An employee note")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T22:10:48.279Z")
public class EmployeeNotesDetails {
  @SerializedName("id")
  private Integer id = null;

  /**
   * Status of the employee note. Either &#x60;active&#x60; or &#x60;archived&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    ARCHIVED("archived");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = StatusEnum.ACTIVE;

  @SerializedName("note_type")
  private String noteType = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("created_by")
  private Integer createdBy = null;

  public EmployeeNotesDetails id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the employee note
   * @return id
  **/
  @ApiModelProperty(example = "123", value = "ID of the employee note")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EmployeeNotesDetails status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the employee note. Either &#x60;active&#x60; or &#x60;archived&#x60;.
   * @return status
  **/
  @ApiModelProperty(example = "active", value = "Status of the employee note. Either `active` or `archived`.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public EmployeeNotesDetails noteType(String noteType) {
    this.noteType = noteType;
    return this;
  }

   /**
   * Note type category of the employee note
   * @return noteType
  **/
  @ApiModelProperty(example = "employee_general", value = "Note type category of the employee note")
  public String getNoteType() {
    return noteType;
  }

  public void setNoteType(String noteType) {
    this.noteType = noteType;
  }

  public EmployeeNotesDetails content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Content of the employee note. A subset of HTML is accepted.
   * @return content
  **/
  @ApiModelProperty(example = "Employee requested additional training.", value = "Content of the employee note. A subset of HTML is accepted.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public EmployeeNotesDetails createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date employee note was created (ISO 8601)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2018-07-08T13:30:00+00:00", value = "Date employee note was created (ISO 8601)")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public EmployeeNotesDetails createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * AlayaCare ID of the employee who created the employee note.
   * @return createdBy
  **/
  @ApiModelProperty(example = "1001", value = "AlayaCare ID of the employee who created the employee note.")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeNotesDetails employeeNotesDetails = (EmployeeNotesDetails) o;
    return Objects.equals(this.id, employeeNotesDetails.id) &&
        Objects.equals(this.status, employeeNotesDetails.status) &&
        Objects.equals(this.noteType, employeeNotesDetails.noteType) &&
        Objects.equals(this.content, employeeNotesDetails.content) &&
        Objects.equals(this.createdAt, employeeNotesDetails.createdAt) &&
        Objects.equals(this.createdBy, employeeNotesDetails.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, noteType, content, createdAt, createdBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeNotesDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    noteType: ").append(toIndentedString(noteType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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


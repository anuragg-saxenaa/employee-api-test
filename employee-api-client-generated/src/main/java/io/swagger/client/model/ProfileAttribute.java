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

/**
 * ProfileAttribute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T22:10:48.279Z")
public class ProfileAttribute {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("description")
  private String description = null;

  public ProfileAttribute tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Attribute key in the demographics object
   * @return tag
  **/
  @ApiModelProperty(example = "first_name", value = "Attribute key in the demographics object")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ProfileAttribute description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Attribute description as it shows in the web application
   * @return description
  **/
  @ApiModelProperty(example = "First Name", value = "Attribute description as it shows in the web application")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileAttribute profileAttribute = (ProfileAttribute) o;
    return Objects.equals(this.tag, profileAttribute.tag) &&
        Objects.equals(this.description, profileAttribute.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileAttribute {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


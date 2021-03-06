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
 * DeleteDirectoryActionSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T22:10:48.279Z")
public class DeleteDirectoryActionSchema {
  @SerializedName("forced-delete")
  private Boolean forcedDelete = null;

  public DeleteDirectoryActionSchema forcedDelete(Boolean forcedDelete) {
    this.forcedDelete = forcedDelete;
    return this;
  }

   /**
   * required to delete a non-empty directory
   * @return forcedDelete
  **/
  @ApiModelProperty(example = "true", value = "required to delete a non-empty directory")
  public Boolean isForcedDelete() {
    return forcedDelete;
  }

  public void setForcedDelete(Boolean forcedDelete) {
    this.forcedDelete = forcedDelete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDirectoryActionSchema deleteDirectoryActionSchema = (DeleteDirectoryActionSchema) o;
    return Objects.equals(this.forcedDelete, deleteDirectoryActionSchema.forcedDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forcedDelete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDirectoryActionSchema {\n");
    
    sb.append("    forcedDelete: ").append(toIndentedString(forcedDelete)).append("\n");
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


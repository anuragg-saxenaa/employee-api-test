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
import io.swagger.client.model.EmploymentTypeDetails;
import io.swagger.client.model.PaginatedList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Paginated list of employment types
 */
@ApiModel(description = "Paginated list of employment types")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T22:10:48.279Z")
public class EmploymentTypeDetailsList extends PaginatedList {
  @SerializedName("items")
  private List<EmploymentTypeDetails> items = null;

  public EmploymentTypeDetailsList items(List<EmploymentTypeDetails> items) {
    this.items = items;
    return this;
  }

  public EmploymentTypeDetailsList addItemsItem(EmploymentTypeDetails itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<EmploymentTypeDetails>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<EmploymentTypeDetails> getItems() {
    return items;
  }

  public void setItems(List<EmploymentTypeDetails> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentTypeDetailsList employmentTypeDetailsList = (EmploymentTypeDetailsList) o;
    return Objects.equals(this.items, employmentTypeDetailsList.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentTypeDetailsList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


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
import io.swagger.client.model.Branch;
import io.swagger.client.model.PaginatedList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Paginated list of branches
 */
@ApiModel(description = "Paginated list of branches")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T22:10:48.279Z")
public class BranchList extends PaginatedList {
  @SerializedName("items")
  private List<Branch> items = null;

  public BranchList items(List<Branch> items) {
    this.items = items;
    return this;
  }

  public BranchList addItemsItem(Branch itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Branch>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<Branch> getItems() {
    return items;
  }

  public void setItems(List<Branch> items) {
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
    BranchList branchList = (BranchList) o;
    return Objects.equals(this.items, branchList.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchList {\n");
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


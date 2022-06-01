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
import io.swagger.client.model.EmployeeStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AlayaCare employee list view 
 */
@ApiModel(description = "AlayaCare employee list view ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T22:10:48.279Z")
public class Employee {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("ac_id")
  private String acId = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("profile_id")
  private Integer profileId = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("status")
  private EmployeeStatus status = null;

  @SerializedName("job_title")
  private String jobTitle = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("phone_other")
  private String phoneOther = null;

  @SerializedName("designation")
  private String designation = null;

  @SerializedName("departments")
  private List<Integer> departments = null;

  @SerializedName("_link")
  private String link = null;

  public Employee id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Employee acId(String acId) {
    this.acId = acId;
    return this;
  }

   /**
   * AlayaCare ID for display in-app
   * @return acId
  **/
  @ApiModelProperty(example = "AC000000024", value = "AlayaCare ID for display in-app")
  public String getAcId() {
    return acId;
  }

  public void setAcId(String acId) {
    this.acId = acId;
  }

  public Employee externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(example = "external_id_1", value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Employee profileId(Integer profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * Get profileId
   * @return profileId
  **/
  @ApiModelProperty(example = "7890", value = "")
  public Integer getProfileId() {
    return profileId;
  }

  public void setProfileId(Integer profileId) {
    this.profileId = profileId;
  }

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "John", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee status(EmployeeStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public EmployeeStatus getStatus() {
    return status;
  }

  public void setStatus(EmployeeStatus status) {
    this.status = status;
  }

  public Employee jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Employee email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "john@smith.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Employee phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "+15555555555", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Employee phoneOther(String phoneOther) {
    this.phoneOther = phoneOther;
    return this;
  }

   /**
   * Get phoneOther
   * @return phoneOther
  **/
  @ApiModelProperty(example = "+15555555555", value = "")
  public String getPhoneOther() {
    return phoneOther;
  }

  public void setPhoneOther(String phoneOther) {
    this.phoneOther = phoneOther;
  }

  public Employee designation(String designation) {
    this.designation = designation;
    return this;
  }

   /**
   * Get designation
   * @return designation
  **/
  @ApiModelProperty(value = "")
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Employee departments(List<Integer> departments) {
    this.departments = departments;
    return this;
  }

  public Employee addDepartmentsItem(Integer departmentsItem) {
    if (this.departments == null) {
      this.departments = new ArrayList<Integer>();
    }
    this.departments.add(departmentsItem);
    return this;
  }

   /**
   * Get departments
   * @return departments
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getDepartments() {
    return departments;
  }

  public void setDepartments(List<Integer> departments) {
    this.departments = departments;
  }

  public Employee link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.acId, employee.acId) &&
        Objects.equals(this.externalId, employee.externalId) &&
        Objects.equals(this.profileId, employee.profileId) &&
        Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.status, employee.status) &&
        Objects.equals(this.jobTitle, employee.jobTitle) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.phone, employee.phone) &&
        Objects.equals(this.phoneOther, employee.phoneOther) &&
        Objects.equals(this.designation, employee.designation) &&
        Objects.equals(this.departments, employee.departments) &&
        Objects.equals(this.link, employee.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, acId, externalId, profileId, firstName, lastName, status, jobTitle, email, phone, phoneOther, designation, departments, link);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acId: ").append(toIndentedString(acId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneOther: ").append(toIndentedString(phoneOther)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    departments: ").append(toIndentedString(departments)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

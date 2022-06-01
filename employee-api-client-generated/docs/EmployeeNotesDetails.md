
# EmployeeNotesDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID of the employee note |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the employee note. Either &#x60;active&#x60; or &#x60;archived&#x60;. |  [optional]
**noteType** | **String** | Note type category of the employee note |  [optional]
**content** | **String** | Content of the employee note. A subset of HTML is accepted. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date employee note was created (ISO 8601) |  [optional]
**createdBy** | **Integer** | AlayaCare ID of the employee who created the employee note. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
ARCHIVED | &quot;archived&quot;




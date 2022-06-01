
# EmployeeStatusUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Updatable status of an employee | 
**comment** | **String** | Can only be set for employee termination |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
PENDING | &quot;pending&quot;
ON_HOLD | &quot;on_hold&quot;
SUSPENDED | &quot;suspended&quot;
TERMINATED | &quot;terminated&quot;
APPLICANT | &quot;applicant&quot;
REJECTED | &quot;rejected&quot;




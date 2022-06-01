
# EmployeeUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**demographics** | [**EmployeeDemographics**](EmployeeDemographics.md) |  |  [optional]
**externalId** | **String** |  |  [optional]
**username** | **String** |  |  [optional]
**roles** | [**List&lt;Role&gt;**](Role.md) | List of roles. Role objects have ID and name for convenience of input, but only the IDs are used here. For valid IDs, request /roles.  |  [optional]
**groups** | [**List&lt;Group&gt;**](Group.md) | List of groups. Group objects have ID and name for convenience of input, but only the IDs are used here. For valid IDs, request /groups.  |  [optional]
**departments** | [**List&lt;Department&gt;**](Department.md) | List of departments. Department objects have ID and name for convenience of input, but only the IDs are used here. For valid IDs, request /departments.  |  [optional]
**designation** | **String** |  |  [optional]
**payrollNumber** | **String** |  |  [optional]
**maxWeeklyCapacity** | **String** |  |  [optional]
**minWeeklyCapacity** | **String** |  |  [optional]
**employmentType** | [**EmploymentType**](EmploymentType.md) |  |  [optional]
**timezone** | **String** | Timezone name in IANA format (iana.org/time-zones). If set to null, will inherit the branch timezone.  |  [optional]




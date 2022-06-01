
# EmployeeDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**demographics** | [**EmployeeDemographics**](EmployeeDemographics.md) |  | 
**id** | **Integer** |  | 
**acId** | **String** | AlayaCare ID for display in-app | 
**externalId** | **String** |  | 
**profileId** | **Integer** |  |  [optional]
**branchId** | **Integer** |  | 
**status** | [**EmployeeStatus**](EmployeeStatus.md) |  | 
**roles** | [**List&lt;Role&gt;**](Role.md) | Employee roles |  [optional]
**groups** | [**List&lt;Group&gt;**](Group.md) | Employee groups |  [optional]
**departments** | [**List&lt;Department&gt;**](Department.md) | Employee departments |  [optional]
**designation** | **String** |  |  [optional]
**maxWeeklyCapacity** | **String** |  |  [optional]
**minWeeklyCapacity** | **String** |  |  [optional]
**username** | **String** |  |  [optional]
**skills** | [**List&lt;Skill&gt;**](Skill.md) | List of skills associated to an employee |  [optional]
**ssnSin** | **String** | Social security number or Social insurance number of the employee |  [optional]
**contacts** | [**List&lt;EmployeeContact&gt;**](EmployeeContact.md) | Employee contacts | 
**language** | **String** |  |  [optional]
**payrollNumber** | **String** |  |  [optional]
**employmentType** | [**EmploymentType**](EmploymentType.md) |  |  [optional]
**costCentre** | [**CostCentre**](CostCentre.md) |  |  [optional]
**timezone** | **String** | Timezone name in IANA format (iana.org/time-zones). If not set, returns the branch timezone.  |  [optional]




# Write your MySQL query statement below
select EmployeeUNI.unique_id , Employees.name from employees Left join EmployeeUNI on  Employees.id = EmployeeUNI.id;


# Write your MySQL query statement below
select Eu.unique_id as unique_id , E.name as name from Employees E left join EmployeeUNI Eu on E.id = Eu.id
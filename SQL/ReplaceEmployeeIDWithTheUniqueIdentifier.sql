# Write your MySQL query statement below
select EmployeeUNI.unique_id , Employees.name from employees Left join EmployeeUNI on  Employees.id = EmployeeUNI.id;
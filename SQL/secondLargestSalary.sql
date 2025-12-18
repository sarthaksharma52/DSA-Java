# Write your MySQL query statement below

select (select distinct salary from Employee order by salary desc limit 1,1 ) as SecondHighestSalary;

select distinct max(salary) as SecondHighestSalary from Employee where salary < (select max(salary) from Employee);

select(select distinct salary from (select salary, dense_rank() over (order by salary desc) as dr from Employee) t where dr = 2) as SecondHighestSalary;
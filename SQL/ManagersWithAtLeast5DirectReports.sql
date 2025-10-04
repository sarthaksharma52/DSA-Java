# Write your MySQL query statement below

select Emp1.name from Employee as Emp1 inner join Employee as Emp2 on Emp1.id = Emp2.managerId group by Emp1.name,Emp1.id having count(Emp2.id)>=5;
# Write your MySQL query statement below
select e.name,a.bonus
from Employee e
left join bonus a
on e.empId=a.empId
where a.bonus<1000
or a.bonus is null;
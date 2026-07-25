# Write your MySQL query statement below
SELECT e.FirstName,e.LastName,a.City,a.State
from Person e
left join Address a
ON e.personId = a.personId ;
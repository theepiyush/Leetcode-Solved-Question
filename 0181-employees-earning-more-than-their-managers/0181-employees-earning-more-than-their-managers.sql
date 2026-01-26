# Write your MySQL query statement below
Select e1.name As Employee
FROM Employee e1
INNER JOIN Employee e2
ON e1.managerId=e2.id
where e1.salary>e2.salary

# Write your MySQL query statement below
Select c.name As customers
From Customers c
Left Join Orders o
on c.id=o.customerId
where o.id is Null

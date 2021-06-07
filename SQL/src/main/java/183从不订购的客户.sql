select Customers.Name as Customers 
from Customers
left join
Orders
on Orders.CustomerId = Customers.id
where Orders.CustomerId is null ;
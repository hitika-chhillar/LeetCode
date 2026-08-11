-- Last updated: 8/11/2026, 9:02:38 PM
SELECT name AS Customers 
FROM Customers
WHERE id NOT IN (SELECT customerId FROM ORDERS);
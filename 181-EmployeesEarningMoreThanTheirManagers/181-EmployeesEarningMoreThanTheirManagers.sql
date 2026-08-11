-- Last updated: 8/11/2026, 9:02:41 PM
SELECT e.name AS employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary>m.salary;

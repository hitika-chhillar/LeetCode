-- Last updated: 8/11/2026, 9:02:43 PM
SELECT 
p.firstName,
p.lastName,
a.city,
a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personid;
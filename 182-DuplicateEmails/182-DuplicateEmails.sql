-- Last updated: 8/11/2026, 9:02:40 PM
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email)>1;

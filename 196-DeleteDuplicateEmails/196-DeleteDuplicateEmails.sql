-- Last updated: 8/11/2026, 9:02:37 PM
DELETE FROM PERSON 
WHERE id NOT IN( 
    SELECT * FROM(
        SELECT MIN(id)FROM PERSON 
GROUP BY email
)AS temp
);

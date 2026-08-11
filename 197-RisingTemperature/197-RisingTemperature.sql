-- Last updated: 8/11/2026, 9:02:35 PM
SELECT w1.id
FROM Weather w1
JOIN Weather w2
ON DATEDIFF(w1.recordDate,w2.recordDate)=1
WHERE w1.temperature > w2.temperature;

-- Last updated: 8/11/2026, 9:02:12 PM
SELECT player_id,
MIN(event_date)AS first_login
FROM Activity
GROUP BY player_id;

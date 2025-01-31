# Write your MySQL query statement below
SELECT project_id , ROUND(SUM(experience_years)/COUNT(employee_id),2)
AS average_years 
From project p INNER JOIN employee e USING(employee_id)
Group by project_id
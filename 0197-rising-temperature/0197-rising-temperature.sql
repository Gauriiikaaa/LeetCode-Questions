# Write your MySQL query statement below
select w1.id from Weather w1 JOIN Weather w2 on W1.recordDate = DATE_ADD(W2.recordDate,Interval 1 DAY)
WHERE W1.temperature >w2.temperature;
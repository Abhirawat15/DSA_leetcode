# Write your MySQL query statement below
SELECT name FROM Customer
WHERE  referee_id!=2 || referee_id IS NULL;
# SELECT name FROM customer WHERE referee_id IS NULL OR referee_id NOT IN(2) ORDER BY id
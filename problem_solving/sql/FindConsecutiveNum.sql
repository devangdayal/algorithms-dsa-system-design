-- 180. Consecutive Numbers -- Medium
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | id          | int     |
-- | num         | varchar |
-- +-------------+---------+
-- In SQL, id is the primary key for this table.
-- id is an autoincrement column starting from 1.
-- Find all numbers that appear at least three times consecutively.
-- Return the result table in any order.
-- The result format is in the following example.
SELECT
    lg1.num as ConsecutiveNums
FROM
    Logs Lg1
    JOIN Logs lg2 on lg1.id + 1 = lg2.id
    JOIN Logs lg3 on lg2.id + 1 = lg3.id
where
    lg1.num = lg2.num
    AND lg2.num = lg3.num;

-- Sample Input
-- Logs table:
-- +----+-----+
-- | id | num |
-- +----+-----+
-- | 1  | 1   |
-- | 2  | 1   |
-- | 3  | 1   |
-- | 4  | 2   |
-- | 5  | 2   |
-- | 6  | 2   |
-- | 7  | 3   |
-- | 8  | 3   |
-- | 9  | 3   |
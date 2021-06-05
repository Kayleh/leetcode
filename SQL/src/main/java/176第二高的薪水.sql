# Write your MySQL query statement below
SELECT (
           SELECT DISTINCT Salary
           FROM employee
           ORDER BY Salary
               DESC
           LIMIT 1,1
       )
           AS SecondHighestSalary;

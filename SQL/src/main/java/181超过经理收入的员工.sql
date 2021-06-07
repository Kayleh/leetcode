SELECT ygName AS Employee
FROM 
(
SELECT yg.`Name` AS ygName,yg.`ManagerId`,yg.`Salary` AS ygs,person.`Name` AS managerName,person.`Salary` AS ms 
FROM Employee AS yg
JOIN 
Employee AS person
ON
person.id = yg.managerId 
) mm
WHERE ygs > ms

----------------------------------------

SELECT
     a.NAME AS Employee
FROM Employee AS a JOIN Employee AS b
     ON a.ManagerId = b.Id
     AND a.Salary > b.Salary
;

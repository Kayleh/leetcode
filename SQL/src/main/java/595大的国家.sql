SELECT
name,population,area
FROM World
where 
area>3000000 or population>25000000

-----------------------------
-- 使用 or 会使索引会失效，在数据量较大的时候查找效率较低，通常建议使用 union 代替 or。
SELECT
    name, population, area
FROM
    world
WHERE
    area > 3000000

UNION

SELECT
    name, population, area
FROM
    world
WHERE
    population > 25000000
;

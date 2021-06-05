select a.ID, a.date
from weather as a cross join weather as b
     on datediff(a.date, b.date) = 1
where a.temp > b.temp;

-- 交叉连接

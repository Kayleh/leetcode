update 
Salary 
set sex = char(ascii('m')+ascii('f')-ascii(sex));

-- 先求 m 和 f 的和，然后减去其中一个，就会得到另外一个的值，从而实现了值的对换。
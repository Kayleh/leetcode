select Email
from 
(
    select Email,count(Email) as EmailCount from Person group by Email;
)
where EmailCount>1

------------------------------
更高效
select Email
from Person
group by Email
having count(Email) > 1;
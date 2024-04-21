-- 코드를 작성해주세요
select ID,FISH_NAME,LENGTH 
from FISH_INFO i join FISH_NAME_INFO n on i.FISH_TYPE = n.FISH_TYPE 
where (i.FISH_TYPE, LENGTH) IN (select i.FISH_TYPE,MAX(i.length) from FISH_INFO i group by FISH_TYPE)order by i.id asc
-- 코드를 작성해주세요

select YEAR(A.DIFFERENTIATION_DATE) as YEAR,(B.size - A.SIZE_OF_COLONY) as YEAR_DEV ,A.ID	
from 
ECOLI_DATA as A, 
(select YEAR(DIFFERENTIATION_DATE) as YEAR, max(SIZE_OF_COLONY) as size from ECOLI_DATA group by YEAR) as B 
where YEAR(A.DIFFERENTIATION_DATE) = B.year
order by YEAR asc, YEAR_DEV asc
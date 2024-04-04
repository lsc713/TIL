-- 코드를 작성해주세요
select CONCAT(CEIL(MONTH(DIFFERENTIATION_DATE)/3),'Q') as QUARTER ,count(*) as ECOLI_COUNT from ECOLI_DATA group by QUARTER order by QUARTER asc
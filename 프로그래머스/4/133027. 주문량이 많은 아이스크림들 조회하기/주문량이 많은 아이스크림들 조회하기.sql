-- 코드를 입력하세요
SELECT f.flavor from july j join FIRST_HALF f on j.FLAVOR=f.FLAVOR group by f.flavor order by sum(j.total_order)+sum(f.total_order) desc limit 3
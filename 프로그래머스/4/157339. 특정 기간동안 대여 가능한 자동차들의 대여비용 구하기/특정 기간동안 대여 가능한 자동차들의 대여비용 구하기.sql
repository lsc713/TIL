-- 코드를 입력하세요
SELECT 
c.CAR_ID,
c.CAR_TYPE,round((c.DAILY_FEE * (100-DISCOUNT_RATE)/100)*30,0)FEE 
from 
CAR_RENTAL_COMPANY_CAR c 
join CAR_RENTAL_COMPANY_RENTAL_HISTORY r 
on c.CAR_ID = r.CAR_ID 
join CAR_RENTAL_COMPANY_DISCOUNT_PLAN d 
on d.CAR_TYPE = c.CAR_TYPE 
where c.CAR_TYPE in ("세단","SUV") 
AND r.CAR_ID NOT IN
(select CAR_ID from CAR_RENTAL_COMPANY_RENTAL_HISTORY WHERE end_date >= "2022-11-01"
            AND start_date < "2022-12-01") AND DURATION_TYPE = "30일 이상"
group by c.CAR_ID having fee between 500000 and 1999999
order by fee desc, c.CAR_TYPE asc, c.CAR_ID desc



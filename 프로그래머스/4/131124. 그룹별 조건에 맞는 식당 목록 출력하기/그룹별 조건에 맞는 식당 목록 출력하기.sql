-- 코드를 입력하세요
SELECT p.MEMBER_NAME, r.REVIEW_TEXT, DATE_FORMAT(r.REVIEW_DATE,'%Y-%m-%d') as REVIEW_DATE
from MEMBER_PROFILE p join REST_REVIEW r on r.MEMBER_ID = p.MEMBER_ID 
where p.MEMBER_ID = (select MEMBER_ID from REST_REVIEW group by MEMBER_ID order by count(*) desc limit 1)
order by r.REVIEW_DATE asc, r.REVIEW_TEXT asc
-- 코드를 입력하세요
SELECT a.AUTHOR_ID,a.AUTHOR_NAME,b.CATEGORY,sum(b.price * s.sales) as TOTAL_SALES
from BOOK b join AUTHOR a on b.AUTHOR_ID = a.AUTHOR_ID join BOOK_SALES s on b.book_id = s.book_id
where date_format(s.SALES_DATE,'%Y-%m') = '2022-01'
group by a.AUTHOR_NAME,b.CATEGORY
order by a.AUTHOR_ID, b.CATEGORY desc
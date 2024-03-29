-- 코드를 작성해주세요

select ID, EMAIL, FIRST_NAME, LAST_NAME from developers as d where SKILL_CODE & (select code from skillcodes where name = "Python")  or SKILL_CODE & (select code from skillcodes where name = "C#") order by id asc
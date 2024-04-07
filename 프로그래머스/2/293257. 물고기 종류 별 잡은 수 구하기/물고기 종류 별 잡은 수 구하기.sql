-- 코드를 작성해주세요
select count(*) as FISH_COUNT, i.FISH_NAME as FISH_NAME  from FISH_NAME_INFO i join fish_info o on i.FISH_TYPE = o.FISH_TYPE group by i.FISH_NAME order by FISH_COUNT desc
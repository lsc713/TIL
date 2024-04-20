-- 코드를 작성해주세요
select i.ITEM_ID,ITEM_NAME,RARITY 
from ITEM_INFO i
where i.ITEM_ID not in (select PARENT_ITEM_ID from ITEM_TREE t where t.PARENT_ITEM_ID is not null) 
order by ITEM_ID desc
-- 코드를 작성해주세요
select 
    i.ITEM_ID,
    i.ITEM_NAME,
    i.RARITY 
from 
    ITEM_INFO i 
    join ITEM_TREE t 
        on i.item_id = t.item_id 
where  t.parent_item_id in (select ITEM_ID 
                             from ITEM_INFO 
                             where rarity="RARE") 
order by t.ITEM_ID desc

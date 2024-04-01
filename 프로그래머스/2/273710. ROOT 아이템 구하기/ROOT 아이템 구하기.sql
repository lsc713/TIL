-- 코드를 작성해주세요
select i.ITEM_ID,i.ITEM_NAME from ITEM_TREE t join item_info i on t.item_id = i.item_id where t.PARENT_ITEM_ID is null
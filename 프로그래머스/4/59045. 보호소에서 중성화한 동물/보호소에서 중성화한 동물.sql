-- 코드를 입력하세요
SELECT o.ANIMAL_ID,o.ANIMAL_TYPE,o.NAME 
from ANIMAL_OUTS o join ANIMAL_INS i on i.ANIMAL_ID=o.ANIMAL_ID 
where 
(i.SEX_UPON_INTAKE NOT like "Spayed%" AND i.SEX_UPON_INTAKE NOT like "Neutered%") 
AND (o.SEX_UPON_OUTCOME like "Neutered%" OR o.SEX_UPON_OUTCOME like "Spayed%") order by i.ANIMAL_ID asc
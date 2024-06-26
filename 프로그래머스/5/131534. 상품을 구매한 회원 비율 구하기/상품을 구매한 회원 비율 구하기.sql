
SELECT
    YEAR(OS.SALES_DATE) YEAR,
    MONTH(OS.SALES_DATE) MONTH,
    COUNT(DISTINCT OS.USER_ID) PUCHASED_USERS,
    ROUND(( COUNT(DISTINCT OS.USER_ID) /
    (SELECT COUNT(UI.USER_ID)
     FROM USER_INFO UI
     WHERE YEAR(UI.JOINED) = 2021)), 1) PUCHASED_RATIO
FROM
    ONLINE_SALE OS
    JOIN USER_INFO UI
    ON OS.USER_ID = UI.USER_ID
    AND YEAR(UI.JOINED) = 2021
    
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH
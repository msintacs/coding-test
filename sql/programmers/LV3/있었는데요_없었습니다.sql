-- 프로그래머스 59043 - 있었는데요 없었습니다
-- https://school.programmers.co.kr/learn/courses/30/lessons/59043

SELECT O.ANIMAL_ID,
       O.NAME
FROM ANIMAL_OUTS O
         JOIN ANIMAL_INS I ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.DATETIME > O.DATETIME
ORDER BY I.DATETIME;
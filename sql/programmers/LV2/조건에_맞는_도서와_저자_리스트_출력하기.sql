-- 프로그래머스 144854 - 조건에 맞는 도서와 저자 리스트 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/144854

SELECT B.BOOK_ID,
       A.AUTHOR_NAME,
       B.PUBLISHED_DATE
FROM BOOK B
         JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE B.CATEGORY = '경제'
ORDER BY B.PUBLISHED_DATE;
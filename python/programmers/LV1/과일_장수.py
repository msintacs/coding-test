# 프로그래머스 135808 - 과일 장수
# https://school.programmers.co.kr/learn/courses/30/lessons/135808

def solution(k, m, score):
    answer = 0

    sorted_score = sorted(score, reverse=True)
    start = 0

    while len(score) - start >= m:
        lowest_score = sorted_score[start + m - 1]
        answer += lowest_score * m
        start += m

    return answer


def main():
    print(solution(5, 3, [5, 1, 4, 2, 5, 3, 4]))  # 18
    print(solution(4, 4, [4, 4, 4, 3, 2, 1, 1]))  # 12
    print(solution(3, 8, [1, 2, 3, 1, 2, 3, 1]))  # 0


if __name__ == "__main__":
    main()
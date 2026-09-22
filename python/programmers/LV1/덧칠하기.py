# 프로그래머스 161989 - 덧칠하기
# https://school.programmers.co.kr/learn/courses/30/lessons/161989

def solution(n, m, section):
    answer = 0
    painted_end = 0

    for position in section:
        if position > painted_end:
            start = min(position, n - m + 1)
            painted_end = start + m - 1
            answer += 1

    return answer


def main():
    print(solution(12, 3, [2, 4, 7, 8, 12]))    # 3
    print(solution(9, 4, [6, 9]))               # 1
    print(solution(7, 1, [2, 5, 7]))            # 3


if __name__ == "__main__":
    main()

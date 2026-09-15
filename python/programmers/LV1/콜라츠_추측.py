# 프로그래머스 12943 - 콜라츠 추측
# https://school.programmers.co.kr/learn/courses/30/lessons/12943

def solution(num):
    answer = 0

    while num != 1 and answer < 500:
        if num % 2 == 0:
            num //= 2
        else:
            num = num * 3 + 1

        answer += 1

    return answer if num == 1 else -1


def main():
    print(solution(4))  # 2
    print(solution(5))  # 5
    print(solution(10))  # 6


if __name__ == "__main__":
    main()

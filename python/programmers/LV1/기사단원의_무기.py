# 프로그래머스 136798 - 기사단원의 무기
# https://school.programmers.co.kr/learn/courses/30/lessons/136798


def divisors_count(n):
    count = 0
    for i in range(1, int(n ** 0.5) + 1):
        if n % i == 0:
            count += 1
            if i != n // i:
                count += 1

    return count

def solution(number, limit, power):
    answer = 0

    for i in range(1, number + 1):
        current_power = divisors_count(i)
        if current_power > limit:
            current_power = power

        answer += current_power

    return answer


def main():
    print(solution(8, 3, 1))


if __name__ == "__main__":
    main();
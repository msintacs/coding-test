# 프로그래머스 12910 - 나누어 떨어지는 숫자 배열
# https://school.programmers.co.kr/learn/courses/30/lessons/12910

def solution(arr, divisor):
    answer = [number for number in arr if number % divisor == 0]

    if not answer:
        return [-1]

    return sorted(answer)


def main():
    arr = [18, 7, 12, 5, 24]
    divisor = 6
    # 예상 결과: [12, 18, 24]

    result = solution(arr, divisor)
    print(result)

    arr = [7, 11, 13]
    divisor = 4
    # 예상 결과: [-1]

    result = solution(arr, divisor)
    print(result)


if __name__ == "__main__":
    main()

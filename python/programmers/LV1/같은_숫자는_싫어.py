# 프로그래머스 12906 - 같은 숫자는 싫어
# https://school.programmers.co.kr/learn/courses/30/lessons/12906

def solution(arr):
    answer = []

    for number in arr:
        if not answer or answer[-1] != number:
            answer.append(number)

    return answer


def main():
    arr = [2, 2, 5, 5, 5, 2, 0, 0, 7]
    # 예상 결과: [2, 5, 2, 0, 7]
    result = solution(arr)
    print(result)


if __name__ == "__main__":
    main()

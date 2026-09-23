# 프로그래머스 68644 - 두 개 뽑아서 더하기
# https://school.programmers.co.kr/learn/courses/30/lessons/68644

def solution(numbers):
    results = set()

    for i in range(len(numbers)):
        for j in range(i + 1, len(numbers)):
            results.add(numbers[i] + numbers[j])

    return sorted(results)


def main():
    print(solution([1, 4, 6]))     # [5, 7, 10]
    print(solution([3, 3, 3]))     # [6]
    print(solution([0, 2, 2, 5]))  # [2, 4, 5, 7]


if __name__ == "__main__":
    main()
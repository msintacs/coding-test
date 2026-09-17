# 프로그래머스 12935 - 제일 작은 수 제거하기
# https://school.programmers.co.kr/learn/courses/30/lessons/12935

def solution(arr):
    min_value = min(arr)
    arr.remove(min_value)

    if not arr:
        return [-1]

    return arr


def main():
    print(solution([8, 2, 6, 4]))  # [8, 6, 4]
    print(solution([3, 9, 5]))     # [9, 5]
    print(solution([7]))           # [-1]


if __name__ == "__main__":
    main()
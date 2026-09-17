# 프로그래머스 12950 - 행렬의 덧셈
# https://school.programmers.co.kr/learn/courses/30/lessons/12950

def solution(arr1, arr2):
    answer = []

    for row1, row2 in zip(arr1, arr2):
        row = [a + b for a, b in zip(row1, row2)]
        answer.append(row)

    return answer


def main():
    print(solution([[2, 5, 1], [4, 0, 3]], [[7, 1, 6], [2, 8, 4]]))
    # [[9, 6, 7], [6, 8, 7]]

    print(solution([[3, 7]], [[5, 2]]))
    # [[8, 9]]

    print(solution([[6]], [[4]]))
    # [[10]]


if __name__ == "__main__":
    main()
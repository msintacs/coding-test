# 프로그래머스 132267 - 콜라 문제
# https://school.programmers.co.kr/learn/courses/30/lessons/132267

def solution(a, b, n):

    total_received = 0
    empty_bottles = n

    while empty_bottles >= a:
        exchange_count = empty_bottles // a
        remaining_bottles = empty_bottles % a
        received_bottles = exchange_count * b

        total_received += received_bottles
        empty_bottles = remaining_bottles + received_bottles

    return total_received


def main():
    print(solution(3, 1, 10))  # 4
    print(solution(4, 2, 10))  # 8
    print(solution(5, 2, 5))   # 2


if __name__ == "__main__":
    main()
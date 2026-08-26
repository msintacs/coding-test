# 프로그래머스 120809 - 배열 두 배 만들기
# https://school.programmers.co.kr/learn/courses/30/lessons/120809

def solution(numbers):
    
    answer = [number * 2 for number in numbers]
    return answer


def main():
    numbers = [2, 4, 6, -8, 10]
    result = solution(numbers)
    print(result)


if __name__ == "__main__":
    main()
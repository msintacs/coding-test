# 프로그래머스 134240 - 푸드 파이트 대회
# https://school.programmers.co.kr/learn/courses/30/lessons/134240

def solution(food):
    answer = ""

    for i in range(1, len(food)):
        answer += str(i) * (food[i] // 2)

    return answer + "0" + answer[::-1]


def main():
    print(solution([1, 2, 5]))      # "1220221"
    print(solution([1, 1, 4, 3]))   # "2230322"
    print(solution([1, 2]))         # "101"


if __name__ == "__main__":
    main()

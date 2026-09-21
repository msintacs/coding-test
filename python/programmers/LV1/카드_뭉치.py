# 프로그래머스 159994 - 카드 뭉치
# https://school.programmers.co.kr/learn/courses/30/lessons/159994

def solution(cards1, cards2, goal):

    p1 = 0
    p2 = 0

    for target in goal:
        if p1 < len(cards1) and cards1[p1] == target:
            p1 += 1
        elif p2 < len(cards2) and cards2[p2] == target:
            p2 += 1
        else:
            return "No"

    return "Yes"


def main():

    print(solution(
        ["we", "code"],
        ["can", "today"],
        ["we", "can", "code", "today"]
    ))  # "Yes"

    print(solution(
        ["red", "blue"],
        ["green"],
        ["blue", "green"]
    ))  # "No"

    print(solution(
        ["open", "close"],
        ["door", "window"],
        ["open", "door"]
    ))  # "Yes"



if __name__ == "__main__":
    main()

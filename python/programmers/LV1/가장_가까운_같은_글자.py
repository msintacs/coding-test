# 프로그래머스 142086 - 가장 가까운 같은 글자
# https://school.programmers.co.kr/learn/courses/30/lessons/142086

def solution(s):
    answer = []
    alphabet = [-1] * 26

    for i in range(len(s)):
        idx = ord(s[i]) - ord("a")

        if alphabet[idx] == -1:
            answer.append(-1)
        else:
            answer.append(i - alphabet[idx])

        alphabet[idx] = i

    return answer


def main():
    print(solution("abacba"))  # [-1, -1, 2, -1, 3, 3]
    print(solution("zzzz"))    # [-1, 1, 1, 1]
    print(solution("desk"))    # [-1, -1, -1, -1]


if __name__ == "__main__":
    main()
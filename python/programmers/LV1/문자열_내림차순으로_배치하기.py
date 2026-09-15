# 프로그래머스 12917 - 문자열 내림차순으로 배치하기
# https://school.programmers.co.kr/learn/courses/30/lessons/12917

def solution(s):
    answer = ''.join(sorted(s, reverse=True))
    return answer


def main():
    print(solution("bAcZa"))  # "cbaZA"
    print(solution("banana"))  # "nnbaaa"
    print(solution("Q"))  # "Q"


if __name__ == "__main__":
    main()
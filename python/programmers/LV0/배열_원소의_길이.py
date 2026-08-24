# 프로그래머스 120854 - 배열 원소의 길이
# https://school.programmers.co.kr/learn/courses/30/lessons/120854

def solution(strlist):
    answer = []

    for text in strlist:
        answer.append(len(text))

    return answer


def main():
    strlist = ["Python", "Java", "Spring"]
    result = solution(strlist)
    print(result)


if __name__ == "__main__":
    main()
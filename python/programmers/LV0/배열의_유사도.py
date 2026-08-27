# 프로그래머스 120903 - 배열의 유사도
# https://school.programmers.co.kr/learn/courses/30/lessons/120903

def solution(s1, s2):

    # for i in s1:
    #     for j in s2:
    #         if i == j:
    #             answer += 1

    return len([word for word in s1 if word in s2])


def main():
    s1 = ["python", "java", "kotlin"]
    s2 = ["spring", "kotlin", "go", "python"]

    result = solution(s1, s2)
    print(result)


if __name__ == "__main__":
    main()
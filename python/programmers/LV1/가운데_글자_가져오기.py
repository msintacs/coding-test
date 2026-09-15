# 프로그래머스 12903 - 가운데 글자 가져오기
# https://school.programmers.co.kr/learn/courses/30/lessons/12903

def solution(s):
    mid = len(s) // 2

    if len(s) % 2 == 0:
        return s[mid - 1:mid + 1]

    return s[mid]


def main():
    s = "planet"
    # 예상 결과: "an"

    result = solution(s)
    print(result)

    s = "stone"
    # 예상 결과: "o"

    result = solution(s)
    print(result)

    s = "x"
    # 예상 결과: "x"

    result = solution(s)
    print(result)


if __name__ == "__main__":
    main()

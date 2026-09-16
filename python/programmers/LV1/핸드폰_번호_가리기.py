# 프로그래머스 12948 - 핸드폰 번호 가리기
# https://school.programmers.co.kr/learn/courses/30/lessons/12948

def solution(phone_number):
    answer = ''

    for i in range(len(phone_number)):
        if i < len(phone_number) - 4:
            answer += "*"
        else:
            answer += phone_number[i]

    return answer


def main():
    print(solution("12345678"))  # "****5678"
    print(solution("98765"))     # "*8765"
    print(solution("4321"))      # "4321"


if __name__ == "__main__":
    main()
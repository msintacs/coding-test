# 프로그래머스 176963 - 추억 점수
# https://school.programmers.co.kr/learn/courses/30/lessons/176963

def solution(name, yearning, photo):
    answer = []
    scores = dict(zip(name, yearning))

    for p in photo:
        score = 0
        for person in p:
            score += scores.get(person, 0)

        answer.append(score)

    return answer


def main():
    print(solution(
        ["hana", "juno", "mina"],
        [4, 7, 2],
        [
            ["juno", "hana"],
            ["luna", "noah"],
            ["mina", "luna", "hana"]
        ]
    ))  # [11, 0, 6]


if __name__ == "__main__":
    main()
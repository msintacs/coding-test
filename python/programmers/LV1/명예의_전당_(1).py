# 프로그래머스 138477 - 명예의 전당 (1)
# https://school.programmers.co.kr/learn/courses/30/lessons/138477

def solution(k, score):
    answer = []
    ranking = []

    for i in range(len(score)):
        ranking.append(score[i])
        ranking = sorted(ranking, reverse=True)

        if len(ranking) > k:
            ranking.pop()

        answer.append(ranking[-1])

    return answer


def main():
    print(solution(10, [10, 20, 30, 40, 50]))


if __name__ == "__main__":
    main()
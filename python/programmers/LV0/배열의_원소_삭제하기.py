# 프로그래머스 181844 - 배열의 원소 삭제하기
# https://school.programmers.co.kr/learn/courses/30/lessons/181844

def solution(arr, delete_list):
    answer=[number for number in arr if number not in delete_list]
    return answer


def main():
    arr = [1, 2, 3, 4, 5]
    delete_list = [2, 5, 9]

    result = solution(arr, delete_list)
    print(result)



if __name__ == "__main__":
    main()
package programmers.LV1;

// 프로그래머스 12906 - 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 같은_숫자는_싫어 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        int[] result1 = solution.solution(arr1);
        int[] result2 = solution.solution(arr2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    static class Solution {
        public int[] solution(int[] arr) {

            List<Integer> answer = new ArrayList<>();
            answer.add(arr[0]);

            for (int i=1; i<arr.length; i++) {
                int prev = arr[i - 1];

                if (prev != arr[i]) {
                    answer.add(arr[i]);
                }
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
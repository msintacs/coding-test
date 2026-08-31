package programmers.LV1;

// 프로그래머스 42840 - 모의고사
// https://school.programmers.co.kr/learn/courses/30/lessons/42840

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {2, 1, 2, 3, 2, 4};
        int[] arr2 = {5};

        int[] result1 = s.solution(arr1);
        int[] result2 = s.solution(arr2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    static class Solution {
        public int[] solution(int[] answers) {

            int[] supoOne = {1, 2, 3, 4, 5};
            int[] supoTwo = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] supoThree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            int[] count = new int[4];

            for (int i=0; i<answers.length; i++) {

                if (answers[i] == supoOne[i % supoOne.length])
                    count[1]++;

                if (answers[i] == supoTwo[i % supoTwo.length])
                    count[2]++;

                if (answers[i] == supoThree[i % supoThree.length])
                    count[3]++;
            }

            int max = -1;
            for (int i=1; i<count.length; i++) {
                if (count[i] > max) {
                    max = count[i];
                }
            }

            List<Integer> answer = new ArrayList<>();
            for (int i=1; i<count.length; i++) {
                if (count[i] == max)
                    answer.add(i);

            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}

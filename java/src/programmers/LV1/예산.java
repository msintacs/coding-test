package programmers.LV1;

// 프로그래머스 12982 - 예산
// https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.Arrays;

public class 예산 {

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] d = {8, 2, 6, 3, 5};
        int budget = 11;

        int result = s.solution(d, budget);
        System.out.println(result);
    }

    static class Solution {

        public int solution(int[] d, int budget) {

            int answer = 0;

            Arrays.sort(d);

            int currentBudget = budget;
            for (int amount : d) {

                if (amount > currentBudget) {
                    break;
                }

                currentBudget -= amount;
                answer++;
            }

            return answer;
        }
    }
}

package programmers.LV2;

// 프로그래머스 43165 - 타겟 넘버
// https://school.programmers.co.kr/learn/courses/30/lessons/43165

public class 타겟_넘버 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] numbers1 = {1, 1, 1, 1, 1};
        int target1 = 3;

        int[] numbers2 = {4, 1, 2, 1};
        int target2 = 4;

        int result1 = s.solution(numbers1, target1);
        int result2 = s.solution(numbers2, target2);

        System.out.println(result1);
        System.out.println(result2);
    }


    static class Solution {

        private int count;

        public int solution(int[] numbers, int target) {
            count = 0;
            dfs(numbers, target, 0, 0);
            return count;
        }

        void dfs(int[] numbers, int target, int index, int sum) {

            if (index == numbers.length) {
                if (sum == target) {
                    count++;
                }

                return;
            }

            dfs(numbers, target, index + 1, sum + numbers[index]);
            dfs(numbers, target, index + 1, sum - numbers[index]);
        }
    }
}

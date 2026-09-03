package programmers.LV1;

// 프로그래머스 1845 - 폰켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class 폰켓몬 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {7, 7, 8, 9, 9, 10, 10, 10};
        int result = s.solution(nums);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] nums) {

            int amount = nums.length / 2;
            Set<Integer> set = Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.toSet());

            return Math.min(amount, set.size());
        }
    }
}

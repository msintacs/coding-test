package programmers.LV2;

// 프로그래머스 42839 - 소수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/42839

import java.util.HashSet;
import java.util.Set;

public class 소수_찾기 {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("17"));
        System.out.println(s.solution("011"));
    }

    static class Solution {

        Set<Integer> made;
        boolean[] used;

        public int solution(String numbers) {

            made = new HashSet<>();
            used = new boolean[numbers.length()];

            dfs(numbers, "");

            int answer = 0;
            for (int num : made) {
                if (isPrime(num)) {
                    answer++;
                }
            }

            return answer;
        }

        private void dfs(String numbers, String cur) {

            if (!cur.equals("")) {
                made.add(Integer.parseInt(cur));
            }

            for (int i=0; i<numbers.length(); i++) {

                if (used[i]) {
                    continue;
                }

                used[i] = true;
                dfs(numbers, cur + numbers.charAt(i));
                used[i] = false;
            }
        }

        private boolean isPrime(int num) {

            if (num < 2) {
                return false;
            }

            for (int i=2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

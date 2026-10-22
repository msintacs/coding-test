package programmers.LV2;

// 프로그래머스 138476 - 귤 고르기
// https://school.programmers.co.kr/learn/courses/30/lessons/138476

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤_고르기 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] tangerine1 = {1, 1, 1, 1, 2};
        System.out.println(s.solution(4, tangerine1)); // 1

        int[] tangerine2 = {1, 2, 3, 1};
        System.out.println(s.solution(3, tangerine2)); // 2

        int[] tangerine3 = {1, 2, 3, 4, 5};
        System.out.println(s.solution(5, tangerine3)); // 5
    }

    static class Solution {
        public int solution(int k, int[] tangerine) {

            int answer = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for (int n : tangerine) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            List<Integer> list = map.values().stream()
                    .sorted(Comparator.reverseOrder())
                    .toList();

            int sum = 0;
            for (int i=0; i<list.size(); i++) {
                sum += list.get(i);

                if (sum >= k)
                    return i + 1;
            }

            return answer;
        }
    }
}

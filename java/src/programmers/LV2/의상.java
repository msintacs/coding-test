package programmers.LV2;

// 프로그래머스 42578 - 의상
// https://school.programmers.co.kr/learn/courses/30/lessons/42578

import java.util.HashMap;
import java.util.Map;

public class 의상 {

    public static void main(String[] args) {

        Solution s = new Solution();

        String[][] clothes = {
                {"lienen_shirt", "top"},
                {"hoodie", "top"},
                {"jeans", "bottom"},
                {"shorts", "bottom"}
        };

        int result = s.solution(clothes);
        System.out.println(result);
    }

    static class Solution {

        public int solution(String[][] clothes) {

            int answer = 1;
            Map<String, Integer> map = new HashMap<>();

            for (int i=0; i<clothes.length; i++) {
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
            }

            for (int count : map.values()) {
                answer *= count + 1;
            }

            return answer - 1;
        }
    }
}

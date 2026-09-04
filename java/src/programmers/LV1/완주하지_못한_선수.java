package programmers.LV1;

// 프로그래머스 42576 - 완주하지 못한 선수
// https://school.programmers.co.kr/learn/courses/30/lessons/42576

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {

    public static void main(String[] args) {
        Solution s = new Solution();

        String[] participant = {"minsu", "jisu", "minsu", "yuna"};
        String[] completion  = {"minsu", "yuna", "jisu"};

        String result = s.solution(participant, completion);
        System.out.println(result);
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {

            Map<String, Integer> counts = new HashMap<>();

            for (String name : participant) {
                counts.put(name, counts.getOrDefault(name, 0) + 1);
            }

            for (String name : completion) {
                counts.put(name, counts.get(name) - 1);
            }

            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                if (entry.getValue() > 0) {
                    return entry.getKey();
                }
            }

            return "";
        }
    }
}

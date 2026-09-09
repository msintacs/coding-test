package programmers.LV1;

// 프로그래머스 12915 - 문자열 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] strings = {"rose", "mint", "rain", "lime"};
        int n = 1;

        String[] result = s.solution(strings.clone(), n);
        String[] alternativeResult = s.alternativeSolution(strings.clone(), n);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(alternativeResult));
    }

    static class Solution {

        public String[] solution(String[] strings, int n) {

            for (int i=strings.length - 1; i>0; i--) {

                for (int j=0; j<i; j++) {

                    char current = strings[j].charAt(n);
                    char next = strings[j+1].charAt(n);

                    if (current - next > 0) {
                        String tmp = strings[j+1];
                        strings[j+1] = strings[j];
                        strings[j] = tmp;
                    } else if (current - next == 0) {
                        if (strings[j].compareTo(strings[j+1]) > 0) {
                            String tmp = strings[j+1];
                            strings[j+1] = strings[j];
                            strings[j] = tmp;
                        }
                    }
                }
            }

            return strings;
        }

        public String[] alternativeSolution(String[] strings, int n) {

            Arrays.sort(strings, (a, b) -> {

                int comparison = Character.compare(a.charAt(n), b.charAt(n));

                if (comparison != 0) {
                    return comparison;
                }

                return a.compareTo(b);
            });

            return strings;
        }
    }

}

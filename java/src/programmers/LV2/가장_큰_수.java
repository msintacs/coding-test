package programmers.LV2;

// 프로그래머스 42746 - 가장 큰 수
// https://school.programmers.co.kr/learn/courses/30/lessons/42746

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] numbers1 = {6, 10, 2};
        System.out.println(s.solution(numbers1));

        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println(s.solution(numbers2));
    }

    static class Solution {
        public String solution(int[] numbers) {

            String[] intToStr = Arrays.stream(numbers)
                    .mapToObj(String::valueOf)
                    .toArray(String[]::new);

            Arrays.sort(intToStr, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {

                    int aFirst = Integer.parseInt(a + b);
                    int bFirst = Integer.parseInt(b + a);

                    if (aFirst > bFirst)
                        return -1;
                    else if (aFirst == bFirst)
                        return 0;
                    else
                        return 1;
                }
            });

            if (intToStr[0].equals("0"))
                return "0";

            StringBuilder sb = new StringBuilder();
            for (String s : intToStr)
                sb.append(s);

            return sb.toString();
        }
    }
}

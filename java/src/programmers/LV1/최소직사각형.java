package programmers.LV1;

// 프로그래머스 86491 - 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491

public class 최소직사각형 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] sizes = {
                {9, 4},
                {3, 12},
                {6, 8},
                {5, 7}
        };

        int result = s.solution(sizes);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[][] sizes) {

            int widthMax = 0;
            int lengthMax = 0;

            for (int i=0; i<sizes.length; i++) {

                int longer = Math.max(sizes[i][0], sizes[i][1]);
                int shorter = Math.min(sizes[i][0], sizes[i][1]);

                widthMax = Math.max(widthMax, longer);
                lengthMax = Math.max(lengthMax, shorter);
            }

            return widthMax * lengthMax;
        }
    }
}

package programmers.LV1;

// 프로그래머스 42748 - K번째수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[] array = {8, 3, 9, 1, 6};
        int[][] commands = {{2, 5, 2}, {3, 3, 1}, {1, 5, 4}};

        int[] result = s.solution(array, commands);

        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {

            int[] answer = new int[commands.length];

            for (int nLoop = 0; nLoop < commands.length; nLoop++) {

                int i = commands[nLoop][0] - 1;
                int j = commands[nLoop][1];
                int k = commands[nLoop][2] - 1;

                int[] part = Arrays.copyOfRange(array, i, j);
                Arrays.sort(part);
                answer[nLoop] = part[k];
            }

            return answer;
        }
    }
}

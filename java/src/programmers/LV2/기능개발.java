package programmers.LV2;

// 프로그래머스 42586 - 기능개발
// https://school.programmers.co.kr/learn/courses/30/lessons/42586

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 기능개발 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] progresses = {80, 95, 70, 60};
        int[] speeds = {10, 5, 10, 10};

        int[] result = s.solution(progresses.clone(), speeds);
        int[] result2 = s.solution2(progresses.clone(), speeds);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {

            int idx = 0;
            List<Integer> answer = new ArrayList<>();


            while (idx < progresses.length) {

                for (int i=idx; i<progresses.length; i++) {
                    progresses[i] += speeds[i];
                }

                int doneCount = 0;
                while (idx < progresses.length && progresses[idx] >= 100) {
                    doneCount++;
                    idx++;
                }

                if (doneCount > 0)
                    answer.add(doneCount);
            }


            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        public int[] solution2(int[] progresses, int[] speeds) {

            List<Integer> answer = new ArrayList<>();
            int released = (int) Math.ceil((100 - progresses[0]) / (double) speeds[0]);
            int doneCount = 1;

            for (int i=1; i<progresses.length; i++) {

                int days = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);

                if (days <= released) {
                    doneCount++;
                } else {
                    answer.add(doneCount);
                    released = days;
                    doneCount = 1;
                }
            }

            answer.add(doneCount);

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}

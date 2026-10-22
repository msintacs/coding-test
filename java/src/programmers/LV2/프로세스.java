package programmers.LV2;

// 프로그래머스 42587 - 프로세스
// https://school.programmers.co.kr/learn/courses/30/lessons/42587

import java.util.Deque;
import java.util.ArrayDeque;

public class 프로세스 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] priorities1 = {2, 1, 1, 2, 1};
        System.out.println(s.solution(priorities1, 4)); // 3

        int[] priorities2 = {1, 2, 5, 3, 4, 2};
        System.out.println(s.solution(priorities2, 5)); // 4

        int[] priorities3 = {1, 1, 1};
        System.out.println(s.solution(priorities3, 2)); // 3

        int[] priorities4 = {9};
        System.out.println(s.solution(priorities4, 0)); // 1
    }

    static class Solution {
        public int solution(int[] priorities, int location) {

            int answer = 0;

            Deque<int[]> queue = new ArrayDeque<>();
            int[] count = new int[10];

            for (int i=0; i<priorities.length; i++) {
                queue.offer(new int[] {i, priorities[i]});
                count[priorities[i]]++;
            }

            int priority = 9;
            while (!queue.isEmpty()) {

                if (count[priority] == 0) {
                    priority--;
                    continue;
                }

                int[] cur = queue.poll();
                if (cur[1] == priority) {

                    answer++;
                    if (cur[0] == location)
                        return answer;

                    count[priority]--;
                } else {
                    queue.offer(cur);
                }
            }

            return answer;
        }
    }
}
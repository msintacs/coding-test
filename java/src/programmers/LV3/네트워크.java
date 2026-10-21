package programmers.LV3;

// 프로그래머스 43162 - 네트워크
// https://school.programmers.co.kr/learn/courses/30/lessons/43162

import java.util.ArrayDeque;
import java.util.Deque;

public class 네트워크 {

    public static void main(String[] args) {
        Solution s = new Solution();

        // 0-1-2 연결, 3 혼자 → 2  (아까 손 추적한 그 예시)
        System.out.println(s.solution(4, new int[][] {
                {1, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 1}
        }));

        // 0-2, 1-2 연결 → 0과 1은 직접 선이 없지만 2를 거쳐 이어짐 → 1
        System.out.println(s.solution(3, new int[][] {
                {1, 0, 1},
                {0, 1, 1},
                {1, 1, 1}
        }));

        // 아무도 연결 안 됨 → 3
        System.out.println(s.solution(3, new int[][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        }));

        // 컴퓨터 1대 → 1
        System.out.println(s.solution(1, new int[][] {
                {1}
        }));
    }

    static class Solution {

        private boolean[] visited;

        public int solution(int n, int[][] computers) {

            int answer = 0;

            visited = new boolean[n];

            for (int i=0; i<computers.length; i++) {

                if (visited[i]) continue;
                bfs(computers, i);
                answer++;
            }

            return answer;
        }

        private void bfs(int[][] computers, int cur) {

            Deque<Integer> queue = new ArrayDeque<>();
            queue.offer(cur);

            visited[cur] = true;

            while (!queue.isEmpty()) {

                int curPos = queue.poll();

                for (int i=0; i<computers[curPos].length; i++) {

                    if (computers[curPos][i] == 0) continue;
                    if (visited[i]) continue;

                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

}

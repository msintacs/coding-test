package programmers.LV2;

// 프로그래머스 1844 - 게임 맵 최단거리
// https://school.programmers.co.kr/learn/courses/30/lessons/1844

import java.util.ArrayDeque;
import java.util.Deque;

public class 게임_맵_최단거리 {

    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] maps1 = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };
        System.out.println(s.solution(maps1)); // 11

        int[][] maps2 = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };
        System.out.println(s.solution(maps2)); // -1 (도착 칸이 막힘)
    }

    static class Solution {

        private static final int[] DR = {-1, 1, 0, 0};
        private static final int[] DC = {0, 0, -1, 1};

        public int solution(int[][] maps) {

            int n = maps.length;
            int m = maps[0].length;
            boolean[][] visited = new boolean[n][m];

            Deque<int[]> queue = new ArrayDeque<>();
            queue.offer(new int[] {0, 0, 1}); // {행, 열, 지나온 칸 수}
            visited[0][0] = true;

            while (!queue.isEmpty()) {

                int[] cur = queue.poll();
                int r = cur[0];
                int c = cur[1];
                int dist = cur[2];

                if (r == n - 1 && c == m - 1) {
                    return dist;
                }

                for (int d=0; d<4; d++) {
                    int nr = r + DR[d];
                    int nc = c + DC[d];

                    if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                    if (maps[nr][nc] == 0) continue;
                    if (visited[nr][nc]) continue;

                    visited[nr][nc] = true;
                    queue.offer(new int[] {nr, nc, dist + 1});
                }
            }

            return -1;
        }
    }
}

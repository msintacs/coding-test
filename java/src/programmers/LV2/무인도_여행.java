package programmers.LV2;

// 프로그래머스 154540 - 무인도 여행
// https://school.programmers.co.kr/learn/courses/30/lessons/154540

import java.util.*;

public class 무인도_여행 {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] maps1 = {"X591X", "X1X5X", "X231X", "1XXX1"};
        System.out.println(Arrays.toString(s.solution(maps1)));     // [1, 1, 27]

        String[] maps2 = {"XXX", "XXX", "XXX"};
        System.out.println(Arrays.toString(s.solution(maps2)));     // [-1]
    }

    static class Solution {

        // 상 하 좌 우
        private static final int[] DR = {-1, 1, 0, 0};
        private static final int[] DC = {0, 0, -1, 1};

        private char[][] grid;
        private boolean[][] visited;
        private int n, m;

        public int[] solution(String[] maps) {
            n = maps.length;
            m = maps[0].length();
            grid = new char[n][];
            for (int r=0; r<n; r++) {
                grid[r] = maps[r].toCharArray();
            }
            visited = new boolean[n][m];

            List<Integer> sums = new ArrayList<>();

            for (int r=0; r<n; r++) {
                for (int c=0; c<m; c++) {
                    if (grid[r][c] == 'X') continue;;
                    if (visited[r][c]) continue;

                    sums.add(bfs(r, c));
                }
            }

            if (sums.isEmpty()) return new int[] {-1};

            Collections.sort(sums);
            return sums.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        private int bfs(int sr, int sc) {
            Deque<int[]> queue = new ArrayDeque<>();
            queue.offer(new int[] {sr, sc});
            visited[sr][sc] = true;
            int sum = grid[sr][sc] - '0';

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int r = cur[0];
                int c = cur[1];

                for (int d=0; d<4; d++) {
                    int nr = r + DR[d];
                    int nc = c + DC[d];

                    if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                    if (grid[nr][nc] == 'X') continue;
                    if (visited[nr][nc]) continue;

                    visited[nr][nc] = true;
                    sum += grid[nr][nc] - '0';
                    queue.offer(new int[] {nr, nc});
                }
            }

            return sum;
        }
    }
}

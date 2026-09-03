package programmers.LV2;

// 프로그래머스 87946 - 피로도
// https://school.programmers.co.kr/learn/courses/30/lessons/87946

public class 피로도 {
    public static void main(String[] args) {

        Solution s = new Solution();

        int k = 60;
        int[][] dungeons = {
                {60, 40},
                {50, 10},
                {40, 20}
        };

        int result = s.solution(k, dungeons);
        System.out.println(result);
    }

    static class Solution {

        private int maxCount;

        public int solution(int k, int[][] dungeons) {

            boolean[] visited = new boolean[dungeons.length];

            maxCount = 0;

            dfs(k, dungeons, visited, 0);

            return maxCount;
        }

        void dfs(int k, int[][] dungeons, boolean[] visited, int visitedCount) {

            maxCount = Math.max(maxCount, visitedCount);

            for (int i=0; i<dungeons.length; i++) {

                if (!visited[i] && k >= dungeons[i][0]) {

                    visited[i] = true;
                    dfs(k - dungeons[i][1], dungeons, visited, visitedCount + 1);
                    visited[i] = false;
                }
            }
        }
    }
}

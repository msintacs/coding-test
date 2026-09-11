package programmers.LV1;

// 프로그래머스 42889 - 실패율
// https://school.programmers.co.kr/learn/courses/30/lessons/42889

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {

        Solution s = new Solution();

        int N = 4;
        int[] stages = {1, 2, 2, 3, 4, 5};
        // 예상 결과: [4, 2, 3, 1]

        int[] result = s.solution(N, stages);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {

        class Rate {

            private Integer idx;
            private double rate;

            public Rate(Integer idx, double rate) {
                this.idx = idx;
                this.rate = rate;
            }

            public Integer getIdx() {
                return idx;
            }

            public double getRate() {
                return rate;
            }
        }

        public int[] solution(int N, int[] stages) {

            Map<Integer, Integer> map = new HashMap<>();

            int totalUser = stages.length;

            for (int i=0; i<stages.length; i++) {
                map.put(stages[i], map.getOrDefault(stages[i], 0) + 1);
            }

            List<Rate> rateList = new ArrayList<>();
            for (int i=1; i<=N; i++) {

                double rate = 0;
                Integer failUser = map.get(i);

                if (failUser != null) {
                    rate = failUser / (double) totalUser;
                    totalUser -= failUser;
                }

                rateList.add(new Rate(i, rate));
            }

            rateList.sort(new Comparator<Rate>() {
                @Override
                public int compare(Rate o1, Rate o2) {

                    if (o1.getRate() == o2.getRate()) {
                        return o1.idx - o2.idx;
                    }

                    return Double.compare(o2.getRate(), o1.getRate());
                }
            });

            List<Integer> answer = new ArrayList<>();
            for (int i=0; i<rateList.size(); i++) {
                answer.add(rateList.get(i).getIdx());
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}

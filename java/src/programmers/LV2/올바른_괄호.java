package programmers.LV2;

// 프로그래머스 12909 - 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909

public class 올바른_괄호 {
    public static void main(String[] args) {
        Solution s = new Solution();

        String s1 = "(()())()";
        String s2 = "())(()";
        String s3 = "((())";

        System.out.println(s.solution(s1));
        System.out.println(s.solution(s2));
        System.out.println(s.solution(s3));
    }

    static class Solution {
        public boolean solution(String s) {

            int openCount = 0;

            for (int i=0; i<s.length(); i++) {

                char c = s.charAt(i);

                if (c == '(') {
                    openCount++;
                } else {
                    if (openCount == 0) {
                        return false;
                    }

                    openCount--;
                }
            }

            return openCount == 0;
        }
    }
}

package org.example.LV0_1;

public class exercise01 {

    class Solution1 {
        public int solution(int num1, int num2) {
            int answer = 0;
            answer = num1 - num2;
            return answer;
        }
    }

    class Solution2 {
        public int solution(int num1, int num2) {
            int answer = num1*num2;
            return answer;
        }
    }
    class Solution3 {
        public int solution(int num1, int num2) {
            int answer = num1/num2;

            return answer;
        }
    }

    class Solution4 {
        public int solution(int age) {
            int answer = 0;
            answer = 2022 - age + 1;
            return answer;
        }
    }
    class Solution5 {
        public int solution(int num1, int num2) {
            int answer = 0;
            if (num1 == num2) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

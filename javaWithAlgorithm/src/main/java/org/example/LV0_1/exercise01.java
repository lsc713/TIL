package org.example.LV0_1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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

    static class Solution6 {
        public int solution(int num1, int num2) {
            int answer = num1/num2*1000;

            return answer;
        }
    }

    static class Solution7 {
        public int solution(int angle) {
            return angle == 180? 4 : angle< 90? 1 : angle == 90 ?  2: angle > 90 ? 3 : 0;}
    }

    static class Solution8 {
        public int solution(int n) {
            return IntStream.rangeClosed(0, n).filter(e -> e % 2 == 0).sum();
        }
    }

    static class Solution9 {
        public String solution(int num) {
            String answer = "";

            answer = num % 2 == 0 ? "Even" : "Odd";

            return answer;
        }
    }

    static class Solution10 {
        public double solution(int[] numbers) {
            return Arrays.stream(numbers).average().orElse(0);
        }
    }

    static class Solution11 {
        public double solution(int[] arr) {
            double answer = 0;

            answer = Arrays.stream(arr).average().orElse(0);

            return answer;
        }
    }


    static class Solution12 {
        public int solution(int n) {
            int answer = 0;
            String s = String.valueOf(n);
            String[] arr = s.split("");
            for (String a : arr) {
                answer += Integer.parseInt(a);
            }
            return answer;


        }
    }

    static class Solution13 {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if ((i * i) == n) {
                        answer += i;

                    } else {
                        answer+=i;
                        answer += n / i;
                    }
                }
            }
            return answer;
        }
    }

    static class Solution14 {
        public int solution(int n) {

            return IntStream.range(2, n).filter(e -> n % e == 1).findFirst().orElse(0);
        }
    }

    static class Solution15 {
        public long[] solution(int x, int n) {
//            long[] answer = new long[n];
//            long num = x;
//            for (int i = 0; i < n; i++) {
//                answer[i] =num;
//                num+=x;
//            }
//
//            return answer;
//            return LongStream.iterate(x, i -> i + x).limit(n).toArray();
            long[] answer = new long[n];
            answer[0] = x;
            for (int i = 1; i < n; i++) {
                answer[i] = answer[i-1] + x;
            }
            return answer;
        }
    }

    static class Solution165 {
        public int[] solution15(long n) {
//            String s = String.valueOf(n);
//            int[] answer = new int[s.length()];
//
//            for(int i = 0; i< answer.length;i++) {
//                answer[i] = Integer.parseInt(s.substring(answer.length - i - 1, answer.length - i));
//            }
            return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
        }
    }

    static class Solution16 {
        public int solution(String str) {
            boolean b = true;
            int value = 0;
            for(char ch : str.toCharArray()){
                if(ch=='-'){
                    b= false;
                } else{
                    int num = ch -48;
                    value = num+value*10;
                }
            }
            return b==true?value:-1*value;
        }

    }

    static class Solution {
        public long solution(long n) {
            long answer = 0;
            if (Math.pow(Math.sqrt(n), 2) == n) {
                return (long) Math.pow(Math.sqrt(n)+1, 2);
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1, 2};
//        System.out.println(Arrays.toString(s.solution(123)));
        System.out.println(s.solution(121));

    }
}

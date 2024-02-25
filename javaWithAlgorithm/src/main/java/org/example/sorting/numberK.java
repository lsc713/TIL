package org.example.sorting;

import java.util.Arrays;

public class numberK {
 static class Solution{
     public static int[] solution(int[] array, int[][] commands) {
         int[] answer = new int[commands.length];
         for (int i = 0; i < answer.length; i++) {
             int[] command = commands[i];
             int from = command[0]-1;
             int to = command[1];
             int k = command[2]-1;
             int[] sub = Arrays.copyOfRange(array, from, to);
             Arrays.sort(sub);
             answer[i] = sub[k];
         }
         return answer;
     }

     public static void main(String[] args) {
         int[] array = {1, 5, 2, 6, 3, 7, 4};
         int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
         int[] result = Solution.solution(array, commands);
         System.out.println("Result: " + Arrays.toString(result));
     }
 }
}

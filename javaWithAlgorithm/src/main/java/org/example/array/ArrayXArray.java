package org.example.array;

import java.util.Arrays;

public class ArrayXArray {
    public static class Solution{
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] arr = new int[arr1.length][arr2[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = 0;
                    for (int k = 0; k < arr1[i].length; k++) {
                        arr[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
            int[][] arr2 = {{3,3}, {3, 3}};
            int[][] result = s.solution(arr1, arr2); // Solution의 solution 메서드 호출
            for (int[] row : result) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
        }
    }
}}

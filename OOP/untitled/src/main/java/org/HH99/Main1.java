package org.HH99;

public class Main1 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] >= 29) {
                arr2[i] = 21;
            }
            arr[i] = arr2[i] - arr1[i];
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main1 method = new Main1();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }
}

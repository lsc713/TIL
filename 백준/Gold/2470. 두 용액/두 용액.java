import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int l =0;
        int r = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int[] res = new int[2];
        while (l < r) {
            int temp = arr[l] + arr[r];
            if (ans > Math.abs(temp)) {
                ans = Math.abs(temp);
                res[0] = arr[l];
                res[1] = arr[r];
                if (ans == 0) {
                    break;
                }
            }
            if (temp > 0) {
                r--;
            } else {
                l++;
            }
        }
        System.out.println(res[0]+" "+res[1]);
    }
}
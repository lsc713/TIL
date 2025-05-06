import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] count = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
            count[arr[i]+4000]++;
        }

        System.out.println(Math.round((double)sum/arr.length));
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
        int maxCount = 0;
        int mode = 0;
        boolean isSecond = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                if (count[i] > maxCount) {
                    maxCount = count[i];
                    mode = i-4000;
                    isSecond = false;
                } else if (count[i] == maxCount && !isSecond) {
                    mode = i-4000;
                    isSecond = true;
                }
            }
        }
        System.out.println(mode);
        System.out.println(max-min);
    }
}

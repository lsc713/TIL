import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main{

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr1[i] = arr[i];
        }
        int[] arr2 = Arrays.stream(arr1).distinct().toArray();
        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];

            sb.append(Arrays.binarySearch(arr2, tmp)).append(" ");
        }

        System.out.println(sb);
    }
}
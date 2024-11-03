import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < m; i++) {
            int idx = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            for (int a = idx; a <= j; a++) {
                arr[a]=k;
            }
        }
        for (int i =1;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
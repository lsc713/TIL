import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            set.add(A[i]);
        }
        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
            if(set.contains(B[i])){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        // Please write your code here.
    }
}
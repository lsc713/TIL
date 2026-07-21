import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int[] A = new int[a];
        int[] B = new int[b];
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < a; i++){
            A[i] = sc.nextInt();
            set.add(A[i]);
        }
        for(int i = 0 ; i < b; i++){
            B[i] = sc.nextInt();
            if(set.contains(B[i])){
                set.remove(B[i]);
            }else{
                set.add(B[i]);
            }
        }
        System.out.println(set.size());

    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0 ; i < m ; i ++){
            arr2[i] = sc.nextInt();
            if(set.contains(arr2[i])){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }
        

        // Please write your code here.
    }
}
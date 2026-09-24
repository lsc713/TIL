import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = sc.nextInt();
        int[] missingNumbers = new int[b];
        boolean[] arr = new boolean[n+1];
        for (int i = 0; i < b; i++) {
            missingNumbers[i] = sc.nextInt();
        }
        for(int i = 1;i<=n;i++){
            arr[i]=true;
        }
        for(int i = 0 ; i < b ; i++){
            arr[missingNumbers[i]]=false;
        }
        int[] arr2 = new int[n+1];
        for(int i=1;i<=n;i++){
            arr2[i]=arr2[i-1];
            if(arr[i]){
                arr2[i]++;
            }
        }
        int ans =k;
        for(int start =1;start<=n-k+1;start++){
            int end = start+k-1;
            int count = arr2[end]-arr2[start-1];
            int missing = k-count;  
            ans =Math.min(ans,missing);
        }
        System.out.println(ans);
        
        // Please write your code here.
    }
}
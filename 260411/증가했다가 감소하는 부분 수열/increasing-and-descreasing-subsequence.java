import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans =0;
        int[] inc = new int[n];
        int[] des = new int[n];
        for(int i = 0 ; i <n;i++){
            inc[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    inc[i]=Math.max(inc[i],inc[j]+1);
                }
            }
        }
        for(int i = n-1 ; i >=0;i--){
            des[i]=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    des[i]=Math.max(des[i],des[j]+1);
                }
            }
        }
        for(int i = 0 ; i < n ; i ++){
            ans = Math.max(ans,inc[i]+des[i]-1);
        }
            
        System.out.println(ans);
        // Please write your code here.
    }
}
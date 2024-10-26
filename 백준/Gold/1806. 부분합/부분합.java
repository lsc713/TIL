import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int l=0,r=0,sum=0,cnt=Integer.MAX_VALUE;
        while(l<=n&&r<=n){
            if(sum>=s){
                cnt=Math.min(cnt,r-l);
                sum-=arr[l++];
            }else{
                sum+=arr[r++];
            }
        }
        System.out.println(cnt==Integer.MAX_VALUE?0:cnt);
    }
}
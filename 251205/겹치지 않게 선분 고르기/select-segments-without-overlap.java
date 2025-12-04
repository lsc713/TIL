import java.util.Scanner;

public class Main {
    static int max,n;
    static int[][] segments;
    static boolean[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        max=0;
        arr= new boolean[1001];
        segments = new int[n][2];
        for (int i = 0; i < n; i++) {
            segments[i][0] = sc.nextInt()-1;
            segments[i][1] = sc.nextInt()-1;
        }
        recur(0,0);
        System.out.println(max);
        // Please write your code here.
    }
    static void recur(int idx,int cnt){
        if(idx==n){
            max=Math.max(max,cnt);
            return;
        }
        recur(idx+1,cnt);
        boolean ok =true;
        for(int i=segments[idx][0];i<=segments[idx][1];i++){
            if(arr[i])ok=false;break;
        }
        if(ok){
            for(int i=segments[idx][0];i<=segments[idx][1];i++){
                arr[i]=true;
            }
            recur(idx+1,cnt+1);
            for(int i=segments[idx][0];i<=segments[idx][1];i++){
                arr[i]=false;
            }
        }
        
    }
}
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i =1;i<=n;i++){
            arr[i]=arr[i-1]+sc.nextInt();
        }
        
        for(int i =0;i<m;i++){
            int answer=0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            answer+=arr[b]-arr[a-1];
            System.out.println(answer);
        }
    }
}
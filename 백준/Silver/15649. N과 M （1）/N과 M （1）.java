import java.util.*;
class Main{
    static boolean[] visited;
    static int[] arr;
    static int n;
    static int m;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        m =sc.nextInt();
        arr= new int[m];
        visited = new boolean[n];
        recur(0);
    }
    static void recur(int depth){
        if(depth ==m){
            for(int val : arr){
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 0 ; i<n;i++){
            if(!visited[i]){
                visited[i]=true;
                arr[depth]=i+1;
                recur(depth+1);
                visited[i]=false;
            }
            
        }
    }
}
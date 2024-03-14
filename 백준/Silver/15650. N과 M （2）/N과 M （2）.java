import java.io.*;
import java.util.*;

public class Main{
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        arr = new int[m];
        visit = new boolean[n];
        bfs(n,m,0,1);
        
    }
    
    public static void bfs(int n, int m , int depth, int start){
        if(depth==m){
            for(int val : arr){
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }
        for(int i = start; i<= n ; i++){
        if(!visit[i-1]){
            visit[i-1]=true;
            arr[depth]=i;
            bfs(n,m,depth+1,i+1);
            visit[i-1]=false;
        }
                        
        }
    }
}
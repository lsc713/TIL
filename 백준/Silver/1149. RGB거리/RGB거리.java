import java.io.*;
import java.util.*;

public class Main{
    final static int red = 0;
    final static int green =1;
    final static int blue = 2;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n][3];
        for(int i =0;i<n;i++){
            st= new StringTokenizer(br.readLine()," ");
            cost[i][red]=Integer.parseInt(st.nextToken());
            cost[i][green]=Integer.parseInt(st.nextToken());
            cost[i][blue]=Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i< n ; i++){
            cost[i][red]+=Math.min(cost[i-1][green],cost[i-1][blue]);
            cost[i][green]+=Math.min(cost[i-1][red],cost[i-1][blue]);
            cost[i][blue]+=Math.min(cost[i-1][red],cost[i-1][green]);
        }
        System.out.println(Math.min(Math.min(cost[n-1][red],cost[n-1][green]),cost[n-1][blue]));
    }
}
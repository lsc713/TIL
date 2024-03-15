import java.io.*;
import java.util.*;

public class Main{
    static int[] arr;
    static int[] nums;
    static boolean[] visit;
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        nums = new int[n];
        visit = new boolean[n];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < n ; i ++){
            nums[i] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        dfs(0);
        System.out.println(sb);
    }
    
    static void dfs(int depth){
        if(depth==m){
            for(int val:arr){
                sb.append(val+" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i = 0; i< n; i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=nums[i];
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }
}
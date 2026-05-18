import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[4][n];

        for(int i = 0 ; i < 4 ; i++){
            st =new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n;j++){
                int sum = arr[0][i]+arr[1][j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int ans =0;
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n;j++){
                int sum = -(arr[2][i]+arr[3][j]);
                ans += map.getOrDefault(sum,0);
                
            }
        }
        

        System.out.println(ans);
    }
}
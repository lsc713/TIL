
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            int bit = (1<<10)-1;
            int result = n;
            int temp = 0;
            while(bit != temp){
                char[] arr = String.valueOf(result).toCharArray();
                for(int i = 0 ; i < arr.length ; i++){
                    temp = temp | (1 << (arr[i] - '0'));
                }
                result += n;
            }
            sb.append("#"+t+ " "+(result-n)).append("\n");
        }
        System.out.println(sb);
    }
}
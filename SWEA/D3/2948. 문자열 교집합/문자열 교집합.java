
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1 ; t <= T ; t++){
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            Set one = new HashSet();
            for (int i = 0; i < n; i++){
                one.add(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++){
                if (one.contains(st.nextToken())){
                    result++;
                }
            }
            System.out.println("#"+t+" "+result);
        }
    }
}

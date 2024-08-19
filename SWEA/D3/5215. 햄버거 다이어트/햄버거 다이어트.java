import java.util.*;
import java.io.FileInputStream;


class Solution
{
    static int n;
    static int limit;
    static int[] score;
    static int[] cal;
    static int answer;
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            answer =0;
            StringBuilder sb = new StringBuilder();
            
			n = sc.nextInt();
            limit = sc.nextInt();
            score = new int[n];
            cal = new int[n];
            for(int i = 0 ; i < n ; i ++){
                score[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }
            recur(0,0,0);

            sb.append("#"+test_case+" "+answer);
            System.out.println(sb);

        }
    }
    
    static void recur(int depth, int scoreSum, int calSum){
    	if(calSum>limit){
        	return;
        }
        if(depth == n){
        	if(calSum <= limit){
            	answer= Math.max(answer,scoreSum);
            }return;
        }
        recur(depth+1,scoreSum,calSum);
        recur(depth+1,scoreSum+score[depth],calSum+cal[depth]);
    }
}
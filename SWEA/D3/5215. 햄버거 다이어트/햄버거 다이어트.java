
import java.util.*;
import java.io.*;

class Solution
{
static int n ;
static int limit;
static int[] score;
static int[] cal;
static int answer;
	public static void main(String args[]) throws Exception
	{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(br.readLine());
        StringTokenizer st;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		limit = Integer.parseInt(st.nextToken());
		score = new int[n];
		cal = new int[n];
		for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
			score[i]=Integer.parseInt(st.nextToken());
			cal[i]=Integer.parseInt(st.nextToken());
		}
            answer=0;
		recur(0,0,0);
		StringBuilder sb = new StringBuilder();
		sb.append("#"+test_case+" "+answer);
		System.out.println(sb);

		}
	}
	static void recur(int depth,int scoreSum, int calSum){
	if(calSum > limit){
		return;
	}
	if(depth==n){
		if(calSum <= limit){
			answer = Math.max(answer,scoreSum);
		}
		return;
	}
		recur(depth+1,scoreSum,calSum);
		recur(depth+1,scoreSum+score[depth],calSum+cal[depth]);
	}
}
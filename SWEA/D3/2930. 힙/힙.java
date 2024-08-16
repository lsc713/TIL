import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;                                             
                                               
		//Scanner sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringBuilder sb = new StringBuilder();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int n = Integer.parseInt(br.readLine());
            sb.append("#"+test_case+" ");
            for(int i = 0; i<n;i++){
            	String input = br.readLine();
                st = new StringTokenizer(input);
                int operator = Integer.parseInt(st.nextToken());
                if(st.hasMoreTokens()){
                	pq.offer(Integer.parseInt(st.nextToken()));
                }else{
                	if(pq.isEmpty()){
                    	sb.append(-1+" ");
                    }else{
                    	sb.append(pq.poll()+" ");
                    }
                }
            }
			System.out.println(sb);
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
	static int n,answer,max,min;
	static int[] operators;
	static int[] arr;
	static int[] result;
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			StringBuilder sb = new StringBuilder();
			 n = Integer.parseInt(br.readLine());
			 answer=0;
			 max=Integer.MIN_VALUE;
			 min=Integer.MAX_VALUE;
			 operators = new int[4];
			 arr=new int[n];
			 result=new int[arr.length-1];
			 st = new StringTokenizer(br.readLine());
			 for(int i = 0 ; i <4;i++) {
				 operators[i]=Integer.parseInt(st.nextToken());
			 }
			 st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < n ;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			recur(0);
			
			answer=max-min;
//			System.out.println(max+" "+min);
			sb.append("#"+t+" "+answer);
			System.out.println(sb);
		}//tc
	}//main
	static void recur(int depth) {
		if(depth==arr.length-1) {
			cal();
			return;
		}
		for(int i=0;i<4;i++) {
			if(operators[i]>0) {
				operators[i]--;
				
				result[depth]=i;
				recur(depth+1);
				operators[i]++;
			}
		}
	}
	static void cal() {
		int tmp = arr[0];
//		System.out.println(Arrays.toString(result));
		for(int i = 0 ; i<result.length;i++) {
//			System.out.println(result[i] + " "+ tmp);
			if(result[i]==0) {
				tmp+=arr[i+1];
			}else if(result[i]==1) {
				tmp-=arr[i+1];
			}else if(result[i]==2) {
				tmp*=arr[i+1];
			}else if(result[i]==3) {
				tmp/=arr[i+1];
			}
		}
//		System.out.println(tmp);
		if(min>tmp) {
			min = tmp;
		}
		if(max<tmp) {
			max = tmp;
		}
	}
}
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static int n;
    static int max;
    static int min;
    static int[] arr;
    static int[] operators;
    static int[] result;
    static int answer;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{

            n =sc.nextInt();
            arr = new int[n];
            operators = new int[4];
            result  = new int[arr.length-1];
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            for(int i = 0 ;i<4;i++){
            	operators[i] = sc.nextInt();
            }
            for(int i = 0 ;i<n;i++){
            	arr[i] = sc.nextInt();
            }
            
            recur(0);
            answer = max - min;
            System.out.println("#"+test_case+" "+answer);
		}
	}
    static void recur(int depth){
    	if(depth == result.length){
            //연산
            cal();
        	return;
        }
        for(int i = 0 ;i<operators.length;i++){
        	if(operators[i] >0){
            	operators[i]--;
                result[depth]=i;
                recur(depth+1);
                operators[i]++;
            }
        }
    }
    static void cal(){
    	int num = arr[0];
        for(int i = 0;i<result.length;i++){
        	if(result[i] ==0){
            	num+=arr[i+1];
            }else if(result[i] ==1){
            	num-=arr[i+1];
            }else if(result[i] ==2){
            	num*=arr[i+1];
            }else if(result[i] ==3){
            	num/=arr[i+1];
            }
        }
        if(num > max){
        	max = num;
        }
        if(num<min){
        	min = num;
        }
    }
}
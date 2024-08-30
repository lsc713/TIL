import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static int dx[] ={-1,1,0,0};
    static int dy[] ={0,0,-1,1};
    
    static int dx1[] ={-1,1,1,-1};
    static int dy1[] = {-1,-1,1,1};
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            
			int n =sc.nextInt();
            int m =sc.nextInt();
            int[][] map = new int[n][n];
            for(int i =0 ;i<n;i++){
            	for(int j = 0 ; j <n;j++){
                	map[i][j] = sc.nextInt();
                }
            }
            int answer=0;
            for(int i =0 ;i<n;i++){
            	for(int j = 0 ; j <n;j++){
                    int result=map[i][j];
                    for(int l=1;l<=m-1;l++){
                        for(int k=0;k<4;k++){
	 	                   	int nx = i+dx[k]*l;
		                    int ny = j+dy[k]*l;
    		                if(!(0<=nx&&nx<n&&0<=ny&&ny<n)){
            		            continue;
                		    }
                        	result+=map[nx][ny];
                    	}
                    }
                    answer=Math.max(result,answer);
                }
            }
            for(int i =0 ;i<n;i++){
            	for(int j = 0 ; j <n;j++){
                    int result=map[i][j];
                    for(int l=1;l<=m-1;l++){
                        for(int k=0;k<4;k++){
	 	                   	int nx = i+dx1[k]*l;
		                    int ny = j+dy1[k]*l;
    		                if(!(0<=nx&&nx<n&&0<=ny&&ny<n)){
            		            continue;
                		    }
                        	result+=map[nx][ny];
                    	}
                    }
                    answer=Math.max(result,answer);
                }
            }
            System.out.println("#"+test_case+" "+answer);
            
		}
	}
}
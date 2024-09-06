import java.util.*;
import java.io.FileInputStream;
class Solution
{
    static int D,W,K;
    static int[] A,B;
    static int[][] map;
    static int[][] copied;
    static int answer;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            D = sc.nextInt();
            W = sc.nextInt();
            K = sc.nextInt();
            answer = Integer.MAX_VALUE;
            map =new int[D][W];
            for(int i = 0 ; i<D;i++){
            	for(int j = 0 ; j<W;j++){
                	map[i][j] = sc.nextInt();
                }
            }
			copied = map.clone();

            A = new int[W];
            B = new int[W];
            Arrays.fill(B,1);
            
            recur(0,0);
            System.out.println("#"+test_case+" "+answer);
		}//tc
	}//main
    static void recur(int depth, int cnt){
        if(cnt>answer)return;
    	if(depth == D){
            if(check()){
            	answer=Math.min(answer,cnt);
            }
        	return;
        }
        if(check()){
        answer=Math.min(answer,cnt);
        }
        
        recur(depth+1,cnt);
        
        insert(depth,A);
        recur(depth+1,cnt+1);
        recovery(depth);
        insert(depth,B);
        recur(depth+1,cnt+1);
        recovery(depth);
    }
    
    static void insert(int depth ,int[] arr){
    	map[depth]=arr;
    }
    static void recovery(int depth){
    	map[depth] = copied[depth];
    }
    static boolean check(){
    	loop:for(int c = 0;c<W;c++){
            int cnt=1;
        	for(int r = 0 ; r<D-1;r++){
            	if(map[r][c] == map[r+1][c]){
                	cnt++;
                }else{cnt=1;}
                if(cnt>=K) continue loop;
            }
            return false;
        }
        return true;
    }
}
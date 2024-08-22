import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    
    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(System.in);
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board1 = new char[8][8];
        char[][] board2 = new char[8][8];
        int answer=Integer.MAX_VALUE;
        //BWBWBWBW WBWBWBWB
        
        char[][] map = new char[n][m];
        for(int i = 0; i < n ;i++){
            String input = br.readLine();
            map[i] = input.toCharArray();
        }
        
        for(int i = 0 ; i <8;i++){
            if(i%2==0){
                board1[i] = "BWBWBWBW".toCharArray();
                board2[i] = "WBWBWBWB".toCharArray();
            }else{
                board1[i] = "WBWBWBWB".toCharArray();
                board2[i] = "BWBWBWBW".toCharArray();
            }
        }
        
        //맵을 돌면서 계산하고 최소 값을 반환하자
        for(int i = 0 ; i <n-7;i++){
            for(int j = 0 ; j<m-7;j++){
            	int min1 = 0;
                int min2 = 0;
                for(int a=i;a<i+8;a++){
                    for(int b=j;b<j+8;b++){
                        if(map[a][b] != board1[a%8][b%8]){
                        	min1++;
                        }
                        if(map[a][b] != board2[a%8][b%8]){
                        	min2++;
                        }
                    }    
                }
                answer=Math.min(answer, Math.min(min1, min2));
            }
        }
        sb.append(answer);
        System.out.println(sb);
        
    }
}
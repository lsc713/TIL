import java.util.*;

public class Main {
    static int n;
    static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        grid = new int[n][n];

        ArrayList<Integer> vals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                vals.add(grid[i][j]);
            }
        }

        Collections.sort(vals);
        vals = new ArrayList<>(new LinkedHashSet<>(vals));

        int R = 0;
        int answer = Integer.MAX_VALUE;
        for(int L =0; L<vals.size();L++){
            while(R<vals.size()){
                if(canDP(vals.get(L),vals.get(R))){
                    answer = Math.min(answer,vals.get(R)-vals.get(L));
                    break;
                }else{
                    R++;
                }
            }
        }
        System.out.println(answer);
    }
    static boolean canDP(int l,int h){
        if(grid[0][0]<l||grid[0][0]>h)return false;
        if(grid[n-1][n-1]<l||grid[n-1][n-1]>h)return false;
        boolean[][] dp = new boolean[n][n];
        dp[0][0]=true;
        for(int i=0;i<n;i++){
            for(int j = 0 ; j<n;j++){
                int v = grid[i][j];
                if(v<l||v>h)continue;
                if(i>0&&dp[i-1][j])dp[i][j]=true;
                if(j>0&&dp[i][j-1])dp[i][j]=true;
            }
        }
        return dp[n-1][n-1];
    }
}
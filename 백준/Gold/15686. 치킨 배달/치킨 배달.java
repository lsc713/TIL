import java.util.*;

class Main{

    static int n,m,answer;
    static int[][] map;
    static boolean visited[];
    static List<int[]> homeList;
    static List<int[]> chickenList;
    static int[] tmpList;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n  = sc.nextInt();
        m  = sc.nextInt();
        map = new int[n][n];
        homeList = new ArrayList<>();
        chickenList = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = sc.nextInt();
                if(map[i][j] == 1) homeList.add(new int[]{i,j});
                if(map[i][j] == 2) chickenList.add(new int[]{i,j});
            }
        }
        visited = new boolean[chickenList.size()];
        answer = Integer.MAX_VALUE;

        tmpList = new int[m];
        find(0,0);
        System.out.println(answer);
    }
    static void find(int depth,int at){
        if (depth == m) {
            cal();
            return;
        }
        for (int i = at; i < chickenList.size(); i++) {
            if (visited[i])continue;
            visited[i] = true;
            tmpList[depth] =i;
            find(depth+1,i+1);
            visited[i] = false;
        }
    }

    private static void cal() {
        int min=Integer.MAX_VALUE;
        int temp=0;
        for (int i = 0; i < homeList.size(); i++) {
            int cnt=Integer.MAX_VALUE;
            for (int j = 0; j < tmpList.length; j++) {
                int[] tmp = chickenList.get(tmpList[j]);
                int result = Math.abs(tmp[0]-homeList.get(i)[0])+Math.abs(tmp[1]-homeList.get(i)[1]);
                cnt = Math.min(cnt,result);

            }
            temp+=cnt;
            min = Math.min(min,temp);
        }
//        System.out.println(temp);
        answer = Math.min(temp,answer);

    }
}
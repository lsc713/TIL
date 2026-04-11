import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] segments = new int[n][2];
        for (int i = 0; i < n; i++) {
            segments[i][0] = sc.nextInt();
            segments[i][1] = sc.nextInt();
        }
        Arrays.sort(segments,(a1,a2)->a1[1]-a2[1]);
        int ans =0;
        int end =-1;
        for(int i = 0 ; i < n ; i++){
            if(segments[i][0]>end){
                ans++;
                end = segments[i][1];
            }
        }
        System.out.println(ans);
        // Please write your code here.
    }
}
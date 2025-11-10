import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        int n = A.length();

        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            String temp = A.substring(n-i)+A.substring(0,n-i);
            int templen = calc(temp);
            ans = Math.min(ans,templen);
        }
        System.out.println(ans);
    }
    static int calc(String A){
        int len =0;
        int i=0;
        int n = A.length();
        while(i<n){
            int j=i+1;
            int cnt=1;
            char ch = A.charAt(i);
            while(j<n&&ch==A.charAt(j)){
                cnt++;
                j++;
            }
            len++;
            len+=Integer.toString(cnt).length();
            i=j;
        }
        return len;
    }
}
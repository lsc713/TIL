import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(count(n));
    }
    static int count(int n){
        int cnt=0;
        int start = (int)Math.pow(10,n-1);
        int end = (int)Math.pow(10,n)-1;
        for(int i=start;i<=end;i++){
            if(beautiful(i)){
                cnt++;
            }
        }
        return cnt;
    }
    static boolean beautiful(int num){
        int[] arr = new int[5];
        int temp = num;
        while(temp>0){
            int digit = temp%10;
            if(digit<1||digit>4){
                return false;
            }
            arr[digit]++;
            temp/=10;
        }
        for(int i = 1;i<=4;i++){
            if(arr[i]>0&&arr[i]!=i){
                return false;
            }
        }
        return true;
    }
}
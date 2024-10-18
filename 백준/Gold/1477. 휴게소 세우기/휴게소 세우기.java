import java.util.*;
class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        int[] arr = new int[n+2];
        arr[0]=0;
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        arr[n+1]=l;
        Arrays.sort(arr);
        int left=1;
        int right=l-1;
        while(left<=right){
            int mid =(left+right)/2;
            int sum=0;
            for (int i =1;i<n+2;i++){
                sum+=(arr[i]-arr[i-1]-1)/mid;
            }
//            System.out.println(sum+" "+left+" "+ right);
            if(sum>m){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(left);
    }
}
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i = 0 ; i<m;i++){
            int gen =sc.nextInt();
            int idx =sc.nextInt();
            if(gen==1){
                for(int j = idx-1;j<n;j=j+idx){
                    arr[j] = 1-arr[j];
                    if(j+idx>=n){
                        break;
                    }
                }
            }else{
                idx=idx-1;
                arr[idx] = 1-arr[idx];
                int left = idx-1;
                int right = idx+1;
                while(left>=0 && right <n && arr[left]==arr[right]){
                    arr[left] = 1-arr[left];
                    arr[right] = 1-arr[right];
                    left--;
                    right++;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(cnt%20==0 && cnt !=0){
                System.out.println();
            }
            cnt++;
            System.out.print(arr[i]+" ");
        }
    }
}
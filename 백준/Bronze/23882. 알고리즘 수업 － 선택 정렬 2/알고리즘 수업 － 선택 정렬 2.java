import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int cnt=0;
        for(int i = n-1 ; i >0;i--){
            int max = i;
            for(int j =i-1;j>=0;j--){
                if(arr[max] < arr[j]){
                    max=j;
                }
            }
            if(max != i){
                cnt++;
                int tmp = arr[i];
                arr[i] = arr[max];
                arr[max] = tmp;
                if(cnt==m){
                    for(int k = 0 ; k < n ; k++){
                        System.out.print(arr[k]+" ");
                    }
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
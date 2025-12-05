import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0,j=n-1;i<j;i++,j--){
            int tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        if(n<3){
            System.out.println(0);
            System.exit(0);
        }
        int best =0;boolean found=false;
        for(int i =0 ; i <= n-3;i++){
            if(arr[i]+arr[i+1]+arr[i+2]<=best)break;
            for(int j=i+1;j<=n-2;j++){
                if((arr[i]&arr[j])!=0)continue;
                if(arr[i]+arr[j]+arr[j+1]<=best)break;

                for(int k = j+1;k<=n-1;k++){
                    if((arr[i]&arr[k])==0&&(arr[j]&arr[k])==0){
                        int sum =arr[i]+arr[j]+arr[k];
                        if(best<sum)best=sum;
                        found =true;
                        break;
                    }
                }
            }
        }
        System.out.println(found? best:0);
        // Please write your code here.
    }
}
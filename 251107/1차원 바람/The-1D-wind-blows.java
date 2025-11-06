import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         q = sc.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int r = sc.nextInt()-1;
            char d = sc.next().charAt(0);
            rotate(a[r],d);

            char dir = (d=='L') ? 'R':'L';
            for(int j = r-1;j>=0;j--){
                if(!canPropagate(a[j],a[j+1]))break;
                rotate(a[j],dir);
                dir = (dir=='L') ? 'R':'L';
            }
            dir = (d=='L') ? 'R':'L';
            for(int j = r+1;j<n;j++){
                if(!canPropagate(a[j],a[j-1]))break;
                rotate(a[j],dir);
                dir = (dir=='L') ? 'R':'L';
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        // Please write your code here.
    }
    static void rotate(int[] arr, char dd){
        int m = arr.length;
        if(dd=='L'){
            int temp = arr[m-1];
            for(int j=m-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }else{
            int temp = arr[0];
            for(int j = 0 ;j<m-1;j++){
                arr[j]=arr[j+1];
            }
            arr[m-1]=temp;
        }
    }
    static int n,m,q;
    static int[][] a;
    static boolean canPropagate(int[] arr,int[] brr){
        for(int j=0;j<m;j++){
            if(arr[j]==brr[j]) return true;
        }
        return false;
    }
}
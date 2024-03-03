import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        int max = 0;
        for(int i = 0 ; i< a ; i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< b ; i++){
            if(binarySearch(arr1,sc.nextInt())>=0){
                sb.append(1).append('\n');
            }else{sb.append(0).append("\n");}
        }
        System.out.println(sb);
    }
    public static int binarySearch(int[] arr, int key){
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(key<arr[mid]){hi =mid-1;}
            else if(key>arr[mid]){lo=mid+1;}else{return mid;}
            
        }
        return -1;
    }
    
}
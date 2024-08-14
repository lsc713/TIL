import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int result = 0;
        for(int i = 0;i<9;i++){
            arr[i] = sc.nextInt();
            result+=arr[i];
        }
        
        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1 ;j<arr.length;j++ ){
                if(result-arr[i]-arr[j]==100){
                	arr[i]=0;
                	arr[j]=0;
                	Arrays.sort(arr);
                    for(int k = 2 ; k <9;k++){
                		System.out.println(arr[k]);
                    }
                    return;
                }    
            }
            
        }
    }
}
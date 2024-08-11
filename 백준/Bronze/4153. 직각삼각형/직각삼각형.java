import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] arr = new int[3];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        String answer ="";
        for(int i =0;i<arr.length;i++){
            answer+=arr[i];
        }
        if(Math.pow(arr[0],2)+Math.pow(arr[1],2) == Math.pow(arr[2],2)){
            if(answer.equals("000")){
            break;
        }  
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
          
        }
        
    }
}
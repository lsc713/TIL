import java.util.*;

public class Main{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        int result = 0;
        int minInt=Integer.MAX_VALUE;
        for(int j=n; j<=m;j++){
            if(isAnswer(j)){
                result += j;
                minInt=Math.min(minInt,j);
            }
        }
        if(result>0){
            System.out.println(result);
            System.out.println(minInt);
        }else{
            System.out.println(-1);
        }
    }

    private static boolean isAnswer(int j) {
        if (j<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(j);i++){
            if(j %i==0){
                return false;
            }
        }
        return true;
    }
}
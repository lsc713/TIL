import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }
        size=n;
        boolean explode = true;
        int curIdx;
        while(explode){
            explode=false;
            curIdx = 0;
            while(curIdx<size){
                int endIdx = calc(curIdx);
                if(endIdx - curIdx+1>=m){
                    explode=true;
                    cut(curIdx,endIdx);
                }else{
                    curIdx=endIdx+1;
                }
            }
        }
        System.out.println(size);
        for(int i = 0 ; i < size;i++){
            System.out.println(bombs[i]);
        }
        // Please write your code here.
    }
    static void cut(int curIdx,int endIdx){
        int len = endIdx-curIdx+1;
        for(int i = endIdx+1;i<size;i++){
            bombs[i-len]=bombs[i];
        }
        size-=len;
    }
    static int calc(int curIdx){
        int endIdx = curIdx+1;
        while(true){
            if(bombs[endIdx]==bombs[curIdx]){
                endIdx++;
            }else{
                break;
            }
        }
        return endIdx-1;
    }
    static int n,m,size;
    static int[] bombs;
}
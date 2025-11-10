import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] bombs;
    static int bombscnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
        bombs = new int[n];
        bombscnt=0;
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }

        m1cond();
        int len = n;
        while(true){
            int[] next = new int[n];
            int ni=0;
            boolean explode = false;
            int i =0 ;
            while(i<len){
                int j = i;
                while(j<len&&bombs[j]==bombs[i])j++;
                int run = j-i;
                if(run>=m){
                    explode=true;
                }else{
                    for(int k=i;k<j;k++){
                        next[ni++]=bombs[k];
                    }
                }
                i=j;
            }
            bombs=next;
            len=ni;
            if(!explode)break;
        }
        print(len);
        
        // Please write your code here.
    }
    static void m1cond(){
        if(m==1){
            System.out.println(0);
            System.exit(0);
        }
    }
    static void print(int len){
        System.out.println(len);
        for(int i = 0 ; i < len ; i++){
            if(bombs[i]!=0){
                System.out.println(bombs[i]);
            }
        }
    }
}
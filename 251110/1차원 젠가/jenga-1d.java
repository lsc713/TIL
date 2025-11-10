import java.util.Scanner;
public class Main {
    static int n;
    static int[] blocks;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        endidx=n;
        for(int i = 0 ; i<2;i++){
            int s1 = sc.nextInt()-1;
            int e1 = sc.nextInt()-1;
            calc(s1,e1);
        }
        
        System.out.println(endidx);
        for(int i = 0 ; i < endidx ;i++){
            System.out.println(blocks[i]);
        }
        // Please write your code here.
    }
    static int endidx;
    static void calc(int s,int e){
        int[] temp = new int[n];
        int idx =0;
        for(int i =0;i<endidx;i++){
            if(i<s||i>e){
                temp[idx++]=blocks[i];
            }
        }
        for(int i = 0;i<idx;i++){
            blocks[i]=temp[i];
        }
        endidx=idx;
    }
}
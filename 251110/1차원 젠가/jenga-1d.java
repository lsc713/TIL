import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        int s1 = sc.nextInt()-1;
        int e1 = sc.nextInt()-1;
        int s2 = sc.nextInt()-1;
        int e2 = sc.nextInt()-1;
        int[] temp = new int[n];
        int idx =0;
        for(int i =0;i<n;i++){
            if(i<s1||i>e1){
                temp[idx++]=blocks[i];
            }
        }
        int[] temp2 = new int[n];
        idx =0;
        for(int i =0;i<n;i++){
            if(i<s2||i>e2){
                temp2[idx++]=temp[i];
            }
        }
        System.out.println(n-(e1-s1+1)-(e2-s2+1));
        for(int i = 0 ; i < n ;i++){
            if(temp2[i]!=0)
                System.out.println(temp2[i]);
        }
        // Please write your code here.
    }
}
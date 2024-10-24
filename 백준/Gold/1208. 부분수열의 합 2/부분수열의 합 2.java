import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n,s;
    static int[] arr;
    static List<Long> left = new ArrayList<>();
    static List<Long> right = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         s = scanner.nextInt();
         arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        answer=0;
        div(0,n/2, 0,left);
        div(n/2,n, 0,right);
        Collections.sort(left);
        Collections.sort(right);

        answer = calc();
        if (s==0)answer--;

        System.out.println(answer);
    }
    private static void div(int depth, int end, long sum, List<Long> list) {
        if (depth == end) {
            list.add(sum);
            return;
        }
        div(depth+1, end, sum+arr[depth], list);
        div(depth+1,end,sum,list);
    }
    static long answer;
    private static long calc() {
        int l=0;
        int r=right.size()-1;
        long result=0;
        while(l<left.size()&&r>=0){
            long sum = left.get(l)+right.get(r);
            if(sum==s){
                long leftValue = left.get(l);
                long cnt1=0;
                while(l<left.size()&&left.get(l)==leftValue){
                    l++;
                    cnt1++;
                }

                long rightValue = right.get(r);
                long cnt2=0;
                while(r>=0&&right.get(r)==rightValue){
                    r--;
                    cnt2++;
                }
                result+=cnt2*cnt1;
            }else if(sum<s){
                l++;
            }else{
                r--;
            }
        }
        return result;
    }
}
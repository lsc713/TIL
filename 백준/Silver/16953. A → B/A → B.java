import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static long answer=Integer.MAX_VALUE;
	static long a,b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		b = sc.nextInt();
		recur(a,0);
		System.out.println(answer==Integer.MAX_VALUE?-1:answer);
	}
	static void recur(long  sum1,long  depth) {
		if(sum1==b) {
			answer=Math.min(depth+1, answer);
			return;
		}
		if(sum1>b)return;
		recur(sum1*10+1,depth+1);
		recur(sum1*2,depth+1);
	}
	
}

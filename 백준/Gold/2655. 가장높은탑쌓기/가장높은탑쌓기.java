import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Brick implements Comparable<Brick>{
		int width,height,weight,origin;
		public Brick(int width,int height,int weight,int origin) {
			this.width=width;
			this.height=height;
			this.weight=weight;
			this.origin=origin;
		}
		@Override
		public int compareTo(Brick o) {
			return Integer.compare(o.width, this.width);
		}
		@Override
		public String toString() {
			return "Brick [width=" + width + ", height=" + height + ", weight=" + weight + "]";
		}
		
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Brick> bricks = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int width=sc.nextInt();
			int height=sc.nextInt();
			int weight = sc.nextInt();
			bricks.add(new Brick(width,height,weight,i+1));
		}
		Collections.sort(bricks);
		int[] dp = new int[n];
		int[] count = new int[n];
		int[] index = new int[n];
		int answer=0;
		int maxIdx=-1;
		Arrays.fill(index, -1);
		Arrays.fill(count, 1);
		for(int i =0;i<n;i++) {
			dp[i]=bricks.get(i).height;
			for(int j=0;j<i;j++) {
				if(bricks.get(j).weight>bricks.get(i).weight&&dp[i]<dp[j]+bricks.get(i).height) {
					dp[i]=dp[j]+bricks.get(i).height;
					count[i]=count[j]+1;
					index[i]=j;
				}
			}
			if(answer<dp[i]) {
				answer=dp[i];
				maxIdx=i;
			}
		}
		System.out.println(count[maxIdx]);
		List<Integer> result = new ArrayList<>();
				while(maxIdx!=-1) {
			result.add(bricks.get(maxIdx).origin);
			maxIdx = index[maxIdx];
		}
		for(int i = 0 ;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}
}

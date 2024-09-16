import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{int answer=0;
         int N =sc.nextInt();
         int A =sc.nextInt();
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         maxHeap.offer(A);
         for(int i =0;i<N;i++){
         	int a = sc.nextInt();
             int b = sc.nextInt();
             if(maxHeap.peek()>=a){
             	maxHeap.offer(a);
             }else{
                 minHeap.offer(a);
             }
             if(maxHeap.peek()>=b){
             	maxHeap.offer(b);
             }else{
                 minHeap.offer(b);
             }
             if(maxHeap.size()<minHeap.size()){
             	maxHeap.offer(minHeap.poll());
             }else if(maxHeap.size()>minHeap.size()+1){
             	minHeap.offer(maxHeap.poll());
             }
                      answer=(answer+maxHeap.peek())%20171109;
         }

System.out.println("#"+test_case+" "+answer);
		}
	}
}
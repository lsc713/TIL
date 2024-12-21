import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] currentInterval = intervals[0];
        result.add(currentInterval);
        for(int[] interval : intervals){
            if(currentInterval[1] >= interval[0]){
                currentInterval[1] = Math.max(currentInterval[1],interval[1]);
            }else{
                currentInterval= interval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
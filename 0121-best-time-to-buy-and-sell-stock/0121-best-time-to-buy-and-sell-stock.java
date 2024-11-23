import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int result =0;
        int temp = Integer.MAX_VALUE;
        for(int i = 0 ; i<prices.length;i++){
            temp = Math.min(prices[i],temp);
            result = Math.max(result,prices[i]-temp);
        }
        return result;
    }
}
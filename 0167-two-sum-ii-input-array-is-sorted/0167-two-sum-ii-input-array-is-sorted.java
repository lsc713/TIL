class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L = 0;
        int R = numbers.length-1;
        while(L<R){
            int temp = numbers[L]+numbers[R];
            if(temp == target){
                return new int[]{L+1,R+1};
            }
            if(temp<target){
                L++;
            }else{
                R--;
            }
        }
        return null;
    }
}
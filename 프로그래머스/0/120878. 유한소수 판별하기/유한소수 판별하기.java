class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int result = b/getg(a,b);
        
        while(result != 1){
            if(result %2 ==0){
                result/=2;
            }else if(result % 5 ==0){
                result /=5;
            }else{
                return 2;
            }
        }
        
        
        return 1;
    }
    
    
    int getg(int a, int b){
        if(b==0){
            return a;
        }
        return getg(b,a%b);
    }
}
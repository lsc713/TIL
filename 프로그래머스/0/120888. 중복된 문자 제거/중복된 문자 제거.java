class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer=answer.concat(my_string.substring(0,1));
        for(int i =0;i<my_string.length();i++){
            for(int j = 0 ;j<answer.length();j++){
                if(answer.contains(my_string.substring(i,i+1))){
                    
                }else{
                    answer=answer.concat(my_string.substring(i,i+1));        
                }
            }
        }
        return answer;
    }
}
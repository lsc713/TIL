class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(c[i]==' '){
                answer+=" ";
                continue;
            }
            if(c[i]+n > 122){
                answer+=(char)(c[i]+n-26);
            }else if(c[i] <96 &&c[i]+n > 90){
                answer+=(char)(c[i]+n-26);    
            }else{
                answer+=(char)(c[i]+n);
            }
            
            
        }
        
        return answer;
    }
}
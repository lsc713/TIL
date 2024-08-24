class Solution {
    public String solution(String s) {
        String answer = "";
        int even=0;
        char[] c =s.toCharArray();
        for(int i =0;i<c.length;i++){
            if(Character.isAlphabetic(c[i])){
                if(even%2==0){
                    answer+=Character.toUpperCase(c[i]);
                }else{
                    answer+=Character.toLowerCase(c[i]);
                }
                even++;
            }else{
                even=0;
                answer+=" ";
            }
        }
        return answer;
    }
}
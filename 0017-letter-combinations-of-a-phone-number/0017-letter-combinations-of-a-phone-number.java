import java.util.*;
class Solution {
    List<String> result;
    String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    String digits;
    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        result = new ArrayList<>();
        backtracking(0,"");
        return result;
    }
    void backtracking(int idx,String current){
        if(digits.equals(null)||digits.equals("")){
            return;
        }
        if(idx==digits.length()){
            result.add(current);
            return;
        }
        String temp = map[digits.charAt(idx)-'0'];
        for(char c : temp.toCharArray()){
            backtracking(idx+1,current+c);
        }

    }
}
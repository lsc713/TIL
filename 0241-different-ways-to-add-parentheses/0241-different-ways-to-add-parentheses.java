class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        if(!expression.contains("+")&&
        !expression.contains("-")&&
        !expression.contains("*")){
            result.add(Integer.valueOf(expression));
            return result;
        }
        for(int i = 0 ;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                String leftSide = expression.substring(0,i);
                String rightSide = expression.substring(i+1);
                List<Integer> leftResults = diffWaysToCompute(leftSide);
                List<Integer> rightResults = diffWaysToCompute(rightSide);
                for(int left : leftResults){
                    for(int right:rightResults){
                        if(c=='+'){
                            result.add(left+right);
                        }else if(c=='-'){
                            result.add(left-right);
                        }else{
                            result.add(left*right);
                        }
                    }
                }
            }
        }

        return result;
    }
}
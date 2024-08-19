class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        //포토의 겉 배열을 돌면서 네임과 같다면 나이를 정답배열에 더해준다.
        for(int i = 0 ; i < photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                for(int k=0;k<name.length;k++){
                    if(photo[i][j].equals(name[k])){
                        answer[i] += yearning[k];
                    }else{
                        continue;
                    }
                }
            }
        }
        return answer;
    }
}
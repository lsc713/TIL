import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        String[] ext1 = {"code", "date", "maximum", "remain"};
        int cnt=0;
        int tmp=0;
        for(int i = 0;i<ext1.length;i++){
            if(sort_by.equals(ext1[i])){
                tmp=i;
            }
            if(ext.equals(ext1[i])){
                for(int j = 0 ; j<data.length;j++){
                    if(data[j][i]<val_ext){
                      cnt++;  
                    }    
                }
            }else{
                continue;
            }
        }
        int[][] answer = new int[cnt][4];
        int idx=0;
        for(int i = 0;i<ext1.length;i++){
            if(ext.equals(ext1[i])){
                for(int a = 0 ; a<data.length;a++){
                    if(data[a][i]<val_ext){
                      for(int j = 0 ; j<4;j++){
                        answer[idx][j] = data[a][j];
                      }
                      idx++;
                    }    
                }
            }
        }
        
        for(int i = answer.length-1;i>0;i--){
            for(int j = 0 ; j<i;j++){
                if(answer[j][tmp]>answer[j+1][tmp]){
                    
                    int[] temp=answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1]=temp;
                }

            }
        }
        
        return answer;
    }
}
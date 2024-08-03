import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> mapp = new HashMap<>();
        mapp.put("code",0);
        mapp.put("date",1);
        mapp.put("maximum",2);
        mapp.put("remain",3);
        
        int extIdx = mapp.get(ext);
        int sortIdx = mapp.get(sort_by);
        
        List<int[]> list = new ArrayList<>();
        for(int[] val : data){
            if(val[extIdx]<val_ext){
                list.add(val);
            }
        }
        
        list.sort(Comparator.comparingInt(a->a[sortIdx]));
        
        int[][] answer = new int[list.size()][4];
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
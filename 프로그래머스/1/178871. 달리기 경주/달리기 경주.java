import java.util.*;
class Solution {
	public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i<players.length;i++){
            map.put(players[i],i);    
        }
        
        for(int i = 0 ; i < callings.length;i++){
            //순위가 나옴.
            int per = map.get(callings[i]);
            
            //순위 변환.

            
            
            String temp = players[per-1];
            players[per-1] = players[per];
            players[per] = temp;
            
            
            map.put(players[per-1], per);
            map.put(players[per], per-1);
            
        }
        return players;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		String[] p = {"mumu", "soe", "poe", "kai", "mine"};
		String[] c = {"kai", "kai", "mine", "mine"};
		s.solution(p,c);
	}
}
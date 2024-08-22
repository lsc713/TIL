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
            
            String temp = players[per-1];
            players[per-1] = players[per];
            players[per] = temp;
           //플레이어의 위치 변경 시켰음 
           
            map.put(players[per-1], per-1);
            map.put(players[per], per);
            
//            System.out.println(players[per-1]+(per-1));
//            System.out.println(map);
            
        }
        return players;
    }
}
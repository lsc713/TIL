import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int maxHealth = health;
        int healTime = bandage[0];
        int healPerSecond = bandage[1];
        int bonusHeal = bandage[2];
        
        int lastAttackTime = attacks[attacks.length-1][0];
        Map<Integer,Integer> attackMap = new HashMap<>();
        for(int[] attack : attacks){
            attackMap.put(attack[0],attack[1]);
        }
        int consecutiveHealing =0;
        for(int time =0 ; time<=lastAttackTime;time++){
            if(attackMap.containsKey(time)){
                currentHealth-=attackMap.get(time);
                consecutiveHealing=0;
                if(currentHealth<=0)return -1;
            }else{
                consecutiveHealing++;
                currentHealth += healPerSecond;
                if(consecutiveHealing == healTime){
                    currentHealth += bonusHeal;
                    consecutiveHealing=0;
                }
                currentHealth = Math.min(maxHealth,currentHealth);
            }
        }
        return currentHealth;
    }
}
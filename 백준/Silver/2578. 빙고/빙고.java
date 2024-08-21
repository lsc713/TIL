
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] bin = new int[5][5];
        for(int i = 0 ; i <5;i++){
            for(int j = 0 ; j<5;j++){
                bin[i][j] = sc.nextInt();
            }
        }
        int answer=0;
        
        loop:for(int a =0 ;a<25;a++){
            answer++;
            int tmp = sc.nextInt();
            for(int i = 0 ; i <5;i++){
                for(int j = 0 ; j<5;j++){
                    if(bin[i][j] == tmp){
                        bin[i][j]=0;
                    }
                }
            }   
            int rcnt=0;
            int ccnt=0;
            int c1=0;
            int c2=0;
            int bing =0;
            for(int i = 0 ; i <5;i++){
            	rcnt=0;
            	ccnt=0;
            	
                for(int j = 0 ; j<5;j++){
                    if(bin[i][j]==0){
                        ccnt++;
                    } 
                    if(bin[j][i]==0){
                        rcnt++;
                    } 
                    if(ccnt==5){
                        bing++;
                    }
                    if(rcnt==5) {
                    	bing++;
                    }
                }
                if(bin[i][i]==0) {
                	c1++;
                }
                if(bin[4-i][i]==0) {
                	c2++;
                }
                if(c1==5) {
                	bing++;
                }
                if(c2==5) {
                	bing++;
                }
            }
            if(bing>=3){
                break loop;    
            }
        }
        System.out.println(answer);
    }
}
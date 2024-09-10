import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
class Main{
    static Character char1[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input=input.toUpperCase();
        int[] arr = new int[26];
//        System.out.println(input);
        for(int i=0; i<input.length(); i++){
            arr[input.charAt(i) - 'A']++;
        }
        int idx=0;
        int max = 0;
        for(int i=0; i<26; i++){
//            System.out.println(arr[i]);
            if(arr[i] > max){
                max = arr[i];
                idx = i;
            }
        }
        String answer="";
        answer+=char1[idx];
//        System.out.println(Arrays.toString(arr));
//        System.out.println(max);
        for(int i=0; i<26; i++){
            if(arr[i] == max&& i != idx){
                answer = "?";
            }
        }
        System.out.println(answer);
    }
}

import java.util.*;
class Main{
    static int n;
    static int m;
    static List<Integer> arr;
    static boolean[] visited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n+1];
        arr = new ArrayList<>();
        recur(0);
        
    }
    static void recur(int idx){
        if(idx==m){
            for(int i =0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 1 ; i<=n;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            arr.add(i);
            recur(idx+1);
            arr.remove(arr.size()-1);
            visited[i]=false;    
        }
        
    }
}
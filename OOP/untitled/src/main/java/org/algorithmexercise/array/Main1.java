package org.algorithmexercise.array;

import java.io.*;
import java.util.*;

class Main1 {
    static int[] arr;
    static int[] num;
    static boolean[] visit;
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        N = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        num= new int[N];
        arr=new int[M];
        visit=new boolean[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++) {
            num[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        출처: https://yeons4every.tistory.com/66 [나누는 개발 공부:티스토리]
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int depth){
        if(depth==m){
            for(int val:arr){
                sb.append(val+" ");
            }
            sb.append("\n");
        }

        for(int i = 0; i< n; i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=nums[i];
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }
}
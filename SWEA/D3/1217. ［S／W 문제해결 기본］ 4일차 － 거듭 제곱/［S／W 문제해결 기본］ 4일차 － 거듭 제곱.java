import java.util.Scanner;


class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int tc =1;tc<=10;tc++) {
            int a = sc.nextInt();

            int n =sc.nextInt();
            int m =sc.nextInt();
            System.out.println("#"+a+" "+pow(n,m));
        }
    }

    static int pow(int n, int m) {
        if(m==1)return n;
        return m%2==0 ? pow(n,m/2)*pow(n,m/2):pow(n,(m-1)/2)*pow(n,(m-1)/2)*n;
    }
}
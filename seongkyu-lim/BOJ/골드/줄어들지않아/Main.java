package 줄어들지않아;


import java.util.Scanner;

public class Main {
    static int n;
    static int[] cases;
    static long[][] dp;
    public static void main(String[] args){
        prepro();
        input();
        for(int i=0; i<cases.length; i++){
            solve(cases[i]);
        }
    }

    private static void solve(int num) {
        long answer = 0;
        for(int i=0; i<=9; i++){
            answer += dp[num][i];
        }
        System.out.println(answer);
    }

    private static void prepro() {

        dp = new long[65][10];
        for(int i=0; i<=9; i++){
            dp[1][i] = 1;
        }

        for(int i=0; i<=9; i++){
            for(int j=2; j<65; j++){
                for(int k=0; k<=i; k++){
                    dp[j][i] += dp[j-1][k];
                }
            }
        }

    }

    private static void input() {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        cases = new int[n];

        for(int i=0; i<n; i++){
            cases[i] = sc.nextInt();
        }
    }
}

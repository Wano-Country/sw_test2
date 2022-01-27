package 가장긴증가하는부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] seq;
    static int[] dp;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        seq = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<n; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[n];

        for (int i=0; i<n; i++){
            LIS(i);
        }

        int max = dp[0];

        for (int val : dp){
            max = Math.max(max, val);
        }

        System.out.println(max);

    }

    static int LIS(int n){

        if (dp[n] == 0){
            dp[n] += 1;
        }



        for(int i=n-1; i>=0; i--){
            if (seq[i]<seq[n]){
                dp[n] = Math.max(dp[n], dp[i]+1);
            }
        }
        return dp[n];
    }
}

/*
dp 알고리즘
buttom-up 방식 적용.
*/
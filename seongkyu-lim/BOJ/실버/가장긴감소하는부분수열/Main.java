package 가장긴감소하는부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] arr,dp;

    public static void main(String[] args) throws IOException{
        input();
        solve();
    }

    private static void solve() {

        dp = new int[n];

        for(int i = n-1; i>=0; i--){
            dp[i] = 1;
            for(int j = n-1; j>i; j--){
                if(arr[j]<arr[i] && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        
        Arrays.sort(dp);
        System.out.println(dp[n-1]);

    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
    }
    
}

package 가장긴바이토닉부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arr;
    static int[] r_dp,l_dp;
    public static void main(String[] args) throws IOException{
        input();
        solve();
    }

    private static void solve() {

        for(int i=0; i<n; i++){
            l_dp[i]=1;
            for(int j=0; j<i; j++){
                
                if(arr[j]<arr[i] && l_dp[i]<l_dp[j]+1){
                    l_dp[i] = l_dp[j]+1;
                }
            }
        }

        for(int i =n-1; i>=0; i--){
            r_dp[i]=1;
            for(int j=n-1; j>i; j--){
                if(arr[j]<arr[i] && r_dp[i]<r_dp[j]+1){
                    r_dp[i] = r_dp[j]+1;
                } 
            }
        }

        int answer = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            answer = Math.max(answer, l_dp[i]+r_dp[i]-1);
        }
        System.out.println(answer);

    }

    private static void input() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        r_dp = new int[n];
        l_dp = new int[n];
    }
    
}

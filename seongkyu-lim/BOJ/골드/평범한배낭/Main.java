package 평범한배낭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*

부르트포스

public class Main {
    static int n,k,max;
    static thing[] arr;
    public static void main(String[] args) throws IOException{
        input();
        solve(0, 0,0);
        System.out.println(max);
        
    }

    private static void solve(int sum, int level, int weight) {
        if(weight>k){
            sum -= arr[level-1].v;
            max = Math.max(max, sum); 
            return;   
        }

        if(level ==n && k>=weight){
            max = Math.max(max, sum);
            return;
        }

        for(int i=level; i<n; i++){
            solve(sum+arr[i].v ,i+1, weight+arr[i].w);
        }

    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new thing[n];

        for(int i=0; i<n; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            arr[i] = new thing(Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()));            
        }

        max = Integer.MIN_VALUE;

    }

    static class thing{
        int w,v;

        thing(int w, int v){
            this.w = w;
            this.v = v;
        }
    }
    
}
*/

// dp

public class Main{
    static int n,k;
    static thing[] arr;
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        input();
        solve();
    }

    private static void solve() {
        for(int i=1; i<n+1; i++){
            for(int j=1; j<k+1; j++){
                if(arr[i-1].w > j) {
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i-1].w]+arr[i-1].v);
                }
            }
        }

        System.out.println(dp[n][k]);
    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new thing[n];

        for(int i=0; i<n; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            arr[i] = new thing(Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()));            
        }

        dp = new int[n+1][k+1];

    }

    static class thing{
        int w,v;

        thing(int w, int v){
            this.w = w;
            this.v = v;
        }
    }
}
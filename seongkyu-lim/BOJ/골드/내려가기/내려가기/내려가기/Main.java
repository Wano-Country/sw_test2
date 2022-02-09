package 내려가기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /*
    슬라이딩 윈도우 알고리즘.
    DP.
    */

    /*

    실질적으로 dp를 쓰지않고 단순하게 품..
    -> 정답이 나와서 일단 패스..

    */

    static int[][] arr;

    static int[][] dp;

    static int n;

    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());

        arr = new int[n][3];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            
        }
        
        dp = new int[n][3];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        maxPoint(n);

        System.out.print(Math.max(Math.max(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
        System.out.print(" ");

        dp = new int[n][3];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2]; 

        minPoint(n);

        System.out.print(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
        System.out.println();
    }
    
    public static void maxPoint(int row){

        if(row == 1){
            return;
        }
        else{

            maxPoint(row-1);

            dp[row-1][0] = Math.max(dp[row-2][0], dp[row-2][1]) + arr[row-1][0];
            dp[row-1][1] = Math.max(Math.max(dp[row-2][0], dp[row-2][1]),dp[row-2][2]) + arr[row-1][1];
            dp[row-1][2] = Math.max(dp[row-2][1], dp[row-2][2]) + arr[row-1][2];

        }
    }

    public static void minPoint(int row){

        if(row == 1){
            return;
        }
        else{

            minPoint(row-1);
            
            dp[row-1][0] = Math.min(dp[row-2][0], dp[row-2][1]) + arr[row-1][0];
            dp[row-1][1] = Math.min(Math.min(dp[row-2][0], dp[row-2][1]),dp[row-2][2]) + arr[row-1][1];
            dp[row-1][2] = Math.min(dp[row-2][1], dp[row-2][2]) + arr[row-1][2];
        }
    }
}

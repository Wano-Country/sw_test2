package 정수삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int[][] dp;
    static int N;

    public static void main(String[] args) throws IOException{

        /**
         * 배열에 저장될 값 : 각 위치에서 최댓 값.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];
        dp = new int[N+1][N+1];
        
        for(int i=1; i<N+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<i+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < N+1; i++) {
			dp[N][i] = arr[N][i];
		}

        System.out.println(find(1, 1));
    }

    static int find(int depth, int idx){

        if(depth == N) return dp[depth][idx];
        
        if (dp[depth][idx] == 0) {
            dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
        }
        return dp[depth][idx];

    }
    
}

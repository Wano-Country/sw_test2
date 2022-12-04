package 곡예비행;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] dp_1 = new int[n][m];
        int[][] dp_2 = new int[n][m];


        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=n-1; i>=0; i--){
            if(i==n-1) dp_1[i][0] = arr[i][0];
            else dp_1[i][0] = arr[i][0] + dp_1[i+1][0];
        }
        for(int j=1; j<m; j++){
            dp_1[n-1][j] = arr[n-1][j] + dp_1[n-1][j-1];
        }

        for(int i=n-2; i>=0; i--){
            for(int j=1; j<m; j++){
                dp_1[i][j] = arr[i][j] + Math.max(dp_1[i][j-1], dp_1[i+1][j]);
            }
        }


        for(int i=n-1; i>=0; i--){
            if(i==n-1) dp_2[i][m-1] = arr[i][m-1];
            else dp_2[i][m-1] = arr[i][m-1] + dp_2[i+1][m-1];
        }
        for(int j=m-2; j>=0; j--){
            dp_2[n-1][j] = arr[n-1][j] + dp_2[n-1][j+1];
        }

        for(int i=n-2; i>=0; i--){
            for(int j=m-2; j>=0; j--){
                dp_2[i][j] = arr[i][j] + Math.max(dp_2[i][j+1], dp_2[i+1][j]);
            }
        }


        long answer = dp_1[0][0] + dp_2[0][0];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                answer = Math.max(answer, dp_1[i][j] + dp_2[i][j]);
            }
        }

        System.out.println(answer);
    }
    
}

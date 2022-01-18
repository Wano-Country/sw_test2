package twoxn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(bf.readLine());

        int[] dp = new int[row];

        for (int i=0; i<row; i++){
            if (i==0){
                dp[i] = 1;
            }else if(i==1){
                dp[i] = 2;
            }else{
                dp[i] = (dp[i-1] + dp[i-2])%10007;
            }
        }
        
        System.out.println(dp[row-1]);

    }
    
}

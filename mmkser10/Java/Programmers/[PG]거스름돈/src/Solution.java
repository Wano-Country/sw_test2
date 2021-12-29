class Solution {
    static final int INF = 1000000007;
    public int solution(int n, int[] money) {
        int[][] dp = new int[money.length+1][n+1];

        for(int i = 1 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[i].length ; j++){
                if(j < money[i-1])
                    dp[i][j] = dp[i-1][j]%INF;
                else if(j == money[i-1])
                    dp[i][j] = (dp[i-1][j]+1)%INF;
                else
                    dp[i][j] = (dp[i-1][j]+dp[i][j-money[i-1]])%INF;
            }
        }
        return dp[money.length][n];
    }
}
class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;

        if(board.length == 1 && board[0].length == 1){
            answer = board[0][0] == 1 ? 1 : 0;
            return answer;
        }
        else {
            int[][] dp = new int[board.length][board[0].length];

            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board[x].length; y++) {
                    dp[x][y] = board[x][y];
                }
            }

            for (int z = 1; z < dp.length; z++) {
                for (int q = 1; q < dp[z].length; q++) {
                    if (board[z][q] == 1) {
                        dp[z][q] = Math.min(Math.min(dp[z - 1][q - 1], dp[z - 1][q]), dp[z][q - 1]) + 1;
                        answer = Math.max(answer, dp[z][q]);
                    }
                }
            }

            return answer * answer;
        }
    }
}
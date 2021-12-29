function solution(board)
{
    let answer = 0;
    let dp = [];

    if(board.length === 1 && board[0].length === 1){
        return board[0][0] === 1 ? 1 : 0;
    }
    else {
        for (let i = 0; i < board.length; i++) {
            dp[i] = board[i];
        }
        for(let j = 1 ; j < dp.length ; j++){
            for(let k = 1 ; k < dp[j].length ; k++){
                if(board[j][k] === 1){
                    dp[j][k] = Math.min(dp[j-1][k-1], dp[j][k-1], dp[j-1][k])+1;
                    answer = Math.max(dp[j][k], answer);
                }
            }
        }
    }
    return answer * answer;
}
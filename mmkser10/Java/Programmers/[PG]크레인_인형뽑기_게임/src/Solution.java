class Solution {
    public int solution(int[][] board, int[] moves) {
        int result_Array[] = new int[moves.length];
        int index = 0;
        int answer = 0;
        for(int x = 0 ; x < moves.length ; x++){
            for(int y = 0 ; y < board.length ; y++){
                if(board[y][moves[x]-1] != 0){
                    result_Array[index] = board[y][moves[x]-1];
                    board[y][moves[x]-1] = 0;
                    break;
                }
            }

            for(int y = 1 ; y < result_Array.length ; y++){
                if(result_Array[y] != 0){
                    if(result_Array[y] == result_Array[y-1]){
                        result_Array[y] = 0;
                        result_Array[y-1] = 0;
                        answer += 2;
                        index = y - 2;
                    }
                }
            }
            index++;
        }
        return answer;
    }
}
class Solution {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{0,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
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
                    /*
            for(int y = 0 ; y < board.length ; y++){
                System.out.print(result_Array[y]);
            }
            System.out.println("\t" + index);
            if(result_Array[index] != 0) {
                if (x >= 1 && index >= 1) {
                    if (result_Array[index] == result_Array[index - 1]) {
                        result_Array[index] = 0;
                        result_Array[index - 1] = 0;
                        index--;
                        answer++;
                    } else
                        index++;
                } else
                    index++;
            }
                }
            }*/
        }
    }
}
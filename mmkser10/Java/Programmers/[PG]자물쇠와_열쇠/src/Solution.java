class Solution {
    public int[][] counterClockWise(int[][] _memory){
        int M = _memory.length;
        int[][] memory = new int[M][M];
        for(int x = 0 ; x < M ; x++){
            for(int y = 0 ; y < M ; y++){
                memory[x][y] = _memory[y][M-x-1];
            }
        }
        return memory;
    }

    public boolean isValid(int[][] _memory, int point){
        for(int x = point ; x < point*2 ; x++){
            for(int y = point ; y < point*2 ; y++){
                if(_memory[x][y] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean solution(int[][] key, int[][] lock) {
        int M = key.length;
        int N = lock.length;
        boolean answer = false;
        int[][][] memory = new int[4][M][M];
        int[][] lockThird = new int[3*N][3*N];
        for(int x = N ; x < N*2 ; x++){
            for(int y = N ; y < N*2 ; y++){
                lockThird[x][y] = lock[x-N][y-N];
            }
        }
        memory[0] = counterClockWise(key);
        memory[1] = counterClockWise(memory[0]);
        memory[2] = counterClockWise(memory[1]);
        memory[3] = counterClockWise(memory[2]);
        for(int x = 0 ; x < 4 ; x++){
            for(int y = 0 ; y <= 2*N ; y++){
                for(int z = 0 ; z <= 2*N ; z++){
                    for(int i = 0 ; i < M ; i++){
                        for(int j = 0 ; j < M ; j++){
                            lockThird[y+i][z+j] ^= memory[x][i][j];
                        }
                    }
                    if(isValid(lockThird, N))   return true;
                    for(int i = 0 ; i < M ; i++){
                        for(int j = 0 ; j < M ; j++){
                            lockThird[y+i][z+j] ^= memory[x][i][j];
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] key = new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        Solution a = new Solution();
        System.out.println(a.solution(key, lock));
    }
}
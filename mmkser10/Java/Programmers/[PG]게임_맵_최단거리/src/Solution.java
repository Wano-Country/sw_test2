import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class Location{
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;
        int[][] check = new int[N][M];
        for(int x = 0 ; x < N ; x++){
            for(int y = 0 ; y < M ; y++){
                check[x][y] = 0;
            }
        }

        Queue<Location> queue = new LinkedList<>();
        Location start = new Location(0, 0);
        check[0][0] = 1;

        int[] index_X = {-1, 0, 1, 0};
        int[] index_Y = {0, 1, 0, -1};

        queue.add(start);
        while(!queue.isEmpty()){
            Location now = queue.poll();

            for(int x = 0 ; x < 4 ; x++){
                int next_X = now.x + index_X[x];
                int next_Y = now.y + index_Y[x];

                if(next_X < 0 || next_Y < 0 || next_X >= N || next_Y >= M)
                    continue;
                if(maps[next_X][next_Y] != 1 || check[next_X][next_Y] > 0)
                    continue;

                queue.add(new Location(next_X, next_Y));
                check[next_X][next_Y] = check[now.x][now.y]+1;
            }
        }
        return check[N-1][M-1] == 0 ? -1 : check[N-1][M-1];
    }
}
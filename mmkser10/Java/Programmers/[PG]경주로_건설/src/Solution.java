import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class Location{
        int x;
        int y;
        int direction;

        public Location(int x, int y, int direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
    }

    public int solution(int[][] board) {
        int N = board.length;
        int min = Integer.MAX_VALUE;
        int[][] money = new int[N][N];
        int[] xArray = new int[]{-1, 0, 0, 1};
        int[] yArray = new int[]{0, -1, 1, 0};
        Queue<Location> queue = new LinkedList<>();
        money[0][0] = 100;


        queue.add(new Location(0, 0, -1));

        while(!queue.isEmpty()){
            Location now = queue.poll();
            if(now.x == N - 1 && now.y == N - 1) {
                min = Math.min(min, money[N-1][N-1]);
                continue;
            }

            for(int x = 0 ; x < 4 ; x++){
                int nextX = now.x+xArray[x];
                int nextY = now.y+yArray[x];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N || board[nextX][nextY] == 1)
                    continue;

                int add = money[now.x][now.y];
                if(now.direction == -1)
                    add=100;
                else if (now.direction == x)
                    add+=100;
                else if(now.direction != x)
                    add+=600;

                if(money[nextX][nextY] == 0 || money[nextX][nextY] >= add){
                    money[nextX][nextY] = add;
                    queue.add(new Location(nextX, nextY, x));
                }

                if(nextX == N-1 && nextY == N-1){
                    System.out.println("ACTIVATE : " + now.x + "\t" + now.y);
                }
            }
        }
        int answer = min;
        System.out.println(answer);
        return answer;
    }
}
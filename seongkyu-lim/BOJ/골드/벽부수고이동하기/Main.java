package 벽부수고이동하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    /*

    그래프 탐색 / BFS

    - 한번은 벽을 부술 수 있다.

    */

    static class Place {
        int y;
        int x;
        int dis;
        int drill;

        public Place(int y, int x, int dis, int drill){
            this.y = y;
            this.x = x;
            this.dis = dis;
            this.drill = drill;
        }
    }

    static int N,M,ans;
    static int[][] arr, visit;

    static int[] dy = {1,-1,0,0};
    static int[] dx = {0,0,-1,1};
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visit = new int[N][M];

        for(int i=0; i<N; i++){

            String row = bf.readLine();

            for(int j=0; j<M; j++){
                arr[i][j] = Character.getNumericValue(row.charAt(j));
                visit[i][j] = Integer.MAX_VALUE;
            }
        }        
        ans = Integer.MAX_VALUE;
        bfs(0,0);

        if(ans == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(ans);
    
    }

    static void bfs(int y, int x){

        Queue<Place> q = new LinkedList<>();
        
        q.add(new Place(y,x,1,0));
        visit[y][x] = 0;

        while(!q.isEmpty()){
            Place p = q.poll();

            if(p.y == N-1 && p.x == M-1){
                ans = p.dis;
                break;
            }
            for (int i = 0; i<4; i++){
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];

                if (ny<0 || nx< 0 || ny>=N || nx>=M) continue;

                if (visit[ny][nx] <= p.drill) continue;

                if(arr[ny][nx] == 0) {
                    visit[ny][nx] = p.drill;
                    q.add(new Place(ny,nx,p.dis+1, p.drill));
                }
                else { 
                    if(p.drill == 0){
                        visit[ny][nx] = p.drill +1;
                        q.add(new Place(ny, nx, p.dis+1, p.drill+1));
                    }
                }
            }
        }




    }
    
}

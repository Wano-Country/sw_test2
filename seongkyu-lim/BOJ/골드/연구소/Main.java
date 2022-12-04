package 연구소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m, max;
    static int[][] arr;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public static void main(String[] args) throws IOException{
        input();
        solve(0);
        System.out.println(max);
    }

    private static void solve(int wall) {

        if (wall == 3){
            max = Math.max(count(), max);
            return;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] ==0){
                    arr[i][j] = 1;
                    solve(wall+1);
                    arr[i][j] = 0;
                }
            }
        }

    }

    private static int count() {

        int[][] virus_map = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                virus_map[i][j] = arr[i][j];
            }
        }

        virus_map = bfs(virus_map);
        
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(virus_map[i][j]==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static int[][] bfs(int[][] virus_map) {
        Queue<virus> que = new LinkedList<virus>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (virus_map[i][j] == 2){
                    que.add(new virus(i,j));
                }
            }
        }

        while (!que.isEmpty()){
            virus v = que.remove();

            for(int i=0; i<4; i++){
                int nx = v.x + dir[i][0];
                int ny = v.y + dir[i][1];

                if(nx<0 || ny < 0 || nx>=n || ny>=m) continue;
                if(virus_map[nx][ny] == 1 || virus_map[nx][ny] ==2) continue;
                virus_map[nx][ny] = 2;
                que.add(new virus(nx, ny));
            }
        }
        return virus_map;
    }

    static class virus{
        int x,y;

        virus(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private static void input() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for(int i=0; i<n; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        max = Integer.MIN_VALUE;
    }
}

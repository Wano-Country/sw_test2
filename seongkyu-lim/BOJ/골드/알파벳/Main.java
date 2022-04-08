package 알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int r,c;
    static int[][] arr;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static boolean[] visited;
    static int max;
    public static void main(String[] args) throws IOException{
        input();
        solve();
    }

    private static void solve() {

        dfs(0,0, 0);

        System.out.println(max);


        
    }

    private static void dfs(int x, int y, int cnt) {
        if(visited[arr[x][y]]){
            max = Math.max(max, cnt);
            return;
        }
        visited[arr[x][y]] = true;
        for(int k=0; k<4; k++){
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if(nx<0 || ny<0 || nx>=r || ny>=c) continue;
            dfs(nx, ny, cnt+1);
        }

        visited[arr[x][y]] = false;
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new int[r][c];
        for(int i=0; i<r; i++){
            String row = br.readLine();
            for(int j=0; j<c; j++){
                arr[i][j] = row.charAt(j) - 'A';
            }
        }

        visited = new boolean[26];

        max = Integer.MIN_VALUE;

    }
    
}

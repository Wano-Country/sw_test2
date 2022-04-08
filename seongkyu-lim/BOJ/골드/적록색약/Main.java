package 적록색약;


import java.util.Scanner;

public class Main {
    static int n;
    static char[][] arr;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static boolean[][] visited;

    public static void main(String[] args){
        input();
        solve();
    }

    private static void solve() {
        visited = new boolean[n][n];

        int answer1 = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]) {
                    answer1++;
                    dfs_1(i,j,arr[i][j]);
                }
            }
        }

        visited = new boolean[n][n];

        int answer2 = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]) {
                    answer2++;
                    dfs_2(i,j,arr[i][j]);
                }
            }
        }

        System.out.println(answer1+" "+answer2);


    }

    private static void dfs_2(int x, int y, char color) {
        visited[x][y]=true;
        for(int k=0; k<4; k++){
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if(nx<0 || ny<0 || nx >=n || ny >= n) continue;
            if(color =='R' || color =='G'){
                if(arr[nx][ny]=='B') continue;
            }else if(color=='B'){
                if(arr[nx][ny] =='R' || arr[nx][ny] =='G') continue;
            }
            if(visited[nx][ny]) continue;
            dfs_2(nx, ny, color);
        }
    }

    static void dfs_1(int x, int y, char color) {
        visited[x][y] = true;
        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if (arr[nx][ny] != color) continue;
            if (visited[nx][ny]) continue;
            dfs_1(nx, ny, color);
        }
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new char[n][n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next().toCharArray();
        }
    }
    
}

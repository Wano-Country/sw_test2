import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //1,2번 케이스에 대해서 정면으로 가지 않는 경우
우
    static boolean[][] visited;
    static int[][] arr;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int n,m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==9) search(i,j);
            }
        }

        int answer = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(visited[i][j]==true) answer += 1;
            }
        }
        System.out.println(answer);


    }

    private static void search(int x, int y) {
        for(int i=0; i<4; i++){
            while(true){
                if(x>=n || y>=m || x<0 || y<0) break;

                visited[x][y] = true;

                if(arr[x+dir[i][0]][y+dir[i][1]] == 0){
                    visited[x+dir[i][0]][y+dir[i][1]] =true;
                    x += dir[i][0];
                    y += dir[i][1];
                }else if(arr[x+dir[i][0]][y+dir[i][1]] ==1){
                    visited[x+dir[i][0]][y+dir[i][1]] =true;
                    break;
                }else if(arr[x+dir[i][0]][y+dir[i][1]] ==2){
                    visited[x+dir[i][0]][y+dir[i][1]] =true;
                    break;
                }else if(arr[x+dir[i][0]][y+dir[i][1]] ==3){
                    visited[x+dir[i][0]][y+dir[i][1]] =true;
                    x += dir[i][0];
                    y += dir[i][1];
                }else{
                    visited[x+dir[i][0]][y+dir[i][1]] =true;
                    x += dir[i][0];
                    y += dir[i][1];
                }   
            }
        }
    }
}
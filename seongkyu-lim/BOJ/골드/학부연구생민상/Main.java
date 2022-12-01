import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // 이미 방문한 곳은 또 방문하지 않기면
    // 재귀를 통해 배열을 다루면 메모리 초과 가능성 존재!

    static boolean[][] visited;
    static int[][] arr;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int[][][] visitedDir; 
    static int n,m;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        arr = new int[n][m];
        visited = new boolean[n][m];
        visitedDir = new int[n][m][4];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==9) {
                    for(int k=0; k<4; k++){
                        search(i, j, k);
                    }
                }
            }
        }

        // int answer = 0;

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(visited[i][j]==true) answer += 1;
        //     }
        // }
        // System.out.println(Arrays.deepToString(visited));
        System.out.println(answer);


    }

    private static void search(int x, int y, int i) {
            while(true){

                if(x>=n || y>=m || x<0 || y<0) break;

                if(visited[x][y]== false){
                    visited[x][y] = true;
                    answer += 1;
                }


                if(arr[x][y] == 0){
                    if(visitedDir[x][y][i]==1) break;
                    visitedDir[x][y][i]=1;
                    x += dir[i][0];
                    y += dir[i][1];
                }else if(arr[x][y] ==1){
                    if(i==0 || i==2){
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x += dir[i][0];
                        y += dir[i][1];
                    }else{
                        break;
                    }
                }else if(arr[x][y] ==2){
                    if(i==1 || i==3){
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x += dir[i][0];
                        y += dir[i][1];
                    }else{
                        break;
                    }
                }else if(arr[x][y] ==3){
                    if(i==0) {
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x=x+dir[3][0];
                        y=y+dir[3][1];
                        i=3;
                    }
                    else if(i==3) {
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x=x+dir[0][0]; 
                        y=y+dir[0][1]; 
                        i=0;
                    }
                    else if(i==1) {
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x=x+dir[2][0]; 
                        y=y+dir[2][1];
                        i=2;
                    }
                    else if(i==2) {
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x=x+dir[1][0]; 
                        y=y+dir[1][1]; 
                        i=1;
                    }
                 }else{
                    if(i==0) {
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x=x+dir[1][0]; 
                        y=y+dir[1][1]; 
                        i=1;
                    }
                    else if(i==1) {
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x=x+dir[0][0]; 
                        y=y+dir[0][1]; 
                        i=0;
                    }
                    else if(i==2) {
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x=x+dir[3][0]; 
                        y=y+dir[3][1]; 
                        i=3;
                    }
                    else if(i==3) {
                        if(visitedDir[x][y][i]==1) break;
                        visitedDir[x][y][i]=1;
                        x=x+dir[2][0]; 
                        y=y+dir[2][1]; 
                        i=2;
                    }
                }   
            }
    }
}
package 섬의개수;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int w,h;
    static int[][] land;
    static boolean[][] visited;
    static int[][] direction = {{0,1},{1,0},{0,-1},{-1,0},{-1,-1},{-1,1},{1,1},{1,-1}};

    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        while(true){
            int end = input();
            if(end == 0) break;
            solve();
        }
    }

    private static void solve() {

        int answer = 0;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(land[i][j]==1 && visited[i][j]==false){
                    dfs(i,j);
                    answer +=1;

                }
            }
        }
        System.out.println(answer);
    }

    private static void dfs(int i, int j) {

        visited[i][j] = true;
        for(int k=0; k<8; k++){
            int nx = i + direction[k][0];
            int ny = j + direction[k][1];
            if( nx<0 || ny <0 || nx >=h || ny>=w) continue;
            if(land[nx][ny] == 0) continue;
            if(visited[nx][ny]) continue;
            dfs(nx, ny);
        }
    }

    private static int input() throws IOException {
        /*

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());

        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        */


        /*
        land = new int[h][w];
        visited = new boolean[h][w];

        for(int i=0; i<h; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for(int j=0; j<w; j++){
                land[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        */
        w = scan.nextInt();
        h = scan.nextInt();
        if(w==0 && h==0) return 0;
        land = new int[h][w];
        for (int i = 0; i < h; i++) for (int j = 0; j < w; j++) land[i][j] = scan.nextInt();
        visited = new boolean[h][w];
        
        return 1;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

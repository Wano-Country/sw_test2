package 테트로미노;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max = Integer.MIN_VALUE;
	static int[][] arr;
	static boolean[][] visited;
	static int n;
	static int m;

    static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        input();
        for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				visited[i][j] = true;
				solve(i,j,arr[i][j],1);
				visited[i][j] = false;
			}
		}
        System.out.println(max);
    }

    static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		} 
    }

    static void solve(int row, int col, int sum, int count) {

		if(count == 4) {
			max = Math.max(max, sum);
			return;
		}

		for(int i = 0; i < 4; i++) {
			int curRow = row + dx[i];
			int curCol = col + dy[i];

			if(curRow < 0 || curRow >= n || curCol < 0 || curCol >= m) {
				continue;
			}

			if(!visited[curRow][curCol]) {
				if(count == 2) {
					visited[curRow][curCol] = true;
					solve(row, col, sum + arr[curRow][curCol], count + 1);
					visited[curRow][curCol] = false;
				}

				visited[curRow][curCol] = true;
				solve(curRow, curCol, sum + arr[curRow][curCol], count + 1);
				visited[curRow][curCol] = false;
			}
		}
	}
    
}

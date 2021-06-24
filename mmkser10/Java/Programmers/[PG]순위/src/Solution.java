import java.util.Arrays;

class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] graph = new boolean[n][n];
        int answer = 0;

        for(int i = 0 ; i < results.length ; i++){
            graph[results[i][0]-1][results[i][1]-1] = true;
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                for(int k = 0 ; k < n ; k++){
                    if(graph[j][i] && graph[i][k]) {
                        graph[j][k]=true;
                    }
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                if(graph[i][j] || graph[j][i])  count++;
            }
            if(count == n-1)    answer++;
        }
        return answer;
    }
}
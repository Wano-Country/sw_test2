import java.util.*;

class Solution {
    class Floyd_Warshall {
        private int n;
        private int[][] graph;

        public Floyd_Warshall(int n) {
            this.n = n;
            this.graph = new int[n + 1][n + 1];
        }

        public void put(int start, int end, int weight) {
            graph[start][end] = weight;
            graph[end][start] = weight;
        }

        public int returnWeight(int start, int end){
            return graph[start][end];
        }

        public void init(){
            for (int x = 0; x <= n; x++) {
                for (int y = 0; y <= n; y++) {
                    if (x != y)
                        graph[x][y] = 2000000;
                }
            }
        }

        public void searchFloyd_Warshall() {
            for (int x = 1; x <= n; x++) {
                for (int y = 1; y <= n; y++) {
                    if (x != y) {
                        for (int k = 1; k <= n; k++) {
                            if (y != k && x != k) {
                                if (graph[y][k] > graph[y][x] + graph[x][k]) {
                                    graph[y][k] = graph[y][x] + graph[x][k];
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    public int solution(int n, int s, int a, int b, int[][] fares) {
        Floyd_Warshall floyd_warshall = new Floyd_Warshall(n);
        int answer = 2000000;

        floyd_warshall.init();
        for(int x = 0 ; x < fares.length ; x++){
            floyd_warshall.put(fares[x][0], fares[x][1], fares[x][2]);
        }
        floyd_warshall.searchFloyd_Warshall();

        for(int x = 1 ; x < n+1 ; x++){
            answer = Math.min(answer, floyd_warshall.returnWeight(s, x) + floyd_warshall.returnWeight(x, a) + floyd_warshall.returnWeight(x, b));
        }
        return answer;
    }
}
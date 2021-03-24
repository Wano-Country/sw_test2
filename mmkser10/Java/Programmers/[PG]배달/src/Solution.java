import java.util.Arrays;

class Dij{
    private int n;
    private int[][] graph;
    private int K;

    public Dij(int n, int K){
        this.n = n;
        this.graph = new int[n][n];
        this.K = K;
    }

    public void put(int start, int end, int weight){
        if(graph[start - 1][end - 1] > weight || graph[start -1 ][end - 1] == 0) {
            graph[start - 1][end - 1] = weight;
        }
    }

    public int findNode(){
        int[] distance = new int[n];
        boolean[] check = new boolean[n];
        int answer = 0;

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

        for(int x = 0 ; x < n-1 ; x++){
            int min = Integer.MAX_VALUE;
            int index = -1;

            for(int y = 0 ; y < n ; y++){
                if(!check[y] && min > distance[y]){
                    index = y;
                    min = distance[y];
                }
            }

            for(int y = 0 ; y < n ; y++){
                if(
                        !check[y]
                                && graph[index][y] != 0
                                && distance[index] != Integer.MAX_VALUE
                                && distance[index] + graph[index][y] < distance[y])
                {
                    distance[y] = distance[index] + graph[index][y];
                }
            }
            check[index] = true;
        }

        for(int z = 0 ; z < n ; z++){
            if(distance[z] <= K){
                answer++;
            }
        }
        return answer;
    }
}

class Solution {
    public int solution(int N, int[][] road, int K) {
        Dij dij = new Dij(N, K);
        for(int x = 0 ; x < road.length ; x++){
            dij.put(road[x][0], road[x][1], road[x][2]);
        }
        int answer = dij.findNode();

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
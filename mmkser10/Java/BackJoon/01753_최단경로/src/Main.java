import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Dijkstra {
    private int n;
    private int[][] graph;

    public Dijkstra(int n){
        this.n = n;
        this.graph = new int[n][n];
    }

    public void put(int start, int end, int weight){
        graph[start-1][end-1] = weight;
    }

    public void findNode(int start){
        int[] distance = new int[n];
        boolean[] check = new boolean[n];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start-1] = 0;

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
                        && distance[index] + graph[index][y] < distance[y]
                ){
                    distance[y] = distance[index] + graph[index][y];
                }
            }
            check[index] = true;
        }

        for(int z = 0 ; z < n ; z++){
            System.out.println(distance[z] == Integer.MAX_VALUE ? "INF" : distance[z]);
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        Dijkstra dijkstra = new Dijkstra(V);
        int start_Node = Integer.parseInt(br.readLine());

        for(int x = 0 ; x < E ; x++){
            st = new StringTokenizer(br.readLine());
            dijkstra.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        dijkstra.findNode(start_Node);
    }
}

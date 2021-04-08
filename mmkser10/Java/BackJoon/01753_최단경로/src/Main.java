import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Dijkstra_PQ {
    private int n;
    private List<Edge>[] graph;

    private class Edge implements Comparable<Edge> {
        int v, weight;

        public Edge(int v, int weight) {
            this.v = v;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            // TODO Auto-generated method stub
            return Integer.compare(this.weight, o.weight);
        }

        @Override
        public String toString() {
            return weight + "";
        }
    }

    public Dijkstra_PQ(int n) {
        this.n = n;
        graph = new ArrayList[n];
        for (int x = 0; x < n; x++) {
            graph[x] = new ArrayList<>();
        }
    }

    public void put(int start, int end, int weight) {
        for (int x = 0; x < n; x++) {
            graph[start - 1].add(new Edge(end - 1, weight));
        }
    }

    public void findNode(int start, int end) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] check = new boolean[n];
        Edge[] distance = new Edge[n];

        for (int x = 0; x < n; x++) {
            if (x == start - 1) {
                distance[x] = new Edge(x, 0);
            } else {
                distance[x] = new Edge(x, Integer.MAX_VALUE);
            }
            pq.add(distance[x]);
        }
        while (!pq.isEmpty()) {
            Edge edge = pq.poll();

            for (Edge next : graph[edge.v]) {
                if (!check[next.v] && distance[next.v].weight > distance[edge.v].weight + next.weight) {
                    distance[next.v].weight = distance[edge.v].weight + next.weight;
                    pq.remove(distance[next.v]);
                    pq.add(distance[next.v]);
                }
            }
            check[edge.v] = true;
        }
        for(int y = 0 ; y < n ; y++){
            if(distance[y].equals(Integer.MAX_VALUE)){
                System.out.println("INF");
            }
            else
                System.out.println(distance[y]);
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

        Dijkstra_PQ dijkstra = new Dijkstra_PQ(V);
        int start_Node = Integer.parseInt(br.readLine());

        for(int x = 0 ; x < E ; x++){
            st = new StringTokenizer(br.readLine());
            dijkstra.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

    }
}

package 최소비용구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    /*

    유향 그래프, 웨이트 존재.

    다익스트라로 최소 비용을 구하자.

    */

    static List<List<Node>> graph = new ArrayList<List<Node>>();
    static int V;
    static int E;
    static final long INF = 10_000_000_000L;

    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        V = Integer.parseInt(bf.readLine());
        E = Integer.parseInt(bf.readLine());

        for (int i=0; i<=V; i++){
            graph.add(new ArrayList<Node>());
        }
        
        for(int i=0; i<E; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Node(end, weight));
        }

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int startPoint = Integer.parseInt(st.nextToken());
        int endPoint = Integer.parseInt(st.nextToken());

        System.out.println(dijkstra(startPoint,endPoint));

    }

    static class Node implements Comparable<Node>{
        private int idx;
        private int weight;
        
        public Node(int idx, int weight) {
            this.idx = idx;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }
    static long dijkstra(int startPoint, int endPoint) {

        long[] distance = new long[V+1];
        int[] prev = new int[V+1];
        boolean[] visited = new boolean[V+1];


        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        Arrays.fill(distance, INF);
        
        distance[startPoint] = 0;
        pq.add(new Node(startPoint,0));
        
        while(!pq.isEmpty()) {
            int cur = pq.poll().idx;
            
            if(visited[cur]) continue;
            visited[cur] = true;
            
            for (Node node : graph.get(cur)) {
                if (distance[node.idx] > distance[cur] + node.weight) {
                    distance[node.idx] = distance[cur] + node.weight;
                    prev[node.idx] = cur;
                    pq.add(new Node(node.idx, Long.valueOf(distance[node.idx]).intValue()));
                }
            }
        }
        return distance[endPoint];
    }
}

package 최단경로;

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
    dijkstra -> 방향 그래프, 간선 weight 존재.
    그래프 탐색.

    *서로다른 두 정점사이에 여러개의 간선 존재 가능. -> 무시. 
    */
    /*
    배열로 그래프 구현했더니 메모리초과 남. -> 인접리스트로 구현해보자.

    인접리스트, 우선순위큐로 구현 -> 해결.
    */

    static List<List<Node>> graph = new ArrayList<List<Node>>();
    static int V;
    static int E;
    static int startPoint;

    static final int INF = 3_000_000;

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        startPoint = Integer.parseInt(bf.readLine());



        for (int i=0; i<=V; i++){
            graph.add(new ArrayList<Node>());
        }

        for (int i=0; i<E; i++){

            st = new StringTokenizer(bf.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            /*
            int cnt = 0;

            for(int j=0; j<graph.get(start).size(); j++){

                if(graph.get(start).get(j).idx== end){
                    if(graph.get(start).get(j).weight> weight){
                        //node 삭제 및 새 노드 추가.
                        graph.get(start).remove(j);
                        graph.get(start).add(new Node(end, weight));
                    }
                }
                else{
                    cnt +=1;
                }
            }
            if(cnt == graph.get(start).size()){
                graph.get(start).add(new Node(end, weight));
            }
            */
            graph.get(start).add(new Node(end, weight));

        }

        int[] answer = dijkstra(startPoint);

        for(int i=1; i<answer.length; i++){
            if(answer[i] == 3_000_000){
                System.out.println("INF");
            }else{
                System.out.println(answer[i]);
            }
        }
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
    
    static int[] dijkstra(int startPoint) {

        int[] distance = new int[V+1];
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
                    pq.add(new Node(node.idx, distance[node.idx]));
                }
            }
        }
        return distance;
    }
}

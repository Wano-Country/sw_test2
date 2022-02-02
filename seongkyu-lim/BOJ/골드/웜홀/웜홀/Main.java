package 웜홀;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    /*
    그래프 이론, 
    벨만-포드 알고리즘
        - 노드간 최단거리를 구하는 알고리즘.
        - 다익스트라 알고리즘과 달리 간선의 weight가 음수여도 적용가능.

    인접리스트 -> list로, node로 구현.
    */

    static int N, M, W;
    static int[] dist;
    static ArrayList<ArrayList<Node>> a;
    static final int INF = 987654321;

    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        int TC = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (TC-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
 
            dist = new int[N + 1];
            a = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                a.add(new ArrayList<>());
            }
 
            for (int i = 0; i < M + W; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());
 
                if (i < M) { // 도로는 양방향 그래프
                    a.get(start).add(new Node(end, weight));
                    a.get(end).add(new Node(start, weight));
                } else { // 웜홀은 단방향 그래프
                    a.get(start).add(new Node(end, -weight));
                }
            }
 
            boolean isMinusCycle = false;
            for (int i = 1; i <= N; i++) {
                if (bellmanFord(i)) {
                    isMinusCycle = true;
                    sb.append("YES\n");
                    break;
                }
            }
 
            if (!isMinusCycle) {
                sb.append("NO\n");
            }
        }
 
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();




    }

    // 벨만포드 알고리즘
    public static boolean bellmanFord(int start) {
        Arrays.fill(dist, INF);
        dist[start] = 0; // 시작점은 0으로 초기화.
        boolean update = false;
        
        // (정점의 개수 - 1)번 동안 최단거리 초기화 작업을 반복함.
        for (int i = 1; i < N; i++) {
            update = false;
            
            // 최단거리 초기화.
            for (int j = 1; j <= N; j++) {
                for (Node node : a.get(j)) {
                    if (dist[j] != INF && dist[node.end] > dist[j] + node.weight) {
                        dist[node.end] = dist[j] + node.weight;
                        update = true;
                    }
                }
            }
            
            // 더 이상 최단거리 초기화가 일어나지 않았을 경우 반복문을 종료.
            if (!update) {
                break;
            }
        }
        
        // (정점의 개수 - 1)번까지 계속 업데이트가 발생했을 경우
        // (정점의 개수)번도 업데이트 발생하면 음수 사이클이 일어난 것을 의미함.
        if (update) {
            for (int i = 1; i <= N; i++) {
                for (Node node : a.get(i)) {
                    if (dist[i] != INF && dist[node.end] > dist[i] + node.weight) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static class Node {
        int end;
        int weight;
     
        Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }
    }

}
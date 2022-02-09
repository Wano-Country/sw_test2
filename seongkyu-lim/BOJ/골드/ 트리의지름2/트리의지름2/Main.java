package 트리의지름2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    /*
    leaf node사이에 dfs로 가장 큰 값을 가지는 경로를 구한다.

    */

    static ArrayList<Node>[] list;
    static boolean[] visited;
    static int max = 0;
    static int node=1;

    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        list = new ArrayList[n+1];
        for( int i=1; i<=n; i++){
            list[i] = new ArrayList<Node>();
        }

        for(int i=0; i<n-1; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int parentNode = Integer.parseInt(st.nextToken());
            int childNode = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            list[childNode].add(new Node(parentNode, cost));
            list[parentNode].add(new Node(childNode, cost));
        }

        visited = new boolean[n+1];
        dfs(1,0);

        visited = new boolean[n+1];
        dfs(node,0);
        System.out.println(max);

    }

    public static void dfs(int x, int len) {
        if(len > max){
            max = len;
            node = x;
        }
        visited[x] = true;

        for(int i=0; i<list[x].size(); i++){
            Node n = list[x].get(i);
            if(visited[n.e] == false){
                dfs(n.e, n.cost + len);
                visited[n.e]=true;
            }
        }
    }

    public static class Node{
        int e;
        int cost;

        public Node(int e, int cost){
            this.e = e;
            this.cost = cost;
        }
    }
    
}

package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int v,e,start;
    static ArrayList<ArrayList<Integer>> adj;

    public static void main(String[] args) throws IOException{

        input();

    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        adj = new ArrayList<>();

        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<e; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            int v1 = Integer.parseInt(st2.nextToken());
            int v2 = Integer.parseInt(st2.nextToken());
            
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
            
        }





    }
    
}

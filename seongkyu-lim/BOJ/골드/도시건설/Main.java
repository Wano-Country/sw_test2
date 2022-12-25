package 도시건설;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    /*
     * 모든 건물 연결되도록 최소한의 도로 만들기.
     * MST(최소신장트리) - Spanning Tree 중에서 사용된 간선들의 가중치 합이 최소인 트리
     * 
     * 구현 방법 : 크루스칼 알고리즘.
     * 1. 간선의 비용이 작은 순서대로 하나씩 확인
     * 2. 사이클이 발생하지 않는다면 해당 간선을 추가
     * 
     * 
     * 
     * Point 1. 간선의 weight로 정렬을 위해 Comparable 구현.
     * Point 2. 사이클 여부를 화인하기위해 유니온파인드 자료구조 사용.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[n];

        class Node implements Comparable<Node>{
            int a;
            int b;
            int weight;

            Node(int a, int b, int weight){
                this.a = a;
                this.b = b;
                this.weight = weight;
            }

            @Override
            public int compareTo(Node other){
                if (this.weight < other.weight){
                    return -1;
                }
                return 1;
            }
        }

        ArrayList<Node> arrayList = new ArrayList<>();

        long badestTotalWeight = 0; 
        for(int i=0; i<m ;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            int weight = Integer.parseInt(st.nextToken());
            arrayList.add(new Node(a, b, weight));
            badestTotalWeight += weight;
        }

        Collections.sort(arrayList);

        for(int i=0; i<n; i++){
            parent[i]= i;
        }
        
        int cnt =0;
        long totalWeight =0;

        for(int i=0; i<arrayList.size(); i++){
            int a = arrayList.get(i).a;
            int b = arrayList.get(i).b;
            if (findParent(a) != findParent(b)){
                unionParent(a, b);
                totalWeight += arrayList.get(i).weight;
                cnt+=1;
            }
        }

        if (cnt != n-1) System.out.println(-1);
        else System.out.println(badestTotalWeight - totalWeight);
        
    }

    // 유니온 파인드 알고리즘 - 사이클이 있는지 확인하기위해 사용.

    public static int[] parent = new int[100001];

    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a <b) parent[b] = a;
        else parent[a] = b;
    }

    public static int findParent(int x) {
        if (x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }

    
    
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFS{
    int n;
    boolean[] check;
    int[] weight;
    Queue<Integer> queue;
    ArrayList<ArrayList<Integer>> graph;

    public BFS(int n) {
        this.n = n;
        this.check = new boolean[n+1];
        this.weight = new int[n+1];
        this.queue = new LinkedList<>();
        this.graph = new ArrayList<>();

        for(int x = 0 ; x < n+1 ; x++){
            this.graph.add(new ArrayList<Integer>());
        }
    }

    public void put(int start, int end){
        graph.get(start).add(end);
        graph.get(end).add(start);
    }

    public void search(){
        check[1] = true;
        queue.offer(1);

        while(!queue.isEmpty()){
            int index = queue.poll();
            for(int next_index : graph.get(index)){
                if(!check[next_index]){
                    queue.offer(next_index);
                    check[next_index] = true;
                    weight[next_index] = weight[index]+1;
                }
            }
        }
    }

    public int findMaximum(){
        int max = 0;
        int counter = 0;
        for(int x = 0 ; x < n+1 ; x++){
            if(weight[x] > max){
                max = weight[x];
                counter = 1;
            } else if (weight[x] == max) {
                counter++;
            }
        }
        return counter;
    }
}

class Solution {

    public int solution(int n, int[][] edge) {
        BFS bfs = new BFS(n);
        for(int x = 0 ; x < edge.length ; x++){
            bfs.put(edge[x][0], edge[x][1]);
        }

        bfs.search();
        int answer = bfs.findMaximum();
        return answer;
    }
}
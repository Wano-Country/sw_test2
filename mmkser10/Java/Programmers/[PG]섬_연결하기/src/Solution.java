import java.util.Arrays;
import java.util.Comparator;

class Solution {
    int[] parent;

    public int search(int child){
        if(parent[child] == child)
            return child;
        else
            return parent[child] = search(parent[child]);
    }

    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];

        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[2], o2[2]);
            }
        });
        for(int x = 0 ; x < n ; x++){
            parent[x] = x;
        }

        for(int x = 0 ; x < costs.length ; x++){
            int first = search(costs[x][0]);
            int second = search(costs[x][1]);
            System.out.println(first+"\t"+second);
            if(first != second){
                parent[second] = first;
                answer+=costs[x][2];
            }
        }
        return answer;
    }
}
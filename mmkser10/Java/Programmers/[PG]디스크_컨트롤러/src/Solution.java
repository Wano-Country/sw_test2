import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[][] jobs) {

        PriorityQueue<Integer[] > queue = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        for(int x = 0 ; x < jobs.length ; x++){
            for(int y = 0 ; y < jobs[x].length ; y++){
                System.out.print(jobs[x][y] + "__");
            }
            System.out.println();
        }
        int answer = 0;
        return answer;
    }
}
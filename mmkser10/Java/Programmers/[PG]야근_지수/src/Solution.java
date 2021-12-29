import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long answer = 0;

        for(int work : works){
            pq.offer(work);
        }
        for(int i = 0 ; i < n ; i++){
            int max = pq.poll();
            if(max <= 0) break;
            pq.offer(max - 1);
        }

        while(!pq.isEmpty()){
            int num = pq.poll();
            answer += Math.pow(num, 2);
        }

        return answer;
    }
}
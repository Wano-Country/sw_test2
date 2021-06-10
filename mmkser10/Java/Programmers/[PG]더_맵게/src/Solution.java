import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        for(int x = 0 ; x < scoville.length ; x++){
            pq.add(scoville[x]);
        }

        while(pq.peek() < K){
            if(pq.size() < 2){
                answer = -1;
                break;
            }
            else {
                answer++;
                int first = pq.poll();
                int second = pq.poll();
                if (first == 0 && second == 0) {
                    answer = -1;
                    break;
                } else {
                    int data = first + second * 2;
                    pq.add(data);
                }
            }
        }
        return answer;
    }
}
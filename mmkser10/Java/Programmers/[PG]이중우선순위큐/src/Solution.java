import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> queueReverse = new PriorityQueue<>((o1, o2) -> o2 - o1);
        StringTokenizer st;
        int[] answer = new int[2];

        for(int x = 0 ; x < operations.length ; x++){
            st = new StringTokenizer(operations[x]);
            String func = st.nextToken();
            int number = Integer.parseInt(st.nextToken());

            if(func.equals("D")){
                if (queue.isEmpty() && queueReverse.isEmpty()){
                    continue;
                }
                else {
                    if(number == -1){
                        int min = queue.poll();
                        queueReverse.remove(min);
                        continue;
                    }
                    else {
                        int max = queueReverse.poll();
                        queue.remove(max);
                        continue;
                    }
                }
            }
            if(func.equals("I")){
                queue.add(number);
                queueReverse.add(number);
            }
        }
        if(!queue.isEmpty() && !queueReverse.isEmpty()){
            answer[0] = queueReverse.poll();
            answer[1] = queue.poll();
        }
        return answer;
    }
}
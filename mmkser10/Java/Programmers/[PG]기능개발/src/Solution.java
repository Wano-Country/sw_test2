import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int index = 0;
        int count = 0;

        while(index != progresses.length){
            for(int x = 0 ; x < progresses.length ; x++){
                progresses[x] += speeds[x];
            }

            if(progresses[index]>=100){
                while(progresses[index]>= 100){
                    index++;
                    count++;
                    if(index == progresses.length){
                        break;
                    }
                }
                queue.add(count);
                count = 0;
            }
        }

        int size = queue.size();
        int[] answer = new int[size];
        for(int y = 0 ; y < size ; y++){
            answer[y] = queue.poll();
        }

        return answer;
    }
}
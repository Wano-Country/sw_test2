import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 1;
        for(int x = 0 ; x < progresses.length ; x++){
            int data = progresses[x];
            double remain = 100 - data;
            day = (int) Math.ceil(remain/(double)speeds[x]*day);
            if()

        }
        int[] answer = {};
        return answer;
    }
}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(int[] priorities, int location) {

        Queue<Integer> prior_Queue = new LinkedList<>();
        Queue<Integer> index_Queue = new LinkedList<>();
        int index_Counter[] = new int[10];
        int counter = 0;
        int answer = 0;

        for(int x = 0 ; x < priorities.length ; x++){
            prior_Queue.add(priorities[x]);
            index_Counter[priorities[x]]++;
            index_Queue.add(x);
        }

        for(int y = index_Counter.length-1 ; y > 0; y--){
            if(index_Counter[y] != 0) {
                for(int z = 0 ; z < index_Counter[y] ; z++){
                    while(true) {
                        int data = prior_Queue.poll();
                        int index = index_Queue.poll();
                        if (data != y) {
                            prior_Queue.add(data);
                            index_Queue.add(index);
                        }
                        else {
                            counter++;
                            if (location == index) {
                                answer = counter;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}
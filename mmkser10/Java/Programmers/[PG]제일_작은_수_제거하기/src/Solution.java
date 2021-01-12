import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {

        if(arr.length == 1){
            int[] answer = new int[]{-1};
            return answer;
        }

        else {
            LinkedList<Integer> list = new LinkedList<>();
            int min = 0;
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    min = arr[i];
                }
                else {
                    if (min > arr[i]) {
                        min = arr[i];
                        index = i;
                    }
                }
                list.add(arr[i]);
            }

            list.remove(index);
            int[] answer = new int[list.size()];
            for (int k = 0; k < answer.length; k++) {
                answer[k] = list.get(k);
            }
            return answer;

        }
    }
}
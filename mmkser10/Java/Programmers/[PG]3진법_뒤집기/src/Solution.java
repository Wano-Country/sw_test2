import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n) {

        Queue<Integer> list = new LinkedList();
        int convert_number = 0;
        int answer = 0;
        int tmp = n;

        while(true){
            list.offer(tmp%3);
            tmp = tmp/3;
            if( tmp == 0 )
                break;
        }

        int loop = list.size();
        for(int i = 0 ; i < loop ; i++){
            convert_number += (loop-i)*list.poll();
        }

        String number = Integer.toString(convert_number);

        answer = Integer.parseInt(number, 3);
        return answer;
    }
}
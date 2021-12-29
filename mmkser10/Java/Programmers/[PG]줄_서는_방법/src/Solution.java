import java.util.ArrayList;

class Solution {
    public int[] solution(int n, long k) {
        ArrayList<Integer> memory = new ArrayList<>();
        long[] maximum = new long[n+1];
        int[] answer = new int[n];
        int index = 0;
        maximum[1] = 1;
        for(int x = 1 ; x <= n ; x++){
            memory.add(x);
            if(x > 1){
                maximum[x] = maximum[x-1]*x;
            }
        }
        long div = (k-1)/maximum[n-1];
        long dummy = (k-1)%maximum[n-1];


        for(int x = n-1 ; x >= 0 ; x--){
            answer[index++] = memory.get((int) div);
            memory.remove((int) div);
            if( dummy == 0 || maximum[x-1] == 0) {
                div = 0;
                dummy = 0;
            }
            else {
                div = dummy / maximum[x - 1];
                dummy = dummy % maximum[x - 1];
            }
        }
        return answer;
    }
}
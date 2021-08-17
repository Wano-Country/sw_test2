import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long left = 1;
        long right = (long) times[times.length - 1] * n;
        long mid = 0;
        long answer = Long.MAX_VALUE;

        Arrays.sort(times);
        while(left <= right){
            long amount = 0;
            mid = (left+right)/2;
            for(int i = 0 ; i < times.length ; i++){
                amount += mid/times[i];
            }
            if(amount >= n){
                answer = answer > mid ? mid : answer;
                right = mid - 1;
            }
            else
                left = mid+1;
        }

        return answer;
    }
}
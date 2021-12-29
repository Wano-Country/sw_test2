class Solution {
    public double solution(int[] arr) {

        double answer = 0;


        for(int x = 0 ; x < arr.length ; x++){
            answer += arr[x];
        }
        answer /= arr.length;
        return answer;
    }
}
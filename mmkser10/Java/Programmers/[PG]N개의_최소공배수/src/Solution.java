class Solution {
    public int gcd(int alpha, int beta){
        while(beta!=0){
            int tmp = alpha%beta;
            alpha = beta;
            beta = tmp;
        }
        return alpha;
    }
    public int solution(int[] arr) {
        int answer = 0;
        for(int x = 0 ; x < arr.length ; x++){
            if(x == 0){
                answer = arr[0];
            }
            answer = answer*arr[x]/gcd(answer, arr[x]);
        }
        return answer;
    }
}
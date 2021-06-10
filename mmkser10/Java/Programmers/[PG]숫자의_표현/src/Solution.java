class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int x = 1 ; x <= n ; x++){
            int sum = 0;
            for(int y = x ; y <= n ; y++){
                sum += y;
                if(sum >= n){
                    if(sum == n){
                        answer++;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
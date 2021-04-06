class Solution {

    public int[] memo;

    public int recursive(int n){
        if(n < 2){
            return n;
        }
        else if(memo[n] != 0){
            return memo[n];
        }
        else{
            memo[n] = (recursive(n-1)+recursive(n-2))%1000000007;
            return memo[n];
        }
    }

    public int solution(int n) {
        memo = new int[n+2];
        int answer = recursive(n+1);
        return answer;
    }
}
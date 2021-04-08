class Solution {
    public int solution(int n) {

        boolean prime[] = new boolean[n+1];
        int answer = 0;

        prime[0] = false;
        prime[1] = false;

        for(int i = 2 ; i <= n ; i++){
            prime[i] = true;
        }

        for(int x = 2 ; x*x <= n ; x++){
            if(prime[x])
                for(int y = x*x ; y <= n ; y = y + x){
                    prime[y] = false;
                }
        }
        for(int m = 2 ; m < prime.length ; m++){
            if(prime[m])
                answer++;
        }
        return answer;
    }
}
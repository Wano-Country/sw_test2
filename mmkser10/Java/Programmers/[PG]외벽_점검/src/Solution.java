class Solution {

    public void dfs(int n, int[] weak, int[] dist ,boolean[] check ,int index){
        check[index] = true;
        int[] memoryClock = new int[weak.length];
        int[] memoryCounterClock = new int[weak.length];

        for(int x = 0 ; x < weak.length ; x++){
            memoryClock[x] = weak[x]-weak[index]%n;
            memoryCounterClock[x] = (weak[index]-weak[x])%n;
        }
    }
    public int solution(int n, int[] weak, int[] dist) {
        boolean[] check = new boolean[weak.length];
        for(int x = 0 ; x < weak.length ; x++){
            dfs(n, weak, dist, check, 0);
        }
        int answer = 0;
        return answer;
    }
}
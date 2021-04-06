class Solution {

    public int result = 0;

    public void dfs(int n, int amount, int[] money, boolean[] check){
        if(n <= amount){
            if(n == amount) {
                result = (result+1)%1000000007;
            }
            return;
        }
        for(int x = 0 ; x < money.length ; x++){
            if(!check[x]) {
                if (x > 0) {
                    check[x - 1] = true;
                }
                dfs(n, amount + money[x], money, check);
                if (x > 0) {
                    check[x - 1] = false;
                }
            }
        }
    }

    public int returnResult(){
        return result;
    }
    public int solution(int n, int[] money) {
        boolean[] check = new boolean[money.length];
        dfs(n, 0, money, check);
        int answer = returnResult();
        return answer;
    }
}
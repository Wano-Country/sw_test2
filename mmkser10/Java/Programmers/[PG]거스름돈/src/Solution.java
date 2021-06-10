class Solution {
    public int result = 0;

    public void dfs(int n, int amount, int[] money, String data, int index){
        if(n <= amount){
            System.out.println(data);
            if(n == amount) {
                result++;
                result%=100000007;
            }
            return;
        }
        for(int x = index ; x < money.length ; x++)
            dfs(n,amount + money[x], money, data+" "+(amount+money[x]), index);
    }
    public int solution(int n, int[] money) {
        boolean[] check = new boolean[money.length];
        dfs(n, 0, money, "", 0);
        int answer = result;
        return answer;
    }

    public static void main(String[] args) {
        Solution x = new Solution();
        x.solution(5, new int[]{1,2,5});
    }
}
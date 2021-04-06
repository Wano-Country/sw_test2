class Solution {

    public int dfsActivate(int index, int n, int[][] computers, boolean[] check){
        check[index] = true;

        for(int x = 0 ; x < n ; x++){
            if(computers[index][x] == 1 && check[x] == false){
                dfsActivate(x, n, computers, check);
            }
        }
        return 1;
    }

    public int dfs(int n, int[][] computers){
        boolean[] check = new boolean[n];
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            if(!check[i]){
                count += dfsActivate(i, n, computers, check);
            }
        }
        return count;
    }

    public int solution(int n, int[][] computers) {

        int answer = dfs(n, computers);
        return answer;
    }
}
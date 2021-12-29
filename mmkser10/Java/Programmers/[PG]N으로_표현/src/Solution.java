class Solution {
    int answer = -1;

    public void dfs(int N, int usageN, int nextNumber, int number){
        if(usageN > 8)
            return;
        if(nextNumber == number){
            if(usageN < answer || answer == -1){
                answer = usageN;
            }
            return;
        }
        int memory = 0;
        for(int x = 0 ; x < 8 ; x++){
            memory = memory*10 + N;
            dfs(N, usageN+x+1, nextNumber + memory, number);
            dfs(N, usageN+x+1, nextNumber - memory, number);
            dfs(N, usageN+x+1, nextNumber / memory, number);
            dfs(N, usageN+x+1, nextNumber * memory, number);
        }
    }
    public int solution(int N, int number) {
        dfs(N, 0, 0, number);
        return answer;
    }
}
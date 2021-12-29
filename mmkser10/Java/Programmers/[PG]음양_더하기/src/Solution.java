class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int N = absolutes.length;

        for(int x = 0 ; x < N ; x++){
            if(signs[x])
                answer += absolutes[x];
            else
                answer -= absolutes[x];
        }
        return answer;
    }
}
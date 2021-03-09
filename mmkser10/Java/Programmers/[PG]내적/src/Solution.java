class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        if(a.length == b.length){
            for(int x = 0 ; x < a.length ; x++){
                answer += a[x]*b[x];
            }
        }
        return answer;
    }
}
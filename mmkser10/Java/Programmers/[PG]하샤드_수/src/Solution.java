class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int tmp = x;
        boolean answer = true;

        while(x != 0){
            sum = sum + x%10;
            x /= 10;
        }
        if(tmp%sum != 0)
            answer = false;
        return answer;
    }
}
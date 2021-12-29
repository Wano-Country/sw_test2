class Solution {
    public int[] solution(long n) {

        int length = Long.toString(n).length();
        int[] answer = new int[length];

        for(int i = 0 ; i < length ; i++){
            answer[i] = (int) (n % 10);
            n = n / 10;
        }

        return answer;
    }
}
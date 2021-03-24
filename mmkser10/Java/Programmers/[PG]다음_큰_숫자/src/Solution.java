class Solution {
    public int solution(int n) {
        int N = Integer.toBinaryString(1000000).length();
        int count = 0;
        int answer = 0;

        for(int x = 0 ; x < N ; x++){
            if((n >> x & 1) == 1){
                count++;
            }
        }

        for(int y = n+1 ; y <= 1000000 ; y++){
            int data = 0;
            for(int x = 0 ; x < N ; x++){
                if((y >> x & 1) == 1){
                    data++;
                }
            }
            if(data == count){
                answer = y;
                break;
            }
        }
        return answer;
    }
}
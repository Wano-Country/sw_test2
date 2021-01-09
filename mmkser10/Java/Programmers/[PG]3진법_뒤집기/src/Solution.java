class Solution {
    public static int solution(int n) {

        StringBuilder reverse_num = new StringBuilder();
        int answer = 0;
        int tmp = n;

        while(true){
            reverse_num.append(tmp%3);
            tmp = tmp/3;
            if( tmp == 0 )
                break;
        }
        answer = Integer.parseInt(reverse_num.toString(), 3);
        return answer;
    }
}
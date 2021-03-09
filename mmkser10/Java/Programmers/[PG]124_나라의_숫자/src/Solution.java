class Solution {
    public String solution(int n) {
        StringBuffer data = new StringBuffer();
        int div = 0;

        while(n > 0){
            div = n%3;
            if(div == 0){
                n = n/3 - 1;
                div = 4;
            }
            else{
                n /= 3;
            }
            data.append(div);
        }
        String answer = new String(data.reverse());
        return answer;
    }
}
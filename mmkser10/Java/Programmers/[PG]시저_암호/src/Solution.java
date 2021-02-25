class Solution {
    public String solution(String s, int n) {

        StringBuffer answer_Buffer = new StringBuffer();

        for(int i = 0 ; i < s.length() ; i++){
            char data = s.charAt(i);

            if(data != 32) {
                if(data >= 'a' && data <= 'z'){
                    data += n;
                    if(data > 'z'){
                        data = (char) ('a' + data - 1 - 'z');
                    }
                }
                else if(data >= 'A' && data <= 'Z'){
                    data += n;
                    if(data > 'Z') {
                        data = (char) ('A' + data - 1 - 'Z');
                    }
                }
            }
            answer_Buffer.append((char)data);
        }
        String answer = answer_Buffer.toString();
        return answer;
    }
}
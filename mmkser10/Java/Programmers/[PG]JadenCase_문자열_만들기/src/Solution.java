class Solution {
    public String solution(String s) {

        String data[] = s.toLowerCase().split("");
        StringBuffer stringBuffer = new StringBuffer();
        boolean activate = true;

        for(String sentence : data){
            stringBuffer.append(activate ? sentence.toUpperCase() : sentence);
            activate = sentence.equals(" ") ? true : false;
        }

        String answer = new String(stringBuffer);
        return answer;
    }
}
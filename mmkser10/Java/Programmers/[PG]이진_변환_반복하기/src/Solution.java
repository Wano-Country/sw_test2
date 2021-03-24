class Solution {
    public int[] solution(String s) {
        int isZero = 0;
        int count = 0;
        while(true){
            count++;
            for(int x = 0 ; x < s.length() ; x++){
                if(s.charAt(x)=='0')
                    isZero++;
            }
            s = s.replace("0", "");
            if(s.length() == 1){
                break;
            }
            else {
                s = String.valueOf(Integer.toBinaryString(s.length()));
            }
        }
        int[] answer = new int[]{count, isZero};
        return answer;
    }
}
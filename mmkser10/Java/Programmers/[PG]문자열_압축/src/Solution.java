class Solution {
    public int solution(String s) {

        int answer = s.length();
        for(int x = 1 ; x <= s.length()/2 ; x++){
            String data = "";
            int length = s.length();
            int counter = 0;

            for(int y = 0 ; y < s.length() ; y += x){
                String tmp = s.substring(y, Math.min(y + x, s.length()));
                if(data.equals(tmp)){
                    counter++;
                    if(s.length()-x == y){
                        length = length - (counter*x) + String.valueOf(counter+1).length();
                    }
                }
                else{
                    data = tmp;
                    if(counter > 0){
                        length = length - (counter*x) + String.valueOf(counter+1).length();
                        counter = 0;
                    }
                }
            }
            System.out.println(length);
            answer = Math.min(answer, length);
        }
        return answer;
    }
}
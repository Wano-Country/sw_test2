class Solution {
    public String solution(String phone_number) {
        String first = "";
        for(int i = 0 ; i < phone_number.length()-4 ; i++){
            first += "*";
        }
        String end = phone_number.substring(phone_number.length()-4 , phone_number.length());
        String answer = first + end;
        return answer;
    }
}
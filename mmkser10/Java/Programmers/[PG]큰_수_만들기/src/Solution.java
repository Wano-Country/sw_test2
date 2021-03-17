import java.util.Stack;

class Solution {

    public void recursive(Stack<Integer> data, String number, int length){
        for(int x = 0 ; x < number.length() ; x++){
            String digit = number.substring(x, x+1);
            if(data.search(digit) == -1)
                data.push(Integer.parseInt(digit));
        }
    }
    public String solution(String number, int k) {
        Stack<Integer> data = new Stack<>();
        int limit = number.length() - k;

        recursive(data, number, limit);
        String answer = "";
        return answer;
    }
}
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> check = new Stack<>();

        for(int x = 0 ; x < s.length() ; x++){
            char data = s.charAt(x);
            if(data == ')'){
                if(check.empty())
                    return false;
                else
                    check.pop();
            }
            else {
                check.push(data);
            }
        }
        boolean answer = check.empty();

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
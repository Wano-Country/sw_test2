import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        int N = s.length();
        for(int x = 0 ; x < N ; x++){
            stack.clear();
            for(int y = 0 ; y < N ; y++){
                if(!stack.isEmpty()){
                    if(stack.peek() == '(' && s.charAt(y) == ')'){
                        stack.pop();
                    }
                    else if(stack.peek() == '[' && s.charAt(y) == ']'){
                        stack.pop();
                    }
                    else if(stack.peek() == '{' && s.charAt(y) == '}'){
                        stack.pop();
                    }
                    else
                        stack.push(s.charAt(y));
                }
                else
                    stack.push(s.charAt(y));
            }
            if(stack.isEmpty()){
                answer++;
            }
            char data = s.charAt(0);
            s = s.substring(1, N);
            s += data;
        }
        return answer;
    }
}
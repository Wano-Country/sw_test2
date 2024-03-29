import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        int N = s.length();

        for(int x = 0 ; x < N ; x++) {
            for (int y = 0; y < N; y++) {
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
            if(stack.size() == 0){
                answer++;
            }
            char data = s.charAt(0);
            s = s.substring(1, N);
            s+=data;
            stack.clear();
        }
        return answer;
    }
}
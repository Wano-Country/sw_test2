import java.util.Stack;

class Solution
{
    public int solution(String s)
    {

        Stack<Character> stack = new Stack<>();
        for(int x = 0 ; x < s.length() ; x++){
            if(stack.isEmpty()) {
                stack.push(s.charAt(x));
            }
            else{
                if(stack.peek().equals(s.charAt(x))){
                    stack.pop();
                }
                else
                    stack.push(s.charAt(x));
            }
        }

        int answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}
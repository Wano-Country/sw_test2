import java.util.Stack;

class Tester {
    public static void main(String[] args) {
        Stack<String> check = new Stack<>();
        String s = "()()";

        for(int x = 0 ; x < s.length() ; x++){
            String data = s.substring(x, x+1);
            if(check.isEmpty()){
                check.push(s.substring(x, x+1));
            }
            else {
                if (check.peek().equals("(") && data.equals(")"))
                    check.pop();
                else
                    check.push(s.substring(x, x + 1));
            }
        }
        boolean answer = check.empty();
        System.out.println(answer);
    }
}
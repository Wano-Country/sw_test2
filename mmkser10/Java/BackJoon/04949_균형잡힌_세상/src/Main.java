import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br;
        String sentence;
        Stack<Character> stack = new Stack<>();

        while (true) {
            br = new BufferedReader(new InputStreamReader(System.in));
            sentence = br.readLine();

            String result = "NO";
            if (sentence.charAt(0) == '.') {
                break;
            }
            for (int i = 0; i < sentence.length(); i++) {
                char data = sentence.charAt(i);
                if (data != '(' && data != ')' && data != '[' && data != ']') {
                    continue;
                }
                else if (data == '(' || data == '[') {
                    stack.push(data);
                }
                else if (data == ')') {
                    if (stack.size() > 0) {
                        stack.push(data);
                        break;
                    }
                    else if(stack.get(stack.size()-1) != '(')
                    stack.pop();
                }
                else if (data == ']') {
                    if (stack.size() > 0) {
                        stack.push(data);
                        break;
                    }
                    else if(stack.get(stack.size()-1) != '[')
                    stack.pop();
                }
            }


            if (stack.empty()) {
                result = "YES";
            }
            System.out.println(result);
            stack.clear();
        }

    }
}

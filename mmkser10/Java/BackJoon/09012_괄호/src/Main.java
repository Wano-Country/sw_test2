import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());


        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < loop ; i++){
            String word = br.readLine();
            String result = "NO";

            for(int j = 0 ; j < word.length() ; j++){
                if( word.charAt(j) == '(' ){
                    stack.push(word.charAt(j));
                }
                else if ( word.charAt(j) == ')' ){
                    if(stack.empty()){
                        stack.push(word.charAt(j));
                        break;
                    }
                    stack.pop();
                }
            }

            if(stack.empty()){
                result = "YES";
            }

            System.out.println(result);
            stack.clear();
        }
    }
}

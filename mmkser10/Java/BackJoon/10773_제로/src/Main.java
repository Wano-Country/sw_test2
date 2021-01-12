import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();


        int loop = Integer.parseInt(br.readLine());
        int add = 0;


        for(int i = 0 ; i < loop ; i++){
            int number = Integer.parseInt(br.readLine());
            if( number == 0 ){
                stack.pop();
            }
            else{
                stack.push(number);
            }
        }

        int stack_loop = stack.size();


        for(int j = 0; j < stack_loop ; j++){
            add += stack.pop();
        }
        System.out.println(add);
    }
}

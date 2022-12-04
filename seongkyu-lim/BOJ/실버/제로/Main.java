import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{

        input();

    }

    private static void input() throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            int value = Integer.parseInt(br.readLine());
            if(value == 0) stack.pop();
            else stack.add(value);
        }

        while(!stack.empty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}

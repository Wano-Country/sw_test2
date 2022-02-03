package 후위표기식;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;


public class Main {
    /*

    중위 연산자를 후위 연산자로 변환하여 출력하는 문제.
    
    괄호가 있는 경우도, 없는 경우도 존재한다.  

    */

    static String[] arr = {"+", "-", "/", "*", "(", ")"};

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Stack<String> stack = new Stack<String>();

        String st = bf.readLine();

        String answer ="";

        for(int i=0; i<st.length();i++){
            
            String val = String.valueOf(st.charAt(i));

            //피연산자인 경우.
            if(Arrays.asList(arr).contains(val) != true){
                answer += val;
            //닫는 괄호인 경우.
            }else if(val.equals(")")){
                while(true){
                    String item = stack.pop();
                    if(item.equals("(")) break;
                    else answer += item;
                }
            //연산자인 경우.
            }else{
                if(stack.empty() || val.equals("(")) stack.push(val);
                else{
                    if(stack.peek().equals("(")){
                        stack.push(val);
                    }else if(val.equals("/") || val.equals("*")){
                        while(true){
                            if(stack.empty()==false && (stack.peek().equals("/") || stack.peek().equals("*"))) answer += stack.pop();
                            else break;
                        }
                        stack.push(val);
                    }else{
                        while(true){
                            if(stack.empty()==false && (stack.peek().equals("+") || stack.peek().equals("-") || stack.peek().equals("/") || stack.peek().equals("*"))) answer += stack.pop();
                            else break;
                        }
                        stack.push(val);
                    }
                }
            }
        }
        while(stack.empty()!=true){
            answer += stack.pop();
        }

        bw.write(answer+"\n");
        bw.flush();
        bw.close();

    }
    
}

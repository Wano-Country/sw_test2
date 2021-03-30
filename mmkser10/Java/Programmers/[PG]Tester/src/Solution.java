import java.util.Stack;

class Tester {
    public static void main(String[] args) {
        String number = "1231234";
        Stack<Integer> stack = new Stack<>();
        for(int x = 0; x < number.length() ; x++){
            int parseInt = Integer.parseInt(String.valueOf(number.charAt(x)));
            if(stack.isEmpty()){
                stack.push(parseInt);
            }
            else {
                if (stack.peek() < parseInt) {
                    stack.pop();
                    stack.push(parseInt);
                } else {
                    stack.push(parseInt);
                }
            }
        }

        for(int y = 0 ; y < stack.size() ; y++){
            System.out.println(stack.pop());
        }
    }
}
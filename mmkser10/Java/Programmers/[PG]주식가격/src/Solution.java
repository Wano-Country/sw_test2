import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> prices_list = new Stack<>();
        int maximum_Second = 10000;

        for(int x = 0 ; x < prices.length ; x++){
            prices_list.push(prices[x]);
        }

        for(int y = 0 ; y < prices_list.size() ; y++){
            int data = prices_list.pop();
            if(data <= maximum_Second){
                System.out.println(y);
            }
        }

        int[] answer = {};
        return answer;
    }
}
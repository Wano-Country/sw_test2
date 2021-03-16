import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer[]> prices_list = new Stack<>();
        int[] answer = new int[prices.length];

        for(int x = prices.length - 2 ; x >= 0 ; x--){
            int day = 0;

            while(!prices_list.isEmpty() && prices_list.peek()[0] >= prices[x]){
                day += prices_list.pop()[1];
            }

            answer[x] = prices_list.push(new Integer[]{prices[x], day+1})[1];
        }
        return answer;
    }
}
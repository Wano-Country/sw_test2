class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {

        dfs(numbers, target, 0, 0);
        return answer;
    }


    public void dfs(int[] numbers, int target, int index, int calculate){

        if(numbers.length == index){
            if(target == calculate)
                answer++;
            return;
        }

        dfs(numbers, target, index+1, calculate+numbers[index]);
        dfs(numbers, target, index+1, calculate-numbers[index]);

    }
}
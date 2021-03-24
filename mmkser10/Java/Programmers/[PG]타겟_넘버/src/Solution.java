class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        return answer;
    }


    public int dfs(int before_data, int index, int[] array, int target){
        if(index >= array.length){
            if(target == before_data){
                return 1;
            }
            else
                return 0;
        }

        int add = before_data+array[index];
        int sub = before_data-array[index];
    }
}
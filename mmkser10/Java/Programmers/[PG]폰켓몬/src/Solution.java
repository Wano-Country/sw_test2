import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Boolean> data = new HashMap<>();
        for(int x = 0 ; x < nums.length ; x++){
            if(!data.containsKey(nums[x])) {
                data.put(nums[x], true);
            }
            if(data.size() == nums.length/2)
                break;
        }
        int answer = data.size();
        return answer;

    }
}
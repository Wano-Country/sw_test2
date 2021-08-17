class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zero = 0;
        for(int i = 0 ; i < lottos.length ; i++){
            if(lottos[i] == 0)
                zero++;

            else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) count++;
                }
            }
        }
        int[] answer = new int[]{rank(count+zero), rank(count)};
        return answer;
    }

    public int rank(int number){
        switch (number){
            default:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;

        }
    }
}
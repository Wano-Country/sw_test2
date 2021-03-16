class Solution {
    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];
        int total = brown + yellow;
        for(int column = 1 ; column <= yellow ; column++){
            if(yellow%column == 0){
                int row = yellow/column;
                if( (column+2)*(row+2) == total && row+2 >= column+2){
                    answer[0] = row+2;
                    answer[1] = column+2;
                    break;
                }
            }
        }
        return answer;
    }
}
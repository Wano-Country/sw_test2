class Solution {
    public String solution(int[] numbers, String hand) {

        char[][] keypad = new char[4][3];
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                keypad[i][j] = (char)(i+j+1);
            }
        }
        keypad[3][1] = '0';

        String answer = "";
        for(int k = 0 ; k < numbers.length ; k++){
            switch (numbers[k]){
                case 1:
                case 4:
                case 7:
                    answer.concat("L");
                    break;

                case 2:
                case 5:
                case 8:
                case 0:

                    break;

                case 3:
                case 6:
                case 9:
                    answer.concat("R");
                    break;

            }
        }
        return answer;
    }
}
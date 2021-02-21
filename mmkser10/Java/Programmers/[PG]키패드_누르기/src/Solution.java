class Solution {
    public String solution(int[] numbers, String hand) {

        StringBuffer record_Hands = new StringBuffer();
        int[] left = new int[]{3, 0};
        int[] right = new int[]{3, 2};

        for(int x = 0 ; x < numbers.length ; x++){
            switch (numbers[x]){
                case 1:
                case 4:
                case 7:
                    left[0] = numbers[x]/3;
                    left[1] = 0;
                    record_Hands.append("L");
                    break;

                case 3:
                case 6:
                case 9:
                    right[0] = numbers[x]/3-1;
                    right[1] = 2;
                    record_Hands.append("R");
                    break;

                case 2:
                case 5:
                case 8:
                case 0:
                    if(numbers[x] == 0)
                        numbers[x] = 10;
                    int left_index = 0;
                    int right_index = 0;
                    left_index += Math.abs(left[0]-numbers[x]/3);
                    left_index += Math.abs(left[1]-1);
                    right_index += Math.abs(right[0]-numbers[x]/3);
                    right_index += Math.abs(right[1]-1);
                    if(left_index < right_index){
                        left[0] = numbers[x]/3;
                        left[1] = 1;
                        record_Hands.append("L");
                    }
                    else if(left_index > right_index){
                        right[0] = numbers[x]/3;
                        right[1] = 1;
                        record_Hands.append("R");
                    }
                    else {
                        if(hand.equals("right")){
                            right[0] = numbers[x]/3;
                            right[1] = 1;
                            record_Hands.append("R");
                        }
                        else if(hand.equals("left")){
                            left[0] = numbers[x]/3;
                            left[1] = 1;
                            record_Hands.append("L");
                        }
                    }
                    break;
            }
        }
        return new String(record_Hands);
    }
}
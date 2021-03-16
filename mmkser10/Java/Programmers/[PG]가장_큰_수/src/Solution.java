import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {

        for(int x = 0 ; x < numbers.length ; x++){
            switch (String.valueOf(numbers[x]).length())
            {
                case 1:
                    numbers[x] += numbers[x]*1000+numbers[x]*100+numbers[x]*10;
                    break;
                case 2:
                    numbers[x] += numbers[x]*100;
                    break;
                case 3:
                    numbers[x] = numbers[x]/100+numbers[x]*10;
                    break;
                default:
                    break;
            }
        }
        String answer = "";
        return answer;
    }
}
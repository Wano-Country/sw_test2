import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] data = s.split(" ");
        int[] number = new int[data.length];

        for(int x = 0 ; x < data.length ; x++){
            number[x] = Integer.parseInt(data[x]);
        }

        Arrays.sort(number);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number[0]);
        stringBuilder.append(" ");
        stringBuilder.append(number[number.length-1]);

        return new String(stringBuilder);
    }
}
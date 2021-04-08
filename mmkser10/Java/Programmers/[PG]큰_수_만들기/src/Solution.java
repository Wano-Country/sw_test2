class Solution {
    public String solution(String number, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = -1;
        for(int x = 0; x < number.length()-k ; x++) {
            char max = '0';
            for (int y = index + 1; y <= k + x; y++) {
                if (max < number.charAt(y)) {
                    index = y;
                    max = number.charAt(y);
                }
            }
            stringBuilder.append(max);
        }
        return new String(stringBuilder);
    }
}
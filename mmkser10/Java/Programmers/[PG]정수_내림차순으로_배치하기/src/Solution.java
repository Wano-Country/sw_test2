import java.util.Arrays;

class Solution {
    public long solution(long n) {

        char[] data = String.valueOf(n).toCharArray();
        Arrays.sort(data);

        long answer = Long.parseLong(new StringBuilder(new String(data)).reverse().toString());
        return answer;
    }
}
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int length = String.valueOf(n).length();

        for(int x = 0 ; x < length ; x++){
            answer += n%10;
            n /= 10;
        }

        return answer;
    }
}
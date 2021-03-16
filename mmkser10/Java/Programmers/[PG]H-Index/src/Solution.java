import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {

        int answer = 1;
        Arrays.sort(citations);

        for(int x = citations.length-1 ; x >= 0 ; x--, answer++){
            if(citations[x] < answer) {
                break;
            }
        }
        return answer;
    }
}
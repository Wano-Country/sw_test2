import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        HashSet<String> vector = new HashSet<>();
        HashMap<Character, int[]> movingIndex = new HashMap<>();
        int answer = 0;
        int xIndex = 5;
        int yIndex = 5;
        movingIndex.put('U', new int[]{-1, 0});
        movingIndex.put('D', new int[]{1, 0});
        movingIndex.put('L', new int[]{0, -1});
        movingIndex.put('R', new int[]{0, 1});

        for(int x = 0 ; x < dirs.length() ; x++){
            char data = dirs.charAt(x);
            int[] wantIndex = movingIndex.get(data);
            int beforeXIndex = xIndex;
            int beforeYInedx = yIndex;
            xIndex += wantIndex[0];
            yIndex += wantIndex[1];
            if(xIndex < 0 || xIndex > 10){
                xIndex -= wantIndex[0];
            }
            if(yIndex < 0 || yIndex > 10){
                yIndex -= wantIndex[1];
            }
            if(beforeXIndex == xIndex && beforeYInedx == yIndex){
                continue;
            }
            vector.add(beforeXIndex+" "+beforeYInedx+" "+xIndex+" "+yIndex);
            vector.add(xIndex+" "+yIndex+" "+beforeXIndex+" "+beforeYInedx);
        }
        answer = vector.size()/2;
        return answer;
    }

    public static void main(String[] args) {
        String x = "UDDDDDDDDDDDDDDDDDDDDDDDDDUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUDDDDDDDDDDDDDDDD";
        Solution a = new Solution();
        System.out.println(a.solution(x));
    }
}



import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int data = 0;
        int answer = 0;

        for(int x = 0 ; x < d.length ; x++){
            if(data + d[x] <= budget){
                data += d[x];
                answer++;
            }
            else{
                break;
            }
            System.out.println(data);
        }
        return answer;
    }
}
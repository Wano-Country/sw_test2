import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });


        int answer = 1;
        int endLine = routes[0][1];
        for(int x = 0 ; x < routes.length ; x++){
            if(routes[x-1][1] <= endLine){
                endLine = Math.max(routes[x][1], endLine);
            }
            else{
                answer++;
                endLine = routes[x][1];
            }
        }
        return answer;
    }
}
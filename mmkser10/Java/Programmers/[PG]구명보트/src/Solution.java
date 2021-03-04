import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {

        Arrays.sort(people);
        int answer = 0;
        int weight = 0;
        int start = 0;
        for(int x = people.length-1; x >= 0 && start <= x ; x--){
            if(people[start]+ people[x] <= limit){
                start++;
            }
            answer++;
        }
        return answer;
    }
}
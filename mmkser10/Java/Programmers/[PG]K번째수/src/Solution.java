import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {


        int[] answer = new int[commands.length];

        for(int i = 0 ; i < answer.length ; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];

            int tmp_Array[] = new int[end-start+1];
            for(int j = 0 ; j < tmp_Array.length ; j++){
                tmp_Array[j] = array[start-1+j];
            }

            Arrays.sort(tmp_Array);
            answer[i] = tmp_Array[index-1];

        }
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] stu_A = {1,2,3,4,5};
        int[] stu_B = {2,1,2,3,2,4,2,5};
        int[] stu_C = {3,3,1,1,2,2,4,4,5,5};
        ArrayList<Integer> answer_List = new ArrayList<Integer>();
        int result_array[] = new int[3];
        int max = 0;

        for(int x = 0 ; x < answers.length ; x++){
            if(answers[x] == stu_A[x%stu_A.length])
                result_array[0]++;
            if(answers[x] == stu_B[x%stu_B.length])
                result_array[1]++;
            if(answers[x] == stu_C[x%stu_C.length])
                result_array[2]++;
        }
        max = Math.max(result_array[0], Math.max(result_array[1], result_array[2]));

        for(int y = 0 ; y < result_array.length ; y++){
            if(max == result_array[y])
                answer_List.add(y);
        }

        int[] answer = new int[answer_List.size()];

        for(int z = 0 ; z < answer.length ; z++){
            answer[z] = answer_List.get(z)+1;
        }
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        int index = B.length-1;
        for(int x = A.length-1 ; x >= 0 ; x--){
            if(A[x] < B[index]){
                answer += 1;
                index--;
            }
        }
        return answer;
    }
}
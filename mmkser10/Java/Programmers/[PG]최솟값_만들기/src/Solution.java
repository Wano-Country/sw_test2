import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        int N = 0;
        if(A.length == B.length)
            N = A.length;

        for(int x = 0 ; x < N ; x++){
            answer += A[x] * B[N-1-x];
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
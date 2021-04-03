class Solution {
    public int solution(int n, int[] stations, int w) {
        int next = 0;
        int prev = 0;
        int answer = 0;
        int range = (w*2)+1;

        for(int x = 0 ; x < stations.length ; x++){
            next = stations[x]-w;
            int current = next-prev-1;
            if(current > 0){
                if(current%range == 0){
                    answer += current/range;
                }
                else
                    answer += current/range+1;
            }
            prev = stations[x] + w;
        }

        if(prev < n){
            int current = n-prev;
            if(current%range == 0){
                answer += current/range;
            }
            else
                answer += current/range+1;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
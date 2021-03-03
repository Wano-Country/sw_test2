class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] data = new double[N];
        int failure_Down = stages.length;
        for(int x = 1 ; x <= N ; x++){
            int failure_Up = 0;
            for(int y = 0 ; y < stages.length ; y++){
                if(stages[y] == x){
                    failure_Up++;
                }
            }

            System.out.println(failure_Up + "\t" + failure_Down + "\t" + failure_Up/failure_Down);
            data[x-1] = failure_Up/failure_Down;
            failure_Down -= failure_Up;

        }
        return answer;
    }
}
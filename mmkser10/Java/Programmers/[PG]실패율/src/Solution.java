import java.util.Arrays;

class Solution {
    static class Fail{
        int index;
        double failure;

        public Fail(int index, double failure) {
            this.index = index;
            this.failure = failure;
        }
    }

    public int[] solution(int N, int[] stages) {
        Fail[] data = new Fail[N];
        double deno = stages.length * 1.0;
        int[] answer = new int[N];
        int[] counter = new int[N+2];

        for(int i = 0 ; i < stages.length ; i++)
            counter[stages[i]]++;

        for(int j = 1 , k = 0; j < N + 1 ; j++){
            if(counter[j] == 0)
                data[k++] = new Fail(j, 0.0);

            else{
                data[k++] = new Fail(j, counter[j] / deno);
                deno -= counter[j];
            }
        }

        Arrays.sort(data, (o1, o2) -> Double.compare(o2.failure, o1.failure));

        for(int k = 0 ; k < data.length ; k++)
            answer[k] = data[k].index;

        return answer;
    }
}
class Solution {
    int zero = 0;
    int one = 0;

    public void quard(int[][] arr, int x, int y, int N){

        int countOne = 0;
        int countZero = 0;
        for(int z = 0 ; z < N ; z++){
            for(int q = 0 ; q < N ; q++){
                if(arr[z+x][q+y] == 1){
                    countOne++;
                }
                else{
                    countZero++;
                }
            }
        }
        if(countOne == N*N){
            one++;
            return;
        }
        else if(countZero == N*N){
            zero++;
            return;
        }


        if(N >= 2) {
            quard(arr, x, y, N/2);
            quard(arr, x, y+N/2, N/2);
            quard(arr, x+N/2, y, N/2);
            quard(arr, x+N/2, y+N/2, N/2);

        }
    }

    public int[] solution(int[][] arr) {
        quard(arr, 0, 0, arr.length);

        int[] answer = new int[]{zero, one};
        return answer;
    }


}
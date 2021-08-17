class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        int[][] data = new int[n][n];
        int count = 1;
        int index = 0;
        int x = -1;
        int y = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else {
                    x--;
                    y--;
                }
                data[x][y] = count++;
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(data[i][j] != 0)
                    answer[index++] = data[i][j];
            }
        }
        return answer;
    }
}
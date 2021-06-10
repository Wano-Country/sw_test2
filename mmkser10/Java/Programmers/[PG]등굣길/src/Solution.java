class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] location = new int[n][m];
        for (int x = 0; x < puddles.length; x++) {
            location[puddles[x][1] - 1][puddles[x][0] - 1] = -1;
        }
        location[0][0] = 1;
        for(int x = 0 ; x < n ; x++){
            for(int y = 0 ; y < m ; y++){
                if(location[x][y] != -1) {
                    if (x != 0) {
                        int up = location[x - 1][y] == -1 ? 0 : location[x - 1][y];
                        location[x][y]+=up%1000000007;
                    }
                    if (y != 0) {
                        int left = location[x][y - 1] == -1 ? 0 : location[x][y - 1];
                        location[x][y]+=left%1000000007;
                    }
                }
            }
        }
        int answer = location[n-1][m-1]%=1000000007;
        return answer;
    }
}
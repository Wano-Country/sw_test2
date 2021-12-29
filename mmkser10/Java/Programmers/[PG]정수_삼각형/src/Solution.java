class Solution {
    public int solution(int[][] triangle) {
        int max = 0;

        for(int x = 1 ; x < triangle.length ; x++){
            for(int y = 0 ; y < triangle[x].length ; y++){
                if(y == 0){
                    triangle[x][y] += triangle[x-1][y];
                }
                else if(y == triangle[x].length-1){
                    triangle[x][y] += triangle[x-1][y-1];
                }
                else
                    triangle[x][y] += Math.max(triangle[x-1][y], triangle[x-1][y-1]);

                max = Math.max(max, triangle[x][y]);
            }
        }
        int answer = max;
        return answer;
    }
}
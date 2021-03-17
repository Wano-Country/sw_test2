class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int x = 0 ; x < arr1.length ; x++){
            for(int y = 0 ; y < arr2[0].length ; y++){
                int number = 0;
                for(int z = 0 ; z < arr1[0].length ; z++){
                    number += arr1[x][z]*arr2[z][y];
                }
                answer[x][y] = number;
            }
        }
        return answer;
    }
}
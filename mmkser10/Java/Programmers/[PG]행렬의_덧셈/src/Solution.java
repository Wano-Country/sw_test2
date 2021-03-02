class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {


        int i_Lnegth = arr1.length;
        int j_Lnegth = arr1[0].length;

        int[][] answer = new int[i_Lnegth][j_Lnegth];

        for(int i = 0 ; i < i_Lnegth ; i++){
            for(int j = 0 ; j < j_Lnegth ; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];

            }
        }

        return answer;
    }
}
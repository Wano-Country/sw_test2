class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int[] total = new int[n];
        int result = n;

        for(int x = 0 ; x < lost.length ; x++){
            total[lost[x]-1]--;
        }
        for(int y = 0 ; y < reserve.length ; y++){
            total[reserve[y]-1]++;
        }

        for(int z = 0 ; z < total.length ; z++){
            if(total[z] == -1){
                if(z == 0){
                    if(total[z+1] == 1){
                        total[z]++;
                        total[z+1]--;
                    }
                }
                else if(z == total.length-1){
                    if(total[z-1] == 1){
                        total[z]++;
                        total[z-1]--;
                    }
                }
                else{
                    if(total[z-1] == 1){
                        total[z]++;
                        total[z-1]--;
                    }
                    else if(total[z+1] == 1){
                        total[z]++;
                        total[z+1]--;
                    }
                }
            }
        }

        for(int i = 0 ; i < total.length ; i++){
            if(total[i] == -1)
                result--;
        }
        return result;
    }
}
class Solution {
    public int solution(int[] nums) {

        int answer = 0;
        int N = 3000;
        boolean[] prime = new boolean[N+1];
        prime[0] = prime[1] = false;

        for(int i=2; i<=N ; i+=1) {
            prime[i] = true;
        }

        for(int j=2 ; j*j<=N ; j++){
            if(!prime[j]) continue;
            for(int z=j*j ; z<=N ; z+=j)
                prime[z] = false;
        }


        for(int x = 0 ; x < nums.length-2 ; x++){
            for(int y = x+1 ; y < nums.length-1 ; y++){
                for(int z = y+1 ; z < nums.length ; z++){
                    if(prime[nums[x] + nums[y] + nums[z]]) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
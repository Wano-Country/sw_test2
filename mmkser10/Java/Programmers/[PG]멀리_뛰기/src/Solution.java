class Solution {
    public long solution(int n) {
        int[] data = new int[n+1];
        data[1] = 1;
        data[2] = 2;
        for(int x = 3 ; x < data.length ; x++){
            data[x] = (data[x-1]+data[x-2])%1234567;
        }
        return data[n];
    }
}
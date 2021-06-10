class Solution {
    public long solution(long n) {
        double data = Math.sqrt(n);
        if(data/1.00 == (int)data){
            return (long)Math.pow(data+1, 2);
        }
        else
            return -1;
    }
}
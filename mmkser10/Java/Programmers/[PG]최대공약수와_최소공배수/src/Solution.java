class Solution {

    int gcd(int x, int y){
        if (y == 0) return x;
        return gcd(y, x%y);
    }

    public int[] solution(int n, int m) {


        if(n > m){
            int tmp = n;
            n = m;
            m = tmp;
        }

        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n*m/gcd(n,m);


        return answer;
    }
}
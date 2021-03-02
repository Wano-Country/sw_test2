class Solution {
    public int counter = 0;

    public int recursive(long number){

        if(number == 1) {return counter;}
        else if(counter >= 500) { return -1; }

        else if(number%2 == 1){
            counter++;
            return recursive(number*3+1);
        }

        else{
            counter++;
            return recursive(number/2);
        }

    }

    public int solution(long num) {
        int answer = recursive(num);
        return answer;
    }
}
class Solution {
    public String solution(int a, int b) {
        String weekend[] = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int day = 4+b;
        for(int x = 1 ; x < a ; x++){ //1, 2, 3, 4
            if(x >= 8){
                if(x%2 == 0)
                    day+=31;
                else
                    day+=30;
            }
            else{
                if(x == 2)
                    day+=29;
                else if(x%2 == 0)
                    day+=30;
                else
                    day+=31;
            }
        }
        String answer = weekend[day%7];
        return answer;
    }
}
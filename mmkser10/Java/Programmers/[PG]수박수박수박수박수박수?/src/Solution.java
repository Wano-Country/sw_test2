class Solution {
    public String solution(int n) {
        StringBuilder watermelon = new StringBuilder();

        for(int i = 1 ; i <= n ; i++){
            if(i%2 == 1)
                watermelon.append("수");
            else
                watermelon.append("박");
        }

        String answer = watermelon.toString();
        return answer;
    }
}
class Solution {

    int answer = 101;

    public int solution(String begin, String target, String[] words) {

        boolean[] check = new boolean[words.length];

        dfs(begin, target, words, check, 0);
        return answer == 101 ? 0 : answer;
    }


    public void dfs(String begin, String target, String[] words, boolean[] check, int count){
        if(begin.equals(target)){
            answer = Math.min(answer, count);
            return;
        }

        for(int x = 0 ; x < words.length ; x++){
            if(!check[x]) {
                int valid = 0;

                for (int y = 0; y < words[x].length(); y++) {
                    if (begin.charAt(y) == words[x].charAt(y)) {
                        valid++;
                    }
                }

                if (valid == begin.length() - 1) {
                    check[x] = true;
                    dfs(words[x], target, words, check, count+1);
                    check[x] = false;
                }
            }
        }
    }
}
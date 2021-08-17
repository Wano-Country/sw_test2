import java.util.Arrays;

class Solution {
    static class Words{
        String word;
        int index;

        public Words(String word, int index) {
            this.word = word;
            this.index = index;
        }
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Words[] words = new Words[strings.length];

        for(int i = 0 ; i < strings.length ; i++){
            StringBuffer sb = new StringBuffer();
            String front = strings[i].substring(0, n);
            String middle = String.valueOf(strings[i].charAt(n));
            String end = strings[i].substring(n+1);
            sb.append(middle);
            sb.append(front);
            sb.append(end);
            words[i] = new Words(new String(sb), i);
        }

        Arrays.sort(words, (o1, o2) -> o1.word.compareTo(o2.word));
        for(int j = 0 ; j < strings.length ; j++){
            answer[j] = strings[words[j].index];
        }
        return answer;
    }
}
class Solution {
    public String solution(String new_id) {

        String answer = new_id;

        answer = answer.toLowerCase();

        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        answer = answer.replaceAll("[.]{2,}", ".");

        if (answer.indexOf(".") == 0)
            answer = answer.substring(1);

        if(answer.contains(".")){
            if (answer.lastIndexOf(".") == answer.length()-1)
                answer = answer.substring(0, answer.length() - 1);
        }

        if (answer.equals(""))
            answer =  "a";


        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.lastIndexOf(".") == answer.length()-1)
                answer = answer.substring(0, answer.length() - 1);
        }


        if (answer.length() <= 2) {
            String index = answer.substring(answer.length()-1);
            for (int i = answer.length() ; i < 3 ; i++) {
                answer = answer.concat(index);
            }
        }

        return answer;
    }
}
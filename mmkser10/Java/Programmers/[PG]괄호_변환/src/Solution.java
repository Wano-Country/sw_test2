import java.util.Stack;

class Solution {
    public String recursive(String data) {
        String returnString = null;
        int N = data.length();
        if (data.equals("")) {
            returnString = "";
        } else {
            StringBuilder sb = new StringBuilder();
            Stack<Character> uMemory = new Stack<>();
            int normal = 0;
            int recur = 0;
            int divideIndex = -1;
            for (int x = 0; x < N; x++) {
                char nowChar = data.charAt(x);
                if (nowChar == '(') {
                    normal++;
                }
                else if (nowChar == ')') {
                    recur++;
                }
                else continue;
                if(!uMemory.isEmpty()){
                    if(uMemory.peek() == '(' && nowChar == ')')
                        uMemory.pop();
                    else
                        uMemory.push(nowChar);
                }
                else {
                    uMemory.push(nowChar);
                }

                if (normal == recur) {
                    divideIndex = x + 1;
                    break;
                }
            }
            String u = data.substring(0, divideIndex);
            String v = data.substring(divideIndex, N);
            if (uMemory.isEmpty()) {
                sb.append(u);
                sb.append(recursive(v));
                returnString = new String(sb);
            } else {
                sb.append("(");
                sb.append(recursive(v));
                sb.append(")");
                int loopCount = 0;

                for(int x = 0 ; x < u.length() ; x++){
                    if(x == 0 || x == u.length()-1){
                        continue;
                    }
                    else{
                        if(u.charAt(x) == '('){
                            sb.append(')');
                        }
                        else {
                            sb.append('(');
                        }
                    }
                }
                returnString = new String(sb);
            }
        }
        return returnString;
    }

    public String solution(String p) {
        String answer = recursive(p);
        return answer;
    }
}
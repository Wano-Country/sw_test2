import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> lzw = new HashMap<>();
        ArrayList<Integer> data = new ArrayList<>();
        int index = 27;
        int x = 0;
        int y = 1;

        for(int i = 65 ; i < 91 ; i++){
            lzw.put(Character.toString(i), i-64);
        }

        while(true){
            if(!lzw.containsKey(msg.substring(x, y))){
                lzw.put(msg.substring(x, y), index++);
                data.add(lzw.get(msg.substring(x, y - 1)));
                x = y - 1;
            }
            else{
                if(y == msg.length()){
                    data.add(lzw.get(msg.substring(x, y)));
                    break;
                }
                y++;
            }
        }

        int[] answer = new int[data.size()];
        for(int i = 0 ; i < data.size() ; i++){
            answer[i] = data.get(i);
        }
        return answer;
    }
}
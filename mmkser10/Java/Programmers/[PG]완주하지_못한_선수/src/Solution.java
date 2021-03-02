import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> finish = new HashMap<>();
        for(int x = 0 ; x < participant.length ; x++){
            finish.put(participant[x], finish.getOrDefault(participant[x], 0) + 1);
        }

        for(int y = 0 ; y < completion.length ; y++){
            finish.put(completion[y], finish.getOrDefault(completion[y], 0) - 1);
        }
        for(int z = 0 ; z < participant.length ; z++){
            if(finish.get(participant[z]) != 0){
                return participant[z];
            }
        }
        return null;
    }
}
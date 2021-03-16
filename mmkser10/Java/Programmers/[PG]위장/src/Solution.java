import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothes_Hash = new HashMap<>();
        int answer = 1;

        for(int x = 0 ; x < clothes.length ; x++){
            clothes_Hash.put(clothes[x][1], clothes_Hash.getOrDefault(clothes[x][1], 0)+1);
        }

        for(int kind : clothes_Hash.values()){
            answer *= (kind+1);
        }
        return answer-1;
    }
}
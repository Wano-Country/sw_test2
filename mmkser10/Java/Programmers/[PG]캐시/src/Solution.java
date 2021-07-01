import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0)  return cities.length * 5;
        else{
            LinkedList<String> lru = new LinkedList<>();
            int answer = 0;

            for(int i = 0 ; i < cities.length ; i++){
                String city = cities[i].toUpperCase();
                if(lru.remove(city)){
                    lru.addLast(city);
                    answer += 1;
                }
                else{
                    if(lru.size() == cacheSize){
                        lru.pollFirst();
                    }
                    lru.addLast(city);
                    answer += 5;
                }
            }
            return answer;
        }
    }
}
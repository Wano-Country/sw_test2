import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {

    public int[] solution(String[] genres, int[] plays) {
        int N = genres.length;
        HashMap<String, Integer> dummy = new HashMap<>();
        for(int x = 0 ; x < N ; x++){
            dummy.put(genres[x], dummy.getOrDefault(genres[x], 0)+plays[x]);
        }
        ArrayList<String> genresList = new ArrayList<>(dummy.keySet());
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(genresList, ((o1, o2) -> (dummy.get(o2)).compareTo(dummy.get(o1))));

        for(String gen : genresList){
            int firstIndex = 0;
            int secondIndex = 0;
            int max = 0;
            for(int x = 0 ; x < N ; x++){
                if(gen.equals(genres[x]) && plays[x] > max){
                    max = plays[x];
                    firstIndex = x;
                }
            }

            max = 0;
            for(int x = 0 ; x < N ; x++){
                if(gen.equals(genres[x]) && plays[x] > max && firstIndex != x){
                    max = plays[x];
                    secondIndex = x;
                }
            }
            result.add(firstIndex);
            if(max != 0) {
                result.add(secondIndex);
            }
        }

        int[] answer = new int[result.size()];
        for(int x = 0 ; x < answer.length ; x++){
            answer[x] = result.get(x);
        }
        return answer;
    }
}
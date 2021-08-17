import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static class NumberCount{
        int number;
        int count;

        public NumberCount(int number, int countl) {
            this.number = number;
            this.count = countl;
        }
    }
    public int[] solution(String s) {
        int[] array = new int[100001];
        ArrayList<NumberCount> list = new ArrayList<>();
        String[] data = s.replaceAll("\\{+", "").
                replaceAll("\\}+", "").
                split(",");

        for(int i = 0 ; i < data.length ; i++){
            array[Integer.parseInt(data[i])]++;
        }
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] != 0) {
                list.add(new NumberCount(i, array[i]));
            }
        }
        int[] answer = new int[list.size()];
        Collections.sort(list, (o1, o2) -> o2.count - o1.count);
        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i).number;
        }
        return answer;
    }
}
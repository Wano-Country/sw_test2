import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int x = 0 ; x < arr.length-1 ; x++){
            if(arr[x] == arr[x+1]){
                if(x != arr.length-2){
                    continue;
                }
                else
                    list.add(arr[x+1]);
            }
            else if(arr[x] != arr[x+1]){
                list.add(arr[x]);
                if(x != arr.length-2){
                    continue;
                }
                else
                    list.add(arr[x+1]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0 ; i < list.size() ; i++)
        {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
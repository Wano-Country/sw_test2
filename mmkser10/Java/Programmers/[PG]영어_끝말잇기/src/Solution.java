import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {

        int[] answer = new int[2];
        HashSet<String> data = new HashSet<>();

        for(int x = 0 ; x < words.length ; x++){
            if(x != 0) {
                char end = words[x-1].charAt(words[x-1].length()-1);
                char start = words[x].charAt(0);
                if (data.contains(words[x])) {
                    answer[0] = (x+1)%n == 0 ? n : (x+1)%n;
                    answer[1] = (int)Math.ceil((double)(x+1)/n);
                    break;
                }
                else if(end != start){
                    answer[0] = (x+1)%n == 0 ? n : (x+1)%n;
                    answer[1] = (int)Math.ceil((double)(x+1)/n);
                    break;
                }
                else {
                    data.add(words[x]);
                }
            }
            else {
                data.add(words[x]);
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        return answer;
    }
}
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

class Solution {
    Words[] memory;

    class Words{
        private String front;
        private String mid;
        private String end;
        private String midAdd;

        public Words(String front, String mid, String end, String midAdd) {
            this.front = front;
            this.mid = mid;
            this.end = end;
            this.midAdd = midAdd;
        }
    }

    public String[] solution(String[] files) {
        int N = files.length;
        String[] answer = new String[N];
        memory = new Words[N];
        for(int x = 0 ; x < N ; x++){
            int stringLength = files[x].length();
            int indexStart = 1001;
            int indexEnd = 0;
            boolean isInteger = false;
            for(int y = 0 ; y < stringLength ; y++){
                if(files[x].charAt(y) >= '0' && files[x].charAt(y) <= '9'){
                    indexStart = Math.min(indexStart, y);
                    indexEnd = y;
                    isInteger = true;
                }
                else {
                    if (isInteger){
                        break;
                    }
                }
            }
            String front = files[x].substring(0, indexStart);
            String mid = files[x].substring(indexStart, indexEnd+1);
            String end = files[x].substring(indexEnd+1, stringLength);
            String midAdd = String.format("%05d", Integer.parseInt(mid));
            memory[x] = new Words(front, mid, end, midAdd);
        }
        Arrays.sort(memory, new Comparator<Words>() {
            @Override
            public int compare(Words o1, Words o2) {
                int result = 0;
                if(o1.front.toUpperCase(Locale.ROOT).compareTo(o2.front.toUpperCase()) < 0){
                    result = -1;
                }
                else if (o1.front.toUpperCase(Locale.ROOT).compareTo(o2.front.toUpperCase()) == 0){
                    int o1mid = Integer.parseInt(o1.midAdd);
                    int o2mid = Integer.parseInt(o2.midAdd);
                    if(o1mid < o2mid)          result = -1;
                    else if (o1mid == o2mid)    result = 0;
                    else                        result = 1;
                }
                else result = 1;
                return result;
            }
        });

        for(int x = 0 ; x < N ; x++){
            StringBuilder sb = new StringBuilder();
            sb.append(memory[x].front);
            sb.append(memory[x].mid);
            sb.append(memory[x].end);
            answer[x] = new String(sb);
            System.out.println(answer[x]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] x = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        solution.solution(x);
    }
}
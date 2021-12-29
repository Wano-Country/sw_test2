import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int x = 0 ; x < phone_book.length-1 ; x++){
            for(int y = 1+x ; y < phone_book.length ; y++){
                if(!phone_book[y].startsWith(phone_book[x])){
                    break;
                }
                else
                    return false;

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] memory = new String[]{"119", "97674223", "1195524421"};
        Solution solution = new Solution();
        solution.solution(memory);
    }
}
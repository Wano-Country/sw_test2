import java.util.ArrayList;

class Solution {
    public String solution(int n, int t, int m, int p) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        list.add('0');
        for(int i = 1 ; i < t*m ; i++){
            String bit = Integer.toString(i, n);
            for(int j = 0 ; j < bit.length() ; j++){
                list.add(bit.charAt(j));
            }
        }
        for(int i = 0 ; i < t ; i++){
            sb.append(list.get(m*i+(p-1)));
        }
        return sb.toString();
    }
}
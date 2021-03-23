class Solution {
    public int solution(String name) {
        int answer = 0;
        for(int x = 0 ; x < name.length() ; x++){
            answer += name.charAt(x)-'A';
        }
        for(int y = 0 ; y < name.length() ; y++){
            for(int z = 0 ; z < y ; z++){
                System.out.print(name.charAt(z));
            }
            for(int q = name.length() - 1 ; q > y ; q--){
                System.out.print(name.charAt(q));
            }
            System.out.println();
        }
        return answer;
    }
}
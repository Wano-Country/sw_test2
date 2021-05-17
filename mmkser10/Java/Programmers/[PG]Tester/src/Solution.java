class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int x = 0 ; x < numbers.length ; x++){
            long count = 1;
            long memory = numbers[x];
            while(true){
                memory += count;
                int bit = Long.bitCount(numbers[x] ^ memory);
                if(bit <= 2){
                    System.out.println(memory);
                    answer[x] = memory;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long n[] = new long[]{16777215, 7};
        solution.solution(n);
    }
}
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i]%2 == 0)
                answer[i] = numbers[i]+1;
            else{
                StringBuffer sb = new StringBuffer();
                String bin = Long.toBinaryString(numbers[i]);
                if(!bin.contains("0")) {
                    sb.append("10");
                    sb.append(bin.substring(1));
                }
                else{
                    int indexZero = bin.lastIndexOf("0");
                    sb.append(bin.substring(0, indexZero));
                    sb.append("1");
                    sb.append("0");
                    sb.append(bin.substring(indexZero+2));
                }
                answer[i] = Long.parseLong(sb.toString(), 2);
            }
        }
        return answer;
    }
}
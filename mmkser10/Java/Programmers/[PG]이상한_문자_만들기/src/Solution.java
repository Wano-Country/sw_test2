class Solution {
    public String solution(String s) {

        String[] split_Data = s.split(" ");
        StringBuffer answer_Buffer = new StringBuffer();

        for(int x = 0 ; x < split_Data.length ; x++){
            StringBuffer data = new StringBuffer();
            for(int y = 0 ; y < split_Data[x].length() ; y++){
                data.append(y%2 == 0 ? split_Data[x].substring(y, y+1).toUpperCase() : split_Data[x].substring(y, y+1).toLowerCase());
            }
            answer_Buffer.append(new String(data));
            if(x != split_Data.length-1)
                answer_Buffer.append(" ");
        }
        return new String(answer_Buffer);
    }
}
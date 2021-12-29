class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];
        String option = "%0" + n + "d";

        for(int x = 0 ; x < n ; x++){

            StringBuffer jewely = new StringBuffer();
            long alpha = Long.parseLong(Integer.toBinaryString(arr1[x]));
            long beta = Long.parseLong(Integer.toBinaryString(arr2[x]));
            String data = String.format(option, alpha+beta);
            System.out.println(data);

            for(int y = 0; y < n ; y++){
                if(data.charAt(y) != '0'){
                    jewely.append("#");
                }
                else
                    jewely.append(" ");
            }
            answer[x] = new String(jewely);
        }
        return answer;
    }
}
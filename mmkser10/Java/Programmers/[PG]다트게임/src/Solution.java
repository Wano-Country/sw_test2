class Solution {
    public int solution(String dartResult) {

        String[] number_Dart = dartResult.split("[^0-9]+");
        String[] signal_Dart = dartResult.split("[^SDT*#]+");
        double[] score = new double[3];
        int answer = 0;
        int index = 0;

        for(int x = 0 ; x < number_Dart.length ; x++){


            if(signal_Dart[x+1].contains("S")){
                score[index] = Math.pow(Double.parseDouble(number_Dart[x]), 1);
            }
            else if(signal_Dart[x+1].contains("D")){
                score[index] = Math.pow(Double.parseDouble(number_Dart[x]), 2);
            }
            else if(signal_Dart[x+1].contains("T")){
                score[index] = Math.pow(Double.parseDouble(number_Dart[x]), 3);
            }

            if(signal_Dart[x+1].length() == 2){
                if(signal_Dart[x+1].contains("*")){
                    score[index] *= 2;
                    if(x != 0){
                        score[index-1] = score[index-1] * 2;
                    }
                }
                else if(signal_Dart[x+1].contains("#")){
                    score[index] = score[index] * -1;
                }
            }
            index++;
        }

        for(int y = 0 ; y < score.length ; y++){
            answer += score[y];
        }

        return answer;
    }
}
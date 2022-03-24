package 홀수홀릭호석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String n;
    static int min,max;

    
    public static void main(String[] args) throws IOException{
        input();
        recurssion_func(n,0);
        System.out.println(min+" "+max);
    }

    private static void recurssion_func(String num, int value) {

        value += odd_count(num);

        if(num.length() == 2){
            num = Integer.toString(Integer.parseInt(num.substring(0,1))+ Integer.parseInt(num.substring(1)));
            recurssion_func(num, value);
        }else if(num.length()==1){
            max = Math.max(value, max);
            min = Math.min(value, min);
        }else {
            for(int i=0; i<num.length()-2; i++){
                for(int j=i+1; j<num.length()-1; j++){
                    String num2 = Integer.toString(Integer.parseInt(num.substring(0,i+1))+Integer.parseInt(num.substring(i+1,j+1))+Integer.parseInt(num.substring(j+1)));
                    recurssion_func(num2, value);                
                }                
            }
        }
    }

    private static int odd_count(String num) {
        int cnt = 0;
        String[] arr = num.split("");
        for(int i=0; i<arr.length; i++){
            if(Integer.parseInt(arr[i])%2 == 1) cnt++;
        }
        return cnt;
    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = bf.readLine();

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    
}


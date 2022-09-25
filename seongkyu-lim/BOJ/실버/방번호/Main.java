package 방번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int[] arr = new int[10];

        for(int i=0; i<number.length(); i++){
            if(number.charAt(i)=='9' && (arr[9] > arr[6])) arr[6] += 1;
            else if(number.charAt(i)=='6' && arr[6] > arr[9]) arr[9] += 1;
            else {
                arr[Character.getNumericValue(number.charAt(i))] += 1;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[9]);

    } 
}

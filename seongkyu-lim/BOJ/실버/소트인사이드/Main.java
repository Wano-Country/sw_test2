package 소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static char[] arr;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = br.readLine().toCharArray();

        Arrays.sort(arr);

        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
    
}

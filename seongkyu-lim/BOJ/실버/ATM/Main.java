package ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int numPeople = Integer.parseInt(bf.readLine());

        String times = bf.readLine();
        String[] array = times.split(" ");
        int[] array2 = new int[numPeople];

        for(int i=0; i<numPeople; i++){
            array2[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(array2);

        int sum = 0;
        
        for(int i=0; i<numPeople; i++){
            sum += array2[i]*(numPeople-i);
        }

        System.out.println(sum);


    }
    
}

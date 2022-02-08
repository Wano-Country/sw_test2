package 조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger answer= new BigInteger("1");

        for(int i=n; i>n-m; i--){
            answer = answer.multiply(new BigInteger(Integer.toString(i)));
            answer = answer.divide(new BigInteger(Integer.toString(n+1-i)));
        }
        System.out.println(answer);


    }
    
}

package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /*
    
    1. 갯수 차이 만큼 앞에 추가하여 차이 파악
    2. 갯수 차이 만큼 뒤에 추가하여 차이 파악.
    */

    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        System.out.println(calc(a,b));
    }

    public static int calc(String a, String b){

        int ans = 0;
        int length = b.length()-a.length();

        String firstCase = b.substring(0, length) + a;

        int value = 0;
        for(int i=0; i<b.length(); i++){
            if (firstCase.charAt(i) != b.charAt(i)) value +=1;
        }
        ans = value;

        String secondCase = a + b.substring(b.length()-length, b.length());

        value = 0;
        for(int i=0; i<b.length(); i++){
            if (secondCase.charAt(i) != b.charAt(i)) value +=1;
        }
        ans = Math.min(ans,value);

        return ans;
    }
    
}

package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    구현, 완전탐색
    */
    static String a,b;
    static int min, gap;

    public static void main(String[] args) throws IOException{

        input();
        calc();
        System.out.println(min);
    }

    private static void calc() {
        
        for (int i=0; i<gap+1; i++){

            String newA = b.substring(0, i) + a + b.substring(b.length()-(gap-i));
            compare(newA, b);
        }
    }

    private static void compare(String a, String b){
        int value = 0;
            for (int i=0; i<b.length(); i++){
                if (a.charAt(i) != b.charAt(i)) value++;
            }
            min = Math.min(min, value);
    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        a = st.nextToken();
        b = st.nextToken();

        min = Integer.MAX_VALUE;
        gap = b.length()-a.length();
    }
}

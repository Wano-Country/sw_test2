package 팰린드롬만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
    문자열의 처음 값부터 i번째 값까지를 문자열 뒤에 붙여서 팰린드롬인지를 체크하자.

    팰린드롬일 때 문자열 길이 반환.
     */

    static String str;

    public static void main(String[] args) throws IOException{
        
        input();
        main_logic();
    }

    private static void main_logic() {

        StringBuffer sb = new StringBuffer(str);

        if(str.equals(sb.reverse().toString())){
            System.out.println(str.length());
            return;
        }

        for (int i=1; i<str.length(); i++){

            StringBuffer sb3 = new StringBuffer(str.substring(0, i));
            String check = str+sb3.reverse().toString();
            StringBuffer sb2 = new StringBuffer(check);

            if(check.equals(sb2.reverse().toString())){
                System.out.println(sb2.length());
                break;
            }
        }
    }

    private static void input() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        str = bf.readLine();
    }
    
}

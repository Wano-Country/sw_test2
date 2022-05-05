package A와B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String s,t;

    public static void main(String[] args) throws IOException{

        input();
        solve();

    }

    private static void solve() {

        while (s.length() != t.length()) {

            if(t.charAt(t.length()-1) == 'A') {
                t = t.substring(0,t.length()-1);

            }else{
                t = t.substring(0, t.length()-1);
                flip(t);
            }
        }

        if(s.equals(t)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    private static void flip(String t2) {
        StringBuffer sb = new StringBuffer(t2);
        t = sb.reverse().toString();
    }

    private static void input() throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
        t = br.readLine();
    }


    
}

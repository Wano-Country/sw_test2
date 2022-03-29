package 팰린드롬만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*

    짝수여도 팰린드롬일 수 있다. 

    나는 홀수로 대칭인 것만 고려 함.
    */

    static String str;

    public static void main(String[] args) throws IOException{
        
        input();
        main_logic();
    }

    private static void main_logic() {
        
        int mid = (str.length()/2);

        Loop1 :
        while(mid<str.length()){
            for(int i=mid-1; i>=0; i--){
                if(mid+(mid-i) > str.length()-1) {
                    str = str + str.substring(i, i+1);
                } 
                else if(mid+mid-i < str.length()-1){
                    if(!str.substring(i, i+1).equals(str.substring(mid+(mid-i), mid+(mid-i)+1))) break;
                }else if(mid+mid-i == str.length()-1){
                    if(!str.substring(i, i+1).equals(str.substring(mid+(mid-i)))) break; 
                }

                if(i==0) {
                    System.out.println(str.length());
                    break Loop1;
                }
            }
            mid++;
        }
    }

    private static void input() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        str = bf.readLine();
    }
    
}

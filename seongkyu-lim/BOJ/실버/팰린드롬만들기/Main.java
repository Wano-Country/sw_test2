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
        int minimum = Integer.MAX_VALUE;

        for(int i=mid; i<str.length();i++){


            if(str.length()==1){
                System.out.println(1);
                break;
            }
            if(Character.compare(str.charAt(i), str.charAt(i-1))==0 && str.length()==2){
                System.out.println(2);
                break;
            }
            if(i==str.length()-1 && str.charAt(i)!= str.charAt(i-1) && minimum == Integer.MAX_VALUE){
                System.out.println(str.length()+str.substring(0,i).length());
                break;
            }

            // 왼쪽을 뒤집은 문자열이 오른쪽 문자열 길이 만큼만 같다면,
            // 전체 문자열 + 왼쪽 문자열 갯수 출력.
            StringBuffer sb = new StringBuffer(str.substring(0,i));
            String reverse = sb.reverse().toString();
            String right = str.substring(i+1);
/*
            System.out.println("left: "+str.substring(0, i));
            System.out.println("reverse: "+reverse);
            System.out.println("right: "+right);
            System.out.println(reverse.substring(0,right.length()));
            System.out.println("-------");
*/
            if (reverse.substring(0,right.length()).equals(right)){
                minimum = Math.min(minimum, str.length()+reverse.length()-right.length());
            }

            //mid 값이 mid-1값이랑 같으면, mid-2부터해서 왼쪽 문자열이 오른쪽 문자열 길이 만큼만 같다면,
            // 전체 문자열 + 왼쪽 문자열 갯수 출력수
            if(Character.compare(str.charAt(i), str.charAt(i-1))==0){
                StringBuffer sb2 = new StringBuffer(str.substring(0, i-1));
                String reverse2 = sb2.reverse().toString();
                if(reverse2.substring(0,right.length()).equals(right)){
                    minimum = Math.min(minimum, str.length()+reverse2.length()-right.length());
                    break;
                }
            }
        }
        if(minimum!= Integer.MAX_VALUE) System.out.println(minimum);
    }

    private static void input() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        str = bf.readLine();
    }
    
}

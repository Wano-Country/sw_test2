package 팰린드롬만들기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    static String str,ans;

    public static void main(String[] args) throws IOException{

        input();
        solve();
    }

    private static void solve() {

        if(str.length()==1) System.out.println(str);

        //뒤에서부터 조회하면서 i == i-1 인경우, ans에 더해준다.
        else if (str.length()%2 == 0){

            for(int i=str.length()-1; i>0; i-=2){
                if(Character.compare(str.charAt(i),str.charAt(i-1))==0){
                    ans = str.substring(i-1, i)+ ans + str.substring(i, i+1);
                }else{
                    ans = "I'm Sorry Hansoo";
                    System.out.println(ans);
                    break;
                }
            }
        }else{
            String mid = "";
            for(int i=str.length()-1; i>0; i-=2){

                if(Character.compare(str.charAt(i),str.charAt(i-1))==0){
                    ans = str.substring(i-1, i)+ ans + str.substring(i, i+1);
                }else{
                    if(mid.equals("")){
                        mid = str.substring(i, i+1);
                        i++;
                    }else{
                        ans = "I'm Sorry Hansoo";
                        System.out.println(ans);
                        break;
                    }
                }
                if(i==2) mid = str.substring(0, 1);
            }
            if(!ans.equals("I'm Sorry Hansoo")){
                ans = ans.substring(0, ans.length()/2)+mid+ans.substring(ans.length()/2);
            }
        }

        if(!ans.equals("I'm Sorry Hansoo")){
            System.out.println(ans);
        }
    }

    private static void input() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        str = bf.readLine();
        char[] sorted = str.toCharArray();
        Arrays.sort(sorted);
        str = new String(sorted);
        ans = "";
    }
}

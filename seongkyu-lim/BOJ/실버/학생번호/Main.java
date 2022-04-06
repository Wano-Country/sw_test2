package 학생번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n, cnt2;
    static String[] students;

    public static void main(String[] args) throws NumberFormatException, IOException{
        input();
        solve();
    }

    private static void solve() {
        int ans = 1;
        for(int i=students[0].length()-1; i>=0; i--){

            int cnt =0;

            Loop1 :
            for(int j=0; j<students.length-1; j++){
                for(int k=j+1; k<students.length; k++){
                    if(students[j].substring(i).equals(students[k].substring(i))){
                        ans++;
                        break Loop1;
                    }
                    cnt++;
                }
            }


            if(cnt == cnt2) {
                System.out.println(ans);
                break;
            }
        }
    }

    private static void input() throws NumberFormatException, IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        students = new String[n];

        for(int i=0; i<n; i++){
            students[i] = bf.readLine();
        }

        cnt2 = 0;
        for(int j=1; j<=students.length; j++){
            cnt2 += students.length-j;

        }
    }
    
}

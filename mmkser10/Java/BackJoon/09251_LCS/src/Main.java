import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int[][] memo = new int[a.length()+1][b.length()+1];

//        for(int i = 0; i <= a.length(); i++)
//            memo[i][0] = 0;
//        for(int i = 0; i <= b.length(); i++)
//            memo[0][i] = 0;

        for(int i = 1; i <= a.length(); i++) {
            for(int j = 1; j <= b.length(); j++) {
                if(a.charAt(i-1) == b.charAt(j-1))
                    memo[i][j] = memo[i-1][j-1] +1;
                else
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
            }
        }

        System.out.println(memo[a.length()][b.length()]);
    }
}
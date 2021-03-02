import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int showm(int N){
        int count = 0;
        for(int i = 100 ; ; i++) {
            String N_string = Integer.toString(i);
            if (N_string.contains("666")) {
                count++;
                if (count == N) {
                    return i;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        System.out.println(showm(N));

    }
}

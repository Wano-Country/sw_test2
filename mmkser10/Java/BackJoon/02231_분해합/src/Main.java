import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int find_SUM(int n){
        int sum = n;
        while(n != 0){
            sum += (n % 10);
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 1 ; i <= N ; i++){
            int sum = find_SUM(i);
            if(N == sum){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

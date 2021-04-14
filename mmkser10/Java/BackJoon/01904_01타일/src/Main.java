import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] memory = new int[N+1];
        memory[0]=1;
        memory[1]=1;
        for(int x = 2 ; x < N+1 ; x++){
            memory[x] = memory[x-1]+memory[x-2];
            memory[x]%=15746;
        }
        System.out.println(memory[N]);
    }
}
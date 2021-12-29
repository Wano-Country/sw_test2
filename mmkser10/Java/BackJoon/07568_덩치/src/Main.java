import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] spce = new int[N*2];
        int[] rank = new int[N];

        for(int i = 0 ; i < spce.length ; i+=2){
            st = new StringTokenizer(br.readLine());
            spce[i] = Integer.parseInt(st.nextToken());
            spce[i+1] = Integer.parseInt(st.nextToken());
        }

        for(int x = 0 ; x < rank.length*2 ; x+=2 ) {
            for (int y = 0 ; y < spce.length; y+= 2) {
                if(spce[x] < spce[y] && spce[x+1] < spce[y+1]){
                    rank[x/2]++;
                }
            }
        }
        for(int z = 0 ; z < rank.length ; z++ ) {
            System.out.print(rank[z]+1 + " ");
        }
    }
}

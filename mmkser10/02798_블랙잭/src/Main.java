import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int blackJack(int[] card, int blackJack) {
        int add = 0;
        int tmp = blackJack;
        int result = 0;
        for (int x = 0; x < card.length - 2; x++) {
            for (int y = x+1; y < card.length - 1; y++) {
                for (int z = y+1; z < card.length; z++) {
                    add = card[x] + card[y] + card[z];
                    if(blackJack - add == 0){
                        result = blackJack;
                        return result;
                    }
                    else{
                        if(Math.abs(blackJack - add) < tmp && blackJack - add > 0) {
                            tmp = Math.min(Math.abs(blackJack - add), tmp);
                            result = blackJack - tmp;
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        int blackJack = Integer.parseInt(st.nextToken());
        int[] card = new int[loop];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < loop ; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(blackJack(card, blackJack));
    }
}

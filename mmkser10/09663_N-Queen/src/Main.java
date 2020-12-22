import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static int count;
    static int queen[];


    public static void countNQueens(int n, int current){
        boolean isPossible;
        if(current == n){
            count++;
            return;
        }

        for(int i = 0 ; i < n ; i++){
            isPossible = true;
            for(int j = 0 ; j < current ; j++){
                if(i == queen[j] || i == queen[j]+(current-j) || i == queen[j]-(current-j)){
                    isPossible = false;
                    break;
                }
            }

            if(isPossible){
                queen[current] = i;
                countNQueens(n, current+1);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        queen = new int[N];
        count = 0;
        countNQueens(N, 0);
        System.out.println(count);
    }
}
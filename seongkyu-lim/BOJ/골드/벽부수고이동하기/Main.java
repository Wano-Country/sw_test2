package 벽부수고이동하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    /*

    그래프 탐색 / BFS

    - 한번은 벽을 부술 수 있다.

    */

    static int N;
    static int M;
    static int[][] arr;
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for(int i=0; i<N; i++){

            String row = bf.readLine();

            for(int j=0; j<M; j++){
                arr[i][j] = Character.getNumericValue(row.charAt(j));
            }
        }        


    }
    
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chess = new char[N][M];
        char[] BW = new char[]{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
        char[] WB = new char[]{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        int result = N * M;

        for (int i = 0; i < N; i++) {
            String point = br.readLine();
            for (int j = 0; j < M; j++) {
                chess[i][j] = point.charAt(j);
            }
        }

        for (int x = 0; x <= N - 8; x++) {
            for (int y = 0; y <= M - 8; y++) {
                int countA = 0;
                int countB = 0;
                for (int a = 0; a < 8; a++) {
                    for (int b = 0; b < 8; b++) {
                        if (a % 2 == 0) {
                            if (chess[a + x][b + y] != WB[b]) {
                                countA++;
                            }
                            else countB++;
                        } else {
                            if (chess[a + x][b + y] != BW[b]) {
                                countA++;
                            }
                            else  countB++;
                        }
                    }
                }
                result = Math.min(result, Math.min(countA, countB));
            }
        }
        System.out.println(result);
    }
}

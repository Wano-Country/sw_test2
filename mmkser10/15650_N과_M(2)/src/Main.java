import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    private static void dfs(int n, int m, int d, int k) {
        if(d == m) {
            for(int a = 0 ; a < arr.length ; a++){
                sb.append(arr[a] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(!visit[i] && i > k) {
                visit[i] = true;
                arr[d] = i;
                dfs(n, m, d+1, i);
                visit[i] = false;
            }
        }
        return;
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visit = new boolean[n+1];

        dfs(n, m, 0, 0);
        System.out.print(sb);
    }
}
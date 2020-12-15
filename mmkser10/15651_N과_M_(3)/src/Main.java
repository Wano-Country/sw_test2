import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    private static void dfs(int n, int m, int d) {
        if(d == m) {
            for(int a = 0 ; a < arr.length ; a++){
                sb.append(arr[a] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++) {
            arr[d] = i;
            dfs(n, m, d+1);
        }
        return;
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs(n, m, 0);
        System.out.print(sb);
    }
}
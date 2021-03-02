import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int arr[];
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int n, int m, int d, int k){
        if(m == d){
            for(int i = 0 ; i < arr.length ; i++){
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1 ; i <= n ; i++){
            if(i >= k) {
                arr[d] = i;
                dfs(n, m, d + 1, i);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs(n ,m ,0, 0);
        System.out.println(sb);
    }
}

package 먹을것인가먹힐것인가;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int testcase,n,m;
    static int[] a,b;
    public static void main(String[] args) throws NumberFormatException, IOException {
            
        testcase = scan.nextInt();
        for(int i=0; i<testcase; i++){
            input();
            solve();
        }
    }

    private static void solve() {
        int answer = 0;
        Arrays.sort(b);
        for (int i=0; i<n; i++){
            answer += binarysearch_lowerbound(0,m-1,a[i]);
        }
        System.out.println(answer);
    }

    private static int binarysearch_lowerbound(int left, int right, int value) {
        int result = 0;
        while(left<=right){

            int mid = (left+right)/2;   
            if(b[mid]<value){
                result = mid+1;
                left = mid+1;        
            }else{
                right = mid-1;
            }
        }
        return result;
    }

    private static void input() throws IOException {

        n = scan.nextInt();
        m = scan.nextInt();
        a = new int[n];
        b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = scan.nextInt();
        }
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

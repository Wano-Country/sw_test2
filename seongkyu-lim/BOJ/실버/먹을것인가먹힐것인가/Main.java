package 먹을것인가먹힐것인가;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int testcase,n,m;
    static int[] a,b;
    public static void main(String[] args) throws NumberFormatException, IOException {
    
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        testcase = Integer.parseInt(bf.readLine());
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
        BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf2.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n];
        b = new int[m];

        StringTokenizer st2 = new StringTokenizer(bf2.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st2.nextToken());
        }
        StringTokenizer st3 = new StringTokenizer(bf2.readLine());
        for(int i=0; i<m; i++){
            b[i] = Integer.parseInt(st3.nextToken());
        }
    }
}

package 짝수팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[] arr = new int[5000];
    public static void main(String[] args) {
        /*
         * 최소 2개, 짝수개
         * 
         * point : 가장 작은 갯수의 팰린드롬을 찾으면 그것이 최적의 상태입.
         */

        FastReader fr = new FastReader();

        n = fr.nextInt();
        for (int i=0; i<n; i++){
            arr[i] = fr.nextInt();
        }        
        
        int answer = 0;
        int j=0;
        for (int i=0; i<n;){
            boolean found = false;
            for (j=i+1; j<n; j +=2){
                if (isEvenPalindrome(i, j)){
                    answer +=1;
                    found = true;
                    break;
                }
            }
            
            if(!found){
                answer = -1;
                break;
            }
            i = j+1;

        }
        System.out.println(answer);


    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() { return Integer.parseInt(next()); }

    }

    public static boolean isEvenPalindrome(int left, int right){
        if ((right-left) % 2 == 0) return false;
        for (int i=0; i<= (right-left)/2; i++){
            if (arr[left+i] != arr[right-i]) return false;
        }
        return true;
    }
    
}

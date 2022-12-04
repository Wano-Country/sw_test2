package 소소수최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long answer = 1L;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            long num = Integer.parseInt(st.nextToken());
            // if(isPrime(num)) answer *= num;
            if(isPrime(num)) answer = LCM(answer, num);
        }

        if (answer == 1L) System.out.println(-1);
        else System.out.println(answer);

    }

    private static boolean isPrime(long num) {
        for (int i = 2; i<=(int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
          }
          return true;
    }

    static long GCD(long a, long b) {
        if(b == 0) return a;
        return GCD(b, a % b);
    }

    static long LCM(long a, long b) {
        return a / GCD(a, b) * b;
    }
}

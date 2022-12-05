package 블로그;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt =1;
        int value = 0;
        for(int i=0; i<x; i++){
            value += arr[i];
        }
        int max = value;

        for(int i=x; i<n; i++){
            value -= arr[i-x];
            value += arr[i];

            if(max == value) cnt+=1;
            else if(max<value) {
                cnt =1;
                max = value;
            }
        }

        if(max==0) System.out.println("SAD");
        else{
            System.out.println(max);
            System.out.println(cnt);
        }
    }
    
}

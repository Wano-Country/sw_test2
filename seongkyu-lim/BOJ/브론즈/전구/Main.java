package 전구;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr = process(arr, a, b, c);
            // System.out.println("array : "+Arrays.toString(arr));
        }

        for(int i=0; i<n; i++){
            if(i==n-1) System.out.print(arr[i]);
            else System.out.print(arr[i]+" ");
        }
    }

    private static int[] process(int[] arr, int a, int b, int c) {

        if (a==1){
            arr[b-1] = c;
        }else if(a==2){
            for(int i=b-1; i<=c-1; i++){
                if(arr[i]==0) arr[i]=1;
                else arr[i]=0;
            }
        }else if(a==3){
            for(int i=b-1; i<=c-1; i++){
                arr[i]=0;
            }
        }else if(a==4){
            for(int i=b-1; i<=c-1; i++){
                arr[i]=1;
            }
        }

        return arr;
    }

}
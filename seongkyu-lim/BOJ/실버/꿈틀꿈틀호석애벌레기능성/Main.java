package 꿈틀꿈틀호석애벌레기능성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n,k,max;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        input();

        for (int i=0; i<n; i++){
            recurssion_func(i, arr[i], 0);
        }

        System.out.println(max);

    }

    private static void recurssion_func(int idx, int value, int energe) {

        if(idx == n){
            max = Math.max(energe, max);
        }else {

            while(true){
                if(value>=k){
                    energe += value-k;
                    value=0;
                    break;
                }
                if(idx == n-1) break;
                idx++;
                value += arr[idx];
            }

            for(int i=idx+1; i<n+1; i++){
                recurssion_func(i, arr[i], energe);                
            }
        }
    }

    private static void input() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n+1];

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        max = Integer.MIN_VALUE;
    }
    
}

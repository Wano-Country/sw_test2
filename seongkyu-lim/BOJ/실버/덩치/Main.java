package 덩치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] weight,height, lanking;

    public static void main(String[] args) throws IOException{

        input();
        solve();
        print();
    }

    private static void print() {

        for(int i=0; i<n; i++){
            System.out.print(lanking[i]+" ");
        }
    }

    private static void solve() {

        for(int i=0; i<n; i++){
            int k=1;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(weight[i]<weight[j] && height[i]<height[j]) k++;
            }
            lanking[i] = k;
        }
    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());

        weight = new int[n];
        height = new int[n];
        lanking = new int[n];
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }
    }
    
}

package 한줄로서기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] arr;
    static List<Integer> list;
    public static void main(String[] args) throws IOException{
        
        input();
        main_logic();
        print();

    }

    private static void print() {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)+" ");
        }
        System.out.println(sb);
    }

    private static void main_logic() {
    
        list = new ArrayList<>();
        
        for(int i=n-1; i>-1; i--){
            list.add(arr[i],i+1);
        }
    }

    private static void input() throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    
}

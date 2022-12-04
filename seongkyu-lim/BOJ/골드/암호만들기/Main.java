package 암호만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int l,c;
    static String[] arr;
    static int[] visited;
    static List<String> answer;
    public static void main(String[] args) throws IOException{
        input();
        solve();
        print();

    }

    private static void print() {
        Collections.sort(answer);
        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }

    private static void solve() {
        choice(0, 0);
    }

    private static void choice(int n, int length) {
        if(length == l) {
            List<String> choosed = new ArrayList<>();
            for(int i=0; i<c; i++){
                if(visited[i]==1) choosed.add(arr[i]);
            }
            check(choosed);
            return;
        }
        for(int i=n; i<c; i++){
            visited[i] = 1;
            choice(i+1, length+1);
            visited[i] = 0;
        }
    }

    private static void check(List<String> choosed) {
        int consonant = 0;
        for(int i=0; i<choosed.size(); i++){
            if(choosed.get(i).equals("a") || choosed.get(i).equals("e") || choosed.get(i).equals("i") || choosed.get(i).equals("o") || choosed.get(i).equals("u")) consonant++;   
        }
        if(consonant>0 && l-consonant >1){
            //오름 차순으로 정렬해서 출력.
            Collections.sort(choosed); 
            answer.add(String.join("",choosed));
        }

    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new String[c];

        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        for(int i=0; i<c; i++){
            arr[i] = st2.nextToken();
        }

        visited = new int[c];

        answer = new ArrayList<>();

    }
    
}

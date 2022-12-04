package 치킨배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n,m,min;
    static int[][] arr;
    static List<chicken_house> houses;
    static int[] visited;

    public static void main(String[] args) throws IOException{
        input();
        solve();
    }

    private static void solve() {

        houses = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 2){
                    houses.add(new chicken_house(i, j));
                }
            }
        }
        visited = new int[houses.size()];

        choice(0,0);

        System.out.println(min);

    }

    private static void choice(int level, int length) {
        if(length == m){
            List<chicken_house> selected = new ArrayList<>();
            for(int i=0; i<visited.length; i++){{
                if(visited[i] == 1){
                    selected.add(houses.get(i));
                }
            }}
            min = Math.min(calc_distance(selected), min);
            return;
        }
        for(int i=level; i<houses.size(); i++){
            visited[i] = 1;
            choice(i+1, length+1);
            visited[i] = 0;            
        }
    }

    private static int calc_distance(List<chicken_house> selected) {

        int sum_distance = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1){
                    int min_dis = Integer.MAX_VALUE;
                    for(int k=0; k<m; k++){
                        min_dis = Math.min(min_dis, Math.abs(i-selected.get(k).x)+Math.abs(j-selected.get(k).y));
                    }
                    sum_distance += min_dis;
                }
            }
        }

        return sum_distance;
    }

    static class chicken_house{
        int x,y;

        chicken_house(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        min = Integer.MAX_VALUE;
    }
    
}

package 숫자정사각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n,m, max;
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        input();
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                main_logic(j,i);
            }
        }
        System.out.println(max);
    }

    //row,column == 시작 포인트.
    private static void main_logic(int row, int column) {

            int i = column+1;
            int j= row+1;
            while(i<m && j<n){
                if(arr[row][column]==arr[j][i] && arr[row][column]==arr[j][column] && arr[row][column]==arr[row][i]){
                    max = Math.max(max, (i-column+1)*(i-column+1));
                }
                i++;
                j++;
            }
    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i=0; i<n; i++){
            String row = bf.readLine();
            for (int j=0; j<m; j++){
                arr[i][j] = Character.getNumericValue(row.charAt(j));
            }
        }

        max = 1;
    }
    
}

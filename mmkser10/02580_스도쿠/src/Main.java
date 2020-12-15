import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    static int[][] sudoku = new int[10][10];
    static ArrayList<Integer> row_list;
    static ArrayList<Integer> col_list;
    static int count;

    public static boolean isPossible(int row, int col, int number){
        for(int i = 1 ; i <= 9 ; i++){
            if( sudoku[i][col] == number && row != i){
                return false;
            }
            if( sudoku[row][i] == number && col != i){
                return false;
            }
        }
        for(int x = (((row-1)/3)+1)*3-2 ; x <= (((row-1)/3)+1)*3 ; x++){
            for(int y = (((col-1)/3)+1)*3-2 ; y <= (((col-1)/3)+1)*3 ; y++){
                if(sudoku[x][y] == number && row != x && col != y){
                    return false;
                }
            }
        }
        return true;
    }

    public static void solveSudoku(int n, int current){
        if(n == current){
            for(int i = 1 ; i <= 9 ; i++){
                for(int j = 1 ; j <= 9 ; j++){
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        for(int k = 1 ; k <= 9 ; k++){
            boolean Success = isPossible(row_list.get(current), col_list.get(current), k);
            if(Success){
                sudoku[row_list.get(current)][col_list.get(current)] = k;
                solveSudoku(n, current+1);
                sudoku[row_list.get(current)][col_list.get(current)] = 0;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        row_list = new ArrayList<>();
        col_list = new ArrayList<>();

        for(int i = 1 ; i <= 9 ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <= 9 ; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp == 0){
                    count++;
                    row_list.add(i);
                    col_list.add(j);
                }
                sudoku[i][j] = tmp;
            }
        }
        solveSudoku(count, 0);
    }
}
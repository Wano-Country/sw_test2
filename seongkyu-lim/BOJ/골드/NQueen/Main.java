package NQueen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] arr;
    static int n;
    static int cnt = 0;
    

    public static void main(String[] args) throws NumberFormatException, IOException{

        input();
        solve(0);
        System.out.println(cnt);
    }

    private static void solve(int row) {

        if(row == n) {
            cnt++;
            return;
        }

        for (int i=0; i<n; i++){
            arr[row] = i;
            
            if(Possibility(row)) {
                solve(row+1);
            }
        }


    }

    private static boolean Possibility(int col) {
        for (int i = 0; i < col; i++) {

            if (arr[col] == arr[i]) {
				return false;
			} 
			
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		
		return true;
    }

    private static void input() throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());
        arr = new int[n];
    }


    
}

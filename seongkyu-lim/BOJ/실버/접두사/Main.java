package 접두사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static String[] arr;
    static int[] check;
    

    public static void main(String[] args) throws NumberFormatException, IOException{
        input();
        solve();
    
    }

    private static void solve() {
        int removed = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                // arr[i] 문자와 다른 문자들을 비교하면서 접두사가 될경우 둘중에 길이가 작은 것을 제거하고 반복문 탈출.
                
                // 제거된 문자가 아닐 경우.
                if(check[i]==0 && check[j]==0){
                    if(arr[i].length()>= arr[j].length()){
                        if(arr[j].equals(arr[i].substring(0,arr[j].length()))){
                            check[j] = 1;
                            removed++;
                        }
                    }else if(arr[i].length()<arr[j].length()){
                        if(arr[i].equals(arr[j].substring(0,arr[i].length()))){
                            check[i] = 1;
                            removed++;
                        }
                    }
                }
            }
        }

        System.out.println(arr.length - removed);
    }

    private static void input() throws NumberFormatException, IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());

        arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = bf.readLine();
        }

        check = new int[n];
    
    }
    
}

package 두수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n,x;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        input();
        solve();
    }

    private static void solve() {

        int answer = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=x) break;
            int yes = binary_search(0,n,x-arr[i]);
            if(yes ==1 ) answer++;
        }
        System.out.println(answer/2);
    }

    private static int binary_search(int left, int right, int value) {

        int result = 0;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<value){
                left = mid+1;
            }else if(arr[mid]>value){
                right = mid-1;
            }else if(arr[mid]==value){
                result =1;
                break;
            }
        }
        return result;
    }

    private static void input() throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());

        arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        x = Integer.parseInt(bf.readLine());
    }
    
}

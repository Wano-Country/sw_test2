package 통계학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        boolean isMinus = false;
        if(sum < 0) isMinus = true;

        if(isMinus){
            System.out.println(-(Math.round(Math.abs(sum)/(double)n)));
        }else{
            System.out.println(Math.round(sum/(double)n));
        }
        Arrays.sort(arr);
        System.out.println(arr[n/2]);

        int[] cnt = new int[8000+1];
        int max = Integer.MIN_VALUE;
        int find = 0;
        int first = 0;
        int second = 0;
        int cnt2 = 0;
        for(int i=n-1; i>-1; i--){
            int idx = arr[i] + 4000;

            cnt[idx] += 1;
            if(cnt[idx]==max){
                second = first;
                first = idx;
                cnt2++;
                continue;
            }
            if(cnt[idx]>max){
                max = cnt[idx];
                find = idx;
            }
        }
        if(cnt[second] == cnt[find]) System.out.println(second-4000);
        else System.out.println(find-4000);
        

        System.out.println(arr[n-1]-arr[0]);
    }
}
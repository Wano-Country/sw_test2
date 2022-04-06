package Test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        long a = 1l;
        long b = 2l;


        System.out.println((a|b));

        long answr = Math.max(a,b);

        
    }

    private static void recursive_fun(int[] arr, int x) {

        for(int i=x; i<arr.length; i++){
            //System.out.println(Arrays.toString(arr));

            if(arr[i]==0){
                /*
                arr[i]=1;
                recursive_fun(arr);
                arr[i]=0;

                arr[i]=2;
                recursive_fun(arr);
                arr[i]=0;

                arr[i]=3;
                recursive_fun(arr);
                arr[i]=0;
                */
                for(int j=1; j<4; j++){
                    arr[i]=j;
                    recursive_fun(arr, x+1);
                    arr[i]=0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


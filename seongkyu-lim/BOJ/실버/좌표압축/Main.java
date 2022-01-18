package 좌표압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        String pointers = bf.readLine();
        String[] arr = pointers.split(" ");
        int[] arr2 = new int[num];

        for (int i=0; i<num; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }

        int[] sortedArr2 = arr2.clone();
        Arrays.sort(sortedArr2);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int n : sortedArr2)
            if (!map.containsKey(n))
                map.put(n, idx++);
        StringBuilder sb = new StringBuilder();
        for (int n : arr2)
            sb.append(map.get(n)).append(' ');

        System.out.println(sb.toString());    
    }
    
}

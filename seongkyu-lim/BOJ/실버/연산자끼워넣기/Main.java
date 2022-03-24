package 연산자끼워넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n,max,min;
    static int[] num, operators;

    public static void main(String[] args) throws IOException{

        input();

        recursion_func(1, num[0]);

        System.out.println(max);
        System.out.println(min);

    }

    private static void recursion_func(int x, int value) {

        if(x == n){ // 마지막 까지 연산이 모두 끝나면 최댓값, 최솟값 갱신.
            max = Math.max(max, value);
            min = Math.min(min, value);
        }else { 
            for(int i=0; i<4; i++){
                if(operators[i]>0){
                    operators[i]--;
                    recursion_func(x+1, calc(i, value, num[x]));
                    operators[i]++;
                }
            }
        }
    }

    private static int calc(int i, int operand1, int operand2) {

        if(i==0){
            return operand1+operand2;
        }else if(i==1){
            return operand1-operand2;
        }else if(i==2){
            return operand1*operand2;
        }else{
            return operand1/operand2;
        }
    }

    static void input() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());

        num = new int[n];
        operators = new int[4];
        
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        for (int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(bf.readLine()," ");
        for (int i=0; i<4; i++){
            operators[i] = Integer.parseInt(st2.nextToken());
        } 

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    
}

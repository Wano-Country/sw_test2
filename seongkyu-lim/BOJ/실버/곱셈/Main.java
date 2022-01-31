package 곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    분할 정복 제곱 수.
    */
    /*
    나머지에 곱해준 것의 나머지와 원래값의 나머지는 같다.

    처음 풀이 : 나머지의 사이클이 생기는 지점까지만 반복문을 통해 나머지를 구해준뒤, 계산식을 통해 나머지를 구해준다.
    -> 입력받을 수 있는 수의 값이 크기때문에 사이클의 크기가 아주 큰 경우에 메모리초과 발생.
    */
    /*
    https://st-lab.tistory.com/237
    두번 째 풀이 : 고속 거듭제곱 알고리즘, 모듈러알고리즘.
    재귀 이용해서 분할 정복.

    */

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        long answer = fastPow(a, b, c);
        System.out.println(answer);
    }

    public static long fastPow(long value, long exp, long c){

        if(exp ==1) return value%c;

        long tmp = fastPow(value, exp/2, c);

        if(exp%2==1){
            return (tmp*tmp%c)*value%c;
        }else {
            return tmp*tmp%c;
        }
    }
}

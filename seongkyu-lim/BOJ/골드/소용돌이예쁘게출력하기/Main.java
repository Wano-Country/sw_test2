package 소용돌이예쁘게출력하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    // 메모리초과. 

    static int r1,c1,r2,c2,size, value, row, column;
    static int[][] arr;
    public static void main(String[] args) throws IOException{

        input();
        make_arr();
        print();
    }

    private static void print() throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "";

        //예쁘게 출력하기위해 가장 큰 수 찾기.
        int max_num = 0;
        for(int i=0; i<r2-r1+1; i++){
            for(int j=0; j<c2-c1+1; j++){
                if(arr[i][j]>max_num) max_num = arr[i][j];
            }
        }

        //가장 큰 수의 자릿수.
        int max_length = (int)(Math.log10(max_num)+1);

        for(int i=0; i<r2-r1+1; i++){
            for(int j=0; j<c2-c1+1; j++){

                int length = (int)(Math.log10(arr[i][j])+1); 
                if(length == max_length) answer += arr[i][j]+" ";
                else{
                    
                    String space = "";
                    for(int k=0; k<max_length-length; k++){
                        space +=" ";
                    }
                    answer += space+arr[i][j]+" ";
                }
            }
            answer += "\n";
        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }

    private static void make_arr() {

        // 값을 순서대로 모두 체크하지만 배열에 넣는 것은 범위에 해당하는 값들만 넣는다.

        //가상의 전체 배열하나 존재한다 생각하고 값들을 순서대로 조회.
        //row, column점은 가상의 배열을 순회하는 것.
        //실제 배열은 부분 배열. -> 계산해서 넣어준다. -> row-r1,column-c1
        //실제 배열의 시작점(0,0) -> 가상 배열의 r1,c1


        if(r1+size<=row && row<= r2+size && c1+size<=column && c2+size>=column) arr[row-(r1+size)][column-(c1+size)] = value;

        for(int i=1; i<size+1; i++){

            ++column;
            ++value;
            if(r1+size<=row && row<= r2+size && c1+size<=column && c2+size>=column) arr[row-(r1+size)][column-(c1+size)] = value;

            // 오른쪽 면.
            for(int j=0; j<2*i-1; j++){
                row -=1;
                ++value;
                if(r1+size<=row && row<= r2+size && c1+size<=column && c2+size>=column) arr[row-(r1+size)][column-(c1+size)] = value;
            }
            // 윗 면.
            for(int j=0; j<2*i; j++){
                column -=1;
                ++value;
                if(r1+size<=row && row<= r2+size && c1+size<=column && c2+size>=column) arr[row-(r1+size)][column-(c1+size)] = value;
            }
            //왼쪽 면.
            for(int j=0; j<2*i; j++){
                row +=1;
                ++value;
                if(r1+size<=row && row<= r2+size && c1+size<=column && c2+size>=column) arr[row-(r1+size)][column-(c1+size)] = value;
            }
            //아랫 면.
            for(int j=0; j<2*i; j++){
                column +=1;
                ++value;
                if(r1+size<=row && row<= r2+size && c1+size<=column && c2+size>=column) arr[row-(r1+size)][column-(c1+size)] = value;
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        r1= Integer.parseInt(st.nextToken());
        size = Math.abs(r1);
        c1= Integer.parseInt(st.nextToken());
        size = Math.max(size,Math.abs(c1));
        r2= Integer.parseInt(st.nextToken());
        size = Math.max(size,Math.abs(r2));
        c2= Integer.parseInt(st.nextToken());
        size = Math.max(size,Math.abs(c2));        
        
        arr = new int[r2-r1+1][c2-c1+1];
        value = 1;
        row = size;
        column = size;
    }
}

package 최대힙;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        MaxHeap heap = new MaxHeap();

        int num = Integer.parseInt(bf.readLine());

        for(int i=0; i<num; i++){
            int val = Integer.parseInt(bf.readLine());
            if (val == 0){
                bw.write(heap.delete()+"\n");
            }else{
                heap.insert(val);
            }
        }
        bw.flush();
        bw.close();
    }   
}


class MaxHeap{
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<Integer>();
        heap.add(0); //첫번째 인덱스는 사용하지 않음
    }

    //삽입
    public void insert(int val) {
        //맨 마지막 위치에 삽입
        heap.add(val);

        int  p = heap.size()-1; //새로 넣은 노드의 인덱스 위치 정보
        //루트까지 이동 자식이 더 크면 교환
        while(p>1 && heap.get(p)> heap.get(p/2)) {
            int tmp = heap.get(p/2);
            heap.set(p/2, heap.get(p));
            heap.set(p, tmp);

            p /= 2;
        }
    }
    //삭제
    public int delete() {
        //힙 이 비어있으면 0리턴
        if(heap.size()-1 < 1) {
            return 0;
        }

        //삭제할 루트 노드 값 저장
        int deleteitem = heap.get(1);

        //맨 마지막 자식 루트에 넣고 마지막 값 삭제
        heap.set(1,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        //루트에 새로 넣은 노드의 인덱스 정보
        int pos = 1;
        while((pos*2)<heap.size()) {

            int max = heap.get(pos*2);
            int maxPos = pos*2;

            //오른쪽 자식이 존재하고 오른쪽 자식이 왼쪽 자식보다 클때 바꿀 자식 오른쪽으로 설정
            if((pos*2 +1)<heap.size() && max < heap.get(pos*2+1)) {
                max = heap.get(pos*2+1);
                maxPos = pos*2+1;
            }

            //부모가 더 크면 끝
            if(heap.get(pos) > max){
                break;
            }

            //자식이 더 크면 교환
            int tmp = heap.get(pos);
            heap.set(pos, max);
            heap.set(maxPos, tmp);
            pos = maxPos;
        }
        return deleteitem;
    }
}
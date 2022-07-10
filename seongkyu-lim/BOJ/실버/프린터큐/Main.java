import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st1.nextToken());
            int location = Integer.parseInt(st1.nextToken());
            
            Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용

            for(int j=0; j<num; j++){
                queue.add(Integer.parseInt(st2.nextToken()));
            }

            logic(num, location, queue);
        }

    }

    private static void logic(int num, int location, Queue<Integer> queue){

        int answer = 1;

        while(true){
            /*
             * queue에서 꺼냈을 때 해당 값보다 큰 값이 있으면 다시 queue에 넣기.
             * queue에서 꺼냈을 떄 가장 큰 값이면 빼내기.
             * queue에서 꺼냈을 떄 가장 큰 값이면서 찾고자 했던 값이면 탈출.
             */
            
            Integer value = queue.poll();
            if(location != 0) location--;

            int cnt = 0;
            for (Integer data : queue) {
                if(data > value){
                    if (location == 0) location = queue.size();
                    queue.add(value);
                    break;
                }
                cnt++;
            }

            if (cnt == queue.size()){
                if (location == 0){
                    System.out.println(answer);
                    break;
                }else{
                    answer++;
                }
            }
        } 
    }

    // private static class Value{
    //     int val;
    //     int loc;

    //     public Value(int val, int loc){
    //         this.val = val;
    //         this.loc = loc;
    //     }
    // }
}

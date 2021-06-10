import java.util.LinkedList;
import java.util.Queue;
class Truck{
    int truckWeight;
    int inTime;

    public Truck(int truckWeight, int inTime) {
        this.truckWeight = truckWeight;
        this.inTime = inTime;
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> truck_queue = new LinkedList<>();
        Queue<Truck> bridge_truck = new LinkedList<>();

        int weightAdd = 0;
        int answer = 0 ;

        for(int x = 0 ; x < truck_weights.length ; x++){
            truck_queue.add(truck_weights[x]);
        }

        while (true) {
            answer++;
            if(!bridge_truck.isEmpty()){
                if(answer - bridge_truck.peek().inTime == bridge_length){
                    weightAdd-=bridge_truck.poll().truckWeight;
                }
            }
            
            if(truck_queue.isEmpty()){
                if(bridge_truck.isEmpty())
                    break;
            }
            else{
                if(weightAdd+truck_queue.peek() <= weight) {
                    int truck = truck_queue.poll();
                    weightAdd += truck;
                    bridge_truck.add(new Truck(truck, answer));
                }
            }
        }
        return answer;
    }
}
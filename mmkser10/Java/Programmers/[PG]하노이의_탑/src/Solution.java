import java.util.ArrayList;

class Solution {
    ArrayList<int[]> memory;

    public void hanoi(int from, int middle, int to, int number){
        int[] set = new int[]{from, to};
        if(number == 0)
            return;
        hanoi(from, to, middle, number-1);
        memory.add(set);
        hanoi(middle, from, to, number-1);
    }

    public int[][] getMemory(){
        int[][] arrayMemory = new int[memory.size()][2];
        for(int x = 0 ; x < memory.size() ; x++) {
            arrayMemory[x][0] = memory.get(x)[0];
            arrayMemory[x][1] = memory.get(x)[1];
        }
        return arrayMemory;
    }


    public int[][] solution(int n) {
        memory = new ArrayList<>();
        hanoi(1,2,3,n);
        return getMemory();
    }
}
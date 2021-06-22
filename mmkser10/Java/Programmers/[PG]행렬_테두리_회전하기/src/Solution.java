import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] array = new int[rows][columns];
        int[] answer = new int[queries.length];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                array[i][j] = i*columns + j + 1;
            }
        }

        for(int k = 0 ; k < queries.length ; k++) {
            int[] start = new int[]{queries[k][0] - 1, queries[k][1] - 1};
            int[] end = new int[]{queries[k][2] - 1, queries[k][3] - 1};
            Queue<Integer> memoryA = new LinkedList<>();
            Queue<Integer> memoryB = new LinkedList<>();
            memoryA.add(array[start[0]][start[1]]);
            memoryB.add(array[end[0]][end[1]]);
            int min = Math.min(memoryA.peek(), memoryB.peek());

            for (int l = 1 ; l <= end[1] - start[1]; l++) {
                memoryA.add(array[start[0]][start[1] + l]);
                array[start[0]][start[1] + l] = memoryA.poll();
                memoryB.add(array[end[0]][end[1] - l]);
                array[end[0]][end[1] - l] = memoryB.poll();
                min = Math.min(memoryA.peek(), min);
                min = Math.min(memoryB.peek(), min);
            }
            for (int m = 1 ; m <= end[0] - start[0]; m++) {
                memoryA.add(array[start[0] + m][end[1]]);
                array[start[0] + m][end[1]] = memoryA.poll();
                memoryB.add(array[end[0] - m][start[1]]);
                array[end[0] - m][start[1]] = memoryB.poll();
                min = Math.min(memoryA.peek(), min);
                min = Math.min(memoryB.peek(), min);
            }
            answer[k] = min;
        }
        return answer;
    }
}
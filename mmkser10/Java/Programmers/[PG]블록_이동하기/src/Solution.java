class Solution {

    public void findMaze(int[] front, int[] end, int[][] board){

    }
    public int solution(int[][] board) {
        int answer = 0;

        int[] robotFront = new int[]{0, 0};
        int[] robotEnd = new int[]{0, 1};
        findMaze(robotFront, robotEnd, board);

        int[] fourMovingXIndex = new int[]{-1, 1, 0 ,0};
        int[] fourMovingYIndex = new int[]{0, 0, -1, 1};

        int[] rowClockXSpinFront = new int[]{-1,-1, 1, 1};
        int[] rowClockYSpinFront = new int[]{-1, 0, -1, 0};

        int[] rowClockXSpinBack = new int[]{-1,-1, 1, 1};
        int[] rowClockYSpinBack = new int[]{1, 0, 1, 0};




        return answer;

    }
}
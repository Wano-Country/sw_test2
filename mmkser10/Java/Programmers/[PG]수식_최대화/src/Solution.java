import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    public long solution(String expression) {
        String[] arith = new String[]{"+", "*" + "-"};
        int[][] orderArray = new int[][]{{0,1,2}, {0,2,1}, {1,0,2}, {1,2,0}, {2,0,1}, {2,1,0}};
        String dummyNumber = expression;
        dummyNumber = dummyNumber.replaceAll("[-*+]", " ");
        List<String> listNumber = Arrays.asList(dummyNumber.split(" "));

        String dummyArith = expression;
        dummyArith = dummyArith.replaceAll("[0-9]{1,3}", " ");
        List<String> listArith = Arrays.asList(dummyArith.split(" "));
        long answer = 0;

        for(int x = 0 ; x < 6 ; x++){
            List<String> _listNumber = listNumber;
            List<String> _listArith = listArith;

            Stack<Integer> stackNumber = new Stack<>();
            Stack<String> stackArith = new Stack<>();
            stackNumber.push(Integer.parseInt(_listNumber.get(0)));
            for(int y = 0 ; y < 3 ; y++) {

                for (int z = 0; z < _listArith.size(); z++) {
                    stackNumber.push(Integer.parseInt(_listNumber.get(z+1)));
                    stackArith.push(_listArith.get(z));

                    if(stackArith.peek().equals(arith[orderArray[x][y]])){
                        int numA = stackNumber.pop();
                        int numB = stackNumber.pop();
                        String arithA = stackArith.pop();
                        switch(arithA){
                            case "+":
                                stackNumber.push(numA+numB);
                                break;
                            case "-":
                                stackNumber.push(numA-numB);
                                break;
                            case "*":
                                stackNumber.push(numA*numB);
                                break;
                        }
                    }
                    _listNumber = new ArrayList(stackNumber);
                    _listArith = new ArrayList(stackArith);

                }
            }
            if(stackNumber.size() == 1 && stackArith.isEmpty()){
                answer = Math.max(answer, Math.abs(stackNumber.pop()));
            }
        }
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    ArrayList<String[] > dummy = new ArrayList<>();
    String[] index;

    public String[] solution(String[][] tickets) {
        String[] data = new String[tickets.length+1];
        boolean[] check = new boolean[tickets.length];
        data[0] = "ICN";
        dfs("ICN", tickets, check, 0, data);


        String[] answer = new String[tickets.length+1];

        for(int x = 0 ; x < dummy.size() ; x++){
            for(int y = 0 ; y < dummy.get(x).length ; y++){
                answer[y] = dummy.get(x)[y];
            }
        }
        return answer;
    }


    public void dfs(String location, String[][] tickets, boolean[] check, int count, String[] data){
        if(count == tickets.length){
            index = new String[tickets.length+1];
            for(int x = 0 ; x < data.length ; x++){
                index[x] = data[x];
            }

            if(dummy.isEmpty()){
                dummy.add(index);
            }
            else {
                for(int x = 0 ; x < dummy.size() ; x++){
                    for(int y = 0 ; y < dummy.get(x).length ; y++){
                        if(dummy.get(x)[y].compareTo(index[y]) > 0){
                            dummy.clear();
                            dummy.add(index);
                        }
                        else if(dummy.get(x)[y].compareTo(index[y]) < 0){
                            break;
                        }
                    }
                }
            }
            return;
        }

        for(int x = 0 ; x < tickets.length ; x++) {
            if(!check[x]) {
                if (tickets[x][0].equals(location)) {
                    check[x] = true;
                    data[count+1] = tickets[x][1];
                    dfs(tickets[x][1], tickets, check, count + 1, data);
                    data[count+1] = null;
                    check[x] = false;
                }
            }
        }
    }
}
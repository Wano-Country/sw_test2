import java.util.*;

class Solution {
    class ActionId{
        String action;
        String Id;

        public ActionId(String action, String id) {
            this.action = action;
            Id = id;
        }
    }
    public String[] solution(String[] record) {
        ArrayList<ActionId> list = new ArrayList<>();
        HashMap<String, String> IdName = new HashMap<>();
        for(int x = 0 ; x < record.length ; x++){
            StringTokenizer st = new StringTokenizer(record[x]);
            String action = st.nextToken();
            String Id = st.nextToken();
            String Name = null;
            if(st.hasMoreTokens()) {
                Name = st.nextToken();
            }
            if(!action.equals("Change")) {
                list.add(new ActionId(action, Id));
            }
            if(!action.equals("Leave")) {
                if (IdName.containsKey(Id)) {
                    if (Name != null) {
                        IdName.replace(Id, Name);
                    }
                }
                else
                    IdName.put(Id, Name);
            }
        }

        String[] answer = new String[list.size()];
        for(int x = 0 ; x < answer.length ; x++){
            ActionId now = list.get(x);
            StringBuilder sb = new StringBuilder();
            sb.append(IdName.get(now.Id));
            sb.append("님이 ");
            sb.append(now.action.equals("Enter") ? "들어왔습니다." : "나갔습니다.");
            answer[x] = new String(sb);
        }
        return answer;
    }
}
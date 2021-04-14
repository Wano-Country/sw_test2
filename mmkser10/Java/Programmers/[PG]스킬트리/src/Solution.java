import java.util.Stack;

class Solution {
    public boolean isValidSkill(String skill, String skill_tree){
        int nowIndex = -1;
        for(int x = 0 ; x < skill.length() ; x++){
            int searchedIndex = skill_tree.indexOf(skill.charAt(x));
            if(searchedIndex == -1)
                searchedIndex = 100;
            if(nowIndex > searchedIndex)
                return false;
            else
                nowIndex = searchedIndex;
        }
        return true;
    }
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int x = 0 ; x < skill_trees.length ; x++){
            if(isValidSkill(skill, skill_trees[x]))
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution x = new Solution();
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
        String skill = "CBD";
        x.solution(skill, skill_trees);
    }
}
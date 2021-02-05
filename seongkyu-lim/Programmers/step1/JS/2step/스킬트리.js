function solution(skill, skill_trees) {
    var answer = skill_trees.length;
    for (let value of skill_trees){
        let idx = 0;
        while (idx < value.length){
            if (skill.indexOf(value[idx]) == -1){
                value = value.replace(value[idx],'');
                idx -= 1;
            }
            idx += 1;
        }
        let index = 0;
        while (index < value.length){
            if (skill[index] != value[index]){
                answer -= 1;
                break;
            }
            index += 1;
        }
    }
    return answer;
}
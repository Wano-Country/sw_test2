function solution(skill, skill_trees) {
    function isVaild(element){

        let array = skill.split('');
        for(let i = 0 ; i < element.length ; i++){
            if(!skill.includes(element.charAt(i)))     continue;
            if(element[i] === array.shift())    continue;
            return false;
        }
        return true;
    }
    console.log(isVaild);
    return skill_trees.filter(isVaild).length;
}

// another sol
function anotherSolutionA(skill, skill_trees) {
    let answer = 0;
    let regex = new RegExp(`[^${skill}]`, 'g');

    return skill_trees
        .map( (x) => x.replace(regex, '') )
        .filter( (x) => {
            return skill.indexOf(x) === 0 || x === "";
        })
        .length;
}
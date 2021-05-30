function solution(numbers, target) {
    return dfs(numbers, target, 0, 0);
}

function dfs(numbers, target, index, cal){
    if(numbers.length === index){
        if(cal === target)  return 1;
        return 0;
    }
    return dfs(numbers, target, index+1, cal+numbers[index])
        + dfs(numbers, target, index+1, cal-numbers[index])
}

// another sol
function anotherSolutionA(numbers, target) {
    let answer = 0;
    getAnswer(0,0);
    function getAnswer(x,value) {
        if(x<numbers.length){
            getAnswer(x+1,value + numbers[x]);
            getAnswer(x+1,value - numbers[x]);
        } else{
            if(value === target){
                answer++
            }
        }
    }
    return answer;
}
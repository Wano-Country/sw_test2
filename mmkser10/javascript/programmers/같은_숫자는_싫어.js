function solution(arr) {
    let answer = [];
    answer.push(arr[0]);
    for(let i = 1 ; i < arr.length ; i++){
        if(arr[i-1] !== arr[i])
            answer.push(arr[i]);
    }
    return answer;
}

// solution sol
function anotherSolutionA(arr) {
    return arr.filter((val,index) => val != arr[index+1]);
}
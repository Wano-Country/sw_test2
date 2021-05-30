function solution(arr) {
    var answer = [];
    let min = Math.min.apply(null, arr);
    for(let i = 0 ; i < arr.length ; i++){
        if(arr[i] !== min){
            answer.push(arr[i]);
        }
    }
    return answer.length === 0 ? [-1] : answer;
}

// another sol
function anotherSolutionA(arr) {
    arr.splice(arr.indexOf(Math.min(...arr)), 1);
    return arr.length < 1 ? [-1] : arr;
}
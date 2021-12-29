function solution(x) {
    let data = x+"".split("");
    let sum = 0;
    for(let i = 0 ; i < data.length ; i++){
        sum = sum + Number(data[i]);
    }
    return x%sum === 0 ? true : false;
}

// another sol
function anotherSolutionA(n) {
    return !(n % (n + "").split("").reduce((a, b) => +b + +a ));
}
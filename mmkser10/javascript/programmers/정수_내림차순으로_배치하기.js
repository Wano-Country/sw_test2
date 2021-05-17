function solution(n) {
    let array = Array.from(n.toString())
    array.sort(function (x, y) {
        return y-x;
    });
    return Number(array.join());
}

// another sol
function anotherSolutionA(n) {
    let data = n+""
    return data.split("").sort().reverse().join("");
}
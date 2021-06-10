function solution(d, budget) {
    var answer = 0;
    let sum = 0;
    d.sort( (x, y) => x-y);
    for(let i = 0 ; i < d.length ; i++){
        sum = sum + d[i];
        if(sum > budget)    break;
        else                answer++;
    }
    return answer;
}
function solution(n, words) {
    let set = new Set();
    let answer = [];
    for(let i = 0 ; i < words.length ; i++){
        if(i === 0)
            set.add(words[0]);
        else{
            if(words[i-1].charCodeAt(words[i-1].length-1) === words[i].charCodeAt(0)){
                if(!set.has(words[i]))
                    set.add(words[i]);
                else {
                    answer.push((i%n)+1);
                    answer.push(parseInt(i/n)+1);
                    break;
                }
            }
            else{
                answer.push((i%n)+1);
                answer.push(parseInt(i/n)+1);
                break;
            }
        }
    }
    return answer.length === 0 ? [0, 0] : answer;
}

// another sol
function anotherSolutionA(n, words) {
    let answer = 0;
    words.reduce((prev, now, idx) => {
        answer = answer || ((words.slice(0, idx).indexOf(now) !== -1 || prev !== now[0]) ? idx : answer);
        return now[now.length-1];
    }, "")
    return answer ? [answer%n+1, Math.floor(answer/n)+1] : [0,0];
}

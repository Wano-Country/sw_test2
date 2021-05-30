function solution(participant, completion) {
    participant.sort();
    completion.sort();
    for(let i = 0 , n = participant.length ; i < n ; i++)
        if(participant[i] !== completion[i]) return participant[i];
}

// another sol
let solution = (participant, completion) => { completion.map(name => completion[name] = (completion[name] | 0) + 1);
    return participant.find((name) => !completion[name]--); };
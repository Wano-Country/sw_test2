function solution(s, n) {
    var answer = '';
    for(let i = 0 ; i < s.length ; i++){
        if("a".charCodeAt(0) <= s.charCodeAt(i) && "z".charCodeAt(0) >= s.charCodeAt(i)){
            answer = answer + String.fromCharCode(((s.charCodeAt(i)+n)%"a".charCodeAt(0))%26 + "a".charCodeAt(0) );
        }
        else if("A".charCodeAt(0) <= s.charCodeAt(i) && "Z".charCodeAt(0) >= s.charCodeAt(i)){
            answer = answer + String.fromCharCode(((s.charCodeAt(i)+n)%"A".charCodeAt(0))%26 + "A".charCodeAt(0) );
        }
        else
            answer = answer + s.charAt(i);
    }
    return answer;
}

// another sol
function anotherSolutionA(s, n){
    let upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    let lower = "abcdefghijklmnopqrstuvwxyz";
    let answer= '';

    for(let i = 0 ; i < s.length ; i++){
        let text = s[i];
        if(text == ' ') {
            answer += ' ';
            continue;
        }
        let textArr = upper.includes(text) ? upper : lower;
        let index = textArr.indexOf(text)+n;
        if(index >= textArr.length) index -= textArr.length;
        answer += textArr[index];
    }
    return answer;
}
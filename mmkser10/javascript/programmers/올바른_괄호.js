function solution(s){
    let array = [];
    for(let i = 0 ; i < s.length; i++) {
        let char = s.charAt(i);
        if(array.length === 0)
            if(char === ')')
                break;
            else
                array.push(char);
        else{
            if(array[array.length-1] === '(' && char === ')')
                array.pop();
            else
                array.push(char);
        }
    }
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')

    return array.length === 0 ? true : false;
}

// another sol
function anotherSolutionA(s){
    let answer = 0;
    for (let element of s) {
        answer += element === '('? 1: -1
        if(answer < 0) {
            return false
        }
    }
    return answer === 0? true: false;
}
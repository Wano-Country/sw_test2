function solution(s) {
    let array = s.toLowerCase().split(' ');
    let answerArray = [];

    for(let i = 0 ; i < array.length ; i++){
        let char = array[i].charCodeAt(0);
        if(char >= 97 && char <= 122){
            answerArray.push(array[i].charAt(0).toUpperCase()+array[i].substr(1, array[i].length-1));
        }
        else if(isNaN(char)){
            answerArray.push('');
        }
        else{
            answerArray.push(array[i]);
        }
    }
    return answerArray.join(' ');
}
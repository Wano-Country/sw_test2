function solution(new_id) {
    var answer = '';
    //step 1
    answer = new_id.toLowerCase();
    //step 2
    let index = [];
    for (let i=0;i<answer.length;i++){
        if ((answer.charCodeAt([i])<65 || (90<answer.charCodeAt([i])&&answer.charCodeAt([i])<97) || answer.charCodeAt([i])>122) && isNaN(answer[i]) == true && (answer[i] != "-" && answer[i] != "_" && answer[i] != ".")){
            index.push(i);
        }
    }
    for(let value of index){
        answer = answer.slice(0,value) + answer.slice(value+1,answer.length);
        for(let idx in index){
            index[idx] -= 1;
        }
    }
    //step 3
    while(answer.indexOf("..") != -1){
        answer = answer.replace("..",".");
    }
    //step 4
    if (answer[0] == "." || answer[answer.length-1] == "."){
        if (answer[0] == "."){
            answer = answer.slice(1,answer.length);
        }
        if (answer[answer.length-1]=="."){
            answer = answer.slice(0,answer.length-1);
        }
    }
    //step 5
    if (answer.length == 0){
        answer = "a";
    }
    //step 6
    if(answer.length >=16){
        answer = answer.slice(0,15);
         if (answer[answer.length-1]=="."){
            answer = answer.slice(0,answer.length-1);
        };
    }
    //step 7
    if(answer.length <= 2){
        while(answer.length<3){
            answer = answer +answer[answer.length-1];
        };
    }
    return answer;
}
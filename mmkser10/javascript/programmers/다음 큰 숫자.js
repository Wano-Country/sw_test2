function solution(n) {
    let bit = n.toString(2).match(/1/g).length;
    while(n++){
        if(bit === n.toString(2).match(/1/g).length)
            break;
    }
    return n;
}
function solution(x) {
    x = String(x)
    var x1 = 0;
    
    for(let i=0;i<x.length; i++){
        x1 += Number(x[i])
    }
    if (Number(x)%x1 == 0) {
        return true
    }
    else {
        return false
    }
}
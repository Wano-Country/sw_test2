function solution(arr) {
    var answer = 0;
    var sum = 0;
    
    for(var i=0;i<arr.length;i++){
        sum += arr[i]
    }
    return sum/arr.length;
}
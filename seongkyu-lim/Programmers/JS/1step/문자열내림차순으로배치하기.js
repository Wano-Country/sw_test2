function solution(s) {
    var sList = s.split("")
    var sList2 = sList.sort()
    var sList3 = sList2.reverse()
    var answer = sList3.join('')
    return answer;
}
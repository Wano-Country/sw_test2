function solution(board, moves) {
    var answer = 0;
    var loc1;
    var loc2;
    var bowl = new Array();
    for(let i=0;i<moves.length;i++){
        loc1 = moves[i]-1;
        for (var j=0;j<board.length;j++){
            if(board[j][loc1] != 0){
                loc2 = j;
                break;
            }else if(j == board.length-1){
                var empty = 1;
            }
        };
        if(empty != 1){
            if (bowl[bowl.length-1] == board[loc2][loc1]){
                answer += 2;
                bowl.pop();
                board[loc2][loc1]=0;
            }
            else{
                bowl.push(board[loc2][loc1]);
                board[loc2][loc1]=0;
            };
        };
    };
    return answer;
}
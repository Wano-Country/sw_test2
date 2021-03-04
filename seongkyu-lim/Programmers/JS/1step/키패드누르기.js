function solution(numbers, hand) {
    var answer = '';
    var lLocation = 0;
    var rLocation = 0;
    var lDistance = 0;
    var rDistance = 0;
    for (let value of numbers) {
        if (rLocation == 0 || value == "#") {
                rLocation = 12;
            }
        if(lLocation == 0 || value == "*"){
                lLocation = 10;
            }
        if (value == 1 || value == 4 || value == 7){
            answer += "L"
            lLocation = value;
        }else if (value == 3 || value == 6 || value == 9){
            answer += "R"
            rLocation = value;
        }else{
            if(value != 0){
                if(parseInt(Math.abs(value-lLocation)/3) != 0) {
                    lDistance = parseInt(Math.abs(value-lLocation)/3) + Math.abs(value-lLocation)%3
                }else{
                    lDistance = Math.abs(value-lLocation)
                }
                if(parseInt(Math.abs(value-rLocation)/3) != 0) {
                    rDistance = parseInt(Math.abs(value-rLocation)/3) + Math.abs(value-rLocation)%3
                }else{
                    rDistance = Math.abs(value-rLocation)
                }
                if(lDistance>rDistance) {
                    rLocation = value; 
                    answer += "R"
                }else if(lDistance<rDistance){
                    lLocation = value;
                    answer += "L"
                }else {
                    if(hand == "right"){
                        rLocation = value; 
                        answer += "R"
                    }else {
                        lLocation = value;
                        answer += "L"
                    }
                }
            }else{
                if(parseInt(Math.abs(11-lLocation)/3) != 0) {
                    lDistance = parseInt(Math.abs(11-lLocation)/3) + Math.abs(11-lLocation)%3
                }else{
                    lDistance = Math.abs(11-lLocation)
                }
                if(parseInt(Math.abs(11-rLocation)/3) != 0) {
                    rDistance = parseInt(Math.abs(11-rLocation)/3) + Math.abs(11-rLocation)%3
                }else{
                    rDistance = Math.abs(11-rLocation)
                }
                if(lDistance>rDistance) {
                    rLocation = 11; 
                    answer += "R"
                }else if(lDistance<rDistance){
                    lLocation = 11;
                    answer += "L"
                }else {
                    if(hand == "right"){
                        rLocation = 11; 
                        answer += "R"
                    }else {
                        lLocation = 11;
                        answer += "L"
                    }
                }
            }
        }
    }
    return answer;
}
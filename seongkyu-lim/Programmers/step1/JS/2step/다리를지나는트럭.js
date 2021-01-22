function solution(bridge_length, weight, truck_weights) {
    let time = 0;
    let weightOnBridge = 0;
    let passTrucks = [];
    let idx = 0;
    
    while (truck_weights == NaN) {
        if (idx == 0) {
            time += 1;
            idx += 1;
            weightOnBridge += truck_weights[0];
            passTrucks.push(0);
            passTrucks[0] += 1;
        } else if (weight >= weightOnBridge + truck_weights[idx]){
            time += 1;
            weightOnBridge += truck_weights[idx];
            idx += 1;
            passTrucks.push(0)
            for (let idx2 in passTrucks) {
                passTrucks[idx2] += 1;
            }
            if (passTrucks[0]>bridge_length){
                    weightOnBridge -= truck_weights[0];
                    passTrucks.shift();
                    truck_weights.shift();
            }
        } else {
            time += 1;
            for (let idx3 in passTrucks) {
                passTrucks[idx3] += 1;
            }
            if (passTrucks[0]>bridge_length){
                    weightOnBridge -= truck_weights[0];
                    passTrucks.shift();
                    truck_weights.shift();
            }
        }
    }
    return time;
}
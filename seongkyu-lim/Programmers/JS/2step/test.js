function scopeCal (a){
  let scope =1;
  let indices = 0;

  for (let i = 0; i<a ; i++ ){
    scope += 1;
    indices += 1;
  }
  return [scope, indices];
};

let scopeCal1 = scopeCal(3)
let scope = scopeCal1[0]
let indices = scopeCal1[1]
console.log(scope, indices)
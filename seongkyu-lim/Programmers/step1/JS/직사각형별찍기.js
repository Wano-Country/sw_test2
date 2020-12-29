process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    
    var c = new Array();
    for(let i=0;i<a;i++){
        c.push('*')
    }
    var row;
    row = c.join("")
    for(let j=0;j<b;j++){
        console.log(row)
    }
    
    
});
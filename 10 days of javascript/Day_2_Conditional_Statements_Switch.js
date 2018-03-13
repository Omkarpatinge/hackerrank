'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function getLetter(s) {
    let letter;
    // Write your code here
    var set={
        A:"aeiou",
        B:"bcdfg",
        C:"hjklm",
        D:"npqrstvwxyz"
    };
    
    var keys=Object.keys(set);
    for(var i=0;i<keys.length;i++){
        if(set[keys[i]].indexOf(s[0])>-1){
            letter=keys[i];
            break;
        }
    }
    
    return letter;
}


function main() {
    const s = readLine();
    
    console.log(getLetter(s));
}
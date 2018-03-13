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

function vowelsAndConsonants(s) {
    let vowels="aeiou";
    let consonants=[];
    for(let i=0;i<s.length;i++){
        if(vowels.indexOf(s[i])>-1){
            console.log(s[i]);
        }
        else{
            consonants.push(s[i]);
        }
    }
    for(let i=0;i<consonants.length;i++){   
        console.log(consonants[i]);
    }
}



function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}
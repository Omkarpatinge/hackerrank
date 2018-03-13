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


function getSecondLargest(nums) {
    let max=nums[0];
    let max2=-1;
    for(let i=0;i<nums.length;i++){
        if(nums[i]>max){
            max2=max;
            max=nums[i];
        }
        if(nums[i]<max && nums[i]>max2){
            max2=nums[i];
        }
    }
    return max2;
   
}

function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
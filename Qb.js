//Question 2 sorting program
const arr = [10,23,12,45,100]; 
function arrSort(arr) { 

    arr.sort((a,b)=>a-b); 

    arr.reverse(); 

    return arr; 
} 

console.log(arrSort(arr)); 

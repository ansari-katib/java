const arr = [1, 2, 3, 4, 5, 6, 7, 8, 0];

let minval = arr[0];
let maxval = arr[0];

for (let i = 1; i < arr.length; i++) {
    if (arr[i] < minval) {
        minval = arr[i];
    }
    if (arr[i] > maxval) {
        maxval = arr[i];
    }
}

console.log("Min:", minval); 
console.log("Max:", maxval); 
